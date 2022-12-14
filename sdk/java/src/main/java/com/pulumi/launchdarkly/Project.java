// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.launchdarkly.ProjectArgs;
import com.pulumi.launchdarkly.Utilities;
import com.pulumi.launchdarkly.inputs.ProjectState;
import com.pulumi.launchdarkly.outputs.ProjectDefaultClientSideAvailability;
import com.pulumi.launchdarkly.outputs.ProjectEnvironment;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a LaunchDarkly project resource.
 * 
 * This resource allows you to create and manage projects within your LaunchDarkly organization.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.launchdarkly.Project;
 * import com.pulumi.launchdarkly.ProjectArgs;
 * import com.pulumi.launchdarkly.inputs.ProjectEnvironmentArgs;
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
 *         var example = new Project(&#34;example&#34;, ProjectArgs.builder()        
 *             .environments(            
 *                 ProjectEnvironmentArgs.builder()
 *                     .approvalSettings(ProjectEnvironmentApprovalSettingArgs.builder()
 *                         .canApplyDeclinedChanges(false)
 *                         .canReviewOwnRequest(false)
 *                         .minNumApprovals(3)
 *                         .requiredApprovalTags(&#34;approvals_required&#34;)
 *                         .build())
 *                     .color(&#34;EEEEEE&#34;)
 *                     .key(&#34;production&#34;)
 *                     .name(&#34;Production&#34;)
 *                     .tags(&#34;terraform&#34;)
 *                     .build(),
 *                 ProjectEnvironmentArgs.builder()
 *                     .color(&#34;000000&#34;)
 *                     .key(&#34;staging&#34;)
 *                     .name(&#34;Staging&#34;)
 *                     .tags(&#34;terraform&#34;)
 *                     .build())
 *             .key(&#34;example-project&#34;)
 *             .tags(&#34;terraform&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * LaunchDarkly projects can be imported using the project&#39;s key, e.g.
 * 
 * ```sh
 *  $ pulumi import launchdarkly:index/project:Project example example-project
 * ```
 * 
 *  **IMPORTANT:** Please note that, regardless of how many `environments` blocks you include on your import, _all_ of the project&#39;s environments will be saved to the Terraform state and will update with subsequent applies. This means that any environments not included in your import configuration will be torn down with any subsequent apply. If you wish to manage project properties with Terraform but not nested environments consider using Terraform&#39;s [ignore changes](https://www.terraform.io/docs/language/meta-arguments/lifecycle.html#ignore_changes) lifecycle meta-argument; see below for example. resource &#34;launchdarkly_project&#34; &#34;example&#34; { 		lifecycle { 			ignore_changes = [environments] 		} 		name = &#34;testProject&#34; 		key = &#34;%s&#34; 		# environments not included on this configuration will not be affected by subsequent applies 	} **Managing environment resources with Terraform should always be done on the project unless the project is not also managed with Terraform.**
 * 
 */
@ResourceType(type="launchdarkly:index/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * A block describing which client-side SDKs can use new flags by default. To learn more, read Nested Client Side Availability Block.
     * 
     */
    @Export(name="defaultClientSideAvailabilities", type=List.class, parameters={ProjectDefaultClientSideAvailability.class})
    private Output<List<ProjectDefaultClientSideAvailability>> defaultClientSideAvailabilities;

    /**
     * @return A block describing which client-side SDKs can use new flags by default. To learn more, read Nested Client Side Availability Block.
     * 
     */
    public Output<List<ProjectDefaultClientSideAvailability>> defaultClientSideAvailabilities() {
        return this.defaultClientSideAvailabilities;
    }
    /**
     * List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     * 
     */
    @Export(name="environments", type=List.class, parameters={ProjectEnvironment.class})
    private Output<List<ProjectEnvironment>> environments;

    /**
     * @return List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     * 
     */
    public Output<List<ProjectEnvironment>> environments() {
        return this.environments;
    }
    /**
     * **Deprecated** (Optional) Whether feature flags created under the project should be available to client-side SDKs by default. Please migrate to `default_client_side_availability` to maintain future compatibility.
     * 
     * @deprecated
     * &#39;include_in_snippet&#39; is now deprecated. Please migrate to &#39;default_client_side_availability&#39; to maintain future compatability.
     * 
     */
    @Deprecated /* 'include_in_snippet' is now deprecated. Please migrate to 'default_client_side_availability' to maintain future compatability. */
    @Export(name="includeInSnippet", type=Boolean.class, parameters={})
    private Output<Boolean> includeInSnippet;

    /**
     * @return **Deprecated** (Optional) Whether feature flags created under the project should be available to client-side SDKs by default. Please migrate to `default_client_side_availability` to maintain future compatibility.
     * 
     */
    public Output<Boolean> includeInSnippet() {
        return this.includeInSnippet;
    }
    /**
     * The project&#39;s unique key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The project&#39;s unique key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The project&#39;s name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The project&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project&#39;s set of tags.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The project&#39;s set of tags.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/project:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("launchdarkly:index/project:Project", name, state, makeResourceOptions(options, id));
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
    public static Project get(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
