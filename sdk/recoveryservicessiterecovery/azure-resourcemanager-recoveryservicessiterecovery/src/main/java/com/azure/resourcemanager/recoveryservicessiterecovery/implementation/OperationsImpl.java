// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.OperationsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.OperationsDiscoveryInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Operations;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OperationsDiscovery;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationsDiscovery> listByResourceGroup(String resourceGroupName) {
        PagedIterable<OperationsDiscoveryInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new OperationsDiscoveryImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationsDiscovery> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<OperationsDiscoveryInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new OperationsDiscoveryImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
