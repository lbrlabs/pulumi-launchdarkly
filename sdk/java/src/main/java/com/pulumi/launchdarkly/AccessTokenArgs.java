// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.AccessTokenInlineRoleArgs;
import com.pulumi.launchdarkly.inputs.AccessTokenPolicyStatementArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessTokenArgs Empty = new AccessTokenArgs();

    /**
     * A list of custom role IDs to use as access limits for the access token
     * 
     */
    @Import(name="customRoles")
    private @Nullable Output<List<String>> customRoles;

    /**
     * @return A list of custom role IDs to use as access limits for the access token
     * 
     */
    public Optional<Output<List<String>>> customRoles() {
        return Optional.ofNullable(this.customRoles);
    }

    /**
     * The default API version for this token. Defaults to the latest API version.
     * 
     */
    @Import(name="defaultApiVersion")
    private @Nullable Output<Integer> defaultApiVersion;

    /**
     * @return The default API version for this token. Defaults to the latest API version.
     * 
     */
    public Optional<Output<Integer>> defaultApiVersion() {
        return Optional.ofNullable(this.defaultApiVersion);
    }

    /**
     * An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
     * 
     * @deprecated
     * &#39;expire&#39; is deprecated and will be removed in the next major release of the LaunchDarly provider
     * 
     */
    @Deprecated /* 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider */
    @Import(name="expire")
    private @Nullable Output<Integer> expire;

    /**
     * @return An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
     * 
     * @deprecated
     * &#39;expire&#39; is deprecated and will be removed in the next major release of the LaunchDarly provider
     * 
     */
    @Deprecated /* 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider */
    public Optional<Output<Integer>> expire() {
        return Optional.ofNullable(this.expire);
    }

    /**
     * An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
     * of a built-in or custom role.
     * 
     */
    @Import(name="inlineRoles")
    private @Nullable Output<List<AccessTokenInlineRoleArgs>> inlineRoles;

    /**
     * @return An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
     * of a built-in or custom role.
     * 
     */
    public Optional<Output<List<AccessTokenInlineRoleArgs>>> inlineRoles() {
        return Optional.ofNullable(this.inlineRoles);
    }

    /**
     * A human-friendly name for the access token.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-friendly name for the access token.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inline_role` to maintain compatibility with future versions.
     * 
     * @deprecated
     * &#39;policy_statements&#39; is deprecated in favor of &#39;inline_roles&#39;. This field will be removed in the next major release of the LaunchDarkly provider
     * 
     */
    @Deprecated /* 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider */
    @Import(name="policyStatements")
    private @Nullable Output<List<AccessTokenPolicyStatementArgs>> policyStatements;

    /**
     * @return Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inline_role` to maintain compatibility with future versions.
     * 
     * @deprecated
     * &#39;policy_statements&#39; is deprecated in favor of &#39;inline_roles&#39;. This field will be removed in the next major release of the LaunchDarkly provider
     * 
     */
    @Deprecated /* 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider */
    public Optional<Output<List<AccessTokenPolicyStatementArgs>>> policyStatements() {
        return Optional.ofNullable(this.policyStatements);
    }

    /**
     * A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
     * 
     */
    @Import(name="serviceToken")
    private @Nullable Output<Boolean> serviceToken;

    /**
     * @return Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
     * 
     */
    public Optional<Output<Boolean>> serviceToken() {
        return Optional.ofNullable(this.serviceToken);
    }

    private AccessTokenArgs() {}

    private AccessTokenArgs(AccessTokenArgs $) {
        this.customRoles = $.customRoles;
        this.defaultApiVersion = $.defaultApiVersion;
        this.expire = $.expire;
        this.inlineRoles = $.inlineRoles;
        this.name = $.name;
        this.policyStatements = $.policyStatements;
        this.role = $.role;
        this.serviceToken = $.serviceToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessTokenArgs $;

        public Builder() {
            $ = new AccessTokenArgs();
        }

        public Builder(AccessTokenArgs defaults) {
            $ = new AccessTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRoles A list of custom role IDs to use as access limits for the access token
         * 
         * @return builder
         * 
         */
        public Builder customRoles(@Nullable Output<List<String>> customRoles) {
            $.customRoles = customRoles;
            return this;
        }

        /**
         * @param customRoles A list of custom role IDs to use as access limits for the access token
         * 
         * @return builder
         * 
         */
        public Builder customRoles(List<String> customRoles) {
            return customRoles(Output.of(customRoles));
        }

        /**
         * @param customRoles A list of custom role IDs to use as access limits for the access token
         * 
         * @return builder
         * 
         */
        public Builder customRoles(String... customRoles) {
            return customRoles(List.of(customRoles));
        }

        /**
         * @param defaultApiVersion The default API version for this token. Defaults to the latest API version.
         * 
         * @return builder
         * 
         */
        public Builder defaultApiVersion(@Nullable Output<Integer> defaultApiVersion) {
            $.defaultApiVersion = defaultApiVersion;
            return this;
        }

        /**
         * @param defaultApiVersion The default API version for this token. Defaults to the latest API version.
         * 
         * @return builder
         * 
         */
        public Builder defaultApiVersion(Integer defaultApiVersion) {
            return defaultApiVersion(Output.of(defaultApiVersion));
        }

        /**
         * @param expire An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
         * 
         * @return builder
         * 
         * @deprecated
         * &#39;expire&#39; is deprecated and will be removed in the next major release of the LaunchDarly provider
         * 
         */
        @Deprecated /* 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider */
        public Builder expire(@Nullable Output<Integer> expire) {
            $.expire = expire;
            return this;
        }

        /**
         * @param expire An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
         * 
         * @return builder
         * 
         * @deprecated
         * &#39;expire&#39; is deprecated and will be removed in the next major release of the LaunchDarly provider
         * 
         */
        @Deprecated /* 'expire' is deprecated and will be removed in the next major release of the LaunchDarly provider */
        public Builder expire(Integer expire) {
            return expire(Output.of(expire));
        }

        /**
         * @param inlineRoles An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
         * of a built-in or custom role.
         * 
         * @return builder
         * 
         */
        public Builder inlineRoles(@Nullable Output<List<AccessTokenInlineRoleArgs>> inlineRoles) {
            $.inlineRoles = inlineRoles;
            return this;
        }

        /**
         * @param inlineRoles An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
         * of a built-in or custom role.
         * 
         * @return builder
         * 
         */
        public Builder inlineRoles(List<AccessTokenInlineRoleArgs> inlineRoles) {
            return inlineRoles(Output.of(inlineRoles));
        }

        /**
         * @param inlineRoles An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
         * of a built-in or custom role.
         * 
         * @return builder
         * 
         */
        public Builder inlineRoles(AccessTokenInlineRoleArgs... inlineRoles) {
            return inlineRoles(List.of(inlineRoles));
        }

        /**
         * @param name A human-friendly name for the access token.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-friendly name for the access token.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyStatements Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inline_role` to maintain compatibility with future versions.
         * 
         * @return builder
         * 
         * @deprecated
         * &#39;policy_statements&#39; is deprecated in favor of &#39;inline_roles&#39;. This field will be removed in the next major release of the LaunchDarkly provider
         * 
         */
        @Deprecated /* 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider */
        public Builder policyStatements(@Nullable Output<List<AccessTokenPolicyStatementArgs>> policyStatements) {
            $.policyStatements = policyStatements;
            return this;
        }

        /**
         * @param policyStatements Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inline_role` to maintain compatibility with future versions.
         * 
         * @return builder
         * 
         * @deprecated
         * &#39;policy_statements&#39; is deprecated in favor of &#39;inline_roles&#39;. This field will be removed in the next major release of the LaunchDarkly provider
         * 
         */
        @Deprecated /* 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider */
        public Builder policyStatements(List<AccessTokenPolicyStatementArgs> policyStatements) {
            return policyStatements(Output.of(policyStatements));
        }

        /**
         * @param policyStatements Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inline_role` to maintain compatibility with future versions.
         * 
         * @return builder
         * 
         * @deprecated
         * &#39;policy_statements&#39; is deprecated in favor of &#39;inline_roles&#39;. This field will be removed in the next major release of the LaunchDarkly provider
         * 
         */
        @Deprecated /* 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider */
        public Builder policyStatements(AccessTokenPolicyStatementArgs... policyStatements) {
            return policyStatements(List.of(policyStatements));
        }

        /**
         * @param role A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param serviceToken Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
         * 
         * @return builder
         * 
         */
        public Builder serviceToken(@Nullable Output<Boolean> serviceToken) {
            $.serviceToken = serviceToken;
            return this;
        }

        /**
         * @param serviceToken Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens)
         * 
         * @return builder
         * 
         */
        public Builder serviceToken(Boolean serviceToken) {
            return serviceToken(Output.of(serviceToken));
        }

        public AccessTokenArgs build() {
            return $;
        }
    }

}