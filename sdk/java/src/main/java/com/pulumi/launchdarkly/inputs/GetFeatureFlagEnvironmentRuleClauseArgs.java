// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeatureFlagEnvironmentRuleClauseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFeatureFlagEnvironmentRuleClauseArgs Empty = new GetFeatureFlagEnvironmentRuleClauseArgs();

    /**
     * The user attribute operated on.
     * 
     */
    @Import(name="attribute", required=true)
    private Output<String> attribute;

    /**
     * @return The user attribute operated on.
     * 
     */
    public Output<String> attribute() {
        return this.attribute;
    }

    /**
     * Whether the rule clause is negated.
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    /**
     * @return Whether the rule clause is negated.
     * 
     */
    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    /**
     * The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     * 
     */
    @Import(name="op", required=true)
    private Output<String> op;

    /**
     * @return The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     * 
     */
    public Output<String> op() {
        return this.op;
    }

    /**
     * The type for each of the clause&#39;s values. Available types are `boolean`, `string`, and `number`.
     * 
     */
    @Import(name="valueType")
    private @Nullable Output<String> valueType;

    /**
     * @return The type for each of the clause&#39;s values. Available types are `boolean`, `string`, and `number`.
     * 
     */
    public Optional<Output<String>> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    /**
     * The list of values associated with the rule clause.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The list of values associated with the rule clause.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetFeatureFlagEnvironmentRuleClauseArgs() {}

    private GetFeatureFlagEnvironmentRuleClauseArgs(GetFeatureFlagEnvironmentRuleClauseArgs $) {
        this.attribute = $.attribute;
        this.negate = $.negate;
        this.op = $.op;
        this.valueType = $.valueType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagEnvironmentRuleClauseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagEnvironmentRuleClauseArgs $;

        public Builder() {
            $ = new GetFeatureFlagEnvironmentRuleClauseArgs();
        }

        public Builder(GetFeatureFlagEnvironmentRuleClauseArgs defaults) {
            $ = new GetFeatureFlagEnvironmentRuleClauseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute The user attribute operated on.
         * 
         * @return builder
         * 
         */
        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute The user attribute operated on.
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param negate Whether the rule clause is negated.
         * 
         * @return builder
         * 
         */
        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        /**
         * @param negate Whether the rule clause is negated.
         * 
         * @return builder
         * 
         */
        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        /**
         * @param op The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
         * 
         * @return builder
         * 
         */
        public Builder op(Output<String> op) {
            $.op = op;
            return this;
        }

        /**
         * @param op The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
         * 
         * @return builder
         * 
         */
        public Builder op(String op) {
            return op(Output.of(op));
        }

        /**
         * @param valueType The type for each of the clause&#39;s values. Available types are `boolean`, `string`, and `number`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(@Nullable Output<String> valueType) {
            $.valueType = valueType;
            return this;
        }

        /**
         * @param valueType The type for each of the clause&#39;s values. Available types are `boolean`, `string`, and `number`.
         * 
         * @return builder
         * 
         */
        public Builder valueType(String valueType) {
            return valueType(Output.of(valueType));
        }

        /**
         * @param values The list of values associated with the rule clause.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The list of values associated with the rule clause.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
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

        public GetFeatureFlagEnvironmentRuleClauseArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.op = Objects.requireNonNull($.op, "expected parameter 'op' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}