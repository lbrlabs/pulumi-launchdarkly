// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetFeatureFlagEnvironmentTarget extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureFlagEnvironmentTarget Empty = new GetFeatureFlagEnvironmentTarget();

    /**
     * The list of values associated with the rule clause.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return The list of values associated with the rule clause.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     * 
     */
    @Import(name="variation", required=true)
    private Integer variation;

    /**
     * @return The integer variation index served when the rule clauses evaluate to `true`.
     * 
     */
    public Integer variation() {
        return this.variation;
    }

    private GetFeatureFlagEnvironmentTarget() {}

    private GetFeatureFlagEnvironmentTarget(GetFeatureFlagEnvironmentTarget $) {
        this.values = $.values;
        this.variation = $.variation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagEnvironmentTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagEnvironmentTarget $;

        public Builder() {
            $ = new GetFeatureFlagEnvironmentTarget();
        }

        public Builder(GetFeatureFlagEnvironmentTarget defaults) {
            $ = new GetFeatureFlagEnvironmentTarget(Objects.requireNonNull(defaults));
        }

        /**
         * @param values The list of values associated with the rule clause.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The list of values associated with the rule clause.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        /**
         * @param variation The integer variation index served when the rule clauses evaluate to `true`.
         * 
         * @return builder
         * 
         */
        public Builder variation(Integer variation) {
            $.variation = variation;
            return this;
        }

        public GetFeatureFlagEnvironmentTarget build() {
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            $.variation = Objects.requireNonNull($.variation, "expected parameter 'variation' to be non-null");
            return $;
        }
    }

}