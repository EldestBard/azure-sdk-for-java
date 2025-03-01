// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ValidateRestoreRequestObject
 *
 * <p>Validate restore request object.
 */
@Fluent
public final class ValidateRestoreRequestObject {
    /*
     * AzureBackupRestoreRequest
     *
     * Gets or sets the restore request object.
     */
    @JsonProperty(value = "restoreRequestObject", required = true)
    private AzureBackupRestoreRequest restoreRequestObject;

    /** Creates an instance of ValidateRestoreRequestObject class. */
    public ValidateRestoreRequestObject() {
    }

    /**
     * Get the restoreRequestObject property: AzureBackupRestoreRequest
     *
     * <p>Gets or sets the restore request object.
     *
     * @return the restoreRequestObject value.
     */
    public AzureBackupRestoreRequest restoreRequestObject() {
        return this.restoreRequestObject;
    }

    /**
     * Set the restoreRequestObject property: AzureBackupRestoreRequest
     *
     * <p>Gets or sets the restore request object.
     *
     * @param restoreRequestObject the restoreRequestObject value to set.
     * @return the ValidateRestoreRequestObject object itself.
     */
    public ValidateRestoreRequestObject withRestoreRequestObject(AzureBackupRestoreRequest restoreRequestObject) {
        this.restoreRequestObject = restoreRequestObject;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restoreRequestObject() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property restoreRequestObject in model ValidateRestoreRequestObject"));
        } else {
            restoreRequestObject().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ValidateRestoreRequestObject.class);
}
