// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagEnvironmentFallthroughArgs;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagEnvironmentPrerequisiteArgs;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagEnvironmentRuleArgs;
import com.pulumi.launchdarkly.inputs.GetFeatureFlagEnvironmentTargetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeatureFlagEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureFlagEnvironmentArgs Empty = new GetFeatureFlagEnvironmentArgs();

    /**
     * The environment key.
     * 
     */
    @Import(name="envKey", required=true)
    private Output<String> envKey;

    /**
     * @return The environment key.
     * 
     */
    public Output<String> envKey() {
        return this.envKey;
    }

    @Import(name="fallthrough")
    private @Nullable Output<GetFeatureFlagEnvironmentFallthroughArgs> fallthrough;

    public Optional<Output<GetFeatureFlagEnvironmentFallthroughArgs>> fallthrough() {
        return Optional.ofNullable(this.fallthrough);
    }

    /**
     * The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
     * 
     */
    @Import(name="flagId", required=true)
    private Output<String> flagId;

    /**
     * @return The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
     * 
     */
    public Output<String> flagId() {
        return this.flagId;
    }

    /**
     * The index of the variation served when targeting is disabled.
     * 
     */
    @Import(name="offVariation")
    private @Nullable Output<Integer> offVariation;

    /**
     * @return The index of the variation served when targeting is disabled.
     * 
     */
    public Optional<Output<Integer>> offVariation() {
        return Optional.ofNullable(this.offVariation);
    }

    /**
     * Whether targeting is enabled.
     * 
     */
    @Import(name="on")
    private @Nullable Output<Boolean> on;

    /**
     * @return Whether targeting is enabled.
     * 
     */
    public Optional<Output<Boolean>> on() {
        return Optional.ofNullable(this.on);
    }

    /**
     * List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
     * 
     */
    @Import(name="prerequisites")
    private @Nullable Output<List<GetFeatureFlagEnvironmentPrerequisiteArgs>> prerequisites;

    /**
     * @return List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
     * 
     */
    public Optional<Output<List<GetFeatureFlagEnvironmentPrerequisiteArgs>>> prerequisites() {
        return Optional.ofNullable(this.prerequisites);
    }

    /**
     * List of logical targeting rules. To learn more, read Nested Rules Blocks.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<GetFeatureFlagEnvironmentRuleArgs>> rules;

    /**
     * @return List of logical targeting rules. To learn more, read Nested Rules Blocks.
     * 
     */
    public Optional<Output<List<GetFeatureFlagEnvironmentRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    @Import(name="targets")
    private @Nullable Output<List<GetFeatureFlagEnvironmentTargetArgs>> targets;

    public Optional<Output<List<GetFeatureFlagEnvironmentTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * Whether event data will be sent back to LaunchDarkly.
     * 
     */
    @Import(name="trackEvents")
    private @Nullable Output<Boolean> trackEvents;

    /**
     * @return Whether event data will be sent back to LaunchDarkly.
     * 
     */
    public Optional<Output<Boolean>> trackEvents() {
        return Optional.ofNullable(this.trackEvents);
    }

    private GetFeatureFlagEnvironmentArgs() {}

    private GetFeatureFlagEnvironmentArgs(GetFeatureFlagEnvironmentArgs $) {
        this.envKey = $.envKey;
        this.fallthrough = $.fallthrough;
        this.flagId = $.flagId;
        this.offVariation = $.offVariation;
        this.on = $.on;
        this.prerequisites = $.prerequisites;
        this.rules = $.rules;
        this.targets = $.targets;
        this.trackEvents = $.trackEvents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagEnvironmentArgs $;

        public Builder() {
            $ = new GetFeatureFlagEnvironmentArgs();
        }

        public Builder(GetFeatureFlagEnvironmentArgs defaults) {
            $ = new GetFeatureFlagEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param envKey The environment key.
         * 
         * @return builder
         * 
         */
        public Builder envKey(Output<String> envKey) {
            $.envKey = envKey;
            return this;
        }

        /**
         * @param envKey The environment key.
         * 
         * @return builder
         * 
         */
        public Builder envKey(String envKey) {
            return envKey(Output.of(envKey));
        }

        public Builder fallthrough(@Nullable Output<GetFeatureFlagEnvironmentFallthroughArgs> fallthrough) {
            $.fallthrough = fallthrough;
            return this;
        }

        public Builder fallthrough(GetFeatureFlagEnvironmentFallthroughArgs fallthrough) {
            return fallthrough(Output.of(fallthrough));
        }

        /**
         * @param flagId The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
         * 
         * @return builder
         * 
         */
        public Builder flagId(Output<String> flagId) {
            $.flagId = flagId;
            return this;
        }

        /**
         * @param flagId The feature flag&#39;s unique `id` in the format `project_key/flag_key`.
         * 
         * @return builder
         * 
         */
        public Builder flagId(String flagId) {
            return flagId(Output.of(flagId));
        }

        /**
         * @param offVariation The index of the variation served when targeting is disabled.
         * 
         * @return builder
         * 
         */
        public Builder offVariation(@Nullable Output<Integer> offVariation) {
            $.offVariation = offVariation;
            return this;
        }

        /**
         * @param offVariation The index of the variation served when targeting is disabled.
         * 
         * @return builder
         * 
         */
        public Builder offVariation(Integer offVariation) {
            return offVariation(Output.of(offVariation));
        }

        /**
         * @param on Whether targeting is enabled.
         * 
         * @return builder
         * 
         */
        public Builder on(@Nullable Output<Boolean> on) {
            $.on = on;
            return this;
        }

        /**
         * @param on Whether targeting is enabled.
         * 
         * @return builder
         * 
         */
        public Builder on(Boolean on) {
            return on(Output.of(on));
        }

        /**
         * @param prerequisites List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
         * 
         * @return builder
         * 
         */
        public Builder prerequisites(@Nullable Output<List<GetFeatureFlagEnvironmentPrerequisiteArgs>> prerequisites) {
            $.prerequisites = prerequisites;
            return this;
        }

        /**
         * @param prerequisites List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
         * 
         * @return builder
         * 
         */
        public Builder prerequisites(List<GetFeatureFlagEnvironmentPrerequisiteArgs> prerequisites) {
            return prerequisites(Output.of(prerequisites));
        }

        /**
         * @param prerequisites List of nested blocks describing prerequisite feature flags rules. To learn more, read Nested Prequisites Blocks.
         * 
         * @return builder
         * 
         */
        public Builder prerequisites(GetFeatureFlagEnvironmentPrerequisiteArgs... prerequisites) {
            return prerequisites(List.of(prerequisites));
        }

        /**
         * @param rules List of logical targeting rules. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<GetFeatureFlagEnvironmentRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of logical targeting rules. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<GetFeatureFlagEnvironmentRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of logical targeting rules. To learn more, read Nested Rules Blocks.
         * 
         * @return builder
         * 
         */
        public Builder rules(GetFeatureFlagEnvironmentRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder targets(@Nullable Output<List<GetFeatureFlagEnvironmentTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<GetFeatureFlagEnvironmentTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(GetFeatureFlagEnvironmentTargetArgs... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param trackEvents Whether event data will be sent back to LaunchDarkly.
         * 
         * @return builder
         * 
         */
        public Builder trackEvents(@Nullable Output<Boolean> trackEvents) {
            $.trackEvents = trackEvents;
            return this;
        }

        /**
         * @param trackEvents Whether event data will be sent back to LaunchDarkly.
         * 
         * @return builder
         * 
         */
        public Builder trackEvents(Boolean trackEvents) {
            return trackEvents(Output.of(trackEvents));
        }

        public GetFeatureFlagEnvironmentArgs build() {
            $.envKey = Objects.requireNonNull($.envKey, "expected parameter 'envKey' to be non-null");
            $.flagId = Objects.requireNonNull($.flagId, "expected parameter 'flagId' to be non-null");
            return $;
        }
    }

}
