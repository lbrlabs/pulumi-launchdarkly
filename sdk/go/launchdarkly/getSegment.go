// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly segment data source.
//
// This data source allows you to retrieve segment information from your LaunchDarkly organization.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.LookupSegment(ctx, &GetSegmentArgs{
//				EnvKey:     "example-env",
//				Key:        "example-segment",
//				ProjectKey: "example-project",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSegment(ctx *pulumi.Context, args *LookupSegmentArgs, opts ...pulumi.InvokeOption) (*LookupSegmentResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupSegmentResult
	err := ctx.Invoke("launchdarkly:index/getSegment:getSegment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSegment.
type LookupSegmentArgs struct {
	// The description of the segment's purpose.
	Description *string `pulumi:"description"`
	// The segment's environment key.
	EnvKey string `pulumi:"envKey"`
	// List of user keys excluded from the segment.
	Excludeds []string `pulumi:"excludeds"`
	// List of user keys included in the segment.
	Includeds []string `pulumi:"includeds"`
	// The unique key that references the segment.
	Key string `pulumi:"key"`
	// The segment's project key.
	ProjectKey string `pulumi:"projectKey"`
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules []GetSegmentRule `pulumi:"rules"`
	// Set of tags for the segment.
	Tags []string `pulumi:"tags"`
}

// A collection of values returned by getSegment.
type LookupSegmentResult struct {
	// The segment's creation date represented as a UNIX epoch timestamp.
	CreationDate int `pulumi:"creationDate"`
	// The description of the segment's purpose.
	Description *string `pulumi:"description"`
	EnvKey      string  `pulumi:"envKey"`
	// List of user keys excluded from the segment.
	Excludeds []string `pulumi:"excludeds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of user keys included in the segment.
	Includeds []string `pulumi:"includeds"`
	Key       string   `pulumi:"key"`
	// The human-friendly name for the segment.
	Name       string `pulumi:"name"`
	ProjectKey string `pulumi:"projectKey"`
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules []GetSegmentRule `pulumi:"rules"`
	// Set of tags for the segment.
	Tags []string `pulumi:"tags"`
}

func LookupSegmentOutput(ctx *pulumi.Context, args LookupSegmentOutputArgs, opts ...pulumi.InvokeOption) LookupSegmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSegmentResult, error) {
			args := v.(LookupSegmentArgs)
			r, err := LookupSegment(ctx, &args, opts...)
			var s LookupSegmentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSegmentResultOutput)
}

// A collection of arguments for invoking getSegment.
type LookupSegmentOutputArgs struct {
	// The description of the segment's purpose.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The segment's environment key.
	EnvKey pulumi.StringInput `pulumi:"envKey"`
	// List of user keys excluded from the segment.
	Excludeds pulumi.StringArrayInput `pulumi:"excludeds"`
	// List of user keys included in the segment.
	Includeds pulumi.StringArrayInput `pulumi:"includeds"`
	// The unique key that references the segment.
	Key pulumi.StringInput `pulumi:"key"`
	// The segment's project key.
	ProjectKey pulumi.StringInput `pulumi:"projectKey"`
	// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
	Rules GetSegmentRuleArrayInput `pulumi:"rules"`
	// Set of tags for the segment.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
}

func (LookupSegmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSegmentArgs)(nil)).Elem()
}

// A collection of values returned by getSegment.
type LookupSegmentResultOutput struct{ *pulumi.OutputState }

func (LookupSegmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSegmentResult)(nil)).Elem()
}

func (o LookupSegmentResultOutput) ToLookupSegmentResultOutput() LookupSegmentResultOutput {
	return o
}

func (o LookupSegmentResultOutput) ToLookupSegmentResultOutputWithContext(ctx context.Context) LookupSegmentResultOutput {
	return o
}

// The segment's creation date represented as a UNIX epoch timestamp.
func (o LookupSegmentResultOutput) CreationDate() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSegmentResult) int { return v.CreationDate }).(pulumi.IntOutput)
}

// The description of the segment's purpose.
func (o LookupSegmentResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSegmentResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

func (o LookupSegmentResultOutput) EnvKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSegmentResult) string { return v.EnvKey }).(pulumi.StringOutput)
}

// List of user keys excluded from the segment.
func (o LookupSegmentResultOutput) Excludeds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSegmentResult) []string { return v.Excludeds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSegmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSegmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of user keys included in the segment.
func (o LookupSegmentResultOutput) Includeds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSegmentResult) []string { return v.Includeds }).(pulumi.StringArrayOutput)
}

func (o LookupSegmentResultOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSegmentResult) string { return v.Key }).(pulumi.StringOutput)
}

// The human-friendly name for the segment.
func (o LookupSegmentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSegmentResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupSegmentResultOutput) ProjectKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSegmentResult) string { return v.ProjectKey }).(pulumi.StringOutput)
}

// List of nested custom rule blocks to apply to the segment. To learn more, read Nested Rules Blocks.
func (o LookupSegmentResultOutput) Rules() GetSegmentRuleArrayOutput {
	return o.ApplyT(func(v LookupSegmentResult) []GetSegmentRule { return v.Rules }).(GetSegmentRuleArrayOutput)
}

// Set of tags for the segment.
func (o LookupSegmentResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSegmentResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSegmentResultOutput{})
}