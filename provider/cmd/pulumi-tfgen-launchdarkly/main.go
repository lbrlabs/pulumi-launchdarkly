package main

import (
	launchdarkly "github.com/lbrlabs/pulumi-launchdarkly/provider"
	"github.com/lbrlabs/pulumi-launchdarkly/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
)

func main() {
	// Modify the path to point to the new provider
	tfgen.Main("launchdarkly", version.Version, launchdarkly.Provider())
}
