// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CustomRolePolicy {
    /**
     * @return The list of action specifiers defining the actions to which the statement applies. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     * 
     */
    private List<String> actions;
    /**
     * @return - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     * 
     */
    private String effect;
    /**
     * @return - The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     * 
     */
    private List<String> resources;

    private CustomRolePolicy() {}
    /**
     * @return The list of action specifiers defining the actions to which the statement applies. Either `actions` or `not_actions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     * 
     */
    public List<String> actions() {
        return this.actions;
    }
    /**
     * @return - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return - The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `not_resources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     * 
     */
    public List<String> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRolePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private String effect;
        private List<String> resources;
        public Builder() {}
        public Builder(CustomRolePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.effect = defaults.effect;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public CustomRolePolicy build() {
            final var o = new CustomRolePolicy();
            o.actions = actions;
            o.effect = effect;
            o.resources = resources;
            return o;
        }
    }
}