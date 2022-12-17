// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * The resource must contain either a `role`, `customRole` or an `inlineRoles` (previously `policyStatements`) block. As of v1.7.0, `policyStatements` has been deprecated in favor of `inlineRoles`.
 *
 * With a built-in role
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const readerToken = new launchdarkly.AccessToken("readerToken", {role: "reader"});
 * ```
 *
 * With a custom role
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const customRoleToken = new launchdarkly.AccessToken("customRoleToken", {customRoles: ["ops"]});
 * ```
 *
 * With an inline custom role (policy statements)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const tokenWithPolicyStatements = new launchdarkly.AccessToken("tokenWithPolicyStatements", {
 *     inlineRoles: [{
 *         actions: ["*"],
 *         effect: "deny",
 *         resources: ["proj/*:env/production"],
 *     }],
 *     serviceToken: true,
 * });
 * ```
 */
export class AccessToken extends pulumi.CustomResource {
    /**
     * Get an existing AccessToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessTokenState, opts?: pulumi.CustomResourceOptions): AccessToken {
        return new AccessToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'launchdarkly:index/accessToken:AccessToken';

    /**
     * Returns true if the given object is an instance of AccessToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessToken.__pulumiType;
    }

    /**
     * A list of custom role IDs to use as access limits for the access token
     */
    public readonly customRoles!: pulumi.Output<string[] | undefined>;
    /**
     * The default API version for this token. Defaults to the latest API version. A change in this field will force the destruction of the existing token in state and the creation of a new one.
     */
    public readonly defaultApiVersion!: pulumi.Output<number>;
    /**
     * An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
     *
     * @deprecated 'expire' is deprecated and will be removed in the next major release of the LaunchDarkly provider
     */
    public readonly expire!: pulumi.Output<number | undefined>;
    /**
     * An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
     * of a built-in or custom role.
     */
    public readonly inlineRoles!: pulumi.Output<outputs.AccessTokenInlineRole[] | undefined>;
    /**
     * A human-friendly name for the access token.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
     *
     * @deprecated 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
     */
    public readonly policyStatements!: pulumi.Output<outputs.AccessTokenPolicyStatement[] | undefined>;
    /**
     * A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
     */
    public readonly role!: pulumi.Output<string | undefined>;
    /**
     * Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens). A change in this field will force the destruction of the existing token and the creation of a new one.
     */
    public readonly serviceToken!: pulumi.Output<boolean | undefined>;
    /**
     * The access token used to authorize usage of the LaunchDarkly API.
     */
    public /*out*/ readonly token!: pulumi.Output<string>;

    /**
     * Create a AccessToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AccessTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessTokenArgs | AccessTokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessTokenState | undefined;
            resourceInputs["customRoles"] = state ? state.customRoles : undefined;
            resourceInputs["defaultApiVersion"] = state ? state.defaultApiVersion : undefined;
            resourceInputs["expire"] = state ? state.expire : undefined;
            resourceInputs["inlineRoles"] = state ? state.inlineRoles : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyStatements"] = state ? state.policyStatements : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["serviceToken"] = state ? state.serviceToken : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
        } else {
            const args = argsOrState as AccessTokenArgs | undefined;
            resourceInputs["customRoles"] = args ? args.customRoles : undefined;
            resourceInputs["defaultApiVersion"] = args ? args.defaultApiVersion : undefined;
            resourceInputs["expire"] = args ? args.expire : undefined;
            resourceInputs["inlineRoles"] = args ? args.inlineRoles : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyStatements"] = args ? args.policyStatements : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["serviceToken"] = args ? args.serviceToken : undefined;
            resourceInputs["token"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["token"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(AccessToken.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessToken resources.
 */
export interface AccessTokenState {
    /**
     * A list of custom role IDs to use as access limits for the access token
     */
    customRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The default API version for this token. Defaults to the latest API version. A change in this field will force the destruction of the existing token in state and the creation of a new one.
     */
    defaultApiVersion?: pulumi.Input<number>;
    /**
     * An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
     *
     * @deprecated 'expire' is deprecated and will be removed in the next major release of the LaunchDarkly provider
     */
    expire?: pulumi.Input<number>;
    /**
     * An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
     * of a built-in or custom role.
     */
    inlineRoles?: pulumi.Input<pulumi.Input<inputs.AccessTokenInlineRole>[]>;
    /**
     * A human-friendly name for the access token.
     */
    name?: pulumi.Input<string>;
    /**
     * Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
     *
     * @deprecated 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
     */
    policyStatements?: pulumi.Input<pulumi.Input<inputs.AccessTokenPolicyStatement>[]>;
    /**
     * A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
     */
    role?: pulumi.Input<string>;
    /**
     * Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens). A change in this field will force the destruction of the existing token and the creation of a new one.
     */
    serviceToken?: pulumi.Input<boolean>;
    /**
     * The access token used to authorize usage of the LaunchDarkly API.
     */
    token?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessToken resource.
 */
export interface AccessTokenArgs {
    /**
     * A list of custom role IDs to use as access limits for the access token
     */
    customRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The default API version for this token. Defaults to the latest API version. A change in this field will force the destruction of the existing token in state and the creation of a new one.
     */
    defaultApiVersion?: pulumi.Input<number>;
    /**
     * An expiration time for the current token secret, expressed as a Unix epoch time. Replace the computed token secret with a new value. The expired secret will no longer be able to authorize usage of the LaunchDarkly API. This field argument is **deprecated**. Please update your config to remove `expire` to maintain compatibility with future versions.
     *
     * @deprecated 'expire' is deprecated and will be removed in the next major release of the LaunchDarkly provider
     */
    expire?: pulumi.Input<number>;
    /**
     * An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place
     * of a built-in or custom role.
     */
    inlineRoles?: pulumi.Input<pulumi.Input<inputs.AccessTokenInlineRole>[]>;
    /**
     * A human-friendly name for the access token.
     */
    name?: pulumi.Input<string>;
    /**
     * Define inline custom roles. An array of statements represented as config blocks with 3 attributes: effect, resources, actions. May be used in place of a built-in or custom role. [Policies in custom roles](https://docs.launchdarkly.com/docs/policies-in-custom-roles). May be specified more than once. This field argument is **deprecated**. Please update your config to use `inlineRole` to maintain compatibility with future versions.
     *
     * @deprecated 'policy_statements' is deprecated in favor of 'inline_roles'. This field will be removed in the next major release of the LaunchDarkly provider
     */
    policyStatements?: pulumi.Input<pulumi.Input<inputs.AccessTokenPolicyStatement>[]>;
    /**
     * A built-in LaunchDarkly role. Can be `reader`, `writer`, or `admin`
     */
    role?: pulumi.Input<string>;
    /**
     * Whether the token will be a [service token](https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens). A change in this field will force the destruction of the existing token and the creation of a new one.
     */
    serviceToken?: pulumi.Input<boolean>;
}
