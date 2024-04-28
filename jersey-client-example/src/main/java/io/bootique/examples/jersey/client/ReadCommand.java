package io.bootique.examples.jersey.client;

import io.bootique.cli.Cli;
import io.bootique.command.CommandOutcome;
import io.bootique.command.CommandWithMetadata;
import io.bootique.jersey.client.HttpClientFactory;
import io.bootique.meta.application.CommandMetadata;
import io.bootique.meta.application.OptionMetadata;
import jakarta.ws.rs.core.Response;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class ReadCommand extends CommandWithMetadata {

    static final String URL_OPTION = "url";

    private final Provider<HttpClientFactory> clientFactory;

    @Inject
    public ReadCommand(Provider<HttpClientFactory> clientFactory) {
        super(CommandMetadata.builder(ReadCommand.class)
                .description("Reads supplied URL, and prints its contents to stdout")
                .addOption(OptionMetadata.builder(URL_OPTION).valueRequired("url").build())
                .build());

        this.clientFactory = clientFactory;
    }

    @Override
    public CommandOutcome run(Cli cli) {

        String url = cli.optionString(URL_OPTION);
        if (url == null) {
            return CommandOutcome.failed(-1, "No URL specified, use --" + URL_OPTION);
        }

        Response r = clientFactory.get().newClient().target(url).request().get();

        if (r.getStatus() != 200) {
            return CommandOutcome.failed(-1, "HTTP request failed with status " + r.getStatus());
        }

        System.out.println(r.readEntity(String.class));
        return CommandOutcome.succeeded();
    }
}
