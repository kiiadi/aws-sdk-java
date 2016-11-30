/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * OfferingTransactionMarshaller
 */
public class OfferingTransactionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(OfferingTransaction offeringTransaction, StructuredJsonGenerator jsonGenerator) {

        if (offeringTransaction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (offeringTransaction.getOfferingStatus() != null) {
                jsonGenerator.writeFieldName("offeringStatus");
                OfferingStatusJsonMarshaller.getInstance().marshall(offeringTransaction.getOfferingStatus(), jsonGenerator);
            }
            if (offeringTransaction.getTransactionId() != null) {
                jsonGenerator.writeFieldName("transactionId").writeValue(offeringTransaction.getTransactionId());
            }
            if (offeringTransaction.getCreatedOn() != null) {
                jsonGenerator.writeFieldName("createdOn").writeValue(offeringTransaction.getCreatedOn());
            }
            if (offeringTransaction.getCost() != null) {
                jsonGenerator.writeFieldName("cost");
                MonetaryAmountJsonMarshaller.getInstance().marshall(offeringTransaction.getCost(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OfferingTransactionJsonMarshaller instance;

    public static OfferingTransactionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OfferingTransactionJsonMarshaller();
        return instance;
    }

}
