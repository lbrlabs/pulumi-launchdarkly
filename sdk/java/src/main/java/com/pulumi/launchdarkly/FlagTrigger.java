// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.FlagTriggerArgs;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.inputs.FlagTriggerState;
import com.pulumi.launchdarkly.outputs.FlagTriggerInstructions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * LaunchDarkly flag triggers can be imported using the following syntax
 * 
 * ```sh
 *  $ pulumi import launchdarkly:index/flagTrigger:FlagTrigger example example-project-key/example-env-key/example-flag-key/62581d4488def814b831abc3
 * ```
 * 
 *  where the string following the final slash is your unique trigger ID. The unique trigger ID can be found in your saved trigger URLhttps://app.launchdarkly.com/webhook/triggers/THIS_IS_YOUR_TRIGGER_ID/aff25a53-17d9-4112-a9b8-12718d1a2e79 Please note that if you did not save this upon creation of the resource, you will have to reset it to get a new value, which can cause breaking changes.
 * 
 */
@ResourceType(type="launchdarkly:index/flagTrigger:FlagTrigger")
public class FlagTrigger extends com.pulumi.resources.CustomResource {
    /**
     * Whether the trigger is currently active or not. This property defaults to true upon creation
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether the trigger is currently active or not. This property defaults to true upon creation
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Export(name="envKey", type=String.class, parameters={})
    private Output<String> envKey;

    /**
     * @return The unique key of the environment the flag trigger will work in. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> envKey() {
        return this.envKey;
    }
    /**
     * The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Export(name="flagKey", type=String.class, parameters={})
    private Output<String> flagKey;

    /**
     * @return The unique key of the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> flagKey() {
        return this.flagKey;
    }
    /**
     * Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. This must be passed as the key-value pair `{ kind = &#34;&lt;flag_action&gt;&#34; }`.
     * 
     */
    @Export(name="instructions", type=FlagTriggerInstructions.class, parameters={})
    private Output<FlagTriggerInstructions> instructions;

    /**
     * @return Instructions containing the action to perform when invoking the trigger. Currently supported flag actions are `&#34;turnFlagOn&#34;` and `&#34;turnFlagOff&#34;`. This must be passed as the key-value pair `{ kind = &#34;&lt;flag_action&gt;&#34; }`.
     * 
     */
    public Output<FlagTriggerInstructions> instructions() {
        return this.instructions;
    }
    /**
     * The unique identifier of the integration you intend to set your trigger up with. Currently supported are `&#34;datadog&#34;`, `&#34;dynatrace&#34;`, `&#34;honeycomb&#34;`, `&#34;new-relic-apm&#34;`, `&#34;signalfx&#34;`, and `&#34;generic-trigger&#34;`. `&#34;generic-trigger&#34;` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Export(name="integrationKey", type=String.class, parameters={})
    private Output<String> integrationKey;

    /**
     * @return The unique identifier of the integration you intend to set your trigger up with. Currently supported are `&#34;datadog&#34;`, `&#34;dynatrace&#34;`, `&#34;honeycomb&#34;`, `&#34;new-relic-apm&#34;`, `&#34;signalfx&#34;`, and `&#34;generic-trigger&#34;`. `&#34;generic-trigger&#34;` should be used for integrations not explicitly supported. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> integrationKey() {
        return this.integrationKey;
    }
    /**
     * The LaunchDarkly ID of the member who maintains the trigger. The API will automatically apply the member associated with
     * your Terraform API key or the most recently-set maintainer
     * 
     */
    @Export(name="maintainerId", type=String.class, parameters={})
    private Output<String> maintainerId;

    /**
     * @return The LaunchDarkly ID of the member who maintains the trigger. The API will automatically apply the member associated with
     * your Terraform API key or the most recently-set maintainer
     * 
     */
    public Output<String> maintainerId() {
        return this.maintainerId;
    }
    /**
     * The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Export(name="projectKey", type=String.class, parameters={})
    private Output<String> projectKey;

    /**
     * @return The unique key of the project encompassing the associated flag. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> projectKey() {
        return this.projectKey;
    }
    /**
     * The unique trigger URL
     * 
     */
    @Export(name="triggerUrl", type=String.class, parameters={})
    private Output<String> triggerUrl;

    /**
     * @return The unique trigger URL
     * 
     */
    public Output<String> triggerUrl() {
        return this.triggerUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlagTrigger(String name) {
        this(name, FlagTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlagTrigger(String name, FlagTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlagTrigger(String name, FlagTriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/flagTrigger:FlagTrigger", name, args == null ? FlagTriggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlagTrigger(String name, Output<String> id, @Nullable FlagTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/flagTrigger:FlagTrigger", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "triggerUrl"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FlagTrigger get(String name, Output<String> id, @Nullable FlagTriggerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlagTrigger(name, id, state, options);
    }
}