// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class FeatureFlagEnvironmentTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureFlagEnvironmentTargetArgs Empty = new FeatureFlagEnvironmentTargetArgs();

    /**
     * List of `user` strings to target.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return List of `user` strings to target.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    /**
     * The index of the variation to serve is a user target value is matched.
     * 
     */
    @Import(name="variation", required=true)
    private Output<Integer> variation;

    /**
     * @return The index of the variation to serve is a user target value is matched.
     * 
     */
    public Output<Integer> variation() {
        return this.variation;
    }

    private FeatureFlagEnvironmentTargetArgs() {}

    private FeatureFlagEnvironmentTargetArgs(FeatureFlagEnvironmentTargetArgs $) {
        this.values = $.values;
        this.variation = $.variation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureFlagEnvironmentTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureFlagEnvironmentTargetArgs $;

        public Builder() {
            $ = new FeatureFlagEnvironmentTargetArgs();
        }

        public Builder(FeatureFlagEnvironmentTargetArgs defaults) {
            $ = new FeatureFlagEnvironmentTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param values List of `user` strings to target.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values List of `user` strings to target.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values List of `user` strings to target.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        /**
         * @param variation The index of the variation to serve is a user target value is matched.
         * 
         * @return builder
         * 
         */
        public Builder variation(Output<Integer> variation) {
            $.variation = variation;
            return this;
        }

        /**
         * @param variation The index of the variation to serve is a user target value is matched.
         * 
         * @return builder
         * 
         */
        public Builder variation(Integer variation) {
            return variation(Output.of(variation));
        }

        public FeatureFlagEnvironmentTargetArgs build() {
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            $.variation = Objects.requireNonNull($.variation, "expected parameter 'variation' to be non-null");
            return $;
        }
    }

}