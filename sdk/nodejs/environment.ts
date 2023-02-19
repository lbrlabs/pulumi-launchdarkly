// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const staging = new launchdarkly.Environment("staging", {
 *     key: "staging",
 *     color: "ff00ff",
 *     tags: [
 *         "terraform",
 *         "staging",
 *     ],
 *     projectKey: launchdarkly_project.example.key,
 * });
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@lbrlabs/pulumi-launchdarkly";
 *
 * const approvalsExample = new launchdarkly.Environment("approvalsExample", {
 *     key: "approvals-example",
 *     color: "ff00ff",
 *     tags: [
 *         "terraform",
 *         "staging",
 *     ],
 *     approvalSettings: [{
 *         required: true,
 *         canReviewOwnRequest: true,
 *         minNumApprovals: 2,
 *         canApplyDeclinedChanges: true,
 *     }],
 *     projectKey: launchdarkly_project.example.key,
 * });
 * ```
 *
 * ## Import
 *
 * You can import a LaunchDarkly environment using this format`project_key/environment_key`. For example
 *
 * ```sh
 *  $ pulumi import launchdarkly:index/environment:Environment staging example-project/staging
 * ```
 */
export class Environment extends pulumi.CustomResource {
    /**
     * Get an existing Environment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentState, opts?: pulumi.CustomResourceOptions): Environment {
        return new Environment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'launchdarkly:index/environment:Environment';

    /**
     * Returns true if the given object is an instance of Environment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Environment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Environment.__pulumiType;
    }

    /**
     * The environment's SDK key.
     */
    public /*out*/ readonly apiKey!: pulumi.Output<string>;
    public readonly approvalSettings!: pulumi.Output<outputs.EnvironmentApprovalSetting[]>;
    /**
     * The environment's client-side ID.
     */
    public /*out*/ readonly clientSideId!: pulumi.Output<string>;
    /**
     * The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     */
    public readonly color!: pulumi.Output<string>;
    /**
     * Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     */
    public readonly confirmChanges!: pulumi.Output<boolean | undefined>;
    /**
     * Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     */
    public readonly defaultTrackEvents!: pulumi.Output<boolean | undefined>;
    /**
     * The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     */
    public readonly defaultTtl!: pulumi.Output<number | undefined>;
    /**
     * The project-unique key for the environment. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * The environment's mobile key.
     */
    public /*out*/ readonly mobileKey!: pulumi.Output<string>;
    /**
     * The name of the environment.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * - The environment's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    public readonly projectKey!: pulumi.Output<string>;
    /**
     * Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     */
    public readonly requireComments!: pulumi.Output<boolean | undefined>;
    /**
     * Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     */
    public readonly secureMode!: pulumi.Output<boolean | undefined>;
    /**
     * Set of tags associated with the environment.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Environment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentArgs | EnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentState | undefined;
            resourceInputs["apiKey"] = state ? state.apiKey : undefined;
            resourceInputs["approvalSettings"] = state ? state.approvalSettings : undefined;
            resourceInputs["clientSideId"] = state ? state.clientSideId : undefined;
            resourceInputs["color"] = state ? state.color : undefined;
            resourceInputs["confirmChanges"] = state ? state.confirmChanges : undefined;
            resourceInputs["defaultTrackEvents"] = state ? state.defaultTrackEvents : undefined;
            resourceInputs["defaultTtl"] = state ? state.defaultTtl : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["mobileKey"] = state ? state.mobileKey : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectKey"] = state ? state.projectKey : undefined;
            resourceInputs["requireComments"] = state ? state.requireComments : undefined;
            resourceInputs["secureMode"] = state ? state.secureMode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as EnvironmentArgs | undefined;
            if ((!args || args.color === undefined) && !opts.urn) {
                throw new Error("Missing required property 'color'");
            }
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.projectKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectKey'");
            }
            resourceInputs["approvalSettings"] = args ? args.approvalSettings : undefined;
            resourceInputs["color"] = args ? args.color : undefined;
            resourceInputs["confirmChanges"] = args ? args.confirmChanges : undefined;
            resourceInputs["defaultTrackEvents"] = args ? args.defaultTrackEvents : undefined;
            resourceInputs["defaultTtl"] = args ? args.defaultTtl : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectKey"] = args ? args.projectKey : undefined;
            resourceInputs["requireComments"] = args ? args.requireComments : undefined;
            resourceInputs["secureMode"] = args ? args.secureMode : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["apiKey"] = undefined /*out*/;
            resourceInputs["clientSideId"] = undefined /*out*/;
            resourceInputs["mobileKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiKey", "clientSideId", "mobileKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Environment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Environment resources.
 */
export interface EnvironmentState {
    /**
     * The environment's SDK key.
     */
    apiKey?: pulumi.Input<string>;
    approvalSettings?: pulumi.Input<pulumi.Input<inputs.EnvironmentApprovalSetting>[]>;
    /**
     * The environment's client-side ID.
     */
    clientSideId?: pulumi.Input<string>;
    /**
     * The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     */
    color?: pulumi.Input<string>;
    /**
     * Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     */
    confirmChanges?: pulumi.Input<boolean>;
    /**
     * Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     */
    defaultTrackEvents?: pulumi.Input<boolean>;
    /**
     * The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     */
    defaultTtl?: pulumi.Input<number>;
    /**
     * The project-unique key for the environment. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    key?: pulumi.Input<string>;
    /**
     * The environment's mobile key.
     */
    mobileKey?: pulumi.Input<string>;
    /**
     * The name of the environment.
     */
    name?: pulumi.Input<string>;
    /**
     * - The environment's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    projectKey?: pulumi.Input<string>;
    /**
     * Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     */
    requireComments?: pulumi.Input<boolean>;
    /**
     * Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     */
    secureMode?: pulumi.Input<boolean>;
    /**
     * Set of tags associated with the environment.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Environment resource.
 */
export interface EnvironmentArgs {
    approvalSettings?: pulumi.Input<pulumi.Input<inputs.EnvironmentApprovalSetting>[]>;
    /**
     * The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     */
    color: pulumi.Input<string>;
    /**
     * Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     */
    confirmChanges?: pulumi.Input<boolean>;
    /**
     * Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/home/data-export).
     */
    defaultTrackEvents?: pulumi.Input<boolean>;
    /**
     * The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/home/organize/environments#ttl-settings).
     */
    defaultTtl?: pulumi.Input<number>;
    /**
     * The project-unique key for the environment. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    key: pulumi.Input<string>;
    /**
     * The name of the environment.
     */
    name?: pulumi.Input<string>;
    /**
     * - The environment's project key. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    projectKey: pulumi.Input<string>;
    /**
     * Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     */
    requireComments?: pulumi.Input<boolean>;
    /**
     * Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     */
    secureMode?: pulumi.Input<boolean>;
    /**
     * Set of tags associated with the environment.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
