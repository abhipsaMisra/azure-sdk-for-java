package com.azure.digitaltwins.core;

import org.junit.jupiter.api.Test;

import com.azure.core.http.HttpClient;

/**
 * This abstract test class defines all the tests that both the sync and async component test classes need to implement.
 * It also houses some component test specific helper functions.
 */
public abstract class ComponentsTestBase extends DigitalTwinsTestBase {
    @Test
    public abstract void componentLifecycleTest(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion);
}
