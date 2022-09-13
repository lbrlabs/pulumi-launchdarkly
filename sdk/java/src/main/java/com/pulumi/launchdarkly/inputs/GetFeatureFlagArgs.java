// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagCustomPropertyArgs;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagDefaultsArgs;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagVariationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeatureFlagArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureFlagArgs Empty = new GetFeatureFlagArgs();

    @Import(name="archived")
    private @Nullable Output<Boolean> archived;

    public Optional<Output<Boolean>> archived() {
        return Optional.ofNullable(this.archived);
    }

    /**
     * List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     * 
     */
    @Import(name="customProperties")
    private @Nullable Output<List<GetFeatureFlagCustomPropertyArgs>> customProperties;

    /**
     * @return List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
     * 
     */
    public Optional<Output<List<GetFeatureFlagCustomPropertyArgs>>> customProperties() {
        return Optional.ofNullable(this.customProperties);
    }

    /**
     * A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
     * 
     */
    @Import(name="defaults")
    private @Nullable Output<GetFeatureFlagDefaultsArgs> defaults;

    /**
     * @return A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
     * 
     */
    public Optional<Output<GetFeatureFlagDefaultsArgs>> defaults() {
        return Optional.ofNullable(this.defaults);
    }

    /**
     * The variation&#39;s description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The variation&#39;s description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="includeInSnippet")
    private @Nullable Output<Boolean> includeInSnippet;

    public Optional<Output<Boolean>> includeInSnippet() {
        return Optional.ofNullable(this.includeInSnippet);
    }

    /**
     * The unique feature flag key that references the flag in your application code.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The unique feature flag key that references the flag in your application code.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The feature flag maintainer&#39;s 24 character alphanumeric team member ID.
     * 
     */
    @Import(name="maintainerId")
    private @Nullable Output<String> maintainerId;

    /**
     * @return The feature flag maintainer&#39;s 24 character alphanumeric team member ID.
     * 
     */
    public Optional<Output<String>> maintainerId() {
        return Optional.ofNullable(this.maintainerId);
    }

    /**
     * The feature flag&#39;s project key.
     * 
     */
    @Import(name="projectKey", required=true)
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
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Set of feature flag tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether the flag is a temporary flag.
     * 
     */
    @Import(name="temporary")
    private @Nullable Output<Boolean> temporary;

    /**
     * @return Whether the flag is a temporary flag.
     * 
     */
    public Optional<Output<Boolean>> temporary() {
        return Optional.ofNullable(this.temporary);
    }

    /**
     * List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
     * 
     */
    @Import(name="variations")
    private @Nullable Output<List<GetFeatureFlagVariationArgs>> variations;

    /**
     * @return List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
     * 
     */
    public Optional<Output<List<GetFeatureFlagVariationArgs>>> variations() {
        return Optional.ofNullable(this.variations);
    }

    private GetFeatureFlagArgs() {}

    private GetFeatureFlagArgs(GetFeatureFlagArgs $) {
        this.archived = $.archived;
        this.customProperties = $.customProperties;
        this.defaults = $.defaults;
        this.description = $.description;
        this.includeInSnippet = $.includeInSnippet;
        this.key = $.key;
        this.maintainerId = $.maintainerId;
        this.projectKey = $.projectKey;
        this.tags = $.tags;
        this.temporary = $.temporary;
        this.variations = $.variations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagArgs $;

        public Builder() {
            $ = new GetFeatureFlagArgs();
        }

        public Builder(GetFeatureFlagArgs defaults) {
            $ = new GetFeatureFlagArgs(Objects.requireNonNull(defaults));
        }

        public Builder archived(@Nullable Output<Boolean> archived) {
            $.archived = archived;
            return this;
        }

        public Builder archived(Boolean archived) {
            return archived(Output.of(archived));
        }

        /**
         * @param customProperties List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
         * 
         * @return builder
         * 
         */
        public Builder customProperties(@Nullable Output<List<GetFeatureFlagCustomPropertyArgs>> customProperties) {
            $.customProperties = customProperties;
            return this;
        }

        /**
         * @param customProperties List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
         * 
         * @return builder
         * 
         */
        public Builder customProperties(List<GetFeatureFlagCustomPropertyArgs> customProperties) {
            return customProperties(Output.of(customProperties));
        }

        /**
         * @param customProperties List of nested blocks describing the feature flag&#39;s [custom properties](https://docs.launchdarkly.com/docs/custom-properties). To learn more, read Nested Custom Properties.
         * 
         * @return builder
         * 
         */
        public Builder customProperties(GetFeatureFlagCustomPropertyArgs... customProperties) {
            return customProperties(List.of(customProperties));
        }

        /**
         * @param defaults A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
         * 
         * @return builder
         * 
         */
        public Builder defaults(@Nullable Output<GetFeatureFlagDefaultsArgs> defaults) {
            $.defaults = defaults;
            return this;
        }

        /**
         * @param defaults A map describing the index of the variation served when the flag is on for new environments. To learn more, read Nested Defaults Blocks.
         * 
         * @return builder
         * 
         */
        public Builder defaults(GetFeatureFlagDefaultsArgs defaults) {
            return defaults(Output.of(defaults));
        }

        /**
         * @param description The variation&#39;s description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The variation&#39;s description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder includeInSnippet(@Nullable Output<Boolean> includeInSnippet) {
            $.includeInSnippet = includeInSnippet;
            return this;
        }

        public Builder includeInSnippet(Boolean includeInSnippet) {
            return includeInSnippet(Output.of(includeInSnippet));
        }

        /**
         * @param key The unique feature flag key that references the flag in your application code.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The unique feature flag key that references the flag in your application code.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param maintainerId The feature flag maintainer&#39;s 24 character alphanumeric team member ID.
         * 
         * @return builder
         * 
         */
        public Builder maintainerId(@Nullable Output<String> maintainerId) {
            $.maintainerId = maintainerId;
            return this;
        }

        /**
         * @param maintainerId The feature flag maintainer&#39;s 24 character alphanumeric team member ID.
         * 
         * @return builder
         * 
         */
        public Builder maintainerId(String maintainerId) {
            return maintainerId(Output.of(maintainerId));
        }

        /**
         * @param projectKey The feature flag&#39;s project key.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(Output<String> projectKey) {
            $.projectKey = projectKey;
            return this;
        }

        /**
         * @param projectKey The feature flag&#39;s project key.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(String projectKey) {
            return projectKey(Output.of(projectKey));
        }

        /**
         * @param tags Set of feature flag tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Set of feature flag tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Set of feature flag tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param temporary Whether the flag is a temporary flag.
         * 
         * @return builder
         * 
         */
        public Builder temporary(@Nullable Output<Boolean> temporary) {
            $.temporary = temporary;
            return this;
        }

        /**
         * @param temporary Whether the flag is a temporary flag.
         * 
         * @return builder
         * 
         */
        public Builder temporary(Boolean temporary) {
            return temporary(Output.of(temporary));
        }

        /**
         * @param variations List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
         * 
         * @return builder
         * 
         */
        public Builder variations(@Nullable Output<List<GetFeatureFlagVariationArgs>> variations) {
            $.variations = variations;
            return this;
        }

        /**
         * @param variations List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
         * 
         * @return builder
         * 
         */
        public Builder variations(List<GetFeatureFlagVariationArgs> variations) {
            return variations(Output.of(variations));
        }

        /**
         * @param variations List of nested blocks describing the variations associated with the feature flag. To learn more, read Nested Variations Blocks.
         * 
         * @return builder
         * 
         */
        public Builder variations(GetFeatureFlagVariationArgs... variations) {
            return variations(List.of(variations));
        }

        public GetFeatureFlagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.projectKey = Objects.requireNonNull($.projectKey, "expected parameter 'projectKey' to be non-null");
            return $;
        }
    }

}