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

    public sealed class GetFeatureFlagVariationInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The variation's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the custom property.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The list of custom property value strings.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public GetFeatureFlagVariationInputArgs()
        {
        }
        public static new GetFeatureFlagVariationInputArgs Empty => new GetFeatureFlagVariationInputArgs();
    }
}
