// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFeatureFlagEnvironmentTarget {
    /**
     * @return The list of values associated with the rule clause.
     * 
     */
    private List<String> values;
    /**
     * @return The integer variation index served when the rule clauses evaluate to `true`.
     * 
     */
    private Integer variation;

    private GetFeatureFlagEnvironmentTarget() {}
    /**
     * @return The list of values associated with the rule clause.
     * 
     */
    public List<String> values() {
        return this.values;
    }
    /**
     * @return The integer variation index served when the rule clauses evaluate to `true`.
     * 
     */
    public Integer variation() {
        return this.variation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureFlagEnvironmentTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> values;
        private Integer variation;
        public Builder() {}
        public Builder(GetFeatureFlagEnvironmentTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
    	      this.variation = defaults.variation;
        }

        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        @CustomType.Setter
        public Builder variation(Integer variation) {
            this.variation = Objects.requireNonNull(variation);
            return this;
        }
        public GetFeatureFlagEnvironmentTarget build() {
            final var o = new GetFeatureFlagEnvironmentTarget();
            o.values = values;
            o.variation = variation;
            return o;
        }
    }
}