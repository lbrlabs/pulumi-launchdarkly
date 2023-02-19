// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.CustomRolePolicyArgs;
import com.pulumi.launchdarkly.inputs.CustomRolePolicyStatementArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomRoleState extends com.pulumi.resources.ResourceArgs {

    public static final CustomRoleState Empty = new CustomRoleState();

    /**
     * The base permission level. Either `reader` or `no_access`. Defaults to `reader` if not set.
     * 
     */
    @Import(name="basePermissions")
    private @Nullable Output<String> basePermissions;

    /**
     * @return The base permission level. Either `reader` or `no_access`. Defaults to `reader` if not set.
     * 
     */
    public Optional<Output<String>> basePermissions() {
        return Optional.ofNullable(this.basePermissions);
    }

    /**
     * The description of the custom role.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the custom role.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique key that references the custom role. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The unique key that references the custom role. A change in this field will force the destruction of the existing resource and the creation of a new one.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The human-readable name for the custom role.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The human-readable name for the custom role.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * @deprecated
     * &#39;policy&#39; is now deprecated. Please migrate to &#39;policy_statements&#39; to maintain future compatability.
     * 
     */
    @Deprecated /* 'policy' is now deprecated. Please migrate to 'policy_statements' to maintain future compatability. */
    @Import(name="policies")
    private @Nullable Output<List<CustomRolePolicyArgs>> policies;

    /**
     * @deprecated
     * &#39;policy&#39; is now deprecated. Please migrate to &#39;policy_statements&#39; to maintain future compatability.
     * 
     */
    @Deprecated /* 'policy' is now deprecated. Please migrate to 'policy_statements' to maintain future compatability. */
    public Optional<Output<List<CustomRolePolicyArgs>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * The custom role policy block. To learn more, read [Using policies](https://docs.launchdarkly.com/home/members/role-policies).
     * 
     */
    @Import(name="policyStatements")
    private @Nullable Output<List<CustomRolePolicyStatementArgs>> policyStatements;

    /**
     * @return The custom role policy block. To learn more, read [Using policies](https://docs.launchdarkly.com/home/members/role-policies).
     * 
     */
    public Optional<Output<List<CustomRolePolicyStatementArgs>>> policyStatements() {
        return Optional.ofNullable(this.policyStatements);
    }

    private CustomRoleState() {}

    private CustomRoleState(CustomRoleState $) {
        this.basePermissions = $.basePermissions;
        this.description = $.description;
        this.key = $.key;
        this.name = $.name;
        this.policies = $.policies;
        this.policyStatements = $.policyStatements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomRoleState $;

        public Builder() {
            $ = new CustomRoleState();
        }

        public Builder(CustomRoleState defaults) {
            $ = new CustomRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param basePermissions The base permission level. Either `reader` or `no_access`. Defaults to `reader` if not set.
         * 
         * @return builder
         * 
         */
        public Builder basePermissions(@Nullable Output<String> basePermissions) {
            $.basePermissions = basePermissions;
            return this;
        }

        /**
         * @param basePermissions The base permission level. Either `reader` or `no_access`. Defaults to `reader` if not set.
         * 
         * @return builder
         * 
         */
        public Builder basePermissions(String basePermissions) {
            return basePermissions(Output.of(basePermissions));
        }

        /**
         * @param description The description of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key The unique key that references the custom role. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The unique key that references the custom role. A change in this field will force the destruction of the existing resource and the creation of a new one.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name The human-readable name for the custom role.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The human-readable name for the custom role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * &#39;policy&#39; is now deprecated. Please migrate to &#39;policy_statements&#39; to maintain future compatability.
         * 
         */
        @Deprecated /* 'policy' is now deprecated. Please migrate to 'policy_statements' to maintain future compatability. */
        public Builder policies(@Nullable Output<List<CustomRolePolicyArgs>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * &#39;policy&#39; is now deprecated. Please migrate to &#39;policy_statements&#39; to maintain future compatability.
         * 
         */
        @Deprecated /* 'policy' is now deprecated. Please migrate to 'policy_statements' to maintain future compatability. */
        public Builder policies(List<CustomRolePolicyArgs> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * &#39;policy&#39; is now deprecated. Please migrate to &#39;policy_statements&#39; to maintain future compatability.
         * 
         */
        @Deprecated /* 'policy' is now deprecated. Please migrate to 'policy_statements' to maintain future compatability. */
        public Builder policies(CustomRolePolicyArgs... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param policyStatements The custom role policy block. To learn more, read [Using policies](https://docs.launchdarkly.com/home/members/role-policies).
         * 
         * @return builder
         * 
         */
        public Builder policyStatements(@Nullable Output<List<CustomRolePolicyStatementArgs>> policyStatements) {
            $.policyStatements = policyStatements;
            return this;
        }

        /**
         * @param policyStatements The custom role policy block. To learn more, read [Using policies](https://docs.launchdarkly.com/home/members/role-policies).
         * 
         * @return builder
         * 
         */
        public Builder policyStatements(List<CustomRolePolicyStatementArgs> policyStatements) {
            return policyStatements(Output.of(policyStatements));
        }

        /**
         * @param policyStatements The custom role policy block. To learn more, read [Using policies](https://docs.launchdarkly.com/home/members/role-policies).
         * 
         * @return builder
         * 
         */
        public Builder policyStatements(CustomRolePolicyStatementArgs... policyStatements) {
            return policyStatements(List.of(policyStatements));
        }

        public CustomRoleState build() {
            return $;
        }
    }

}
