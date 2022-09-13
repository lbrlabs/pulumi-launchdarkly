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

    public sealed class GetFeatureFlagEnvironmentPrerequisiteInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The prerequisite feature flag's `key`.
        /// </summary>
        [Input("flagKey", required: true)]
        public Input<string> FlagKey { get; set; } = null!;

        /// <summary>
        /// The integer variation index served when the rule clauses evaluate to `true`.
        /// </summary>
        [Input("variation", required: true)]
        public Input<int> Variation { get; set; } = null!;

        public GetFeatureFlagEnvironmentPrerequisiteInputArgs()
        {
        }
        public static new GetFeatureFlagEnvironmentPrerequisiteInputArgs Empty => new GetFeatureFlagEnvironmentPrerequisiteInputArgs();
    }
}