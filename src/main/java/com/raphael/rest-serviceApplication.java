package com.raphael;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class rest-serviceApplication extends Application<rest-serviceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new rest-serviceApplication().run(args);
    }

    @Override
    public String getName() {
        return "rest-service";
    }

    @Override
    public void initialize(final Bootstrap<rest-serviceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final rest-serviceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
