// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.resourcemanager.communication.models.DomainResource;
import com.azure.resourcemanager.communication.models.UserEngagementTracking;

/** Samples for Domains Update. */
public final class DomainsUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2023-04-01-preview/examples/domains/update.json
     */
    /**
     * Sample code: Update Domains resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void updateDomainsResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        DomainResource resource =
            manager
                .domains()
                .getWithResponse(
                    "MyResourceGroup", "MyEmailServiceResource", "mydomain.com", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withUserEngagementTracking(UserEngagementTracking.ENABLED).apply();
    }
}
