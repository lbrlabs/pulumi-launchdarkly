// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DestinationState extends com.pulumi.resources.ResourceArgs {

    public static final DestinationState Empty = new DestinationState();

    /**
     * - The destination-specific configuration. To learn more, read Destination-Specific Configs.
     * 
     */
    @Import(name="config")
    private @Nullable Output<Map<String,String>> config;

    /**
     * @return - The destination-specific configuration. To learn more, read Destination-Specific Configs.
     * 
     */
    public Optional<Output<Map<String,String>>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="envKey")
    private @Nullable Output<String> envKey;

    /**
     * @return - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Optional<Output<String>> envKey() {
        return Optional.ofNullable(this.envKey);
    }

    /**
     * - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * - 
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return -
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * - Whether the data export destination is on or not.
     * 
     */
    @Import(name="on")
    private @Nullable Output<Boolean> on;

    /**
     * @return - Whether the data export destination is on or not.
     * 
     */
    public Optional<Output<Boolean>> on() {
        return Optional.ofNullable(this.on);
    }

    /**
     * - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="projectKey")
    private @Nullable Output<String> projectKey;

    /**
     * @return - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Optional<Output<String>> projectKey() {
        return Optional.ofNullable(this.projectKey);
    }

    /**
     * Tags associated with your resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags associated with your resource
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DestinationState() {}

    private DestinationState(DestinationState $) {
        this.config = $.config;
        this.envKey = $.envKey;
        this.kind = $.kind;
        this.name = $.name;
        this.on = $.on;
        this.projectKey = $.projectKey;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationState $;

        public Builder() {
            $ = new DestinationState();
        }

        public Builder(DestinationState defaults) {
            $ = new DestinationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config - The destination-specific configuration. To learn more, read Destination-Specific Configs.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<Map<String,String>> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config - The destination-specific configuration. To learn more, read Destination-Specific Configs.
         * 
         * @return builder
         * 
         */
        public Builder config(Map<String,String> config) {
            return config(Output.of(config));
        }

        /**
         * @param envKey - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder envKey(@Nullable Output<String> envKey) {
            $.envKey = envKey;
            return this;
        }

        /**
         * @param envKey - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder envKey(String envKey) {
            return envKey(Output.of(envKey));
        }

        /**
         * @param kind - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name -
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name -
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param on - Whether the data export destination is on or not.
         * 
         * @return builder
         * 
         */
        public Builder on(@Nullable Output<Boolean> on) {
            $.on = on;
            return this;
        }

        /**
         * @param on - Whether the data export destination is on or not.
         * 
         * @return builder
         * 
         */
        public Builder on(Boolean on) {
            return on(Output.of(on));
        }

        /**
         * @param projectKey - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(@Nullable Output<String> projectKey) {
            $.projectKey = projectKey;
            return this;
        }

        /**
         * @param projectKey - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(String projectKey) {
            return projectKey(Output.of(projectKey));
        }

        /**
         * @param tags Tags associated with your resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags associated with your resource
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags associated with your resource
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public DestinationState build() {
            return $;
        }
    }

}
