// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.TeamArgs;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.inputs.TeamState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a LaunchDarkly team resource.
 * 
 * This resource allows you to create and manage a team within your LaunchDarkly organization.
 * 
 * &gt; **Note:** Teams are available to customers on an Enterprise LaunchDarkly plan. To learn more, read about our pricing. To upgrade your plan, [contact LaunchDarkly Sales](https://launchdarkly.com/contact-sales/).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.Team;
 * import com.pulumi.launchdarkly.TeamArgs;
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
 *         var platformTeam = new Team(&#34;platformTeam&#34;, TeamArgs.builder()        
 *             .customRoleKeys(            
 *                 &#34;platform&#34;,
 *                 &#34;nomad-administrators&#34;)
 *             .description(&#34;Team to manage internal infrastructure&#34;)
 *             .key(&#34;platform_team&#34;)
 *             .maintainers(&#34;12ab3c45de678910abc12345&#34;)
 *             .memberIds(            
 *                 &#34;507f1f77bcf86cd799439011&#34;,
 *                 &#34;569f183514f4432160000007&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A LaunchDarkly team can be imported using the team key
 * 
 * ```sh
 *  $ pulumi import launchdarkly:index/team:Team platform_team platform_team
 * ```
 * 
 */
@ResourceType(type="launchdarkly:index/team:Team")
public class Team extends com.pulumi.resources.CustomResource {
    /**
     * List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don&#39;t, the provider may behave unexpectedly.
     * 
     */
    @Export(name="customRoleKeys", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customRoleKeys;

    /**
     * @return List of custom role keys the team will access. The referenced custom roles must already exist in LaunchDarkly. If they don&#39;t, the provider may behave unexpectedly.
     * 
     */
    public Output<Optional<List<String>>> customRoleKeys() {
        return Codegen.optional(this.customRoleKeys);
    }
    /**
     * The team description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The team description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The team key.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The team key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * List of member IDs for users who maintain the team.
     * 
     */
    @Export(name="maintainers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> maintainers;

    /**
     * @return List of member IDs for users who maintain the team.
     * 
     */
    public Output<Optional<List<String>>> maintainers() {
        return Codegen.optional(this.maintainers);
    }
    /**
     * List of member IDs who belong to the team.
     * 
     */
    @Export(name="memberIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> memberIds;

    /**
     * @return List of member IDs who belong to the team.
     * 
     */
    public Output<Optional<List<String>>> memberIds() {
        return Codegen.optional(this.memberIds);
    }
    /**
     * A human-friendly name for the team.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A human-friendly name for the team.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Team(String name) {
        this(name, TeamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Team(String name, TeamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Team(String name, TeamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/team:Team", name, args == null ? TeamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Team(String name, Output<String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/team:Team", name, state, makeResourceOptions(options, id));
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
    public static Team get(String name, Output<String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Team(name, id, state, options);
    }
}
