//go:generate go run ./generate.go

package main

import (
	_ "embed"

	launchdarkly "github.com/lbrlabs/pulumi-launchdarkly/provider"
	"github.com/lbrlabs/pulumi-launchdarkly/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

//go:embed schema-embed.json
var pulumiSchema []byte

func main() {
	// Modify the path to point to the new provider
	tfbridge.Main("launchdarkly", version.Version, launchdarkly.Provider(), pulumiSchema)
}
