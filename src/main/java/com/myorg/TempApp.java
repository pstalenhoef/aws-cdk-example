package com.myorg;

import software.amazon.awscdk.core.App;

import java.util.Arrays;

public class TempApp {
    public static void main(final String[] args) {
        App app = new App();

        new TempStack(app, "TempStack");

        app.synth();
    }
}
