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

    public sealed class GetFeatureFlagEnvironmentFallthroughInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Group percentage rollout by a custom attribute.
        /// </summary>
        [Input("bucketBy")]
        public Input<string>? BucketBy { get; set; }

        [Input("rolloutWeights")]
        private InputList<int>? _rolloutWeights;

        /// <summary>
        /// List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
        /// </summary>
        public InputList<int> RolloutWeights
        {
            get => _rolloutWeights ?? (_rolloutWeights = new InputList<int>());
            set => _rolloutWeights = value;
        }

        /// <summary>
        /// The integer variation index served when the rule clauses evaluate to `true`.
        /// </summary>
        [Input("variation")]
        public Input<int>? Variation { get; set; }

        public GetFeatureFlagEnvironmentFallthroughInputArgs()
        {
        }
        public static new GetFeatureFlagEnvironmentFallthroughInputArgs Empty => new GetFeatureFlagEnvironmentFallthroughInputArgs();
    }
}
