// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.UpdateRunInner;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpdate;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeSpec;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelection;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateRunInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateRunInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Failed\",\"strategy\":{\"stages\":[{\"name\":\"mouexhdzx\",\"groups\":[{\"name\":\"eojnxqbzvddn\"},{\"name\":\"wndeicbtwnp\"},{\"name\":\"aoqvuh\"},{\"name\":\"hcffcyddglmjthjq\"}],\"afterStageWaitInSeconds\":1616692109},{\"name\":\"yeicxmqciwqvhk\",\"groups\":[{\"name\":\"uigdtopbobjog\"},{\"name\":\"m\"},{\"name\":\"w\"}],\"afterStageWaitInSeconds\":54099605},{\"name\":\"a\",\"groups\":[{\"name\":\"z\"},{\"name\":\"yvvtpgvdfgio\"}],\"afterStageWaitInSeconds\":1858576873}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"tqxln\"},\"nodeImageSelection\":{\"type\":\"Consistent\"}},\"status\":{\"status\":{\"startTime\":\"2021-07-23T20:25:28Z\",\"completedTime\":\"2021-01-24T10:40:18Z\",\"state\":\"Failed\"},\"stages\":[{\"status\":{\"startTime\":\"2021-08-28T06:39:58Z\",\"completedTime\":\"2021-02-10T03:59:13Z\",\"state\":\"Completed\"},\"name\":\"vqdra\",\"groups\":[{},{}],\"afterStageWaitStatus\":{\"status\":{},\"waitDurationInSeconds\":1370032032}},{\"status\":{\"startTime\":\"2021-04-03T11:00:19Z\",\"completedTime\":\"2021-02-13T15:34:58Z\",\"state\":\"Skipped\"},\"name\":\"kanyktzlcuiywg\",\"groups\":[{},{},{},{}],\"afterStageWaitStatus\":{\"status\":{},\"waitDurationInSeconds\":508841198}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{\"version\":\"zgpphrcgyncocpe\"},{\"version\":\"vmmcoofs\"},{\"version\":\"zevgb\"}]}}},\"eTag\":\"jqabcypmivkwlzuv\",\"id\":\"c\",\"name\":\"wnfnbacf\",\"type\":\"onlebxetqgtzxdpn\"}")
                .toObject(UpdateRunInner.class);
        Assertions.assertEquals("mouexhdzx", model.strategy().stages().get(0).name());
        Assertions.assertEquals("eojnxqbzvddn", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(1616692109, model.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.NODE_IMAGE_ONLY, model.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("tqxln", model.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(NodeImageSelectionType.CONSISTENT, model.managedClusterUpdate().nodeImageSelection().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateRunInner model =
            new UpdateRunInner()
                .withStrategy(
                    new UpdateRunStrategy()
                        .withStages(
                            Arrays
                                .asList(
                                    new UpdateStage()
                                        .withName("mouexhdzx")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("eojnxqbzvddn"),
                                                    new UpdateGroup().withName("wndeicbtwnp"),
                                                    new UpdateGroup().withName("aoqvuh"),
                                                    new UpdateGroup().withName("hcffcyddglmjthjq")))
                                        .withAfterStageWaitInSeconds(1616692109),
                                    new UpdateStage()
                                        .withName("yeicxmqciwqvhk")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("uigdtopbobjog"),
                                                    new UpdateGroup().withName("m"),
                                                    new UpdateGroup().withName("w")))
                                        .withAfterStageWaitInSeconds(54099605),
                                    new UpdateStage()
                                        .withName("a")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("z"),
                                                    new UpdateGroup().withName("yvvtpgvdfgio")))
                                        .withAfterStageWaitInSeconds(1858576873))))
                .withManagedClusterUpdate(
                    new ManagedClusterUpdate()
                        .withUpgrade(
                            new ManagedClusterUpgradeSpec()
                                .withType(ManagedClusterUpgradeType.NODE_IMAGE_ONLY)
                                .withKubernetesVersion("tqxln"))
                        .withNodeImageSelection(new NodeImageSelection().withType(NodeImageSelectionType.CONSISTENT)));
        model = BinaryData.fromObject(model).toObject(UpdateRunInner.class);
        Assertions.assertEquals("mouexhdzx", model.strategy().stages().get(0).name());
        Assertions.assertEquals("eojnxqbzvddn", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(1616692109, model.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.NODE_IMAGE_ONLY, model.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("tqxln", model.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(NodeImageSelectionType.CONSISTENT, model.managedClusterUpdate().nodeImageSelection().type());
    }
}
