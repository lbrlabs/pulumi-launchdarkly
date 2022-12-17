// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a LaunchDarkly team member resource.
 *
 * This resource allows you to create and manage team members within your LaunchDarkly organization.
 *
 * > **Note:** You can only manage team members with "admin" level personal access tokens. To learn more, read [Managing Teams](https://docs.launchdarkly.com/docs/teams/managing).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@pulumi/launchdarkly";
 *
 * const example = new launchdarkly.TeamMember("example", {
 *     email: "example.user@example.com",
 *     firstName: "John",
 *     lastName: "Smith",
 *     role: "writer",
 * });
 * ```
 *
 * ## Import
 *
 * LaunchDarkly team members can be imported using the team member's 24 character ID, e.g.
 *
 * ```sh
 *  $ pulumi import launchdarkly:index/teamMember:TeamMember example 5f05565b48be0b441fb63020
 * ```
 */
export class TeamMember extends pulumi.CustomResource {
    /**
     * Get an existing TeamMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamMemberState, opts?: pulumi.CustomResourceOptions): TeamMember {
        return new TeamMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'launchdarkly:index/teamMember:TeamMember';

    /**
     * Returns true if the given object is an instance of TeamMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamMember.__pulumiType;
    }

    /**
     * The list of custom roles keys associated with the team member. Custom roles are only available to customers on enterprise plans. To learn more about enterprise plans, contact sales@launchdarkly.com.
     */
    public readonly customRoles!: pulumi.Output<string[] | undefined>;
    /**
     * The unique email address associated with the team member. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * The team member's given name. Please note that, once created, this cannot be updated except by the team member themself.
     */
    public readonly firstName!: pulumi.Output<string | undefined>;
    /**
     * The team member's family name. Please note that, once created, this cannot be updated except by the team member themself.
     */
    public readonly lastName!: pulumi.Output<string | undefined>;
    /**
     * The role associated with team member. Supported roles are `reader`, `writer`, `noAccess`, or `admin`. If you don't specify a role, `reader` is assigned by default.
     */
    public readonly role!: pulumi.Output<string>;

    /**
     * Create a TeamMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamMemberArgs | TeamMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamMemberState | undefined;
            resourceInputs["customRoles"] = state ? state.customRoles : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["firstName"] = state ? state.firstName : undefined;
            resourceInputs["lastName"] = state ? state.lastName : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
        } else {
            const args = argsOrState as TeamMemberArgs | undefined;
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            resourceInputs["customRoles"] = args ? args.customRoles : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["firstName"] = args ? args.firstName : undefined;
            resourceInputs["lastName"] = args ? args.lastName : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TeamMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamMember resources.
 */
export interface TeamMemberState {
    /**
     * The list of custom roles keys associated with the team member. Custom roles are only available to customers on enterprise plans. To learn more about enterprise plans, contact sales@launchdarkly.com.
     */
    customRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique email address associated with the team member. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    email?: pulumi.Input<string>;
    /**
     * The team member's given name. Please note that, once created, this cannot be updated except by the team member themself.
     */
    firstName?: pulumi.Input<string>;
    /**
     * The team member's family name. Please note that, once created, this cannot be updated except by the team member themself.
     */
    lastName?: pulumi.Input<string>;
    /**
     * The role associated with team member. Supported roles are `reader`, `writer`, `noAccess`, or `admin`. If you don't specify a role, `reader` is assigned by default.
     */
    role?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TeamMember resource.
 */
export interface TeamMemberArgs {
    /**
     * The list of custom roles keys associated with the team member. Custom roles are only available to customers on enterprise plans. To learn more about enterprise plans, contact sales@launchdarkly.com.
     */
    customRoles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique email address associated with the team member. A change in this field will force the destruction of the existing resource and the creation of a new one.
     */
    email: pulumi.Input<string>;
    /**
     * The team member's given name. Please note that, once created, this cannot be updated except by the team member themself.
     */
    firstName?: pulumi.Input<string>;
    /**
     * The team member's family name. Please note that, once created, this cannot be updated except by the team member themself.
     */
    lastName?: pulumi.Input<string>;
    /**
     * The role associated with team member. Supported roles are `reader`, `writer`, `noAccess`, or `admin`. If you don't specify a role, `reader` is assigned by default.
     */
    role?: pulumi.Input<string>;
}
