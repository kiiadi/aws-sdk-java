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
package com.amazonaws.services.elasticloadbalancingv2;

import com.amazonaws.services.elasticloadbalancingv2.model.*;

/**
 * Interface for accessing Elastic Load Balancing v2 asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticloadbalancingv2.AbstractAmazonElasticLoadBalancingAsync} instead.
 * </p>
 * <p>
 * <fullname>Elastic Load Balancing</fullname>
 * <p>
 * A load balancer distributes incoming traffic across targets, such as your EC2 instances. This enables you to increase
 * the availability of your application. The load balancer also monitors the health of its registered targets and
 * ensures that it routes traffic only to healthy targets. You configure your load balancer to accept incoming traffic
 * by specifying one or more listeners, which are configured with a protocol and port number for connections from
 * clients to the load balancer. You configure a target group with a protocol and port number for connections from the
 * load balancer to the targets, and with health check settings to be used when checking the health status of the
 * targets.
 * </p>
 * <p>
 * Elastic Load Balancing supports two types of load balancers: Classic Load Balancers and Application Load Balancers. A
 * Classic Load Balancer makes routing and load balancing decisions either at the transport layer (TCP/SSL) or the
 * application layer (HTTP/HTTPS), and supports either EC2-Classic or a VPC. An Application Load Balancer makes routing
 * and load balancing decisions at the application layer (HTTP/HTTPS), supports path-based routing, and can route
 * requests to one or more ports on each EC2 instance or container instance in your virtual private cloud (VPC). For
 * more information, see the <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/">Elastic Load
 * Balancing User Guide</a>.
 * </p>
 * <p>
 * This reference covers the 2015-12-01 API, which supports Application Load Balancers. The 2012-06-01 API supports
 * Classic Load Balancers.
 * </p>
 * <p>
 * To get started, complete the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create an Application Load Balancer using <a>CreateLoadBalancer</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a target group using <a>CreateTargetGroup</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Register targets for the target group using <a>RegisterTargets</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create one or more listeners for your load balancer using <a>CreateListener</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * (Optional) Create one or more rules for content routing based on URL using <a>CreateRule</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * To delete an Application Load Balancer and its related resources, complete the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Delete the load balancer using <a>DeleteLoadBalancer</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Delete the target group using <a>DeleteTargetGroup</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * All Elastic Load Balancing operations are idempotent, which means that they complete at most one time. If you repeat
 * an operation, it succeeds.
 * </p>
 */
public interface AmazonElasticLoadBalancingAsync extends AmazonElasticLoadBalancing {

    /**
     * <p>
     * Adds the specified tags to the specified resource. You can tag your Application Load Balancers and your target
     * groups.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>DescribeTags</a>. To remove tags from your resources, use
     * <a>RemoveTags</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource. You can tag your Application Load Balancers and your target
     * groups.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key,
     * <code>AddTags</code> updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>DescribeTags</a>. To remove tags from your resources, use
     * <a>RemoveTags</a>.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Creates a listener for the specified Application Load Balancer.
     * </p>
     * <p>
     * You can create up to 10 listeners per load balancer.
     * </p>
     * <p>
     * To update a listener, use <a>ModifyListener</a>. When you are finished with a listener, you can delete it using
     * <a>DeleteListener</a>. If you are finished with both the listener and the load balancer, you can delete them both
     * using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html">Listeners
     * for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     *        Contains the parameters for CreateListener.
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateListener
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest);

    /**
     * <p>
     * Creates a listener for the specified Application Load Balancer.
     * </p>
     * <p>
     * You can create up to 10 listeners per load balancer.
     * </p>
     * <p>
     * To update a listener, use <a>ModifyListener</a>. When you are finished with a listener, you can delete it using
     * <a>DeleteListener</a>. If you are finished with both the listener and the load balancer, you can delete them both
     * using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html">Listeners
     * for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createListenerRequest
     *        Contains the parameters for CreateListener.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateListener
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateListenerRequest, CreateListenerResult> asyncHandler);

    /**
     * <p>
     * Creates an Application Load Balancer.
     * </p>
     * <p>
     * To create listeners for your load balancer, use <a>CreateListener</a>. You can add security groups, subnets, and
     * tags when you create your load balancer, or you can add them later using <a>SetSecurityGroups</a>,
     * <a>SetSubnets</a>, and <a>AddTags</a>.
     * </p>
     * <p>
     * To describe your current load balancers, see <a>DescribeLoadBalancers</a>. When you are finished with a load
     * balancer, you can delete it using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can request an increase for the number of load
     * balancers for your account. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html">Limits for
     * Your Application Load Balancer</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html"
     * >Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     *        Contains the parameters for CreateLoadBalancer.
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateLoadBalancer
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest);

    /**
     * <p>
     * Creates an Application Load Balancer.
     * </p>
     * <p>
     * To create listeners for your load balancer, use <a>CreateListener</a>. You can add security groups, subnets, and
     * tags when you create your load balancer, or you can add them later using <a>SetSecurityGroups</a>,
     * <a>SetSubnets</a>, and <a>AddTags</a>.
     * </p>
     * <p>
     * To describe your current load balancers, see <a>DescribeLoadBalancers</a>. When you are finished with a load
     * balancer, you can delete it using <a>DeleteLoadBalancer</a>.
     * </p>
     * <p>
     * You can create up to 20 load balancers per region per account. You can request an increase for the number of load
     * balancers for your account. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html">Limits for
     * Your Application Load Balancer</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html"
     * >Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createLoadBalancerRequest
     *        Contains the parameters for CreateLoadBalancer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateLoadBalancer
     */
    java.util.concurrent.Future<CreateLoadBalancerResult> createLoadBalancerAsync(CreateLoadBalancerRequest createLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoadBalancerRequest, CreateLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Creates a rule for the specified listener.
     * </p>
     * <p>
     * Each rule can have one action and one condition. Rules are evaluated in priority order, from the lowest value to
     * the highest value. When the condition for a rule is met, the specified action is taken. If no conditions are met,
     * the default action for the default rule is taken. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules"
     * >Listener Rules</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * <p>
     * To view your current rules, use <a>DescribeRules</a>. To update a rule, use <a>ModifyRule</a>. To set the
     * priorities of your rules, use <a>SetRulePriorities</a>. To delete a rule, use <a>DeleteRule</a>.
     * </p>
     * 
     * @param createRuleRequest
     *        Contains the parameters for CreateRule.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateRule
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a rule for the specified listener.
     * </p>
     * <p>
     * Each rule can have one action and one condition. Rules are evaluated in priority order, from the lowest value to
     * the highest value. When the condition for a rule is met, the specified action is taken. If no conditions are met,
     * the default action for the default rule is taken. For more information, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules"
     * >Listener Rules</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * <p>
     * To view your current rules, use <a>DescribeRules</a>. To update a rule, use <a>ModifyRule</a>. To set the
     * priorities of your rules, use <a>SetRulePriorities</a>. To delete a rule, use <a>DeleteRule</a>.
     * </p>
     * 
     * @param createRuleRequest
     *        Contains the parameters for CreateRule.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateRule
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a target group.
     * </p>
     * <p>
     * To register targets with the target group, use <a>RegisterTargets</a>. To update the health check settings for
     * the target group, use <a>ModifyTargetGroup</a>. To monitor the health of targets in the target group, use
     * <a>DescribeTargetHealth</a>.
     * </p>
     * <p>
     * To route traffic to the targets in a target group, specify the target group in an action using
     * <a>CreateListener</a> or <a>CreateRule</a>.
     * </p>
     * <p>
     * To delete a target group, use <a>DeleteTargetGroup</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html">Target
     * Groups for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createTargetGroupRequest
     *        Contains the parameters for CreateTargetGroup.
     * @return A Java Future containing the result of the CreateTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.CreateTargetGroup
     */
    java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest createTargetGroupRequest);

    /**
     * <p>
     * Creates a target group.
     * </p>
     * <p>
     * To register targets with the target group, use <a>RegisterTargets</a>. To update the health check settings for
     * the target group, use <a>ModifyTargetGroup</a>. To monitor the health of targets in the target group, use
     * <a>DescribeTargetHealth</a>.
     * </p>
     * <p>
     * To route traffic to the targets in a target group, specify the target group in an action using
     * <a>CreateListener</a> or <a>CreateRule</a>.
     * </p>
     * <p>
     * To delete a target group, use <a>DeleteTargetGroup</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html">Target
     * Groups for Your Application Load Balancers</a> in the <i>Application Load Balancers Guide</i>.
     * </p>
     * 
     * @param createTargetGroupRequest
     *        Contains the parameters for CreateTargetGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.CreateTargetGroup
     */
    java.util.concurrent.Future<CreateTargetGroupResult> createTargetGroupAsync(CreateTargetGroupRequest createTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTargetGroupRequest, CreateTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * <p>
     * Alternatively, your listener is deleted when you delete the load balancer it is attached to using
     * <a>DeleteLoadBalancer</a>.
     * </p>
     * 
     * @param deleteListenerRequest
     *        Contains the parameters for DeleteListener.
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteListener
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest);

    /**
     * <p>
     * Deletes the specified listener.
     * </p>
     * <p>
     * Alternatively, your listener is deleted when you delete the load balancer it is attached to using
     * <a>DeleteLoadBalancer</a>.
     * </p>
     * 
     * @param deleteListenerRequest
     *        Contains the parameters for DeleteListener.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteListener
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteListenerRequest, DeleteListenerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Application Load Balancer and its attached listeners.
     * </p>
     * <p>
     * You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has
     * already been deleted, the call succeeds.
     * </p>
     * <p>
     * Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run
     * and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or
     * terminate them.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     *        Contains the parameters for DeleteLoadBalancer.
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteLoadBalancer
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest);

    /**
     * <p>
     * Deletes the specified Application Load Balancer and its attached listeners.
     * </p>
     * <p>
     * You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has
     * already been deleted, the call succeeds.
     * </p>
     * <p>
     * Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run
     * and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or
     * terminate them.
     * </p>
     * 
     * @param deleteLoadBalancerRequest
     *        Contains the parameters for DeleteLoadBalancer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoadBalancer operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteLoadBalancer
     */
    java.util.concurrent.Future<DeleteLoadBalancerResult> deleteLoadBalancerAsync(DeleteLoadBalancerRequest deleteLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoadBalancerRequest, DeleteLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteRuleRequest
     *        Contains the parameters for DeleteRule.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteRule
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteRuleRequest
     *        Contains the parameters for DeleteRule.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteRule
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified target group.
     * </p>
     * <p>
     * You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any
     * associated health checks.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     *        Contains the parameters for DeleteTargetGroup.
     * @return A Java Future containing the result of the DeleteTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeleteTargetGroup
     */
    java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest deleteTargetGroupRequest);

    /**
     * <p>
     * Deletes the specified target group.
     * </p>
     * <p>
     * You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any
     * associated health checks.
     * </p>
     * 
     * @param deleteTargetGroupRequest
     *        Contains the parameters for DeleteTargetGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeleteTargetGroup
     */
    java.util.concurrent.Future<DeleteTargetGroupResult> deleteTargetGroupAsync(DeleteTargetGroupRequest deleteTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTargetGroupRequest, DeleteTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no
     * longer receive traffic from the load balancer.
     * </p>
     * 
     * @param deregisterTargetsRequest
     *        Contains the parameters for DeregisterTargets.
     * @return A Java Future containing the result of the DeregisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DeregisterTargets
     */
    java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest deregisterTargetsRequest);

    /**
     * <p>
     * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no
     * longer receive traffic from the load balancer.
     * </p>
     * 
     * @param deregisterTargetsRequest
     *        Contains the parameters for DeregisterTargets.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DeregisterTargets
     */
    java.util.concurrent.Future<DeregisterTargetsResult> deregisterTargetsAsync(DeregisterTargetsRequest deregisterTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTargetsRequest, DeregisterTargetsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified listeners or the listeners for the specified Application Load Balancer. You must specify
     * either a load balancer or one or more listeners.
     * </p>
     * 
     * @param describeListenersRequest
     *        Contains the parameters for DescribeListeners.
     * @return A Java Future containing the result of the DescribeListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeListeners
     */
    java.util.concurrent.Future<DescribeListenersResult> describeListenersAsync(DescribeListenersRequest describeListenersRequest);

    /**
     * <p>
     * Describes the specified listeners or the listeners for the specified Application Load Balancer. You must specify
     * either a load balancer or one or more listeners.
     * </p>
     * 
     * @param describeListenersRequest
     *        Contains the parameters for DescribeListeners.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeListeners operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeListeners
     */
    java.util.concurrent.Future<DescribeListenersResult> describeListenersAsync(DescribeListenersRequest describeListenersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeListenersRequest, DescribeListenersResult> asyncHandler);

    /**
     * <p>
     * Describes the attributes for the specified Application Load Balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     *        Contains the parameters for DescribeLoadBalancerAttributes.
     * @return A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancerAttributes
     */
    java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest);

    /**
     * <p>
     * Describes the attributes for the specified Application Load Balancer.
     * </p>
     * 
     * @param describeLoadBalancerAttributesRequest
     *        Contains the parameters for DescribeLoadBalancerAttributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancerAttributes
     */
    java.util.concurrent.Future<DescribeLoadBalancerAttributesResult> describeLoadBalancerAttributesAsync(
            DescribeLoadBalancerAttributesRequest describeLoadBalancerAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerAttributesRequest, DescribeLoadBalancerAttributesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified Application Load Balancers or all of your Application Load Balancers.
     * </p>
     * <p>
     * To describe the listeners for a load balancer, use <a>DescribeListeners</a>. To describe the attributes for a
     * load balancer, use <a>DescribeLoadBalancerAttributes</a>.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeLoadBalancers
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * <p>
     * Describes the specified Application Load Balancers or all of your Application Load Balancers.
     * </p>
     * <p>
     * To describe the listeners for a load balancer, use <a>DescribeListeners</a>. To describe the attributes for a
     * load balancer, use <a>DescribeLoadBalancerAttributes</a>.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeLoadBalancers
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one
     * or more rules.
     * </p>
     * 
     * @param describeRulesRequest
     *        Contains the parameters for DescribeRules.
     * @return A Java Future containing the result of the DescribeRules operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeRules
     */
    java.util.concurrent.Future<DescribeRulesResult> describeRulesAsync(DescribeRulesRequest describeRulesRequest);

    /**
     * <p>
     * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one
     * or more rules.
     * </p>
     * 
     * @param describeRulesRequest
     *        Contains the parameters for DescribeRules.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRules operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeRules
     */
    java.util.concurrent.Future<DescribeRulesResult> describeRulesAsync(DescribeRulesRequest describeRulesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRulesRequest, DescribeRulesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified policies or all policies used for SSL negotiation.
     * </p>
     * <p>
     * Note that the only supported policy at this time is ELBSecurityPolicy-2015-05.
     * </p>
     * 
     * @param describeSSLPoliciesRequest
     *        Contains the parameters for DescribeSSLPolicies.
     * @return A Java Future containing the result of the DescribeSSLPolicies operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeSSLPolicies
     */
    java.util.concurrent.Future<DescribeSSLPoliciesResult> describeSSLPoliciesAsync(DescribeSSLPoliciesRequest describeSSLPoliciesRequest);

    /**
     * <p>
     * Describes the specified policies or all policies used for SSL negotiation.
     * </p>
     * <p>
     * Note that the only supported policy at this time is ELBSecurityPolicy-2015-05.
     * </p>
     * 
     * @param describeSSLPoliciesRequest
     *        Contains the parameters for DescribeSSLPolicies.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSSLPolicies operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeSSLPolicies
     */
    java.util.concurrent.Future<DescribeSSLPoliciesResult> describeSSLPoliciesAsync(DescribeSSLPoliciesRequest describeSSLPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSSLPoliciesRequest, DescribeSSLPoliciesResult> asyncHandler);

    /**
     * <p>
     * Describes the tags for the specified resources.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the tags for the specified resources.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the attributes for the specified target group.
     * </p>
     * 
     * @param describeTargetGroupAttributesRequest
     *        Contains the parameters for DescribeTargetGroupAttributes.
     * @return A Java Future containing the result of the DescribeTargetGroupAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTargetGroupAttributes
     */
    java.util.concurrent.Future<DescribeTargetGroupAttributesResult> describeTargetGroupAttributesAsync(
            DescribeTargetGroupAttributesRequest describeTargetGroupAttributesRequest);

    /**
     * <p>
     * Describes the attributes for the specified target group.
     * </p>
     * 
     * @param describeTargetGroupAttributesRequest
     *        Contains the parameters for DescribeTargetGroupAttributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTargetGroupAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTargetGroupAttributes
     */
    java.util.concurrent.Future<DescribeTargetGroupAttributesResult> describeTargetGroupAttributesAsync(
            DescribeTargetGroupAttributesRequest describeTargetGroupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTargetGroupAttributesRequest, DescribeTargetGroupAttributesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified target groups or all of your target groups. By default, all target groups are described.
     * Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the
     * names of one or more target groups, or the ARNs of one or more target groups.
     * </p>
     * <p>
     * To describe the targets for a target group, use <a>DescribeTargetHealth</a>. To describe the attributes of a
     * target group, use <a>DescribeTargetGroupAttributes</a>.
     * </p>
     * 
     * @param describeTargetGroupsRequest
     *        Contains the parameters for DescribeTargetGroups.
     * @return A Java Future containing the result of the DescribeTargetGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTargetGroups
     */
    java.util.concurrent.Future<DescribeTargetGroupsResult> describeTargetGroupsAsync(DescribeTargetGroupsRequest describeTargetGroupsRequest);

    /**
     * <p>
     * Describes the specified target groups or all of your target groups. By default, all target groups are described.
     * Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the
     * names of one or more target groups, or the ARNs of one or more target groups.
     * </p>
     * <p>
     * To describe the targets for a target group, use <a>DescribeTargetHealth</a>. To describe the attributes of a
     * target group, use <a>DescribeTargetGroupAttributes</a>.
     * </p>
     * 
     * @param describeTargetGroupsRequest
     *        Contains the parameters for DescribeTargetGroups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTargetGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTargetGroups
     */
    java.util.concurrent.Future<DescribeTargetGroupsResult> describeTargetGroupsAsync(DescribeTargetGroupsRequest describeTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTargetGroupsRequest, DescribeTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes the health of the specified targets or all of your targets.
     * </p>
     * 
     * @param describeTargetHealthRequest
     *        Contains the parameters for DescribeTargetHealth.
     * @return A Java Future containing the result of the DescribeTargetHealth operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.DescribeTargetHealth
     */
    java.util.concurrent.Future<DescribeTargetHealthResult> describeTargetHealthAsync(DescribeTargetHealthRequest describeTargetHealthRequest);

    /**
     * <p>
     * Describes the health of the specified targets or all of your targets.
     * </p>
     * 
     * @param describeTargetHealthRequest
     *        Contains the parameters for DescribeTargetHealth.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTargetHealth operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.DescribeTargetHealth
     */
    java.util.concurrent.Future<DescribeTargetHealthResult> describeTargetHealthAsync(DescribeTargetHealthRequest describeTargetHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTargetHealthRequest, DescribeTargetHealthResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified properties of the specified listener.
     * </p>
     * <p>
     * Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to
     * HTTP removes the security policy and SSL certificate properties. If you change the protocol from HTTP to HTTPS,
     * you must add the security policy.
     * </p>
     * 
     * @param modifyListenerRequest
     *        Contains the parameters for ModifyListener.
     * @return A Java Future containing the result of the ModifyListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyListener
     */
    java.util.concurrent.Future<ModifyListenerResult> modifyListenerAsync(ModifyListenerRequest modifyListenerRequest);

    /**
     * <p>
     * Modifies the specified properties of the specified listener.
     * </p>
     * <p>
     * Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to
     * HTTP removes the security policy and SSL certificate properties. If you change the protocol from HTTP to HTTPS,
     * you must add the security policy.
     * </p>
     * 
     * @param modifyListenerRequest
     *        Contains the parameters for ModifyListener.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyListener operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyListener
     */
    java.util.concurrent.Future<ModifyListenerResult> modifyListenerAsync(ModifyListenerRequest modifyListenerRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyListenerRequest, ModifyListenerResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified attributes of the specified Application Load Balancer.
     * </p>
     * <p>
     * If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
     * you do not modify retain their current values.
     * </p>
     * 
     * @param modifyLoadBalancerAttributesRequest
     *        Contains the parameters for ModifyLoadBalancerAttributes.
     * @return A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyLoadBalancerAttributes
     */
    java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest);

    /**
     * <p>
     * Modifies the specified attributes of the specified Application Load Balancer.
     * </p>
     * <p>
     * If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that
     * you do not modify retain their current values.
     * </p>
     * 
     * @param modifyLoadBalancerAttributesRequest
     *        Contains the parameters for ModifyLoadBalancerAttributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyLoadBalancerAttributes operation returned by the
     *         service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyLoadBalancerAttributes
     */
    java.util.concurrent.Future<ModifyLoadBalancerAttributesResult> modifyLoadBalancerAttributesAsync(
            ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyLoadBalancerAttributesRequest, ModifyLoadBalancerAttributesResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified rule.
     * </p>
     * <p>
     * Any existing properties that you do not modify retain their current values.
     * </p>
     * <p>
     * To modify the default action, use <a>ModifyListener</a>.
     * </p>
     * 
     * @param modifyRuleRequest
     *        Contains the parameters for ModifyRules.
     * @return A Java Future containing the result of the ModifyRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyRule
     */
    java.util.concurrent.Future<ModifyRuleResult> modifyRuleAsync(ModifyRuleRequest modifyRuleRequest);

    /**
     * <p>
     * Modifies the specified rule.
     * </p>
     * <p>
     * Any existing properties that you do not modify retain their current values.
     * </p>
     * <p>
     * To modify the default action, use <a>ModifyListener</a>.
     * </p>
     * 
     * @param modifyRuleRequest
     *        Contains the parameters for ModifyRules.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyRule operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyRule
     */
    java.util.concurrent.Future<ModifyRuleResult> modifyRuleAsync(ModifyRuleRequest modifyRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyRuleRequest, ModifyRuleResult> asyncHandler);

    /**
     * <p>
     * Modifies the health checks used when evaluating the health state of the targets in the specified target group.
     * </p>
     * <p>
     * To monitor the health of the targets, use <a>DescribeTargetHealth</a>.
     * </p>
     * 
     * @param modifyTargetGroupRequest
     *        Contains the parameters for ModifyTargetGroup.
     * @return A Java Future containing the result of the ModifyTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyTargetGroup
     */
    java.util.concurrent.Future<ModifyTargetGroupResult> modifyTargetGroupAsync(ModifyTargetGroupRequest modifyTargetGroupRequest);

    /**
     * <p>
     * Modifies the health checks used when evaluating the health state of the targets in the specified target group.
     * </p>
     * <p>
     * To monitor the health of the targets, use <a>DescribeTargetHealth</a>.
     * </p>
     * 
     * @param modifyTargetGroupRequest
     *        Contains the parameters for ModifyTargetGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyTargetGroup operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyTargetGroup
     */
    java.util.concurrent.Future<ModifyTargetGroupResult> modifyTargetGroupAsync(ModifyTargetGroupRequest modifyTargetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyTargetGroupRequest, ModifyTargetGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified attributes of the specified target group.
     * </p>
     * 
     * @param modifyTargetGroupAttributesRequest
     *        Contains the parameters for ModifyTargetGroupAttributes.
     * @return A Java Future containing the result of the ModifyTargetGroupAttributes operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.ModifyTargetGroupAttributes
     */
    java.util.concurrent.Future<ModifyTargetGroupAttributesResult> modifyTargetGroupAttributesAsync(
            ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest);

    /**
     * <p>
     * Modifies the specified attributes of the specified target group.
     * </p>
     * 
     * @param modifyTargetGroupAttributesRequest
     *        Contains the parameters for ModifyTargetGroupAttributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyTargetGroupAttributes operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.ModifyTargetGroupAttributes
     */
    java.util.concurrent.Future<ModifyTargetGroupAttributesResult> modifyTargetGroupAttributesAsync(
            ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyTargetGroupAttributesRequest, ModifyTargetGroupAttributesResult> asyncHandler);

    /**
     * <p>
     * Registers the specified targets with the specified target group.
     * </p>
     * <p>
     * By default, the load balancer routes requests to registered targets using the protocol and port number for the
     * target group. Alternatively, you can override the port for a target when you register it.
     * </p>
     * <p>
     * The target must be in the virtual private cloud (VPC) that you specified for the target group. If the target is
     * an EC2 instance, it can't be in the <code>stopped</code> or <code>running</code> state when you register it.
     * </p>
     * <p>
     * To remove a target from a target group, use <a>DeregisterTargets</a>.
     * </p>
     * 
     * @param registerTargetsRequest
     *        Contains the parameters for RegisterTargets.
     * @return A Java Future containing the result of the RegisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.RegisterTargets
     */
    java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest registerTargetsRequest);

    /**
     * <p>
     * Registers the specified targets with the specified target group.
     * </p>
     * <p>
     * By default, the load balancer routes requests to registered targets using the protocol and port number for the
     * target group. Alternatively, you can override the port for a target when you register it.
     * </p>
     * <p>
     * The target must be in the virtual private cloud (VPC) that you specified for the target group. If the target is
     * an EC2 instance, it can't be in the <code>stopped</code> or <code>running</code> state when you register it.
     * </p>
     * <p>
     * To remove a target from a target group, use <a>DeregisterTargets</a>.
     * </p>
     * 
     * @param registerTargetsRequest
     *        Contains the parameters for RegisterTargets.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTargets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.RegisterTargets
     */
    java.util.concurrent.Future<RegisterTargetsResult> registerTargetsAsync(RegisterTargetsRequest registerTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTargetsRequest, RegisterTargetsResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>DescribeTags</a>.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>DescribeTags</a>.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * Sets the priorities of the specified rules.
     * </p>
     * <p>
     * You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
     * you do not specify retain their current priority.
     * </p>
     * 
     * @param setRulePrioritiesRequest
     *        Contains the parameters for SetRulePriorities.
     * @return A Java Future containing the result of the SetRulePriorities operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.SetRulePriorities
     */
    java.util.concurrent.Future<SetRulePrioritiesResult> setRulePrioritiesAsync(SetRulePrioritiesRequest setRulePrioritiesRequest);

    /**
     * <p>
     * Sets the priorities of the specified rules.
     * </p>
     * <p>
     * You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that
     * you do not specify retain their current priority.
     * </p>
     * 
     * @param setRulePrioritiesRequest
     *        Contains the parameters for SetRulePriorities.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetRulePriorities operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetRulePriorities
     */
    java.util.concurrent.Future<SetRulePrioritiesResult> setRulePrioritiesAsync(SetRulePrioritiesRequest setRulePrioritiesRequest,
            com.amazonaws.handlers.AsyncHandler<SetRulePrioritiesRequest, SetRulePrioritiesResult> asyncHandler);

    /**
     * <p>
     * Associates the specified security groups with the specified load balancer. The specified security groups override
     * the previously associated security groups.
     * </p>
     * 
     * @param setSecurityGroupsRequest
     *        Contains the parameters for SetSecurityGroups.
     * @return A Java Future containing the result of the SetSecurityGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.SetSecurityGroups
     */
    java.util.concurrent.Future<SetSecurityGroupsResult> setSecurityGroupsAsync(SetSecurityGroupsRequest setSecurityGroupsRequest);

    /**
     * <p>
     * Associates the specified security groups with the specified load balancer. The specified security groups override
     * the previously associated security groups.
     * </p>
     * 
     * @param setSecurityGroupsRequest
     *        Contains the parameters for SetSecurityGroups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetSecurityGroups operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetSecurityGroups
     */
    java.util.concurrent.Future<SetSecurityGroupsResult> setSecurityGroupsAsync(SetSecurityGroupsRequest setSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<SetSecurityGroupsRequest, SetSecurityGroupsResult> asyncHandler);

    /**
     * <p>
     * Enables the Availability Zone for the specified subnets for the specified load balancer. The specified subnets
     * replace the previously enabled subnets.
     * </p>
     * 
     * @param setSubnetsRequest
     *        Contains the parameters for SetSubnets.
     * @return A Java Future containing the result of the SetSubnets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsync.SetSubnets
     */
    java.util.concurrent.Future<SetSubnetsResult> setSubnetsAsync(SetSubnetsRequest setSubnetsRequest);

    /**
     * <p>
     * Enables the Availability Zone for the specified subnets for the specified load balancer. The specified subnets
     * replace the previously enabled subnets.
     * </p>
     * 
     * @param setSubnetsRequest
     *        Contains the parameters for SetSubnets.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetSubnets operation returned by the service.
     * @sample AmazonElasticLoadBalancingAsyncHandler.SetSubnets
     */
    java.util.concurrent.Future<SetSubnetsResult> setSubnetsAsync(SetSubnetsRequest setSubnetsRequest,
            com.amazonaws.handlers.AsyncHandler<SetSubnetsRequest, SetSubnetsResult> asyncHandler);

}
