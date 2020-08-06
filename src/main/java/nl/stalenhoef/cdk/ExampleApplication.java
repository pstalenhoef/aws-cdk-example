package nl.stalenhoef.cdk;

import software.amazon.awscdk.core.App;

public class ExampleApplication {
    public static void main(final String[] args) {
        App app = new App();

        new ExampleStack(app, "ExampleStack");

        app.synth();
    }
}
