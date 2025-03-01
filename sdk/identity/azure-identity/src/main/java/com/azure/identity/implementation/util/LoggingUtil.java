// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.implementation.util;

import com.azure.core.credential.TokenRequestContext;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import com.azure.identity.CredentialUnavailableException;
import com.azure.identity.implementation.IdentityClientOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Utilities to handle logging for credentials.
 */
public final class LoggingUtil {
    /**
     * Log a success message for a getToken() call.
     * @param logger the logger to output the log message
     * @param context the context of the getToken() request
     */
    public static void logTokenSuccess(ClientLogger logger, TokenRequestContext context) {
        logger.log(LogLevel.INFORMATIONAL, () -> String.format(
            "Azure Identity => getToken() result for scopes [%s]: SUCCESS",
            CoreUtils.stringJoin(", ", context.getScopes())));
    }

    /**
     * Log an error message for a getToken() call.
     * @param logger the logger to output the log message
     * @param context the context of the getToken() request
     * @param error the error thrown during getToken()
     */
    public static void logTokenError(ClientLogger logger, IdentityClientOptions options, TokenRequestContext context,
        Throwable error) {
        logError(logger, options, () -> String.format("Azure Identity => ERROR in getToken() call for scopes [%s]: %s",
                CoreUtils.stringJoin(", ", context.getScopes()), error == null ? "" : error.getMessage()));
    }

    /**
     * Log the names of the currently available environment variables among a list of useful environment variables for
     * Azure Identity authentications.
     * @param logger the logger to output the log message
     */
    public static void logAvailableEnvironmentVariables(ClientLogger logger, Configuration configuration) {
        String msiEndpoint = configuration.get(Configuration.PROPERTY_MSI_ENDPOINT);
        String msiSecret = configuration.get(Configuration.PROPERTY_MSI_SECRET);
        String clientId = configuration.get(Configuration.PROPERTY_AZURE_CLIENT_ID);
        String tenantId = configuration.get(Configuration.PROPERTY_AZURE_TENANT_ID);
        String clientSecret = configuration.get(Configuration.PROPERTY_AZURE_CLIENT_SECRET);
        String certPath = configuration.get(Configuration.PROPERTY_AZURE_CLIENT_CERTIFICATE_PATH);
        String username = configuration.get(Configuration.PROPERTY_AZURE_USERNAME);
        String password = configuration.get(Configuration.PROPERTY_AZURE_PASSWORD);
        List<String> envVars = new ArrayList<>();
        if (msiEndpoint != null) {
            envVars.add(Configuration.PROPERTY_MSI_ENDPOINT);
        }
        if (msiSecret != null) {
            envVars.add(Configuration.PROPERTY_MSI_SECRET);
        }
        if (clientId != null) {
            envVars.add(Configuration.PROPERTY_AZURE_CLIENT_ID);
        }
        if (tenantId != null) {
            envVars.add(Configuration.PROPERTY_AZURE_TENANT_ID);
        }
        if (clientSecret != null) {
            envVars.add(Configuration.PROPERTY_AZURE_CLIENT_SECRET);
        }
        if (certPath != null) {
            envVars.add(Configuration.PROPERTY_AZURE_CLIENT_CERTIFICATE_PATH);
        }
        if (username != null) {
            envVars.add(Configuration.PROPERTY_AZURE_USERNAME);
        }
        if (password != null) {
            envVars.add(Configuration.PROPERTY_AZURE_PASSWORD);
        }
        logger.verbose("Azure Identity => Found the following environment variables: {}", String.join(", ", envVars));
    }

    private LoggingUtil() {
    }

    public static CredentialUnavailableException logCredentialUnavailableException(ClientLogger logger,
                                       IdentityClientOptions options, CredentialUnavailableException exception) {
        logger.log(options.getIdentityLogOptionsImpl().getRuntimeExceptionLogLevel(), exception::getMessage, exception);
        return exception;
    }

    public static void logError(ClientLogger logger, IdentityClientOptions options, String message) {
        logger.log(options.getIdentityLogOptionsImpl().getRuntimeExceptionLogLevel(), () -> message);
    }

    public static void logError(ClientLogger logger, IdentityClientOptions options, Supplier<String> messageSupplier) {
        logger.log(options.getIdentityLogOptionsImpl().getRuntimeExceptionLogLevel(), messageSupplier);
    }
}
