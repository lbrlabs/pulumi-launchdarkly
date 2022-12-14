// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Launchdarkly.Outputs
{

    [OutputType]
    public sealed class GetFeatureFlagEnvironmentRuleResult
    {
        /// <summary>
        /// Group percentage rollout by a custom attribute.
        /// </summary>
        public readonly string? BucketBy;
        /// <summary>
        /// List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFeatureFlagEnvironmentRuleClauseResult> Clauses;
        /// <summary>
        /// List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
        /// </summary>
        public readonly ImmutableArray<int> RolloutWeights;
        /// <summary>
        /// The integer variation index served when the rule clauses evaluate to `true`.
        /// </summary>
        public readonly int? Variation;

        [OutputConstructor]
        private GetFeatureFlagEnvironmentRuleResult(
            string? bucketBy,

            ImmutableArray<Outputs.GetFeatureFlagEnvironmentRuleClauseResult> clauses,

            ImmutableArray<int> rolloutWeights,

            int? variation)
        {
            BucketBy = bucketBy;
            Clauses = clauses;
            RolloutWeights = rolloutWeights;
            Variation = variation;
        }
    }
}
