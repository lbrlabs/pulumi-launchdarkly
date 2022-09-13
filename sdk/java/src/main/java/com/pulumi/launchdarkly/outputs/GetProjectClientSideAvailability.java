// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectClientSideAvailability {
    /**
     * @return When set to true, the flags in this project are available to SDKs using the client-side ID by default.
     * 
     */
    private @Nullable Boolean usingEnvironmentId;
    /**
     * @return When set to true, the flags in this project are available to SDKs using a mobile key by default.
     * 
     */
    private @Nullable Boolean usingMobileKey;

    private GetProjectClientSideAvailability() {}
    /**
     * @return When set to true, the flags in this project are available to SDKs using the client-side ID by default.
     * 
     */
    public Optional<Boolean> usingEnvironmentId() {
        return Optional.ofNullable(this.usingEnvironmentId);
    }
    /**
     * @return When set to true, the flags in this project are available to SDKs using a mobile key by default.
     * 
     */
    public Optional<Boolean> usingMobileKey() {
        return Optional.ofNullable(this.usingMobileKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectClientSideAvailability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean usingEnvironmentId;
        private @Nullable Boolean usingMobileKey;
        public Builder() {}
        public Builder(GetProjectClientSideAvailability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usingEnvironmentId = defaults.usingEnvironmentId;
    	      this.usingMobileKey = defaults.usingMobileKey;
        }

        @CustomType.Setter
        public Builder usingEnvironmentId(@Nullable Boolean usingEnvironmentId) {
            this.usingEnvironmentId = usingEnvironmentId;
            return this;
        }
        @CustomType.Setter
        public Builder usingMobileKey(@Nullable Boolean usingMobileKey) {
            this.usingMobileKey = usingMobileKey;
            return this;
        }
        public GetProjectClientSideAvailability build() {
            final var o = new GetProjectClientSideAvailability();
            o.usingEnvironmentId = usingEnvironmentId;
            o.usingMobileKey = usingMobileKey;
            return o;
        }
    }
}