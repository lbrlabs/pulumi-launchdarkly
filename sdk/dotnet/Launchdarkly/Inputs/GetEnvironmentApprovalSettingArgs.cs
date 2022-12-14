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

    public sealed class GetEnvironmentApprovalSettingInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("canApplyDeclinedChanges")]
        public Input<bool>? CanApplyDeclinedChanges { get; set; }

        [Input("canReviewOwnRequest")]
        public Input<bool>? CanReviewOwnRequest { get; set; }

        [Input("minNumApprovals")]
        public Input<int>? MinNumApprovals { get; set; }

        [Input("required")]
        public Input<bool>? Required { get; set; }

        [Input("requiredApprovalTags")]
        private InputList<string>? _requiredApprovalTags;
        public InputList<string> RequiredApprovalTags
        {
            get => _requiredApprovalTags ?? (_requiredApprovalTags = new InputList<string>());
            set => _requiredApprovalTags = value;
        }

        public GetEnvironmentApprovalSettingInputArgs()
        {
        }
        public static new GetEnvironmentApprovalSettingInputArgs Empty => new GetEnvironmentApprovalSettingInputArgs();
    }
}
