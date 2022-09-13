// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Launchdarkly.Inputs
{

    public sealed class GetFeatureFlagEnvironmentRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Group percentage rollout by a custom attribute.
        /// </summary>
        [Input("bucketBy")]
        public string? BucketBy { get; set; }

        [Input("clauses")]
        private List<Inputs.GetFeatureFlagEnvironmentRuleClauseArgs>? _clauses;

        /// <summary>
        /// List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
        /// </summary>
        public List<Inputs.GetFeatureFlagEnvironmentRuleClauseArgs> Clauses
        {
            get => _clauses ?? (_clauses = new List<Inputs.GetFeatureFlagEnvironmentRuleClauseArgs>());
            set => _clauses = value;
        }

        [Input("rolloutWeights")]
        private List<int>? _rolloutWeights;

        /// <summary>
        /// List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
        /// </summary>
        public List<int> RolloutWeights
        {
            get => _rolloutWeights ?? (_rolloutWeights = new List<int>());
            set => _rolloutWeights = value;
        }

        /// <summary>
        /// The integer variation index served when the rule clauses evaluate to `true`.
        /// </summary>
        [Input("variation")]
        public int? Variation { get; set; }

        public GetFeatureFlagEnvironmentRuleArgs()
        {
        }
        public static new GetFeatureFlagEnvironmentRuleArgs Empty => new GetFeatureFlagEnvironmentRuleArgs();
    }
}