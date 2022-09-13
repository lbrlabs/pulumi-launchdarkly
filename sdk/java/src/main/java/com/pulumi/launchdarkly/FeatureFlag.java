// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.FeatureFlagArgs;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.inputs.FeatureFlagState;
import com.pulumi.launchdarkly.outputs.FeatureFlagCustomProperty;
import com.pulumi.launchdarkly.outputs.FeatureFlagDefaults;
import com.pulumi.launchdarkly.outputs.FeatureFlagVariation;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a LaunchDarkly feature flag resource.
 * 
 * This resource allows you to create and manage feature flags within your LaunchDarkly organization.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.FeatureFlag;
 * import com.pulumi.launchdarkly.FeatureFlagArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagVariationArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagDefaultsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var buildingMaterials = new FeatureFlag(&#34;buildingMaterials&#34;, FeatureFlagArgs.builder()        
 *             .projectKey(launchdarkly_project.example().key())
 *             .key(&#34;building-materials&#34;)
 *             .description(&#34;this is a multivariate flag with string variations.&#34;)
 *             .variationType(&#34;string&#34;)
 *             .variations(            
 *                 FeatureFlagVariationArgs.builder()
 *                     .value(&#34;straw&#34;)
 *                     .name(&#34;Straw&#34;)
 *                     .description(&#34;Watch out for wind.&#34;)
 *                     .build(),
 *                 FeatureFlagVariationArgs.builder()
 *                     .value(&#34;sticks&#34;)
 *                     .name(&#34;Sticks&#34;)
 *                     .description(&#34;Sturdier than straw&#34;)
 *                     .build(),
 *                 FeatureFlagVariationArgs.builder()
 *                     .value(&#34;bricks&#34;)
 *                     .name(&#34;Bricks&#34;)
 *                     .description(&#34;The strongest variation&#34;)
 *                     .build())
 *             .defaults(FeatureFlagDefaultsArgs.builder()
 *                 .onVariation(2)
 *                 .offVariation(0)
 *                 .build())
 *             .tags(            
 *                 &#34;example&#34;,
 *                 &#34;terraform&#34;,
 *                 &#34;multivariate&#34;,
 *                 &#34;building-materials&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.FeatureFlag;
 * import com.pulumi.launchdarkly.FeatureFlagArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagVariationArgs;
 * import com.pulumi.launchdarkly.inputs.FeatureFlagDefaultsArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var jsonExample = new FeatureFlag(&#34;jsonExample&#34;, FeatureFlagArgs.builder()        
 *             .projectKey(&#34;example-project&#34;)
 *             .key(&#34;json-example&#34;)
 *             .variationType(&#34;json&#34;)
 *             .variations(            
 *                 FeatureFlagVariationArgs.builder()
 *                     .name(&#34;Single foo&#34;)
 *                     .value(serializeJson(
 *                         jsonObject(
 *                             jsonProperty(&#34;foo&#34;, &#34;bar&#34;)
 *                         )))
 *                     .build(),
 *                 FeatureFlagVariationArgs.builder()
 *                     .name(&#34;Multiple foos&#34;)
 *                     .value(serializeJson(
 *                         jsonObject(
 *                             jsonProperty(&#34;foos&#34;, jsonArray(
 *                                 &#34;bar1&#34;, 
 *                                 &#34;bar2&#34;
 *                             ))
 *                         )))
 *                     .build())
 *             .defaults(FeatureFlagDefaultsArgs.builder()
 *                 .onVariation(1)
 *                 .offVariation(0)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * You can import a feature flag using the feature flag&#39;s ID in the format `project_key/flag_key`. For example
 * 
 * ```sh
 *  $ pulumi import launchdarkly:index/featureFlag:FeatureFlag building_materials example-project/building-materials
 * ```
 * 
 */
@ResourceType(type="launchdarkly:index/featureFlag:FeatureFlag")
public class FeatureFlag extends com.pulumi.resources.CustomResource {
    /**
     * Whether to archive the flag
     * 
     */
    @Export(name="archived", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> archived;

    /**
     * @return Whether to archive the flag
     * 
     */
    public Output<Optional<Boolean>> archived() {
        return Codegen.optional(this.archived);
    }
    /**
     * List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     * 
     */
    @Export(name="customProperties", type=List.class, parameters={FeatureFlagCustomProperty.class})
    private Output</* @Nullable */ List<FeatureFlagCustomProperty>> customProperties;

    /**
     * @return List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     * 
     */
    public Output<Optional<List<FeatureFlagCustomProperty>>> customProperties() {
        return Codegen.optional(this.customProperties);
    }
    /**
     * A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
     * 
     */
    @Export(name="defaults", type=FeatureFlagDefaults.class, parameters={})
    private Output<FeatureFlagDefaults> defaults;

    /**
     * @return A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
     * 
     */
    public Output<FeatureFlagDefaults> defaults() {
        return this.defaults;
    }
    /**
     * The feature flag&#39;s description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The feature flag&#39;s description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies whether this flag should be made available to the client-side JavaScript SDK.
     * 
     */
    @Export(name="includeInSnippet", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> includeInSnippet;

    /**
     * @return Specifies whether this flag should be made available to the client-side JavaScript SDK.
     * 
     */
    public Output<Optional<Boolean>> includeInSnippet() {
        return Codegen.optional(this.includeInSnippet);
    }
    /**
     * The unique feature flag key that references the flag in your application code.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The unique feature flag key that references the flag in your application code.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
     * associated with your Terraform API key or the most recently set maintainer
     * 
     */
    @Export(name="maintainerId", type=String.class, parameters={})
    private Output<String> maintainerId;

    /**
     * @return The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
     * associated with your Terraform API key or the most recently set maintainer
     * 
     */
    public Output<String> maintainerId() {
        return this.maintainerId;
    }
    /**
     * The human-readable name of the feature flag.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The human-readable name of the feature flag.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The feature flag&#39;s project key.
     * 
     */
    @Export(name="projectKey", type=String.class, parameters={})
    private Output<String> projectKey;

    /**
     * @return The feature flag&#39;s project key.
     * 
     */
    public Output<String> projectKey() {
        return this.projectKey;
    }
    /**
     * Set of feature flag tags.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Set of feature flag tags.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies whether the flag is a temporary flag.
     * 
     */
    @Export(name="temporary", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> temporary;

    /**
     * @return Specifies whether the flag is a temporary flag.
     * 
     */
    public Output<Optional<Boolean>> temporary() {
        return Codegen.optional(this.temporary);
    }
    /**
     * The feature flag&#39;s variation type: `boolean`, `string`, `number` or `json`.
     * 
     */
    @Export(name="variationType", type=String.class, parameters={})
    private Output<String> variationType;

    /**
     * @return The feature flag&#39;s variation type: `boolean`, `string`, `number` or `json`.
     * 
     */
    public Output<String> variationType() {
        return this.variationType;
    }
    /**
     * List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
     * 
     */
    @Export(name="variations", type=List.class, parameters={FeatureFlagVariation.class})
    private Output<List<FeatureFlagVariation>> variations;

    /**
     * @return List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
     * 
     */
    public Output<List<FeatureFlagVariation>> variations() {
        return this.variations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FeatureFlag(String name) {
        this(name, FeatureFlagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FeatureFlag(String name, FeatureFlagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FeatureFlag(String name, FeatureFlagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/featureFlag:FeatureFlag", name, args == null ? FeatureFlagArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FeatureFlag(String name, Output<String> id, @Nullable FeatureFlagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/featureFlag:FeatureFlag", name, state, makeResourceOptions(options, id));
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
    public static FeatureFlag get(String name, Output<String> id, @Nullable FeatureFlagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FeatureFlag(name, id, state, options);
    }
}