// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for Registries List. */
public final class RegistriesListSamples {
    /*
     * x-ms-original-file: mgmt_containerregistry_add_readonly/specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2023-07-01/examples/RegistryList.json
     */
    /**
     * Sample code: RegistryList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getRegistries().list(com.azure.core.util.Context.NONE);
    }
}
