// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly feature flag resource.
//
// This resource allows you to create and manage feature flags within your LaunchDarkly organization.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.NewFeatureFlag(ctx, "buildingMaterials", &launchdarkly.FeatureFlagArgs{
//				ProjectKey:    pulumi.Any(launchdarkly_project.Example.Key),
//				Key:           pulumi.String("building-materials"),
//				Description:   pulumi.String("this is a multivariate flag with string variations."),
//				VariationType: pulumi.String("string"),
//				Variations: launchdarkly.FeatureFlagVariationArray{
//					&launchdarkly.FeatureFlagVariationArgs{
//						Value:       pulumi.String("straw"),
//						Name:        pulumi.String("Straw"),
//						Description: pulumi.String("Watch out for wind."),
//					},
//					&launchdarkly.FeatureFlagVariationArgs{
//						Value:       pulumi.String("sticks"),
//						Name:        pulumi.String("Sticks"),
//						Description: pulumi.String("Sturdier than straw"),
//					},
//					&launchdarkly.FeatureFlagVariationArgs{
//						Value:       pulumi.String("bricks"),
//						Name:        pulumi.String("Bricks"),
//						Description: pulumi.String("The strongest variation"),
//					},
//				},
//				Defaults: &launchdarkly.FeatureFlagDefaultsArgs{
//					OnVariation:  pulumi.Int(2),
//					OffVariation: pulumi.Int(0),
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("example"),
//					pulumi.String("terraform"),
//					pulumi.String("multivariate"),
//					pulumi.String("building-materials"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"foo": "bar",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			tmpJSON1, err := json.Marshal(map[string]interface{}{
//				"foos": []string{
//					"bar1",
//					"bar2",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json1 := string(tmpJSON1)
//			_, err = launchdarkly.NewFeatureFlag(ctx, "jsonExample", &launchdarkly.FeatureFlagArgs{
//				ProjectKey:    pulumi.String("example-project"),
//				Key:           pulumi.String("json-example"),
//				VariationType: pulumi.String("json"),
//				Variations: launchdarkly.FeatureFlagVariationArray{
//					&launchdarkly.FeatureFlagVariationArgs{
//						Name:  pulumi.String("Single foo"),
//						Value: pulumi.String(json0),
//					},
//					&launchdarkly.FeatureFlagVariationArgs{
//						Name:  pulumi.String("Multiple foos"),
//						Value: pulumi.String(json1),
//					},
//				},
//				Defaults: &launchdarkly.FeatureFlagDefaultsArgs{
//					OnVariation:  pulumi.Int(1),
//					OffVariation: pulumi.Int(0),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// You can import a feature flag using the feature flag's ID in the format `project_key/flag_key`. For example
//
// ```sh
//
//	$ pulumi import launchdarkly:index/featureFlag:FeatureFlag building_materials example-project/building-materials
//
// ```
type FeatureFlag struct {
	pulumi.CustomResourceState

	// Whether to archive the flag
	Archived pulumi.BoolPtrOutput `pulumi:"archived"`
	// A block describing whether this flag should be made available to the client-side JavaScript SDK using the client-side Id, mobile key, or both. This value gets its default from your project configuration if not set. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities FeatureFlagClientSideAvailabilityArrayOutput `pulumi:"clientSideAvailabilities"`
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/home/connecting/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties FeatureFlagCustomPropertyArrayOutput `pulumi:"customProperties"`
	// A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
	Defaults FeatureFlagDefaultsOutput `pulumi:"defaults"`
	// The feature flag's description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// **Deprecated** (Optional) Specifies whether this flag should be made available to the client-side JavaScript SDK using the client-side Id. This value gets its default from your project configuration if not set. `includeInSnippet` is now deprecated. Please migrate to `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet pulumi.BoolOutput `pulumi:"includeInSnippet"`
	// The unique feature flag key that references the flag in your application code. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Key pulumi.StringOutput `pulumi:"key"`
	// The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
	// associated with your Terraform API key or the most recently set maintainer
	MaintainerId pulumi.StringOutput `pulumi:"maintainerId"`
	// The human-readable name of the feature flag.
	Name pulumi.StringOutput `pulumi:"name"`
	// The feature flag's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey pulumi.StringOutput `pulumi:"projectKey"`
	// Set of feature flag tags.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Specifies whether the flag is a temporary flag.
	Temporary pulumi.BoolPtrOutput `pulumi:"temporary"`
	// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
	VariationType pulumi.StringOutput `pulumi:"variationType"`
	// List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
	Variations FeatureFlagVariationArrayOutput `pulumi:"variations"`
}

// NewFeatureFlag registers a new resource with the given unique name, arguments, and options.
func NewFeatureFlag(ctx *pulumi.Context,
	name string, args *FeatureFlagArgs, opts ...pulumi.ResourceOption) (*FeatureFlag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.ProjectKey == nil {
		return nil, errors.New("invalid value for required argument 'ProjectKey'")
	}
	if args.VariationType == nil {
		return nil, errors.New("invalid value for required argument 'VariationType'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource FeatureFlag
	err := ctx.RegisterResource("launchdarkly:index/featureFlag:FeatureFlag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFeatureFlag gets an existing FeatureFlag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFeatureFlag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FeatureFlagState, opts ...pulumi.ResourceOption) (*FeatureFlag, error) {
	var resource FeatureFlag
	err := ctx.ReadResource("launchdarkly:index/featureFlag:FeatureFlag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FeatureFlag resources.
type featureFlagState struct {
	// Whether to archive the flag
	Archived *bool `pulumi:"archived"`
	// A block describing whether this flag should be made available to the client-side JavaScript SDK using the client-side Id, mobile key, or both. This value gets its default from your project configuration if not set. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities []FeatureFlagClientSideAvailability `pulumi:"clientSideAvailabilities"`
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/home/connecting/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties []FeatureFlagCustomProperty `pulumi:"customProperties"`
	// A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
	Defaults *FeatureFlagDefaults `pulumi:"defaults"`
	// The feature flag's description.
	Description *string `pulumi:"description"`
	// **Deprecated** (Optional) Specifies whether this flag should be made available to the client-side JavaScript SDK using the client-side Id. This value gets its default from your project configuration if not set. `includeInSnippet` is now deprecated. Please migrate to `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet *bool `pulumi:"includeInSnippet"`
	// The unique feature flag key that references the flag in your application code. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Key *string `pulumi:"key"`
	// The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
	// associated with your Terraform API key or the most recently set maintainer
	MaintainerId *string `pulumi:"maintainerId"`
	// The human-readable name of the feature flag.
	Name *string `pulumi:"name"`
	// The feature flag's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey *string `pulumi:"projectKey"`
	// Set of feature flag tags.
	Tags []string `pulumi:"tags"`
	// Specifies whether the flag is a temporary flag.
	Temporary *bool `pulumi:"temporary"`
	// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
	VariationType *string `pulumi:"variationType"`
	// List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
	Variations []FeatureFlagVariation `pulumi:"variations"`
}

type FeatureFlagState struct {
	// Whether to archive the flag
	Archived pulumi.BoolPtrInput
	// A block describing whether this flag should be made available to the client-side JavaScript SDK using the client-side Id, mobile key, or both. This value gets its default from your project configuration if not set. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities FeatureFlagClientSideAvailabilityArrayInput
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/home/connecting/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties FeatureFlagCustomPropertyArrayInput
	// A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
	Defaults FeatureFlagDefaultsPtrInput
	// The feature flag's description.
	Description pulumi.StringPtrInput
	// **Deprecated** (Optional) Specifies whether this flag should be made available to the client-side JavaScript SDK using the client-side Id. This value gets its default from your project configuration if not set. `includeInSnippet` is now deprecated. Please migrate to `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet pulumi.BoolPtrInput
	// The unique feature flag key that references the flag in your application code. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Key pulumi.StringPtrInput
	// The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
	// associated with your Terraform API key or the most recently set maintainer
	MaintainerId pulumi.StringPtrInput
	// The human-readable name of the feature flag.
	Name pulumi.StringPtrInput
	// The feature flag's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey pulumi.StringPtrInput
	// Set of feature flag tags.
	Tags pulumi.StringArrayInput
	// Specifies whether the flag is a temporary flag.
	Temporary pulumi.BoolPtrInput
	// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
	VariationType pulumi.StringPtrInput
	// List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
	Variations FeatureFlagVariationArrayInput
}

func (FeatureFlagState) ElementType() reflect.Type {
	return reflect.TypeOf((*featureFlagState)(nil)).Elem()
}

type featureFlagArgs struct {
	// Whether to archive the flag
	Archived *bool `pulumi:"archived"`
	// A block describing whether this flag should be made available to the client-side JavaScript SDK using the client-side Id, mobile key, or both. This value gets its default from your project configuration if not set. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities []FeatureFlagClientSideAvailability `pulumi:"clientSideAvailabilities"`
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/home/connecting/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties []FeatureFlagCustomProperty `pulumi:"customProperties"`
	// A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
	Defaults *FeatureFlagDefaults `pulumi:"defaults"`
	// The feature flag's description.
	Description *string `pulumi:"description"`
	// **Deprecated** (Optional) Specifies whether this flag should be made available to the client-side JavaScript SDK using the client-side Id. This value gets its default from your project configuration if not set. `includeInSnippet` is now deprecated. Please migrate to `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet *bool `pulumi:"includeInSnippet"`
	// The unique feature flag key that references the flag in your application code. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Key string `pulumi:"key"`
	// The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
	// associated with your Terraform API key or the most recently set maintainer
	MaintainerId *string `pulumi:"maintainerId"`
	// The human-readable name of the feature flag.
	Name *string `pulumi:"name"`
	// The feature flag's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey string `pulumi:"projectKey"`
	// Set of feature flag tags.
	Tags []string `pulumi:"tags"`
	// Specifies whether the flag is a temporary flag.
	Temporary *bool `pulumi:"temporary"`
	// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
	VariationType string `pulumi:"variationType"`
	// List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
	Variations []FeatureFlagVariation `pulumi:"variations"`
}

// The set of arguments for constructing a FeatureFlag resource.
type FeatureFlagArgs struct {
	// Whether to archive the flag
	Archived pulumi.BoolPtrInput
	// A block describing whether this flag should be made available to the client-side JavaScript SDK using the client-side Id, mobile key, or both. This value gets its default from your project configuration if not set. To learn more, read Nested Client-Side Availability Block.
	ClientSideAvailabilities FeatureFlagClientSideAvailabilityArrayInput
	// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/home/connecting/custom-properties). To learn more, read Nested Custom Properties.
	CustomProperties FeatureFlagCustomPropertyArrayInput
	// A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
	Defaults FeatureFlagDefaultsPtrInput
	// The feature flag's description.
	Description pulumi.StringPtrInput
	// **Deprecated** (Optional) Specifies whether this flag should be made available to the client-side JavaScript SDK using the client-side Id. This value gets its default from your project configuration if not set. `includeInSnippet` is now deprecated. Please migrate to `client_side_availability.using_environment_id` to maintain future compatability.
	//
	// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
	IncludeInSnippet pulumi.BoolPtrInput
	// The unique feature flag key that references the flag in your application code. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Key pulumi.StringInput
	// The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
	// associated with your Terraform API key or the most recently set maintainer
	MaintainerId pulumi.StringPtrInput
	// The human-readable name of the feature flag.
	Name pulumi.StringPtrInput
	// The feature flag's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey pulumi.StringInput
	// Set of feature flag tags.
	Tags pulumi.StringArrayInput
	// Specifies whether the flag is a temporary flag.
	Temporary pulumi.BoolPtrInput
	// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
	VariationType pulumi.StringInput
	// List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
	Variations FeatureFlagVariationArrayInput
}

func (FeatureFlagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*featureFlagArgs)(nil)).Elem()
}

type FeatureFlagInput interface {
	pulumi.Input

	ToFeatureFlagOutput() FeatureFlagOutput
	ToFeatureFlagOutputWithContext(ctx context.Context) FeatureFlagOutput
}

func (*FeatureFlag) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureFlag)(nil)).Elem()
}

func (i *FeatureFlag) ToFeatureFlagOutput() FeatureFlagOutput {
	return i.ToFeatureFlagOutputWithContext(context.Background())
}

func (i *FeatureFlag) ToFeatureFlagOutputWithContext(ctx context.Context) FeatureFlagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagOutput)
}

// FeatureFlagArrayInput is an input type that accepts FeatureFlagArray and FeatureFlagArrayOutput values.
// You can construct a concrete instance of `FeatureFlagArrayInput` via:
//
//	FeatureFlagArray{ FeatureFlagArgs{...} }
type FeatureFlagArrayInput interface {
	pulumi.Input

	ToFeatureFlagArrayOutput() FeatureFlagArrayOutput
	ToFeatureFlagArrayOutputWithContext(context.Context) FeatureFlagArrayOutput
}

type FeatureFlagArray []FeatureFlagInput

func (FeatureFlagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureFlag)(nil)).Elem()
}

func (i FeatureFlagArray) ToFeatureFlagArrayOutput() FeatureFlagArrayOutput {
	return i.ToFeatureFlagArrayOutputWithContext(context.Background())
}

func (i FeatureFlagArray) ToFeatureFlagArrayOutputWithContext(ctx context.Context) FeatureFlagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagArrayOutput)
}

// FeatureFlagMapInput is an input type that accepts FeatureFlagMap and FeatureFlagMapOutput values.
// You can construct a concrete instance of `FeatureFlagMapInput` via:
//
//	FeatureFlagMap{ "key": FeatureFlagArgs{...} }
type FeatureFlagMapInput interface {
	pulumi.Input

	ToFeatureFlagMapOutput() FeatureFlagMapOutput
	ToFeatureFlagMapOutputWithContext(context.Context) FeatureFlagMapOutput
}

type FeatureFlagMap map[string]FeatureFlagInput

func (FeatureFlagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureFlag)(nil)).Elem()
}

func (i FeatureFlagMap) ToFeatureFlagMapOutput() FeatureFlagMapOutput {
	return i.ToFeatureFlagMapOutputWithContext(context.Background())
}

func (i FeatureFlagMap) ToFeatureFlagMapOutputWithContext(ctx context.Context) FeatureFlagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FeatureFlagMapOutput)
}

type FeatureFlagOutput struct{ *pulumi.OutputState }

func (FeatureFlagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FeatureFlag)(nil)).Elem()
}

func (o FeatureFlagOutput) ToFeatureFlagOutput() FeatureFlagOutput {
	return o
}

func (o FeatureFlagOutput) ToFeatureFlagOutputWithContext(ctx context.Context) FeatureFlagOutput {
	return o
}

// Whether to archive the flag
func (o FeatureFlagOutput) Archived() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.BoolPtrOutput { return v.Archived }).(pulumi.BoolPtrOutput)
}

// A block describing whether this flag should be made available to the client-side JavaScript SDK using the client-side Id, mobile key, or both. This value gets its default from your project configuration if not set. To learn more, read Nested Client-Side Availability Block.
func (o FeatureFlagOutput) ClientSideAvailabilities() FeatureFlagClientSideAvailabilityArrayOutput {
	return o.ApplyT(func(v *FeatureFlag) FeatureFlagClientSideAvailabilityArrayOutput { return v.ClientSideAvailabilities }).(FeatureFlagClientSideAvailabilityArrayOutput)
}

// List of nested blocks describing the feature flag's [custom properties](https://docs.launchdarkly.com/home/connecting/custom-properties). To learn more, read Nested Custom Properties.
func (o FeatureFlagOutput) CustomProperties() FeatureFlagCustomPropertyArrayOutput {
	return o.ApplyT(func(v *FeatureFlag) FeatureFlagCustomPropertyArrayOutput { return v.CustomProperties }).(FeatureFlagCustomPropertyArrayOutput)
}

// A block containing the indices of the variations to be used as the default on and off variations in all new environments. Flag configurations in existing environments will not be changed nor updated if the configuration block is removed. To learn more, read Nested Defaults Blocks.
func (o FeatureFlagOutput) Defaults() FeatureFlagDefaultsOutput {
	return o.ApplyT(func(v *FeatureFlag) FeatureFlagDefaultsOutput { return v.Defaults }).(FeatureFlagDefaultsOutput)
}

// The feature flag's description.
func (o FeatureFlagOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// **Deprecated** (Optional) Specifies whether this flag should be made available to the client-side JavaScript SDK using the client-side Id. This value gets its default from your project configuration if not set. `includeInSnippet` is now deprecated. Please migrate to `client_side_availability.using_environment_id` to maintain future compatability.
//
// Deprecated: 'include_in_snippet' is now deprecated. Please migrate to 'client_side_availability' to maintain future compatability.
func (o FeatureFlagOutput) IncludeInSnippet() pulumi.BoolOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.BoolOutput { return v.IncludeInSnippet }).(pulumi.BoolOutput)
}

// The unique feature flag key that references the flag in your application code. A change in this field will force the destruction of the existing resource and the creation of a new one.
func (o FeatureFlagOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The LaunchDarkly id of the user who will maintain the flag. If not set, the API will automatically apply the member
// associated with your Terraform API key or the most recently set maintainer
func (o FeatureFlagOutput) MaintainerId() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.MaintainerId }).(pulumi.StringOutput)
}

// The human-readable name of the feature flag.
func (o FeatureFlagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The feature flag's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
func (o FeatureFlagOutput) ProjectKey() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.ProjectKey }).(pulumi.StringOutput)
}

// Set of feature flag tags.
func (o FeatureFlagOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Specifies whether the flag is a temporary flag.
func (o FeatureFlagOutput) Temporary() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.BoolPtrOutput { return v.Temporary }).(pulumi.BoolPtrOutput)
}

// The feature flag's variation type: `boolean`, `string`, `number` or `json`.
func (o FeatureFlagOutput) VariationType() pulumi.StringOutput {
	return o.ApplyT(func(v *FeatureFlag) pulumi.StringOutput { return v.VariationType }).(pulumi.StringOutput)
}

// List of nested blocks describing the variations associated with the feature flag. You must specify at least two variations. To learn more, read Nested Variations Blocks.
func (o FeatureFlagOutput) Variations() FeatureFlagVariationArrayOutput {
	return o.ApplyT(func(v *FeatureFlag) FeatureFlagVariationArrayOutput { return v.Variations }).(FeatureFlagVariationArrayOutput)
}

type FeatureFlagArrayOutput struct{ *pulumi.OutputState }

func (FeatureFlagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FeatureFlag)(nil)).Elem()
}

func (o FeatureFlagArrayOutput) ToFeatureFlagArrayOutput() FeatureFlagArrayOutput {
	return o
}

func (o FeatureFlagArrayOutput) ToFeatureFlagArrayOutputWithContext(ctx context.Context) FeatureFlagArrayOutput {
	return o
}

func (o FeatureFlagArrayOutput) Index(i pulumi.IntInput) FeatureFlagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FeatureFlag {
		return vs[0].([]*FeatureFlag)[vs[1].(int)]
	}).(FeatureFlagOutput)
}

type FeatureFlagMapOutput struct{ *pulumi.OutputState }

func (FeatureFlagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FeatureFlag)(nil)).Elem()
}

func (o FeatureFlagMapOutput) ToFeatureFlagMapOutput() FeatureFlagMapOutput {
	return o
}

func (o FeatureFlagMapOutput) ToFeatureFlagMapOutputWithContext(ctx context.Context) FeatureFlagMapOutput {
	return o
}

func (o FeatureFlagMapOutput) MapIndex(k pulumi.StringInput) FeatureFlagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FeatureFlag {
		return vs[0].(map[string]*FeatureFlag)[vs[1].(string)]
	}).(FeatureFlagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagInput)(nil)).Elem(), &FeatureFlag{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagArrayInput)(nil)).Elem(), FeatureFlagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FeatureFlagMapInput)(nil)).Elem(), FeatureFlagMap{})
	pulumi.RegisterOutputType(FeatureFlagOutput{})
	pulumi.RegisterOutputType(FeatureFlagArrayOutput{})
	pulumi.RegisterOutputType(FeatureFlagMapOutput{})
}
