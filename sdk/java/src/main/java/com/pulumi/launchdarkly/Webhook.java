// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.WebhookArgs;
import com.pulumi.launchdarkly.inputs.WebhookState;
import com.pulumi.launchdarkly.outputs.WebhookStatement;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a LaunchDarkly webhook resource.
 * 
 * This resource allows you to create and manage webhooks within your LaunchDarkly organization.
 * 
 * ## Import
 * 
 * LaunchDarkly webhooks can be imported using the webhook&#39;s 24 character ID, e.g.
 * 
 * ```sh
 *  $ pulumi import launchdarkly:index/webhook:Webhook example 57c0af609969090743529967
 * ```
 * 
 */
@ResourceType(type="launchdarkly:index/webhook:Webhook")
public class Webhook extends com.pulumi.resources.CustomResource {
    /**
     * The webhook&#39;s human-readable name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The webhook&#39;s human-readable name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether the webhook is enabled.
     * 
     */
    @Export(name="on", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> on;

    /**
     * @return Specifies whether the webhook is enabled.
     * 
     */
    public Output<Optional<Boolean>> on() {
        return Codegen.optional(this.on);
    }
    /**
     * The secret used to sign the webhook.
     * 
     */
    @Export(name="secret", type=String.class, parameters={})
    private Output</* @Nullable */ String> secret;

    /**
     * @return The secret used to sign the webhook.
     * 
     */
    public Output<Optional<String>> secret() {
        return Codegen.optional(this.secret);
    }
    @Export(name="statements", type=List.class, parameters={WebhookStatement.class})
    private Output</* @Nullable */ List<WebhookStatement>> statements;

    public Output<Optional<List<WebhookStatement>>> statements() {
        return Codegen.optional(this.statements);
    }
    /**
     * Set of tags associated with the webhook.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Set of tags associated with the webhook.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The URL of the remote webhook.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The URL of the remote webhook.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhook(String name) {
        this(name, WebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhook(String name, WebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/webhook:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Webhook(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/webhook:Webhook", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Webhook get(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, state, options);
    }
}