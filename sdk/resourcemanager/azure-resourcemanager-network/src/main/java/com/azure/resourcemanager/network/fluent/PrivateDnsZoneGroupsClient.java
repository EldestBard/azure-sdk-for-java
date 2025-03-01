// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.PrivateDnsZoneGroupInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateDnsZoneGroupsClient. */
public interface PrivateDnsZoneGroupsClient {
    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName, Context context);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName, Context context);

    /**
     * Gets the private dns zone group resource by specified private dns zone group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private dns zone group resource by specified private dns zone group name along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateDnsZoneGroupInner>> getWithResponseAsync(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Gets the private dns zone group resource by specified private dns zone group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private dns zone group resource by specified private dns zone group name on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateDnsZoneGroupInner> getAsync(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Gets the private dns zone group resource by specified private dns zone group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private dns zone group resource by specified private dns zone group name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateDnsZoneGroupInner> getWithResponse(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName, Context context);

    /**
     * Gets the private dns zone group resource by specified private dns zone group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private dns zone group resource by specified private dns zone group name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateDnsZoneGroupInner get(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private dns zone group resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of private dns zone group resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<PrivateDnsZoneGroupInner>, PrivateDnsZoneGroupInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private dns zone group resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateDnsZoneGroupInner>, PrivateDnsZoneGroupInner> beginCreateOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private dns zone group resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateDnsZoneGroupInner>, PrivateDnsZoneGroupInner> beginCreateOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters,
        Context context);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private dns zone group resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateDnsZoneGroupInner> createOrUpdateAsync(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private dns zone group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateDnsZoneGroupInner createOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private dns zone group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateDnsZoneGroupInner createOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters,
        Context context);

    /**
     * Gets all private dns zone groups in a private endpoint.
     *
     * @param privateEndpointName The name of the private endpoint.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private dns zone groups in a private endpoint as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PrivateDnsZoneGroupInner> listAsync(String privateEndpointName, String resourceGroupName);

    /**
     * Gets all private dns zone groups in a private endpoint.
     *
     * @param privateEndpointName The name of the private endpoint.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private dns zone groups in a private endpoint as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateDnsZoneGroupInner> list(String privateEndpointName, String resourceGroupName);

    /**
     * Gets all private dns zone groups in a private endpoint.
     *
     * @param privateEndpointName The name of the private endpoint.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private dns zone groups in a private endpoint as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateDnsZoneGroupInner> list(String privateEndpointName, String resourceGroupName, Context context);
}
