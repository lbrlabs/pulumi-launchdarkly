// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetFeatureFlagCustomProperty extends com.pulumi.resources.InvokeArgs {

    public static final GetFeatureFlagCustomProperty Empty = new GetFeatureFlagCustomProperty();

    /**
     * The unique feature flag key that references the flag in your application code.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return The unique feature flag key that references the flag in your application code.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * The name of the custom property.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the custom property.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The list of custom property value strings.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return The list of custom property value strings.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetFeatureFlagCustomProperty() {}

    private GetFeatureFlagCustomProperty(GetFeatureFlagCustomProperty $) {
        this.key = $.key;
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeatureFlagCustomProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeatureFlagCustomProperty $;

        public Builder() {
            $ = new GetFeatureFlagCustomProperty();
        }

        public Builder(GetFeatureFlagCustomProperty defaults) {
            $ = new GetFeatureFlagCustomProperty(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The unique feature flag key that references the flag in your application code.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param name The name of the custom property.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values The list of custom property value strings.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The list of custom property value strings.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetFeatureFlagCustomProperty build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
