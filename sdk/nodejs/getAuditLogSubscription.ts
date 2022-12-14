// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a LaunchDarkly audit log subscription data source.
 *
 * This data source allows you to retrieve information about LaunchDarkly audit log subscriptions.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@pulumi/launchdarkly";
 *
 * const test = launchdarkly.getAuditLogSubscription({
 *     id: "5f0cd446a77cba0b4c5644a7",
 *     integrationKey: "msteams",
 * });
 * ```
 */
export function getAuditLogSubscription(args: GetAuditLogSubscriptionArgs, opts?: pulumi.InvokeOptions): Promise<GetAuditLogSubscriptionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("launchdarkly:index/getAuditLogSubscription:getAuditLogSubscription", {
        "config": args.config,
        "id": args.id,
        "integrationKey": args.integrationKey,
        "name": args.name,
        "on": args.on,
        "statements": args.statements,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getAuditLogSubscription.
 */
export interface GetAuditLogSubscriptionArgs {
    /**
     * A block of configuration fields associated with your integration type.
     */
    config?: {[key: string]: any};
    /**
     * The unique subscription ID. This can be found in the URL of the pull-out configuration sidebar for the given subscription on your [LaunchDarkly Integrations page](https://app.launchdarkly.com/default/integrations).
     */
    id: string;
    /**
     * The integration key. As of February 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`.
     */
    integrationKey: string;
    /**
     * The subscription's human-readable name.
     */
    name?: string;
    /**
     * Whether the subscription is enabled.
     */
    on?: boolean;
    /**
     * The statement block used to filter subscription events. To learn more, read Statement Blocks.
     */
    statements?: inputs.GetAuditLogSubscriptionStatement[];
    /**
     * Set of tags associated with the subscription.
     */
    tags?: string[];
}

/**
 * A collection of values returned by getAuditLogSubscription.
 */
export interface GetAuditLogSubscriptionResult {
    /**
     * A block of configuration fields associated with your integration type.
     */
    readonly config?: {[key: string]: any};
    readonly id: string;
    readonly integrationKey: string;
    /**
     * The subscription's human-readable name.
     */
    readonly name?: string;
    /**
     * Whether the subscription is enabled.
     */
    readonly on?: boolean;
    /**
     * The statement block used to filter subscription events. To learn more, read Statement Blocks.
     */
    readonly statements?: outputs.GetAuditLogSubscriptionStatement[];
    /**
     * Set of tags associated with the subscription.
     */
    readonly tags?: string[];
}
/**
 * Provides a LaunchDarkly audit log subscription data source.
 *
 * This data source allows you to retrieve information about LaunchDarkly audit log subscriptions.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as launchdarkly from "@pulumi/launchdarkly";
 *
 * const test = launchdarkly.getAuditLogSubscription({
 *     id: "5f0cd446a77cba0b4c5644a7",
 *     integrationKey: "msteams",
 * });
 * ```
 */
export function getAuditLogSubscriptionOutput(args: GetAuditLogSubscriptionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAuditLogSubscriptionResult> {
    return pulumi.output(args).apply((a: any) => getAuditLogSubscription(a, opts))
}

/**
 * A collection of arguments for invoking getAuditLogSubscription.
 */
export interface GetAuditLogSubscriptionOutputArgs {
    /**
     * A block of configuration fields associated with your integration type.
     */
    config?: pulumi.Input<{[key: string]: any}>;
    /**
     * The unique subscription ID. This can be found in the URL of the pull-out configuration sidebar for the given subscription on your [LaunchDarkly Integrations page](https://app.launchdarkly.com/default/integrations).
     */
    id: pulumi.Input<string>;
    /**
     * The integration key. As of February 2022, supported integrations are `"datadog"`, `"dynatrace"`, `"elastic"`, `"honeycomb"`, `"logdna"`, `"msteams"`, `"new-relic-apm"`, `"signalfx"`, `"slack"`, and `"splunk"`.
     */
    integrationKey: pulumi.Input<string>;
    /**
     * The subscription's human-readable name.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether the subscription is enabled.
     */
    on?: pulumi.Input<boolean>;
    /**
     * The statement block used to filter subscription events. To learn more, read Statement Blocks.
     */
    statements?: pulumi.Input<pulumi.Input<inputs.GetAuditLogSubscriptionStatementArgs>[]>;
    /**
     * Set of tags associated with the subscription.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
