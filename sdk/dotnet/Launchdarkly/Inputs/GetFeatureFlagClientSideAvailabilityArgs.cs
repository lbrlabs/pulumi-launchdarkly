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

    public sealed class GetFeatureFlagClientSideAvailabilityInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When set to true, this flag is available to SDKs using the client-side ID.
        /// </summary>
        [Input("usingEnvironmentId", required: true)]
        public Input<bool> UsingEnvironmentId { get; set; } = null!;

        /// <summary>
        /// When set to true, this flag is available to SDKs using a mobile key.
        /// </summary>
        [Input("usingMobileKey")]
        public Input<bool>? UsingMobileKey { get; set; }

        public GetFeatureFlagClientSideAvailabilityInputArgs()
        {
        }
        public static new GetFeatureFlagClientSideAvailabilityInputArgs Empty => new GetFeatureFlagClientSideAvailabilityInputArgs();
    }
}
