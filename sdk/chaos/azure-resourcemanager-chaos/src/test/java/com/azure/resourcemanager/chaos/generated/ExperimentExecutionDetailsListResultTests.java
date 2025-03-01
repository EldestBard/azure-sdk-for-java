// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionDetailsListResult;

public final class ExperimentExecutionDetailsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentExecutionDetailsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"type\":\"wroyqbexrmcq\",\"id\":\"ycnojvknmefqsg\",\"name\":\"ah\",\"properties\":{\"experimentId\":\"y\",\"status\":\"pvgqzcjrvxdjzlm\",\"failureReason\":\"xkvugfhzov\",\"createdDateTime\":\"2021-04-06T17:45:34Z\",\"lastActionDateTime\":\"2021-08-30T15:15:07Z\",\"startDateTime\":\"2021-08-29T21:49:24Z\",\"stopDateTime\":\"2021-02-16T01:55:44Z\",\"runInformation\":{\"steps\":[{}]}}},{\"type\":\"rnxipei\",\"id\":\"jzuaejxdultskzbb\",\"name\":\"zumveekgpwo\",\"properties\":{\"experimentId\":\"kfpbs\",\"status\":\"ofd\",\"failureReason\":\"uusdttouwa\",\"createdDateTime\":\"2021-08-12T22:43:04Z\",\"lastActionDateTime\":\"2021-11-05T01:57:54Z\",\"startDateTime\":\"2021-09-30T23:19:15Z\",\"stopDateTime\":\"2021-03-07T10:01:38Z\",\"runInformation\":{\"steps\":[{}]}}},{\"type\":\"bxwyjsflhhcaa\",\"id\":\"jixisxyawjoyaqcs\",\"name\":\"jpkiidzyexznelix\",\"properties\":{\"experimentId\":\"ztfolhbnxk\",\"status\":\"laulppg\",\"failureReason\":\"tpnapnyiropuhpig\",\"createdDateTime\":\"2021-05-18T16:57:02Z\",\"lastActionDateTime\":\"2021-06-13T20:05:29Z\",\"startDateTime\":\"2021-09-08T14:57:52Z\",\"stopDateTime\":\"2021-09-24T06:30:02Z\",\"runInformation\":{\"steps\":[{},{},{}]}}},{\"type\":\"jvc\",\"id\":\"ynqwwncwzzhxgk\",\"name\":\"mgucna\",\"properties\":{\"experimentId\":\"eoellwptfdygp\",\"status\":\"b\",\"failureReason\":\"ceopzfqrhhuaopp\",\"createdDateTime\":\"2021-12-04T10:32:02Z\",\"lastActionDateTime\":\"2021-11-26T20:29:16Z\",\"startDateTime\":\"2021-08-22T01:14:41Z\",\"stopDateTime\":\"2021-02-19T08:33:13Z\",\"runInformation\":{\"steps\":[{},{}]}}}],\"nextLink\":\"xcto\"}")
                .toObject(ExperimentExecutionDetailsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentExecutionDetailsListResult model = new ExperimentExecutionDetailsListResult();
        model = BinaryData.fromObject(model).toObject(ExperimentExecutionDetailsListResult.class);
    }
}
