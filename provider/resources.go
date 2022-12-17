package launchdarkly

import (
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/launchdarkly/terraform-provider-launchdarkly/launchdarkly"
	"github.com/lbrlabs/pulumi-launchdarkly/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	mainPkg = "launchdarkly"
	mainMod = "index" //
)

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// launchDarklyMember manufactures a type token for the Launch Darkly package and the given module and type.
func launchDarklyMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// launchDarklyType manufactures a type token for the Launch Darkly package and the given module and type.
func launchDarklyType(mod string, typ string) tokens.Type {
	return tokens.Type(launchDarklyMember(mod, typ))
}

// launchDarklyDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the Launch Darkly package and names the file by simply lower casing the data
// source's first character.
func launchDarklyDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return launchDarklyMember(mod+"/"+fn, res)
}

// launchDarklyResource manufactures a standard resource token given a module and resource name.
// It automatically uses the Launch Darkly package and names the file by simply lower casing the resource's
// first character.
func launchDarklyResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return launchDarklyType(mod+"/"+fn, res)
}

// func refProviderLicense(license tfbridge.TFProviderLicense) *tfbridge.TFProviderLicense {
// 	return &license
// }

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(launchdarkly.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "launchdarkly",
		DisplayName:       "Launch Darkly",
		Publisher:         "lbrlabs",
		LogoURL:           "https://raw.githubusercontent.com/lbrlabs/pulumi-launchdarkly/master/assets/logo.png",
		PluginDownloadURL: "github://api.github.com/lbrlabs",
		Description:       "A Pulumi package for creating and managing launch darkly cloud resources.",
		Keywords:          []string{"pulumi", "launchdarkly", "lbrlabs"},
		// License:    string(*refProviderLicense(tfbridge.MPL20LicenseType)),
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/lbrlabs/pulumi-launchdarkly",
		GitHubOrg:  "launchdarkly",
		Config: map[string]*tfbridge.SchemaInfo{
			"access_token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"LAUNCHDARKLY_ACCESS_TOKEN"},
				},
			},
			"oauth_token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"LAUNCHDARKLY_OAUTH_TOKEN"},
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"launchdarkly_audit_log_subscription":    {Tok: launchDarklyResource(mainMod, "AuditLogSubscription")},
			"launchdarkly_access_token":              {Tok: launchDarklyResource(mainMod, "AccessToken")},
			"launchdarkly_flag_trigger":              {Tok: launchDarklyResource(mainMod, "FlagTrigger")},
			"launchdarkly_custom_role":               {Tok: launchDarklyResource(mainMod, "CustomRole")},
			"launchdarkly_destination":               {Tok: launchDarklyResource(mainMod, "Destination")},
			"launchdarkly_environment":               {Tok: launchDarklyResource(mainMod, "Environment")},
			"launchdarkly_feature_flag":              {Tok: launchDarklyResource(mainMod, "FeatureFlag")},
			"launchdarkly_feature_flag_environment":  {Tok: launchDarklyResource(mainMod, "FeatureFlagEnvironment")},
			"launchdarkly_metric":                    {Tok: launchDarklyResource(mainMod, "Metric")},
			"launchdarkly_project":                   {Tok: launchDarklyResource(mainMod, "Project")},
			"launchdarkly_relay_proxy_configuration": {Tok: launchDarklyResource(mainMod, "RelayProxyConfiguration")},
			"launchdarkly_segment":                   {Tok: launchDarklyResource(mainMod, "Segment")},
			"launchdarkly_team":                      {Tok: launchDarklyResource(mainMod, "Team")},
			"launchdarkly_team_member":               {Tok: launchDarklyResource(mainMod, "TeamMember")},
			"launchdarkly_webhook":                   {Tok: launchDarklyResource(mainMod, "Webhook")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"launchdarkly_audit_log_subscription": {
				Tok: launchDarklyDataSource(mainMod, "getAuditLogSubscription"),
			},
			"launchdarkly_environment":  {Tok: launchDarklyDataSource(mainMod, "getEnvironment")},
			"launchdarkly_flag_trigger": {Tok: launchDarklyDataSource(mainMod, "getFlagTrigger")},
			"launchdarkly_feature_flag": {Tok: launchDarklyDataSource(mainMod, "getFeatureFlag")},
			"launchdarkly_feature_flag_environment": {
				Tok: launchDarklyDataSource(mainMod, "getFeatureFlagEnvironment"),
			},
			"launchdarkly_metric":                    {Tok: launchDarklyDataSource(mainMod, "getMetric")},
			"launchdarkly_project":                   {Tok: launchDarklyDataSource(mainMod, "getProject")},
			"launchdarkly_relay_proxy_configuration": {Tok: launchDarklyDataSource(mainMod, "getRelayProxyConfiguration")},

			"launchdarkly_segment":      {Tok: launchDarklyDataSource(mainMod, "getSegment")},
			"launchdarkly_team":         {Tok: launchDarklyDataSource(mainMod, "getTeam")},
			"launchdarkly_team_member":  {Tok: launchDarklyDataSource(mainMod, "getTeamMember")},
			"launchdarkly_team_members": {Tok: launchDarklyDataSource(mainMod, "getTeamMembers")},
			"launchdarkly_webhook":      {Tok: launchDarklyDataSource(mainMod, "getWebhook")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			PackageName: "@lbrlabs/pulumi-launchdarkly",
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PackageName: "lbrlabs_pulumi_launchdarkly",
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/lbrlabs/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Lbrlabs.PulumiPackage",
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
