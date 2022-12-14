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

    public sealed class SegmentRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The attribute by which to group users together.
        /// </summary>
        [Input("bucketBy")]
        public Input<string>? BucketBy { get; set; }

        [Input("clauses")]
        private InputList<Inputs.SegmentRuleClauseGetArgs>? _clauses;

        /// <summary>
        /// List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
        /// </summary>
        public InputList<Inputs.SegmentRuleClauseGetArgs> Clauses
        {
            get => _clauses ?? (_clauses = new InputList<Inputs.SegmentRuleClauseGetArgs>());
            set => _clauses = value;
        }

        /// <summary>
        /// The integer weight of the rule (between 1 and 100000).
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public SegmentRuleGetArgs()
        {
        }
        public static new SegmentRuleGetArgs Empty => new SegmentRuleGetArgs();
    }
}
