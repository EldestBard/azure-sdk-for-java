// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceProperties;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceType;
import org.junit.jupiter.api.Assertions;

public final class ShareablePrivateLinkResourceTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ShareablePrivateLinkResourceType model =
            BinaryData
                .fromString(
                    "{\"name\":\"miccwrwfscjfnyn\",\"properties\":{\"description\":\"ujiz\",\"groupId\":\"oqytibyowbblgy\",\"type\":\"utp\"}}")
                .toObject(ShareablePrivateLinkResourceType.class);
        Assertions.assertEquals("miccwrwfscjfnyn", model.name());
        Assertions.assertEquals("ujiz", model.properties().description());
        Assertions.assertEquals("oqytibyowbblgy", model.properties().groupId());
        Assertions.assertEquals("utp", model.properties().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ShareablePrivateLinkResourceType model =
            new ShareablePrivateLinkResourceType()
                .withName("miccwrwfscjfnyn")
                .withProperties(
                    new ShareablePrivateLinkResourceProperties()
                        .withDescription("ujiz")
                        .withGroupId("oqytibyowbblgy")
                        .withType("utp"));
        model = BinaryData.fromObject(model).toObject(ShareablePrivateLinkResourceType.class);
        Assertions.assertEquals("miccwrwfscjfnyn", model.name());
        Assertions.assertEquals("ujiz", model.properties().description());
        Assertions.assertEquals("oqytibyowbblgy", model.properties().groupId());
        Assertions.assertEquals("utp", model.properties().type());
    }
}
