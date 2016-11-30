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
package com.amazonaws.services.route53.model;

/**
 * <p>
 * You're trying to associate a VPC with a public hosted zone. Amazon Route 53 doesn't support associating a VPC with a
 * public hosted zone.
 * </p>
 */
public class PublicZoneVPCAssociationException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PublicZoneVPCAssociationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PublicZoneVPCAssociationException(String message) {
        super(message);
    }

}
