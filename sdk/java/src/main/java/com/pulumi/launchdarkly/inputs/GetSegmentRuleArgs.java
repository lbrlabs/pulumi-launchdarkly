// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.GetSegmentRuleClauseArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSegmentRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSegmentRuleArgs Empty = new GetSegmentRuleArgs();

    /**
     * The attribute by which to group users together.
     * 
     */
    @Import(name="bucketBy")
    private @Nullable Output<String> bucketBy;

    /**
     * @return The attribute by which to group users together.
     * 
     */
    public Optional<Output<String>> bucketBy() {
        return Optional.ofNullable(this.bucketBy);
    }

    /**
     * List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
     * 
     */
    @Import(name="clauses")
    private @Nullable Output<List<GetSegmentRuleClauseArgs>> clauses;

    /**
     * @return List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
     * 
     */
    public Optional<Output<List<GetSegmentRuleClauseArgs>>> clauses() {
        return Optional.ofNullable(this.clauses);
    }

    /**
     * The integer weight of the rule (between 0 and 100000).
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The integer weight of the rule (between 0 and 100000).
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private GetSegmentRuleArgs() {}

    private GetSegmentRuleArgs(GetSegmentRuleArgs $) {
        this.bucketBy = $.bucketBy;
        this.clauses = $.clauses;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSegmentRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSegmentRuleArgs $;

        public Builder() {
            $ = new GetSegmentRuleArgs();
        }

        public Builder(GetSegmentRuleArgs defaults) {
            $ = new GetSegmentRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketBy The attribute by which to group users together.
         * 
         * @return builder
         * 
         */
        public Builder bucketBy(@Nullable Output<String> bucketBy) {
            $.bucketBy = bucketBy;
            return this;
        }

        /**
         * @param bucketBy The attribute by which to group users together.
         * 
         * @return builder
         * 
         */
        public Builder bucketBy(String bucketBy) {
            return bucketBy(Output.of(bucketBy));
        }

        /**
         * @param clauses List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
         * 
         * @return builder
         * 
         */
        public Builder clauses(@Nullable Output<List<GetSegmentRuleClauseArgs>> clauses) {
            $.clauses = clauses;
            return this;
        }

        /**
         * @param clauses List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
         * 
         * @return builder
         * 
         */
        public Builder clauses(List<GetSegmentRuleClauseArgs> clauses) {
            return clauses(Output.of(clauses));
        }

        /**
         * @param clauses List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
         * 
         * @return builder
         * 
         */
        public Builder clauses(GetSegmentRuleClauseArgs... clauses) {
            return clauses(List.of(clauses));
        }

        /**
         * @param weight The integer weight of the rule (between 0 and 100000).
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The integer weight of the rule (between 0 and 100000).
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public GetSegmentRuleArgs build() {
            return $;
        }
    }

}
