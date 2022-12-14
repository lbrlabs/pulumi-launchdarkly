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
    public sealed class GetFeatureFlagEnvironmentTargetResult
    {
        /// <summary>
        /// The list of values associated with the rule clause.
        /// </summary>
        public readonly ImmutableArray<string> Values;
        /// <summary>
        /// The integer variation index served when the rule clauses evaluate to `true`.
        /// </summary>
        public readonly int Variation;

        [OutputConstructor]
        private GetFeatureFlagEnvironmentTargetResult(
            ImmutableArray<string> values,

            int variation)
        {
            Values = values;
            Variation = variation;
        }
    }
}
