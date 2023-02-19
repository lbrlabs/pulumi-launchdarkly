// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.EnvironmentApprovalSettingArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @Import(name="approvalSettings")
    private @Nullable Output<List<EnvironmentApprovalSettingArgs>> approvalSettings;

    public Optional<Output<List<EnvironmentApprovalSettingArgs>>> approvalSettings() {
        return Optional.ofNullable(this.approvalSettings);
    }

    /**
     * The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     * 
     */
    @Import(name="color", required=true)
    private Output<String> color;

    /**
     * @return The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     * 
     */
    public Output<String> color() {
        return this.color;
    }

    /**
     * Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    @Import(name="confirmChanges")
    private @Nullable Output<Boolean> confirmChanges;

    /**
     * @return Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    public Optional<Output<Boolean>> confirmChanges() {
        return Optional.ofNullable(this.confirmChanges);
    }

    /**
     * Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     * 
     */
    @Import(name="defaultTrackEvents")
    private @Nullable Output<Boolean> defaultTrackEvents;

    /**
     * @return Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     * 
     */
    public Optional<Output<Boolean>> defaultTrackEvents() {
        return Optional.ofNullable(this.defaultTrackEvents);
    }

    /**
     * The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<Integer> defaultTtl;

    /**
     * @return The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     * 
     */
    public Optional<Output<Integer>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * The project-unique key for the environment. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The project-unique key for the environment. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * - The environment&#39;s project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="projectKey", required=true)
    private Output<String> projectKey;

    /**
     * @return - The environment&#39;s project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Output<String> projectKey() {
        return this.projectKey;
    }

    /**
     * Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    @Import(name="requireComments")
    private @Nullable Output<Boolean> requireComments;

    /**
     * @return Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     * 
     */
    public Optional<Output<Boolean>> requireComments() {
        return Optional.ofNullable(this.requireComments);
    }

    /**
     * Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     * 
     */
    @Import(name="secureMode")
    private @Nullable Output<Boolean> secureMode;

    /**
     * @return Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     * 
     */
    public Optional<Output<Boolean>> secureMode() {
        return Optional.ofNullable(this.secureMode);
    }

    /**
     * Set of tags associated with the environment.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Set of tags associated with the environment.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.approvalSettings = $.approvalSettings;
        this.color = $.color;
        this.confirmChanges = $.confirmChanges;
        this.defaultTrackEvents = $.defaultTrackEvents;
        this.defaultTtl = $.defaultTtl;
        this.key = $.key;
        this.name = $.name;
        this.projectKey = $.projectKey;
        this.requireComments = $.requireComments;
        this.secureMode = $.secureMode;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder approvalSettings(@Nullable Output<List<EnvironmentApprovalSettingArgs>> approvalSettings) {
            $.approvalSettings = approvalSettings;
            return this;
        }

        public Builder approvalSettings(List<EnvironmentApprovalSettingArgs> approvalSettings) {
            return approvalSettings(Output.of(approvalSettings));
        }

        public Builder approvalSettings(EnvironmentApprovalSettingArgs... approvalSettings) {
            return approvalSettings(List.of(approvalSettings));
        }

        /**
         * @param color The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
         * 
         * @return builder
         * 
         */
        public Builder color(Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        /**
         * @param confirmChanges Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
         * 
         * @return builder
         * 
         */
        public Builder confirmChanges(@Nullable Output<Boolean> confirmChanges) {
            $.confirmChanges = confirmChanges;
            return this;
        }

        /**
         * @param confirmChanges Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
         * 
         * @return builder
         * 
         */
        public Builder confirmChanges(Boolean confirmChanges) {
            return confirmChanges(Output.of(confirmChanges));
        }

        /**
         * @param defaultTrackEvents Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
         * 
         * @return builder
         * 
         */
        public Builder defaultTrackEvents(@Nullable Output<Boolean> defaultTrackEvents) {
            $.defaultTrackEvents = defaultTrackEvents;
            return this;
        }

        /**
         * @param defaultTrackEvents Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
         * 
         * @return builder
         * 
         */
        public Builder defaultTrackEvents(Boolean defaultTrackEvents) {
            return defaultTrackEvents(Output.of(defaultTrackEvents));
        }

        /**
         * @param defaultTtl The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * @param defaultTtl The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(Integer defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        /**
         * @param key The project-unique key for the environment. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The project-unique key for the environment. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectKey - The environment&#39;s project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(Output<String> projectKey) {
            $.projectKey = projectKey;
            return this;
        }

        /**
         * @param projectKey - The environment&#39;s project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(String projectKey) {
            return projectKey(Output.of(projectKey));
        }

        /**
         * @param requireComments Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
         * 
         * @return builder
         * 
         */
        public Builder requireComments(@Nullable Output<Boolean> requireComments) {
            $.requireComments = requireComments;
            return this;
        }

        /**
         * @param requireComments Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
         * 
         * @return builder
         * 
         */
        public Builder requireComments(Boolean requireComments) {
            return requireComments(Output.of(requireComments));
        }

        /**
         * @param secureMode Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
         * 
         * @return builder
         * 
         */
        public Builder secureMode(@Nullable Output<Boolean> secureMode) {
            $.secureMode = secureMode;
            return this;
        }

        /**
         * @param secureMode Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
         * 
         * @return builder
         * 
         */
        public Builder secureMode(Boolean secureMode) {
            return secureMode(Output.of(secureMode));
        }

        /**
         * @param tags Set of tags associated with the environment.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Set of tags associated with the environment.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Set of tags associated with the environment.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public EnvironmentArgs build() {
            $.color = Objects.requireNonNull($.color, "expected parameter 'color' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.projectKey = Objects.requireNonNull($.projectKey, "expected parameter 'projectKey' to be non-null");
            return $;
        }
    }

}
