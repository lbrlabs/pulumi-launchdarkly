// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlagTriggerInstructionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlagTriggerInstructionsArgs Empty = new FlagTriggerInstructionsArgs();

    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    private FlagTriggerInstructionsArgs() {}

    private FlagTriggerInstructionsArgs(FlagTriggerInstructionsArgs $) {
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlagTriggerInstructionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlagTriggerInstructionsArgs $;

        public Builder() {
            $ = new FlagTriggerInstructionsArgs();
        }

        public Builder(FlagTriggerInstructionsArgs defaults) {
            $ = new FlagTriggerInstructionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public FlagTriggerInstructionsArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
