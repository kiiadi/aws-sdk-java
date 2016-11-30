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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CloneStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The source stack ID.
     * </p>
     */
    private String sourceStackId;
    /**
     * <p>
     * The cloned stack name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All instances
     * are launched into this VPC, and you cannot change the ID later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your account supports EC2 Classic, the default value is no VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account does not support EC2 Classic, the default value is the default VPC for the specified region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the VPC ID corresponds to a default VPC and you have specified either the <code>DefaultAvailabilityZone</code>
     * or the <code>DefaultSubnetId</code> parameter only, AWS OpsWorks infers the value of the other parameter. If you
     * specify neither parameter, AWS OpsWorks sets these parameters to the first valid Availability Zone for the
     * specified region and the corresponding default VPC subnet ID, respectively.
     * </p>
     * <p>
     * If you specify a nondefault VPC ID, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must belong to a VPC in your account that is in the specified region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify a value for <code>DefaultSubnetId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to use AWS OpsWorks with a VPC, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html">Running a Stack in a VPC</a>.
     * For more information on default VPC and EC2 Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * A list of stack attributes and values as key/value pairs to be added to the cloned stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;
    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks to work with AWS resources on
     * your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. If you
     * create a stack by using the AWS OpsWorks console, it creates the role for you. You can obtain an existing stack's
     * IAM ARN programmatically by calling <a>DescribePermissions</a>. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * <note>
     * <p>
     * You must set this parameter to a valid service role ARN or the action will fail; there is no default value. You
     * can specify the source stack's service role ARN, if you prefer, but you must do so explicitly.
     * </p>
     * </note>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     */
    private String defaultInstanceProfileArn;
    /**
     * <p>
     * The stack's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information on how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the parent stack's operating system. For more information on the supported operating
     * systems, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks
     * Operating Systems</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     */
    private String defaultOs;
    /**
     * <p>
     * The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     */
    private String hostnameTheme;
    /**
     * <p>
     * The cloned stack's default Availability Zone, which must be in the specified region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see the
     * <code>VpcId</code> parameter description.
     * </p>
     */
    private String defaultAvailabilityZone;
    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     */
    private String defaultSubnetId;
    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>
     * </p>
     */
    private String customJson;
    /**
     * <p>
     * The configuration manager. When you clone a stack we recommend that you use the configuration manager to specify
     * the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux
     * stacks is currently 12.
     * </p>
     */
    private StackConfigurationManager configurationManager;
    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     */
    private ChefConfiguration chefConfiguration;
    /**
     * <p>
     * Whether to use custom cookbooks.
     * </p>
     */
    private Boolean useCustomCookbooks;
    /**
     * <p>
     * Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are associated with
     * layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide your own custom security
     * groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer (default
     * setting). You can associate additional security groups with a layer after you create it but you cannot delete the
     * built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate Amazon
     * Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you
     * create. However, you can still manually associate a built-in security group with a layer on creation; custom
     * security groups are required only for those layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     */
    private Boolean useOpsworksSecurityGroups;

    private Source customCookbooksSource;
    /**
     * <p>
     * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks
     * installs the public key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html">
     * Managing SSH Access</a>. You can override this setting by specifying a different key pair, or no key pair, when
     * you <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     * instance</a>.
     * </p>
     */
    private String defaultSshKeyName;
    /**
     * <p>
     * Whether to clone the source stack's permissions.
     * </p>
     */
    private Boolean clonePermissions;
    /**
     * <p>
     * A list of source stack app IDs to be included in the cloned stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cloneAppIds;
    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the cloned stack, but you can
     * override it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     */
    private String defaultRootDeviceType;
    /**
     * <p>
     * The default AWS OpsWorks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks automatically installs new agent versions
     * on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks then automatically installs that version on the
     * stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     */
    private String agentVersion;

    /**
     * <p>
     * The source stack ID.
     * </p>
     * 
     * @param sourceStackId
     *        The source stack ID.
     */

    public void setSourceStackId(String sourceStackId) {
        this.sourceStackId = sourceStackId;
    }

    /**
     * <p>
     * The source stack ID.
     * </p>
     * 
     * @return The source stack ID.
     */

    public String getSourceStackId() {
        return this.sourceStackId;
    }

    /**
     * <p>
     * The source stack ID.
     * </p>
     * 
     * @param sourceStackId
     *        The source stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withSourceStackId(String sourceStackId) {
        setSourceStackId(sourceStackId);
        return this;
    }

    /**
     * <p>
     * The cloned stack name.
     * </p>
     * 
     * @param name
     *        The cloned stack name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The cloned stack name.
     * </p>
     * 
     * @return The cloned stack name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The cloned stack name.
     * </p>
     * 
     * @param name
     *        The cloned stack name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All instances
     * are launched into this VPC, and you cannot change the ID later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your account supports EC2 Classic, the default value is no VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account does not support EC2 Classic, the default value is the default VPC for the specified region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the VPC ID corresponds to a default VPC and you have specified either the <code>DefaultAvailabilityZone</code>
     * or the <code>DefaultSubnetId</code> parameter only, AWS OpsWorks infers the value of the other parameter. If you
     * specify neither parameter, AWS OpsWorks sets these parameters to the first valid Availability Zone for the
     * specified region and the corresponding default VPC subnet ID, respectively.
     * </p>
     * <p>
     * If you specify a nondefault VPC ID, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must belong to a VPC in your account that is in the specified region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify a value for <code>DefaultSubnetId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to use AWS OpsWorks with a VPC, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html">Running a Stack in a VPC</a>.
     * For more information on default VPC and EC2 Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All
     *        instances are launched into this VPC, and you cannot change the ID later.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If your account supports EC2 Classic, the default value is no VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your account does not support EC2 Classic, the default value is the default VPC for the specified
     *        region.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the VPC ID corresponds to a default VPC and you have specified either the
     *        <code>DefaultAvailabilityZone</code> or the <code>DefaultSubnetId</code> parameter only, AWS OpsWorks
     *        infers the value of the other parameter. If you specify neither parameter, AWS OpsWorks sets these
     *        parameters to the first valid Availability Zone for the specified region and the corresponding default VPC
     *        subnet ID, respectively.
     *        </p>
     *        <p>
     *        If you specify a nondefault VPC ID, note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must belong to a VPC in your account that is in the specified region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You must specify a value for <code>DefaultSubnetId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on how to use AWS OpsWorks with a VPC, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html">Running a Stack in a
     *        VPC</a>. For more information on default VPC and EC2 Classic, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *        Platforms</a>.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All instances
     * are launched into this VPC, and you cannot change the ID later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your account supports EC2 Classic, the default value is no VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account does not support EC2 Classic, the default value is the default VPC for the specified region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the VPC ID corresponds to a default VPC and you have specified either the <code>DefaultAvailabilityZone</code>
     * or the <code>DefaultSubnetId</code> parameter only, AWS OpsWorks infers the value of the other parameter. If you
     * specify neither parameter, AWS OpsWorks sets these parameters to the first valid Availability Zone for the
     * specified region and the corresponding default VPC subnet ID, respectively.
     * </p>
     * <p>
     * If you specify a nondefault VPC ID, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must belong to a VPC in your account that is in the specified region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify a value for <code>DefaultSubnetId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to use AWS OpsWorks with a VPC, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html">Running a Stack in a VPC</a>.
     * For more information on default VPC and EC2 Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     * 
     * @return The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All
     *         instances are launched into this VPC, and you cannot change the ID later.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If your account supports EC2 Classic, the default value is no VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your account does not support EC2 Classic, the default value is the default VPC for the specified
     *         region.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the VPC ID corresponds to a default VPC and you have specified either the
     *         <code>DefaultAvailabilityZone</code> or the <code>DefaultSubnetId</code> parameter only, AWS OpsWorks
     *         infers the value of the other parameter. If you specify neither parameter, AWS OpsWorks sets these
     *         parameters to the first valid Availability Zone for the specified region and the corresponding default
     *         VPC subnet ID, respectively.
     *         </p>
     *         <p>
     *         If you specify a nondefault VPC ID, note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It must belong to a VPC in your account that is in the specified region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must specify a value for <code>DefaultSubnetId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information on how to use AWS OpsWorks with a VPC, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html">Running a Stack in a
     *         VPC</a>. For more information on default VPC and EC2 Classic, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *         Platforms</a>.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All instances
     * are launched into this VPC, and you cannot change the ID later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your account supports EC2 Classic, the default value is no VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your account does not support EC2 Classic, the default value is the default VPC for the specified region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the VPC ID corresponds to a default VPC and you have specified either the <code>DefaultAvailabilityZone</code>
     * or the <code>DefaultSubnetId</code> parameter only, AWS OpsWorks infers the value of the other parameter. If you
     * specify neither parameter, AWS OpsWorks sets these parameters to the first valid Availability Zone for the
     * specified region and the corresponding default VPC subnet ID, respectively.
     * </p>
     * <p>
     * If you specify a nondefault VPC ID, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must belong to a VPC in your account that is in the specified region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify a value for <code>DefaultSubnetId</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information on how to use AWS OpsWorks with a VPC, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html">Running a Stack in a VPC</a>.
     * For more information on default VPC and EC2 Classic, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported Platforms</a>.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All
     *        instances are launched into this VPC, and you cannot change the ID later.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If your account supports EC2 Classic, the default value is no VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your account does not support EC2 Classic, the default value is the default VPC for the specified
     *        region.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the VPC ID corresponds to a default VPC and you have specified either the
     *        <code>DefaultAvailabilityZone</code> or the <code>DefaultSubnetId</code> parameter only, AWS OpsWorks
     *        infers the value of the other parameter. If you specify neither parameter, AWS OpsWorks sets these
     *        parameters to the first valid Availability Zone for the specified region and the corresponding default VPC
     *        subnet ID, respectively.
     *        </p>
     *        <p>
     *        If you specify a nondefault VPC ID, note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must belong to a VPC in your account that is in the specified region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You must specify a value for <code>DefaultSubnetId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information on how to use AWS OpsWorks with a VPC, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-vpc.html">Running a Stack in a
     *        VPC</a>. For more information on default VPC and EC2 Classic, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html">Supported
     *        Platforms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * A list of stack attributes and values as key/value pairs to be added to the cloned stack.
     * </p>
     * 
     * @return A list of stack attributes and values as key/value pairs to be added to the cloned stack.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A list of stack attributes and values as key/value pairs to be added to the cloned stack.
     * </p>
     * 
     * @param attributes
     *        A list of stack attributes and values as key/value pairs to be added to the cloned stack.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A list of stack attributes and values as key/value pairs to be added to the cloned stack.
     * </p>
     * 
     * @param attributes
     *        A list of stack attributes and values as key/value pairs to be added to the cloned stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public CloneStackRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks to work with AWS resources on
     * your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. If you
     * create a stack by using the AWS OpsWorks console, it creates the role for you. You can obtain an existing stack's
     * IAM ARN programmatically by calling <a>DescribePermissions</a>. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * <note>
     * <p>
     * You must set this parameter to a valid service role ARN or the action will fail; there is no default value. You
     * can specify the source stack's service role ARN, if you prefer, but you must do so explicitly.
     * </p>
     * </note>
     * 
     * @param serviceRoleArn
     *        The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks to work with AWS
     *        resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing
     *        IAM role. If you create a stack by using the AWS OpsWorks console, it creates the role for you. You can
     *        obtain an existing stack's IAM ARN programmatically by calling <a>DescribePermissions</a>. For more
     *        information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.</p>
     *        <note>
     *        <p>
     *        You must set this parameter to a valid service role ARN or the action will fail; there is no default
     *        value. You can specify the source stack's service role ARN, if you prefer, but you must do so explicitly.
     *        </p>
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks to work with AWS resources on
     * your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. If you
     * create a stack by using the AWS OpsWorks console, it creates the role for you. You can obtain an existing stack's
     * IAM ARN programmatically by calling <a>DescribePermissions</a>. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * <note>
     * <p>
     * You must set this parameter to a valid service role ARN or the action will fail; there is no default value. You
     * can specify the source stack's service role ARN, if you prefer, but you must do so explicitly.
     * </p>
     * </note>
     * 
     * @return The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks to work with AWS
     *         resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing
     *         IAM role. If you create a stack by using the AWS OpsWorks console, it creates the role for you. You can
     *         obtain an existing stack's IAM ARN programmatically by calling <a>DescribePermissions</a>. For more
     *         information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.</p>
     *         <note>
     *         <p>
     *         You must set this parameter to a valid service role ARN or the action will fail; there is no default
     *         value. You can specify the source stack's service role ARN, if you prefer, but you must do so explicitly.
     *         </p>
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks to work with AWS resources on
     * your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. If you
     * create a stack by using the AWS OpsWorks console, it creates the role for you. You can obtain an existing stack's
     * IAM ARN programmatically by calling <a>DescribePermissions</a>. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * <note>
     * <p>
     * You must set this parameter to a valid service role ARN or the action will fail; there is no default value. You
     * can specify the source stack's service role ARN, if you prefer, but you must do so explicitly.
     * </p>
     * </note>
     * 
     * @param serviceRoleArn
     *        The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks to work with AWS
     *        resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing
     *        IAM role. If you create a stack by using the AWS OpsWorks console, it creates the role for you. You can
     *        obtain an existing stack's IAM ARN programmatically by calling <a>DescribePermissions</a>. For more
     *        information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.</p>
     *        <note>
     *        <p>
     *        You must set this parameter to a valid service role ARN or the action will fail; there is no default
     *        value. You can specify the source stack's service role ARN, if you prefer, but you must do so explicitly.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @param defaultInstanceProfileArn
     *        The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2
     *        instances. For more information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public void setDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public String getDefaultInstanceProfileArn() {
        return this.defaultInstanceProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @param defaultInstanceProfileArn
     *        The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2
     *        instances. For more information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        setDefaultInstanceProfileArn(defaultInstanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The stack's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information on how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the parent stack's operating system. For more information on the supported operating
     * systems, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks
     * Operating Systems</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     * 
     * @param defaultOs
     *        The stack's operating system, which must be set to one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2016.03</code>,
     *        <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>,
     *        or <code>Ubuntu 12.04 LTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CentOS 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Red Hat Enterprise Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Microsoft Windows Server 2012 R2 Base</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances.
     *        For more information on how to use custom AMIs with OpsWorks, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default option is the parent stack's operating system. For more information on the supported operating
     *        systems, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     *        OpsWorks Operating Systems</a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux
     *        to Windows or Windows to Linux.
     *        </p>
     */

    public void setDefaultOs(String defaultOs) {
        this.defaultOs = defaultOs;
    }

    /**
     * <p>
     * The stack's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information on how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the parent stack's operating system. For more information on the supported operating
     * systems, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks
     * Operating Systems</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     * 
     * @return The stack's operating system, which must be set to one of the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2016.03</code>,
     *         <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>
     *         , or <code>Ubuntu 12.04 LTS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CentOS 7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Red Hat Enterprise Linux 7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Microsoft Windows Server 2012 R2 Base</code>,
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances.
     *         For more information on how to use custom AMIs with OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *         AMIs</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default option is the parent stack's operating system. For more information on the supported
     *         operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks
     *         Operating Systems</a>.
     *         </p>
     *         <note>
     *         <p>
     *         You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux
     *         to Windows or Windows to Linux.
     *         </p>
     */

    public String getDefaultOs() {
        return this.defaultOs;
    }

    /**
     * <p>
     * The stack's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances. For more
     * information on how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default option is the parent stack's operating system. For more information on the supported operating
     * systems, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks
     * Operating Systems</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     * 
     * @param defaultOs
     *        The stack's operating system, which must be set to one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2016.03</code>,
     *        <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>,
     *        or <code>Ubuntu 12.04 LTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CentOS 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Red Hat Enterprise Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Microsoft Windows Server 2012 R2 Base</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom AMI: <code>Custom</code>. You specify the custom AMI you want to use when you create instances.
     *        For more information on how to use custom AMIs with OpsWorks, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default option is the parent stack's operating system. For more information on the supported operating
     *        systems, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     *        OpsWorks Operating Systems</a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux
     *        to Windows or Windows to Linux.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withDefaultOs(String defaultOs) {
        setDefaultOs(defaultOs);
        return this;
    }

    /**
     * <p>
     * The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     * 
     * @param hostnameTheme
     *        The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host
     *        names for the stack's instances. By default, <code>HostnameTheme</code> is set to
     *        <code>Layer_Dependent</code>, which creates host names by appending integers to the layer's short name.
     *        The other themes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Baked_Goods</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Clouds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Europe_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fruits</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Greek_Deities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Legendary_creatures_from_Japan</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Planets_and_Moons</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Roman_Deities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Scottish_Islands</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>US_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Wild_Cats</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based
     *        on the current theme.
     */

    public void setHostnameTheme(String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
    }

    /**
     * <p>
     * The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     * 
     * @return The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host
     *         names for the stack's instances. By default, <code>HostnameTheme</code> is set to
     *         <code>Layer_Dependent</code>, which creates host names by appending integers to the layer's short name.
     *         The other themes are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Baked_Goods</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Clouds</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Europe_Cities</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fruits</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Greek_Deities</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Legendary_creatures_from_Japan</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Planets_and_Moons</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Roman_Deities</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Scottish_Islands</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>US_Cities</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Wild_Cats</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based
     *         on the current theme.
     */

    public String getHostnameTheme() {
        return this.hostnameTheme;
    }

    /**
     * <p>
     * The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host names
     * for the stack's instances. By default, <code>HostnameTheme</code> is set to <code>Layer_Dependent</code>, which
     * creates host names by appending integers to the layer's short name. The other themes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baked_Goods</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Clouds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Europe_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fruits</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Greek_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Legendary_creatures_from_Japan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Planets_and_Moons</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Roman_Deities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Scottish_Islands</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>US_Cities</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Wild_Cats</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based on the
     * current theme.
     * </p>
     * 
     * @param hostnameTheme
     *        The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host
     *        names for the stack's instances. By default, <code>HostnameTheme</code> is set to
     *        <code>Layer_Dependent</code>, which creates host names by appending integers to the layer's short name.
     *        The other themes are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Baked_Goods</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Clouds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Europe_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fruits</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Greek_Deities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Legendary_creatures_from_Japan</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Planets_and_Moons</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Roman_Deities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Scottish_Islands</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>US_Cities</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Wild_Cats</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To obtain a generated host name, call <code>GetHostNameSuggestion</code>, which returns a host name based
     *        on the current theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withHostnameTheme(String hostnameTheme) {
        setHostnameTheme(hostnameTheme);
        return this;
    }

    /**
     * <p>
     * The cloned stack's default Availability Zone, which must be in the specified region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see the
     * <code>VpcId</code> parameter description.
     * </p>
     * 
     * @param defaultAvailabilityZone
     *        The cloned stack's default Availability Zone, which must be in the specified region. For more information,
     *        see <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you
     *        also specify a value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more
     *        information, see the <code>VpcId</code> parameter description.
     */

    public void setDefaultAvailabilityZone(String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }

    /**
     * <p>
     * The cloned stack's default Availability Zone, which must be in the specified region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see the
     * <code>VpcId</code> parameter description.
     * </p>
     * 
     * @return The cloned stack's default Availability Zone, which must be in the specified region. For more
     *         information, see <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and
     *         Endpoints</a>. If you also specify a value for <code>DefaultSubnetId</code>, the subnet must be in the
     *         same zone. For more information, see the <code>VpcId</code> parameter description.
     */

    public String getDefaultAvailabilityZone() {
        return this.defaultAvailabilityZone;
    }

    /**
     * <p>
     * The cloned stack's default Availability Zone, which must be in the specified region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you also specify a
     * value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more information, see the
     * <code>VpcId</code> parameter description.
     * </p>
     * 
     * @param defaultAvailabilityZone
     *        The cloned stack's default Availability Zone, which must be in the specified region. For more information,
     *        see <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>. If you
     *        also specify a value for <code>DefaultSubnetId</code>, the subnet must be in the same zone. For more
     *        information, see the <code>VpcId</code> parameter description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withDefaultAvailabilityZone(String defaultAvailabilityZone) {
        setDefaultAvailabilityZone(defaultAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     * 
     * @param defaultSubnetId
     *        The stack's default VPC subnet ID. This parameter is required if you specify a value for the
     *        <code>VpcId</code> parameter. All instances are launched into this subnet unless you specify otherwise
     *        when you create the instance. If you also specify a value for <code>DefaultAvailabilityZone</code>, the
     *        subnet must be in that zone. For information on default values and when this parameter is required, see
     *        the <code>VpcId</code> parameter description.
     */

    public void setDefaultSubnetId(String defaultSubnetId) {
        this.defaultSubnetId = defaultSubnetId;
    }

    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     * 
     * @return The stack's default VPC subnet ID. This parameter is required if you specify a value for the
     *         <code>VpcId</code> parameter. All instances are launched into this subnet unless you specify otherwise
     *         when you create the instance. If you also specify a value for <code>DefaultAvailabilityZone</code>, the
     *         subnet must be in that zone. For information on default values and when this parameter is required, see
     *         the <code>VpcId</code> parameter description.
     */

    public String getDefaultSubnetId() {
        return this.defaultSubnetId;
    }

    /**
     * <p>
     * The stack's default VPC subnet ID. This parameter is required if you specify a value for the <code>VpcId</code>
     * parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance.
     * If you also specify a value for <code>DefaultAvailabilityZone</code>, the subnet must be in that zone. For
     * information on default values and when this parameter is required, see the <code>VpcId</code> parameter
     * description.
     * </p>
     * 
     * @param defaultSubnetId
     *        The stack's default VPC subnet ID. This parameter is required if you specify a value for the
     *        <code>VpcId</code> parameter. All instances are launched into this subnet unless you specify otherwise
     *        when you create the instance. If you also specify a value for <code>DefaultAvailabilityZone</code>, the
     *        subnet must be in that zone. For information on default values and when this parameter is required, see
     *        the <code>VpcId</code> parameter description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withDefaultSubnetId(String defaultSubnetId) {
        setDefaultSubnetId(defaultSubnetId);
        return this;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     *        configuration JSON values. The string should be in the following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information on custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>
     */

    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>
     * </p>
     * 
     * @return A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     *         configuration JSON values. The string should be in the following format:</p>
     *         <p>
     *         <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *         </p>
     *         <p>
     *         For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *         Modify the Stack Configuration Attributes</a>
     */

    public String getCustomJson() {
        return this.customJson;
    }

    /**
     * <p>
     * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     * configuration JSON values. The string should be in the following format:
     * </p>
     * <p>
     * <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     * </p>
     * <p>
     * For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to Modify the
     * Stack Configuration Attributes</a>
     * </p>
     * 
     * @param customJson
     *        A string that contains user-defined, custom JSON. It is used to override the corresponding default stack
     *        configuration JSON values. The string should be in the following format:</p>
     *        <p>
     *        <code>"{\"key1\": \"value1\", \"key2\": \"value2\",...}"</code>
     *        </p>
     *        <p>
     *        For more information on custom JSON, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">Use Custom JSON to
     *        Modify the Stack Configuration Attributes</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withCustomJson(String customJson) {
        setCustomJson(customJson);
        return this;
    }

    /**
     * <p>
     * The configuration manager. When you clone a stack we recommend that you use the configuration manager to specify
     * the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux
     * stacks is currently 12.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager. When you clone a stack we recommend that you use the configuration manager to
     *        specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     *        value for Linux stacks is currently 12.
     */

    public void setConfigurationManager(StackConfigurationManager configurationManager) {
        this.configurationManager = configurationManager;
    }

    /**
     * <p>
     * The configuration manager. When you clone a stack we recommend that you use the configuration manager to specify
     * the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux
     * stacks is currently 12.
     * </p>
     * 
     * @return The configuration manager. When you clone a stack we recommend that you use the configuration manager to
     *         specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     *         value for Linux stacks is currently 12.
     */

    public StackConfigurationManager getConfigurationManager() {
        return this.configurationManager;
    }

    /**
     * <p>
     * The configuration manager. When you clone a stack we recommend that you use the configuration manager to specify
     * the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux
     * stacks is currently 12.
     * </p>
     * 
     * @param configurationManager
     *        The configuration manager. When you clone a stack we recommend that you use the configuration manager to
     *        specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default
     *        value for Linux stacks is currently 12.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withConfigurationManager(StackConfigurationManager configurationManager) {
        setConfigurationManager(configurationManager);
        return this;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param chefConfiguration
     *        A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *        version on Chef 11.10 stacks. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     */

    public void setChefConfiguration(ChefConfiguration chefConfiguration) {
        this.chefConfiguration = chefConfiguration;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @return A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *         version on Chef 11.10 stacks. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *         Stack</a>.
     */

    public ChefConfiguration getChefConfiguration() {
        return this.chefConfiguration;
    }

    /**
     * <p>
     * A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf version on
     * Chef 11.10 stacks. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param chefConfiguration
     *        A <code>ChefConfiguration</code> object that specifies whether to enable Berkshelf and the Berkshelf
     *        version on Chef 11.10 stacks. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withChefConfiguration(ChefConfiguration chefConfiguration) {
        setChefConfiguration(chefConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether to use custom cookbooks.
     * </p>
     * 
     * @param useCustomCookbooks
     *        Whether to use custom cookbooks.
     */

    public void setUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
    }

    /**
     * <p>
     * Whether to use custom cookbooks.
     * </p>
     * 
     * @return Whether to use custom cookbooks.
     */

    public Boolean getUseCustomCookbooks() {
        return this.useCustomCookbooks;
    }

    /**
     * <p>
     * Whether to use custom cookbooks.
     * </p>
     * 
     * @param useCustomCookbooks
     *        Whether to use custom cookbooks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withUseCustomCookbooks(Boolean useCustomCookbooks) {
        setUseCustomCookbooks(useCustomCookbooks);
        return this;
    }

    /**
     * <p>
     * Whether to use custom cookbooks.
     * </p>
     * 
     * @return Whether to use custom cookbooks.
     */

    public Boolean isUseCustomCookbooks() {
        return this.useCustomCookbooks;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are associated with
     * layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide your own custom security
     * groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer (default
     * setting). You can associate additional security groups with a layer after you create it but you cannot delete the
     * built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate Amazon
     * Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you
     * create. However, you can still manually associate a built-in security group with a layer on creation; custom
     * security groups are required only for those layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param useOpsworksSecurityGroups
     *        Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.</p>
     *        <p>
     *        AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are associated
     *        with layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide your own
     *        custom security groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer
     *        (default setting). You can associate additional security groups with a layer after you create it but you
     *        cannot delete the built-in security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate
     *        Amazon Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer
     *        that you create. However, you can still manually associate a built-in security group with a layer on
     *        creation; custom security groups are required only for those layers that need custom settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     */

    public void setUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        this.useOpsworksSecurityGroups = useOpsworksSecurityGroups;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are associated with
     * layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide your own custom security
     * groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer (default
     * setting). You can associate additional security groups with a layer after you create it but you cannot delete the
     * built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate Amazon
     * Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you
     * create. However, you can still manually associate a built-in security group with a layer on creation; custom
     * security groups are required only for those layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @return Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.</p>
     *         <p>
     *         AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are
     *         associated with layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide
     *         your own custom security groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer
     *         (default setting). You can associate additional security groups with a layer after you create it but you
     *         cannot delete the built-in security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate
     *         Amazon Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer
     *         that you create. However, you can still manually associate a built-in security group with a layer on
     *         creation; custom security groups are required only for those layers that need custom settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *         Stack</a>.
     */

    public Boolean getUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are associated with
     * layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide your own custom security
     * groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer (default
     * setting). You can associate additional security groups with a layer after you create it but you cannot delete the
     * built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate Amazon
     * Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you
     * create. However, you can still manually associate a built-in security group with a layer on creation; custom
     * security groups are required only for those layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @param useOpsworksSecurityGroups
     *        Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.</p>
     *        <p>
     *        AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are associated
     *        with layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide your own
     *        custom security groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer
     *        (default setting). You can associate additional security groups with a layer after you create it but you
     *        cannot delete the built-in security group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate
     *        Amazon Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer
     *        that you create. However, you can still manually associate a built-in security group with a layer on
     *        creation; custom security groups are required only for those layers that need custom settings.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *        Stack</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withUseOpsworksSecurityGroups(Boolean useOpsworksSecurityGroups) {
        setUseOpsworksSecurityGroups(useOpsworksSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.
     * </p>
     * <p>
     * AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are associated with
     * layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide your own custom security
     * groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer (default
     * setting). You can associate additional security groups with a layer after you create it but you cannot delete the
     * built-in security group.
     * </p>
     * </li>
     * <li>
     * <p>
     * False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate Amazon
     * Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you
     * create. However, you can still manually associate a built-in security group with a layer on creation; custom
     * security groups are required only for those layers that need custom settings.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New Stack</a>.
     * </p>
     * 
     * @return Whether to associate the AWS OpsWorks built-in security groups with the stack's layers.</p>
     *         <p>
     *         AWS OpsWorks provides a standard set of built-in security groups, one for each layer, which are
     *         associated with layers by default. With <code>UseOpsworksSecurityGroups</code> you can instead provide
     *         your own custom security groups. <code>UseOpsworksSecurityGroups</code> has the following settings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         True - AWS OpsWorks automatically associates the appropriate built-in security group with each layer
     *         (default setting). You can associate additional security groups with a layer after you create it but you
     *         cannot delete the built-in security group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         False - AWS OpsWorks does not associate built-in security groups with layers. You must create appropriate
     *         Amazon Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer
     *         that you create. However, you can still manually associate a built-in security group with a layer on
     *         creation; custom security groups are required only for those layers that need custom settings.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-creating.html">Create a New
     *         Stack</a>.
     */

    public Boolean isUseOpsworksSecurityGroups() {
        return this.useOpsworksSecurityGroups;
    }

    /**
     * @param customCookbooksSource
     */

    public void setCustomCookbooksSource(Source customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
    }

    /**
     * @return
     */

    public Source getCustomCookbooksSource() {
        return this.customCookbooksSource;
    }

    /**
     * @param customCookbooksSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withCustomCookbooksSource(Source customCookbooksSource) {
        setCustomCookbooksSource(customCookbooksSource);
        return this;
    }

    /**
     * <p>
     * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks
     * installs the public key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html">
     * Managing SSH Access</a>. You can override this setting by specifying a different key pair, or no key pair, when
     * you <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     * instance</a>.
     * </p>
     * 
     * @param defaultSshKeyName
     *        A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS
     *        OpsWorks installs the public key on the instance and you can use the private key with an SSH client to log
     *        in to the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to
     *        Communicate with an Instance</a> and <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH
     *        Access</a>. You can override this setting by specifying a different key pair, or no key pair, when you <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     *        instance</a>.
     */

    public void setDefaultSshKeyName(String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
    }

    /**
     * <p>
     * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks
     * installs the public key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html">
     * Managing SSH Access</a>. You can override this setting by specifying a different key pair, or no key pair, when
     * you <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     * instance</a>.
     * </p>
     * 
     * @return A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS
     *         OpsWorks installs the public key on the instance and you can use the private key with an SSH client to
     *         log in to the instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to
     *         Communicate with an Instance</a> and <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH
     *         Access</a>. You can override this setting by specifying a different key pair, or no key pair, when you <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     *         instance</a>.
     */

    public String getDefaultSshKeyName() {
        return this.defaultSshKeyName;
    }

    /**
     * <p>
     * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks
     * installs the public key on the instance and you can use the private key with an SSH client to log in to the
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to Communicate
     * with an Instance</a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html">
     * Managing SSH Access</a>. You can override this setting by specifying a different key pair, or no key pair, when
     * you <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     * instance</a>.
     * </p>
     * 
     * @param defaultSshKeyName
     *        A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS
     *        OpsWorks installs the public key on the instance and you can use the private key with an SSH client to log
     *        in to the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-ssh.html"> Using SSH to
     *        Communicate with an Instance</a> and <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/security-ssh-access.html"> Managing SSH
     *        Access</a>. You can override this setting by specifying a different key pair, or no key pair, when you <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> create an
     *        instance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withDefaultSshKeyName(String defaultSshKeyName) {
        setDefaultSshKeyName(defaultSshKeyName);
        return this;
    }

    /**
     * <p>
     * Whether to clone the source stack's permissions.
     * </p>
     * 
     * @param clonePermissions
     *        Whether to clone the source stack's permissions.
     */

    public void setClonePermissions(Boolean clonePermissions) {
        this.clonePermissions = clonePermissions;
    }

    /**
     * <p>
     * Whether to clone the source stack's permissions.
     * </p>
     * 
     * @return Whether to clone the source stack's permissions.
     */

    public Boolean getClonePermissions() {
        return this.clonePermissions;
    }

    /**
     * <p>
     * Whether to clone the source stack's permissions.
     * </p>
     * 
     * @param clonePermissions
     *        Whether to clone the source stack's permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withClonePermissions(Boolean clonePermissions) {
        setClonePermissions(clonePermissions);
        return this;
    }

    /**
     * <p>
     * Whether to clone the source stack's permissions.
     * </p>
     * 
     * @return Whether to clone the source stack's permissions.
     */

    public Boolean isClonePermissions() {
        return this.clonePermissions;
    }

    /**
     * <p>
     * A list of source stack app IDs to be included in the cloned stack.
     * </p>
     * 
     * @return A list of source stack app IDs to be included in the cloned stack.
     */

    public java.util.List<String> getCloneAppIds() {
        if (cloneAppIds == null) {
            cloneAppIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cloneAppIds;
    }

    /**
     * <p>
     * A list of source stack app IDs to be included in the cloned stack.
     * </p>
     * 
     * @param cloneAppIds
     *        A list of source stack app IDs to be included in the cloned stack.
     */

    public void setCloneAppIds(java.util.Collection<String> cloneAppIds) {
        if (cloneAppIds == null) {
            this.cloneAppIds = null;
            return;
        }

        this.cloneAppIds = new com.amazonaws.internal.SdkInternalList<String>(cloneAppIds);
    }

    /**
     * <p>
     * A list of source stack app IDs to be included in the cloned stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloneAppIds(java.util.Collection)} or {@link #withCloneAppIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cloneAppIds
     *        A list of source stack app IDs to be included in the cloned stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withCloneAppIds(String... cloneAppIds) {
        if (this.cloneAppIds == null) {
            setCloneAppIds(new com.amazonaws.internal.SdkInternalList<String>(cloneAppIds.length));
        }
        for (String ele : cloneAppIds) {
            this.cloneAppIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of source stack app IDs to be included in the cloned stack.
     * </p>
     * 
     * @param cloneAppIds
     *        A list of source stack app IDs to be included in the cloned stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withCloneAppIds(java.util.Collection<String> cloneAppIds) {
        setCloneAppIds(cloneAppIds);
        return this;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the cloned stack, but you can
     * override it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the cloned stack, but you
     *        can override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setDefaultRootDeviceType(String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the cloned stack, but you can
     * override it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @return The default root device type. This value is used by default for all instances in the cloned stack, but
     *         you can override it when you create an instance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *         >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public String getDefaultRootDeviceType() {
        return this.defaultRootDeviceType;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the cloned stack, but you can
     * override it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the cloned stack, but you
     *        can override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public CloneStackRequest withDefaultRootDeviceType(String defaultRootDeviceType) {
        setDefaultRootDeviceType(defaultRootDeviceType);
        return this;
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the cloned stack, but you can
     * override it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the cloned stack, but you
     *        can override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType.toString();
    }

    /**
     * <p>
     * The default root device type. This value is used by default for all instances in the cloned stack, but you can
     * override it when you create an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param defaultRootDeviceType
     *        The default root device type. This value is used by default for all instances in the cloned stack, but you
     *        can override it when you create an instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public CloneStackRequest withDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        setDefaultRootDeviceType(defaultRootDeviceType);
        return this;
    }

    /**
     * <p>
     * The default AWS OpsWorks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks automatically installs new agent versions
     * on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks then automatically installs that version on the
     * stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     * 
     * @param agentVersion
     *        The default AWS OpsWorks agent version. You have the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks automatically installs new agent
     *        versions on the stack's instances as soon as they are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must
     *        edit the stack configuration and specify a new version. AWS OpsWorks then automatically installs that
     *        version on the stack's instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     *        number, not the abbreviated number shown on the console. For a list of available agent version numbers,
     *        call <a>DescribeAgentVersions</a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can also specify an agent version when you create or update an instance, which overrides the stack's
     *        default setting.
     *        </p>
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The default AWS OpsWorks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks automatically installs new agent versions
     * on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks then automatically installs that version on the
     * stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     * 
     * @return The default AWS OpsWorks agent version. You have the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks automatically installs new agent
     *         versions on the stack's instances as soon as they are available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must
     *         edit the stack configuration and specify a new version. AWS OpsWorks then automatically installs that
     *         version on the stack's instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete
     *         version number, not the abbreviated number shown on the console. For a list of available agent version
     *         numbers, call <a>DescribeAgentVersions</a>.
     *         </p>
     *         <note>
     *         <p>
     *         You can also specify an agent version when you create or update an instance, which overrides the stack's
     *         default setting.
     *         </p>
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The default AWS OpsWorks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks automatically installs new agent versions
     * on the stack's instances as soon as they are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit
     * the stack configuration and specify a new version. AWS OpsWorks then automatically installs that version on the
     * stack's instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <note>
     * <p>
     * You can also specify an agent version when you create or update an instance, which overrides the stack's default
     * setting.
     * </p>
     * </note>
     * 
     * @param agentVersion
     *        The default AWS OpsWorks agent version. You have the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Auto-update - Set this parameter to <code>LATEST</code>. AWS OpsWorks automatically installs new agent
     *        versions on the stack's instances as soon as they are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must
     *        edit the stack configuration and specify a new version. AWS OpsWorks then automatically installs that
     *        version on the stack's instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>LATEST</code>. To specify an agent version, you must use the complete version
     *        number, not the abbreviated number shown on the console. For a list of available agent version numbers,
     *        call <a>DescribeAgentVersions</a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can also specify an agent version when you create or update an instance, which overrides the stack's
     *        default setting.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneStackRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceStackId() != null)
            sb.append("SourceStackId: " + getSourceStackId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getDefaultInstanceProfileArn() != null)
            sb.append("DefaultInstanceProfileArn: " + getDefaultInstanceProfileArn() + ",");
        if (getDefaultOs() != null)
            sb.append("DefaultOs: " + getDefaultOs() + ",");
        if (getHostnameTheme() != null)
            sb.append("HostnameTheme: " + getHostnameTheme() + ",");
        if (getDefaultAvailabilityZone() != null)
            sb.append("DefaultAvailabilityZone: " + getDefaultAvailabilityZone() + ",");
        if (getDefaultSubnetId() != null)
            sb.append("DefaultSubnetId: " + getDefaultSubnetId() + ",");
        if (getCustomJson() != null)
            sb.append("CustomJson: " + getCustomJson() + ",");
        if (getConfigurationManager() != null)
            sb.append("ConfigurationManager: " + getConfigurationManager() + ",");
        if (getChefConfiguration() != null)
            sb.append("ChefConfiguration: " + getChefConfiguration() + ",");
        if (getUseCustomCookbooks() != null)
            sb.append("UseCustomCookbooks: " + getUseCustomCookbooks() + ",");
        if (getUseOpsworksSecurityGroups() != null)
            sb.append("UseOpsworksSecurityGroups: " + getUseOpsworksSecurityGroups() + ",");
        if (getCustomCookbooksSource() != null)
            sb.append("CustomCookbooksSource: " + getCustomCookbooksSource() + ",");
        if (getDefaultSshKeyName() != null)
            sb.append("DefaultSshKeyName: " + getDefaultSshKeyName() + ",");
        if (getClonePermissions() != null)
            sb.append("ClonePermissions: " + getClonePermissions() + ",");
        if (getCloneAppIds() != null)
            sb.append("CloneAppIds: " + getCloneAppIds() + ",");
        if (getDefaultRootDeviceType() != null)
            sb.append("DefaultRootDeviceType: " + getDefaultRootDeviceType() + ",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: " + getAgentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloneStackRequest == false)
            return false;
        CloneStackRequest other = (CloneStackRequest) obj;
        if (other.getSourceStackId() == null ^ this.getSourceStackId() == null)
            return false;
        if (other.getSourceStackId() != null && other.getSourceStackId().equals(this.getSourceStackId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getDefaultInstanceProfileArn() == null ^ this.getDefaultInstanceProfileArn() == null)
            return false;
        if (other.getDefaultInstanceProfileArn() != null && other.getDefaultInstanceProfileArn().equals(this.getDefaultInstanceProfileArn()) == false)
            return false;
        if (other.getDefaultOs() == null ^ this.getDefaultOs() == null)
            return false;
        if (other.getDefaultOs() != null && other.getDefaultOs().equals(this.getDefaultOs()) == false)
            return false;
        if (other.getHostnameTheme() == null ^ this.getHostnameTheme() == null)
            return false;
        if (other.getHostnameTheme() != null && other.getHostnameTheme().equals(this.getHostnameTheme()) == false)
            return false;
        if (other.getDefaultAvailabilityZone() == null ^ this.getDefaultAvailabilityZone() == null)
            return false;
        if (other.getDefaultAvailabilityZone() != null && other.getDefaultAvailabilityZone().equals(this.getDefaultAvailabilityZone()) == false)
            return false;
        if (other.getDefaultSubnetId() == null ^ this.getDefaultSubnetId() == null)
            return false;
        if (other.getDefaultSubnetId() != null && other.getDefaultSubnetId().equals(this.getDefaultSubnetId()) == false)
            return false;
        if (other.getCustomJson() == null ^ this.getCustomJson() == null)
            return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false)
            return false;
        if (other.getConfigurationManager() == null ^ this.getConfigurationManager() == null)
            return false;
        if (other.getConfigurationManager() != null && other.getConfigurationManager().equals(this.getConfigurationManager()) == false)
            return false;
        if (other.getChefConfiguration() == null ^ this.getChefConfiguration() == null)
            return false;
        if (other.getChefConfiguration() != null && other.getChefConfiguration().equals(this.getChefConfiguration()) == false)
            return false;
        if (other.getUseCustomCookbooks() == null ^ this.getUseCustomCookbooks() == null)
            return false;
        if (other.getUseCustomCookbooks() != null && other.getUseCustomCookbooks().equals(this.getUseCustomCookbooks()) == false)
            return false;
        if (other.getUseOpsworksSecurityGroups() == null ^ this.getUseOpsworksSecurityGroups() == null)
            return false;
        if (other.getUseOpsworksSecurityGroups() != null && other.getUseOpsworksSecurityGroups().equals(this.getUseOpsworksSecurityGroups()) == false)
            return false;
        if (other.getCustomCookbooksSource() == null ^ this.getCustomCookbooksSource() == null)
            return false;
        if (other.getCustomCookbooksSource() != null && other.getCustomCookbooksSource().equals(this.getCustomCookbooksSource()) == false)
            return false;
        if (other.getDefaultSshKeyName() == null ^ this.getDefaultSshKeyName() == null)
            return false;
        if (other.getDefaultSshKeyName() != null && other.getDefaultSshKeyName().equals(this.getDefaultSshKeyName()) == false)
            return false;
        if (other.getClonePermissions() == null ^ this.getClonePermissions() == null)
            return false;
        if (other.getClonePermissions() != null && other.getClonePermissions().equals(this.getClonePermissions()) == false)
            return false;
        if (other.getCloneAppIds() == null ^ this.getCloneAppIds() == null)
            return false;
        if (other.getCloneAppIds() != null && other.getCloneAppIds().equals(this.getCloneAppIds()) == false)
            return false;
        if (other.getDefaultRootDeviceType() == null ^ this.getDefaultRootDeviceType() == null)
            return false;
        if (other.getDefaultRootDeviceType() != null && other.getDefaultRootDeviceType().equals(this.getDefaultRootDeviceType()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceStackId() == null) ? 0 : getSourceStackId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultInstanceProfileArn() == null) ? 0 : getDefaultInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultOs() == null) ? 0 : getDefaultOs().hashCode());
        hashCode = prime * hashCode + ((getHostnameTheme() == null) ? 0 : getHostnameTheme().hashCode());
        hashCode = prime * hashCode + ((getDefaultAvailabilityZone() == null) ? 0 : getDefaultAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDefaultSubnetId() == null) ? 0 : getDefaultSubnetId().hashCode());
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode());
        hashCode = prime * hashCode + ((getConfigurationManager() == null) ? 0 : getConfigurationManager().hashCode());
        hashCode = prime * hashCode + ((getChefConfiguration() == null) ? 0 : getChefConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUseCustomCookbooks() == null) ? 0 : getUseCustomCookbooks().hashCode());
        hashCode = prime * hashCode + ((getUseOpsworksSecurityGroups() == null) ? 0 : getUseOpsworksSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getCustomCookbooksSource() == null) ? 0 : getCustomCookbooksSource().hashCode());
        hashCode = prime * hashCode + ((getDefaultSshKeyName() == null) ? 0 : getDefaultSshKeyName().hashCode());
        hashCode = prime * hashCode + ((getClonePermissions() == null) ? 0 : getClonePermissions().hashCode());
        hashCode = prime * hashCode + ((getCloneAppIds() == null) ? 0 : getCloneAppIds().hashCode());
        hashCode = prime * hashCode + ((getDefaultRootDeviceType() == null) ? 0 : getDefaultRootDeviceType().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public CloneStackRequest clone() {
        return (CloneStackRequest) super.clone();
    }
}
