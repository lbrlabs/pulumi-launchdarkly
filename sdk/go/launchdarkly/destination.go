// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a LaunchDarkly Data Export Destination resource.
//
// > **Note:** Data Export is available to customers on an Enterprise LaunchDarkly plan. To learn more, read about our pricing. To upgrade your plan, [contact LaunchDarkly Sales](https://launchdarkly.com/contact-sales/).
//
// Data Export Destinations are locations that receive exported data. This resource allows you to configure destinations for the export of raw analytics data, including feature flag requests, analytics events, custom events, and more.
//
// To learn more about data export, read [Data Export Documentation](https://docs.launchdarkly.com/integrations/data-export).
//
// ## Example Usage
//
// Currently the following five types of destinations are available: kinesis, google-pubsub, mparticle, azure-event-hubs, and segment. Please note that config fields will vary depending on which destination you are trying to configure / access.
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
//			_, err := launchdarkly.NewDestination(ctx, "example", &launchdarkly.DestinationArgs{
//				ProjectKey: pulumi.String("example-project"),
//				EnvKey:     pulumi.String("example-env"),
//				Kind:       pulumi.String("kinesis"),
//				Config: pulumi.StringMap{
//					"region":      pulumi.String("us-east-1"),
//					"role_arn":    pulumi.String("arn:aws:iam::123456789012:role/marketingadmin"),
//					"stream_name": pulumi.String("cat-stream"),
//				},
//				On: pulumi.Bool(true),
//				Tags: pulumi.StringArray{
//					pulumi.String("terraform"),
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
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.NewDestination(ctx, "example", &launchdarkly.DestinationArgs{
//				ProjectKey: pulumi.String("example-project"),
//				EnvKey:     pulumi.String("example-env"),
//				Kind:       pulumi.String("google-pubsub"),
//				Config: pulumi.StringMap{
//					"project": pulumi.String("example-pub-sub-project"),
//					"topic":   pulumi.String("example-topic"),
//				},
//				On: pulumi.Bool(true),
//				Tags: pulumi.StringArray{
//					pulumi.String("terraform"),
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
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.NewDestination(ctx, "example", &launchdarkly.DestinationArgs{
//				ProjectKey: pulumi.String("example-project"),
//				EnvKey:     pulumi.String("example-env"),
//				Kind:       pulumi.String("mparticle"),
//				Config: pulumi.StringMap{
//					"api_key":       pulumi.String("apiKeyfromMParticle"),
//					"secret":        pulumi.String("mParticleSecret"),
//					"user_identity": pulumi.String("customer_id"),
//					"environment":   pulumi.String("production"),
//				},
//				On: pulumi.Bool(true),
//				Tags: pulumi.StringArray{
//					pulumi.String("terraform"),
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
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.NewDestination(ctx, "example", &launchdarkly.DestinationArgs{
//				Config: pulumi.StringMap{
//					"name":        pulumi.String("example-azure-name"),
//					"namespace":   pulumi.String("example-azure-namespace"),
//					"policy_key":  pulumi.String("azure-event-hubs-policy-key"),
//					"policy_name": pulumi.String("example-policy-name"),
//				},
//				EnvKey:     pulumi.String("example-env"),
//				Kind:       pulumi.String("azure-event-hubs"),
//				On:         pulumi.Bool(true),
//				ProjectKey: pulumi.String("example-project"),
//				Tags: pulumi.StringArray{
//					pulumi.String("terraform"),
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
//	"github.com/lbrlabs/pulumi-launchdarkly/sdk/go/launchdarkly"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := launchdarkly.NewDestination(ctx, "example", &launchdarkly.DestinationArgs{
//				ProjectKey: pulumi.String("example-project"),
//				EnvKey:     pulumi.String("example-env"),
//				Kind:       pulumi.String("segment"),
//				Config: pulumi.StringMap{
//					"write_key": pulumi.String("segment-write-key"),
//				},
//				On: pulumi.Bool(true),
//				Tags: pulumi.StringArray{
//					pulumi.String("terraform"),
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
// You can import a data export destination using the destination's full ID in the format `project_key/environment_key/id`. For example
//
// ```sh
//
//	$ pulumi import launchdarkly:index/destination:Destination example example-project/example-env/57c0af609969090743529967
//
// ```
type Destination struct {
	pulumi.CustomResourceState

	// - The destination-specific configuration. To learn more, read Destination-Specific Configs.
	Config pulumi.StringMapOutput `pulumi:"config"`
	// - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	EnvKey pulumi.StringOutput `pulumi:"envKey"`
	// - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// -
	Name pulumi.StringOutput `pulumi:"name"`
	// - Whether the data export destination is on or not.
	On pulumi.BoolPtrOutput `pulumi:"on"`
	// - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey pulumi.StringOutput `pulumi:"projectKey"`
	// Tags associated with your resource
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewDestination registers a new resource with the given unique name, arguments, and options.
func NewDestination(ctx *pulumi.Context,
	name string, args *DestinationArgs, opts ...pulumi.ResourceOption) (*Destination, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Config == nil {
		return nil, errors.New("invalid value for required argument 'Config'")
	}
	if args.EnvKey == nil {
		return nil, errors.New("invalid value for required argument 'EnvKey'")
	}
	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.ProjectKey == nil {
		return nil, errors.New("invalid value for required argument 'ProjectKey'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Destination
	err := ctx.RegisterResource("launchdarkly:index/destination:Destination", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDestination gets an existing Destination resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDestination(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DestinationState, opts ...pulumi.ResourceOption) (*Destination, error) {
	var resource Destination
	err := ctx.ReadResource("launchdarkly:index/destination:Destination", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Destination resources.
type destinationState struct {
	// - The destination-specific configuration. To learn more, read Destination-Specific Configs.
	Config map[string]string `pulumi:"config"`
	// - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	EnvKey *string `pulumi:"envKey"`
	// - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Kind *string `pulumi:"kind"`
	// -
	Name *string `pulumi:"name"`
	// - Whether the data export destination is on or not.
	On *bool `pulumi:"on"`
	// - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey *string `pulumi:"projectKey"`
	// Tags associated with your resource
	Tags []string `pulumi:"tags"`
}

type DestinationState struct {
	// - The destination-specific configuration. To learn more, read Destination-Specific Configs.
	Config pulumi.StringMapInput
	// - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	EnvKey pulumi.StringPtrInput
	// - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Kind pulumi.StringPtrInput
	// -
	Name pulumi.StringPtrInput
	// - Whether the data export destination is on or not.
	On pulumi.BoolPtrInput
	// - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey pulumi.StringPtrInput
	// Tags associated with your resource
	Tags pulumi.StringArrayInput
}

func (DestinationState) ElementType() reflect.Type {
	return reflect.TypeOf((*destinationState)(nil)).Elem()
}

type destinationArgs struct {
	// - The destination-specific configuration. To learn more, read Destination-Specific Configs.
	Config map[string]string `pulumi:"config"`
	// - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	EnvKey string `pulumi:"envKey"`
	// - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Kind string `pulumi:"kind"`
	// -
	Name *string `pulumi:"name"`
	// - Whether the data export destination is on or not.
	On *bool `pulumi:"on"`
	// - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey string `pulumi:"projectKey"`
	// Tags associated with your resource
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a Destination resource.
type DestinationArgs struct {
	// - The destination-specific configuration. To learn more, read Destination-Specific Configs.
	Config pulumi.StringMapInput
	// - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	EnvKey pulumi.StringInput
	// - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
	Kind pulumi.StringInput
	// -
	Name pulumi.StringPtrInput
	// - Whether the data export destination is on or not.
	On pulumi.BoolPtrInput
	// - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
	ProjectKey pulumi.StringInput
	// Tags associated with your resource
	Tags pulumi.StringArrayInput
}

func (DestinationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*destinationArgs)(nil)).Elem()
}

type DestinationInput interface {
	pulumi.Input

	ToDestinationOutput() DestinationOutput
	ToDestinationOutputWithContext(ctx context.Context) DestinationOutput
}

func (*Destination) ElementType() reflect.Type {
	return reflect.TypeOf((**Destination)(nil)).Elem()
}

func (i *Destination) ToDestinationOutput() DestinationOutput {
	return i.ToDestinationOutputWithContext(context.Background())
}

func (i *Destination) ToDestinationOutputWithContext(ctx context.Context) DestinationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DestinationOutput)
}

// DestinationArrayInput is an input type that accepts DestinationArray and DestinationArrayOutput values.
// You can construct a concrete instance of `DestinationArrayInput` via:
//
//	DestinationArray{ DestinationArgs{...} }
type DestinationArrayInput interface {
	pulumi.Input

	ToDestinationArrayOutput() DestinationArrayOutput
	ToDestinationArrayOutputWithContext(context.Context) DestinationArrayOutput
}

type DestinationArray []DestinationInput

func (DestinationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Destination)(nil)).Elem()
}

func (i DestinationArray) ToDestinationArrayOutput() DestinationArrayOutput {
	return i.ToDestinationArrayOutputWithContext(context.Background())
}

func (i DestinationArray) ToDestinationArrayOutputWithContext(ctx context.Context) DestinationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DestinationArrayOutput)
}

// DestinationMapInput is an input type that accepts DestinationMap and DestinationMapOutput values.
// You can construct a concrete instance of `DestinationMapInput` via:
//
//	DestinationMap{ "key": DestinationArgs{...} }
type DestinationMapInput interface {
	pulumi.Input

	ToDestinationMapOutput() DestinationMapOutput
	ToDestinationMapOutputWithContext(context.Context) DestinationMapOutput
}

type DestinationMap map[string]DestinationInput

func (DestinationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Destination)(nil)).Elem()
}

func (i DestinationMap) ToDestinationMapOutput() DestinationMapOutput {
	return i.ToDestinationMapOutputWithContext(context.Background())
}

func (i DestinationMap) ToDestinationMapOutputWithContext(ctx context.Context) DestinationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DestinationMapOutput)
}

type DestinationOutput struct{ *pulumi.OutputState }

func (DestinationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Destination)(nil)).Elem()
}

func (o DestinationOutput) ToDestinationOutput() DestinationOutput {
	return o
}

func (o DestinationOutput) ToDestinationOutputWithContext(ctx context.Context) DestinationOutput {
	return o
}

// - The destination-specific configuration. To learn more, read Destination-Specific Configs.
func (o DestinationOutput) Config() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Destination) pulumi.StringMapOutput { return v.Config }).(pulumi.StringMapOutput)
}

// - The environment key. A change in this field will force the destruction of the existing resource and the creation of a new one.
func (o DestinationOutput) EnvKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Destination) pulumi.StringOutput { return v.EnvKey }).(pulumi.StringOutput)
}

// - The data export destination type. Available choices are `kinesis`, `google-pubsub`, `mparticle`, `azure-event-hubs`, and `segment`. A change in this field will force the destruction of the existing resource and the creation of a new one.
func (o DestinationOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *Destination) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// -
func (o DestinationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Destination) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// - Whether the data export destination is on or not.
func (o DestinationOutput) On() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Destination) pulumi.BoolPtrOutput { return v.On }).(pulumi.BoolPtrOutput)
}

// - The LaunchDarkly project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
func (o DestinationOutput) ProjectKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Destination) pulumi.StringOutput { return v.ProjectKey }).(pulumi.StringOutput)
}

// Tags associated with your resource
func (o DestinationOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Destination) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type DestinationArrayOutput struct{ *pulumi.OutputState }

func (DestinationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Destination)(nil)).Elem()
}

func (o DestinationArrayOutput) ToDestinationArrayOutput() DestinationArrayOutput {
	return o
}

func (o DestinationArrayOutput) ToDestinationArrayOutputWithContext(ctx context.Context) DestinationArrayOutput {
	return o
}

func (o DestinationArrayOutput) Index(i pulumi.IntInput) DestinationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Destination {
		return vs[0].([]*Destination)[vs[1].(int)]
	}).(DestinationOutput)
}

type DestinationMapOutput struct{ *pulumi.OutputState }

func (DestinationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Destination)(nil)).Elem()
}

func (o DestinationMapOutput) ToDestinationMapOutput() DestinationMapOutput {
	return o
}

func (o DestinationMapOutput) ToDestinationMapOutputWithContext(ctx context.Context) DestinationMapOutput {
	return o
}

func (o DestinationMapOutput) MapIndex(k pulumi.StringInput) DestinationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Destination {
		return vs[0].(map[string]*Destination)[vs[1].(string)]
	}).(DestinationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DestinationInput)(nil)).Elem(), &Destination{})
	pulumi.RegisterInputType(reflect.TypeOf((*DestinationArrayInput)(nil)).Elem(), DestinationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DestinationMapInput)(nil)).Elem(), DestinationMap{})
	pulumi.RegisterOutputType(DestinationOutput{})
	pulumi.RegisterOutputType(DestinationArrayOutput{})
	pulumi.RegisterOutputType(DestinationMapOutput{})
}
