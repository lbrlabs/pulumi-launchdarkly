// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.ProjectDefaultClientSideAvailabilityArgs;
import com.pulumi.launchdarkly.inputs.ProjectEnvironmentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * A block describing which client-side SDKs can use new flags by default. To learn more, read Nested Client Side Availability Block.
     * 
     */
    @Import(name="defaultClientSideAvailabilities")
    private @Nullable Output<List<ProjectDefaultClientSideAvailabilityArgs>> defaultClientSideAvailabilities;

    /**
     * @return A block describing which client-side SDKs can use new flags by default. To learn more, read Nested Client Side Availability Block.
     * 
     */
    public Optional<Output<List<ProjectDefaultClientSideAvailabilityArgs>>> defaultClientSideAvailabilities() {
        return Optional.ofNullable(this.defaultClientSideAvailabilities);
    }

    /**
     * List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     * 
     */
    @Import(name="environments", required=true)
    private Output<List<ProjectEnvironmentArgs>> environments;

    /**
     * @return List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
     * 
     */
    public Output<List<ProjectEnvironmentArgs>> environments() {
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
    @Import(name="includeInSnippet")
    private @Nullable Output<Boolean> includeInSnippet;

    /**
     * @return **Deprecated** (Optional) Whether feature flags created under the project should be available to client-side SDKs by default. Please migrate to `default_client_side_availability` to maintain future compatibility.
     * 
     * @deprecated
     * &#39;include_in_snippet&#39; is now deprecated. Please migrate to &#39;default_client_side_availability&#39; to maintain future compatability.
     * 
     */
    @Deprecated /* 'include_in_snippet' is now deprecated. Please migrate to 'default_client_side_availability' to maintain future compatability. */
    public Optional<Output<Boolean>> includeInSnippet() {
        return Optional.ofNullable(this.includeInSnippet);
    }

    /**
     * The project&#39;s unique key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="key", required=true)
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
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The project&#39;s name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project&#39;s set of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The project&#39;s set of tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.defaultClientSideAvailabilities = $.defaultClientSideAvailabilities;
        this.environments = $.environments;
        this.includeInSnippet = $.includeInSnippet;
        this.key = $.key;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultClientSideAvailabilities A block describing which client-side SDKs can use new flags by default. To learn more, read Nested Client Side Availability Block.
         * 
         * @return builder
         * 
         */
        public Builder defaultClientSideAvailabilities(@Nullable Output<List<ProjectDefaultClientSideAvailabilityArgs>> defaultClientSideAvailabilities) {
            $.defaultClientSideAvailabilities = defaultClientSideAvailabilities;
            return this;
        }

        /**
         * @param defaultClientSideAvailabilities A block describing which client-side SDKs can use new flags by default. To learn more, read Nested Client Side Availability Block.
         * 
         * @return builder
         * 
         */
        public Builder defaultClientSideAvailabilities(List<ProjectDefaultClientSideAvailabilityArgs> defaultClientSideAvailabilities) {
            return defaultClientSideAvailabilities(Output.of(defaultClientSideAvailabilities));
        }

        /**
         * @param defaultClientSideAvailabilities A block describing which client-side SDKs can use new flags by default. To learn more, read Nested Client Side Availability Block.
         * 
         * @return builder
         * 
         */
        public Builder defaultClientSideAvailabilities(ProjectDefaultClientSideAvailabilityArgs... defaultClientSideAvailabilities) {
            return defaultClientSideAvailabilities(List.of(defaultClientSideAvailabilities));
        }

        /**
         * @param environments List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
         * 
         * @return builder
         * 
         */
        public Builder environments(Output<List<ProjectEnvironmentArgs>> environments) {
            $.environments = environments;
            return this;
        }

        /**
         * @param environments List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
         * 
         * @return builder
         * 
         */
        public Builder environments(List<ProjectEnvironmentArgs> environments) {
            return environments(Output.of(environments));
        }

        /**
         * @param environments List of nested `environments` blocks describing LaunchDarkly environments that belong to the project
         * 
         * @return builder
         * 
         */
        public Builder environments(ProjectEnvironmentArgs... environments) {
            return environments(List.of(environments));
        }

        /**
         * @param includeInSnippet **Deprecated** (Optional) Whether feature flags created under the project should be available to client-side SDKs by default. Please migrate to `default_client_side_availability` to maintain future compatibility.
         * 
         * @return builder
         * 
         * @deprecated
         * &#39;include_in_snippet&#39; is now deprecated. Please migrate to &#39;default_client_side_availability&#39; to maintain future compatability.
         * 
         */
        @Deprecated /* 'include_in_snippet' is now deprecated. Please migrate to 'default_client_side_availability' to maintain future compatability. */
        public Builder includeInSnippet(@Nullable Output<Boolean> includeInSnippet) {
            $.includeInSnippet = includeInSnippet;
            return this;
        }

        /**
         * @param includeInSnippet **Deprecated** (Optional) Whether feature flags created under the project should be available to client-side SDKs by default. Please migrate to `default_client_side_availability` to maintain future compatibility.
         * 
         * @return builder
         * 
         * @deprecated
         * &#39;include_in_snippet&#39; is now deprecated. Please migrate to &#39;default_client_side_availability&#39; to maintain future compatability.
         * 
         */
        @Deprecated /* 'include_in_snippet' is now deprecated. Please migrate to 'default_client_side_availability' to maintain future compatability. */
        public Builder includeInSnippet(Boolean includeInSnippet) {
            return includeInSnippet(Output.of(includeInSnippet));
        }

        /**
         * @param key The project&#39;s unique key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The project&#39;s unique key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name The project&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The project&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags The project&#39;s set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The project&#39;s set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The project&#39;s set of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public ProjectArgs build() {
            $.environments = Objects.requireNonNull($.environments, "expected parameter 'environments' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
