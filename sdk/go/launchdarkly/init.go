// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package launchdarkly

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "launchdarkly:index/accessToken:AccessToken":
		r = &AccessToken{}
	case "launchdarkly:index/customRole:CustomRole":
		r = &CustomRole{}
	case "launchdarkly:index/destination:Destination":
		r = &Destination{}
	case "launchdarkly:index/environment:Environment":
		r = &Environment{}
	case "launchdarkly:index/featureFlag:FeatureFlag":
		r = &FeatureFlag{}
	case "launchdarkly:index/featureFlagEnvironment:FeatureFlagEnvironment":
		r = &FeatureFlagEnvironment{}
	case "launchdarkly:index/project:Project":
		r = &Project{}
	case "launchdarkly:index/segment:Segment":
		r = &Segment{}
	case "launchdarkly:index/teamMember:TeamMember":
		r = &TeamMember{}
	case "launchdarkly:index/webhook:Webhook":
		r = &Webhook{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:launchdarkly" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/accessToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/customRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/destination",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/environment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/featureFlag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/featureFlagEnvironment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/project",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/segment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/teamMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"launchdarkly",
		"index/webhook",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"launchdarkly",
		&pkg{version},
	)
}