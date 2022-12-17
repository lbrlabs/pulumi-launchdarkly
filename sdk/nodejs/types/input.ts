// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AccessTokenInlineRole {
    /**
     * The list of action specifiers defining the actions to which the statement applies.
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply.
     */
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the statement does not apply.
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the statement applies.
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface AccessTokenPolicyStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies.
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply.
     */
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the statement does not apply.
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the statement applies.
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface AuditLogSubscriptionStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     */
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface CustomRolePolicy {
    /**
     * The list of action specifiers defining the actions to which the statement applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    /**
     * - The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources: pulumi.Input<pulumi.Input<string>[]>;
}

export interface CustomRolePolicyStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the statement does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface EnvironmentApprovalSetting {
    /**
     * Set to `true` if changes can be applied as long as the `minNumApprovals` is met, regardless of whether any reviewers have declined a request. Defaults to `true`.
     */
    canApplyDeclinedChanges?: pulumi.Input<boolean>;
    /**
     * Set to `true` if requesters can approve or decline their own request. They may always comment. Defaults to `false`.
     */
    canReviewOwnRequest?: pulumi.Input<boolean>;
    /**
     * The number of approvals required before an approval request can be applied. This number must be between 1 and 5. Defaults to 1.
     */
    minNumApprovals?: pulumi.Input<number>;
    /**
     * Set to `true` for changes to flags in this environment to require approval. You may only set `required` to true if `requiredApprovalTags` is not set and vice versa. Defaults to `false`.
     */
    required?: pulumi.Input<boolean>;
    /**
     * An array of tags used to specify which flags with those tags require approval. You may only set `requiredApprovalTags` if `required` is not set to `true` and vice versa.
     */
    requiredApprovalTags?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface FeatureFlagClientSideAvailability {
    /**
     * Whether this flag is available to SDKs using the client-side ID.
     */
    usingEnvironmentId?: pulumi.Input<boolean>;
    /**
     * Whether this flag is available to SDKs using a mobile key.
     */
    usingMobileKey?: pulumi.Input<boolean>;
}

export interface FeatureFlagCustomProperty {
    /**
     * The unique custom property key.
     */
    key: pulumi.Input<string>;
    /**
     * The name of the custom property.
     */
    name: pulumi.Input<string>;
    /**
     * The list of custom property value strings.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface FeatureFlagDefaults {
    /**
     * The index of the variation the flag will default to in all new environments when off.
     */
    offVariation: pulumi.Input<number>;
    /**
     * The index of the variation the flag will default to in all new environments when on.
     */
    onVariation: pulumi.Input<number>;
}

export interface FeatureFlagEnvironmentFallthrough {
    /**
     * Group percentage rollout by a custom attribute. This argument is only valid if `rolloutWeights` is also specified.
     */
    bucketBy?: pulumi.Input<string>;
    /**
     * List of integer percentage rollout weights (in thousandths of a percent) to apply to each variation if the rule clauses evaluates to `true`. The sum of the `rolloutWeights` must equal 100000 and the number of rollout weights specified in the array must match the number of flag variations. You must specify either `variation` or `rolloutWeights`.
     */
    rolloutWeights?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The integer variation index to serve if the rule clauses evaluate to `true`. You must specify either `variation` or `rolloutWeights`.
     */
    variation?: pulumi.Input<number>;
}

export interface FeatureFlagEnvironmentPrerequisite {
    /**
     * The prerequisite feature flag's `key`.
     */
    flagKey: pulumi.Input<string>;
    /**
     * The index of the prerequisite feature flag's variation to target.
     */
    variation: pulumi.Input<number>;
}

export interface FeatureFlagEnvironmentRule {
    /**
     * Group percentage rollout by a custom attribute. This argument is only valid if `rolloutWeights` is also specified.
     */
    bucketBy?: pulumi.Input<string>;
    /**
     * List of nested blocks specifying the logical clauses to evaluate. To learn more, read Nested Clauses Blocks.
     */
    clauses?: pulumi.Input<pulumi.Input<inputs.FeatureFlagEnvironmentRuleClause>[]>;
    /**
     * List of integer percentage rollout weights (in thousandths of a percent) to apply to each variation if the rule clauses evaluates to `true`. The sum of the `rolloutWeights` must equal 100000 and the number of rollout weights specified in the array must match the number of flag variations. You must specify either `variation` or `rolloutWeights`.
     */
    rolloutWeights?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The integer variation index to serve if the rule clauses evaluate to `true`. You must specify either `variation` or `rolloutWeights`.
     */
    variation?: pulumi.Input<number>;
}

export interface FeatureFlagEnvironmentRuleClause {
    /**
     * The user attribute to operate on.
     */
    attribute: pulumi.Input<string>;
    /**
     * Whether to negate the rule clause.
     */
    negate?: pulumi.Input<boolean>;
    /**
     * The operator associated with the rule clause. Available options are `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: pulumi.Input<string>;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`. If omitted, `valueType` defaults to `string`.
     */
    valueType?: pulumi.Input<string>;
    /**
     * The list of values associated with the rule clause.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface FeatureFlagEnvironmentTarget {
    /**
     * List of `user` strings to target.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The index of the variation to serve is a user target value is matched.
     */
    variation: pulumi.Input<number>;
}

export interface FeatureFlagVariation {
    /**
     * The variation's description.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the variation.
     */
    name?: pulumi.Input<string>;
    /**
     * The variation value. The value's type must correspond to the `variationType` argument. For example: `variationType = "boolean"` accepts only `true` or `false`. The `"number"` variation type accepts both floats and ints, but please note that any trailing zeroes on floats will be trimmed (i.e. `1.1` and `1.100` will both be converted to `1.1`).
     */
    value: pulumi.Input<string>;
}

export interface FlagTriggerInstructions {
    kind: pulumi.Input<string>;
}

export interface GetAuditLogSubscriptionStatementArgs {
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetAuditLogSubscriptionStatement {
    actions?: string[];
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    notActions?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    notResources?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    resources?: string[];
}

export interface GetEnvironmentApprovalSetting {
    canApplyDeclinedChanges?: boolean;
    canReviewOwnRequest?: boolean;
    minNumApprovals?: number;
    required?: boolean;
    requiredApprovalTags?: string[];
}

export interface GetEnvironmentApprovalSettingArgs {
    canApplyDeclinedChanges?: pulumi.Input<boolean>;
    canReviewOwnRequest?: pulumi.Input<boolean>;
    minNumApprovals?: pulumi.Input<number>;
    required?: pulumi.Input<boolean>;
    requiredApprovalTags?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetFeatureFlagClientSideAvailability {
    /**
     * When set to true, this flag is available to SDKs using the client-side ID.
     */
    usingEnvironmentId?: boolean;
    /**
     * When set to true, this flag is available to SDKs using a mobile key.
     */
    usingMobileKey?: boolean;
}

export interface GetFeatureFlagClientSideAvailabilityArgs {
    /**
     * When set to true, this flag is available to SDKs using the client-side ID.
     */
    usingEnvironmentId?: pulumi.Input<boolean>;
    /**
     * When set to true, this flag is available to SDKs using a mobile key.
     */
    usingMobileKey?: pulumi.Input<boolean>;
}

export interface GetFeatureFlagCustomPropertyArgs {
    /**
     * The unique feature flag key that references the flag in your application code.
     */
    key: pulumi.Input<string>;
    /**
     * The name of the custom property.
     */
    name: pulumi.Input<string>;
    /**
     * The list of custom property value strings.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetFeatureFlagCustomProperty {
    /**
     * The unique feature flag key that references the flag in your application code.
     */
    key: string;
    /**
     * The name of the custom property.
     */
    name: string;
    /**
     * The list of custom property value strings.
     */
    values: string[];
}

export interface GetFeatureFlagDefaultsArgs {
    /**
     * (Required) The index of the variation the flag will default to in all new environments when off.
     */
    offVariation: pulumi.Input<number>;
    /**
     * (Required) The index of the variation the flag will default to in all new environments when on.
     */
    onVariation: pulumi.Input<number>;
}

export interface GetFeatureFlagDefaults {
    /**
     * (Required) The index of the variation the flag will default to in all new environments when off.
     */
    offVariation: number;
    /**
     * (Required) The index of the variation the flag will default to in all new environments when on.
     */
    onVariation: number;
}

export interface GetFeatureFlagEnvironmentFallthroughArgs {
    /**
     * Group percentage rollout by a custom attribute.
     */
    bucketBy?: pulumi.Input<string>;
    /**
     * List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
     */
    rolloutWeights?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation?: pulumi.Input<number>;
}

export interface GetFeatureFlagEnvironmentFallthrough {
    /**
     * Group percentage rollout by a custom attribute.
     */
    bucketBy?: string;
    /**
     * List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
     */
    rolloutWeights?: number[];
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation?: number;
}

export interface GetFeatureFlagEnvironmentPrerequisite {
    /**
     * The prerequisite feature flag's `key`.
     */
    flagKey: string;
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation: number;
}

export interface GetFeatureFlagEnvironmentPrerequisiteArgs {
    /**
     * The prerequisite feature flag's `key`.
     */
    flagKey: pulumi.Input<string>;
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation: pulumi.Input<number>;
}

export interface GetFeatureFlagEnvironmentRule {
    /**
     * Group percentage rollout by a custom attribute.
     */
    bucketBy?: string;
    /**
     * List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
     */
    clauses?: inputs.GetFeatureFlagEnvironmentRuleClause[];
    /**
     * List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
     */
    rolloutWeights?: number[];
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation?: number;
}

export interface GetFeatureFlagEnvironmentRuleArgs {
    /**
     * Group percentage rollout by a custom attribute.
     */
    bucketBy?: pulumi.Input<string>;
    /**
     * List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
     */
    clauses?: pulumi.Input<pulumi.Input<inputs.GetFeatureFlagEnvironmentRuleClauseArgs>[]>;
    /**
     * List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
     */
    rolloutWeights?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation?: pulumi.Input<number>;
}

export interface GetFeatureFlagEnvironmentRuleClause {
    /**
     * The user attribute operated on.
     */
    attribute: string;
    /**
     * Whether the rule clause is negated.
     */
    negate?: boolean;
    /**
     * The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: string;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`.
     */
    valueType?: string;
    /**
     * The list of values associated with the rule clause.
     */
    values: string[];
}

export interface GetFeatureFlagEnvironmentRuleClauseArgs {
    /**
     * The user attribute operated on.
     */
    attribute: pulumi.Input<string>;
    /**
     * Whether the rule clause is negated.
     */
    negate?: pulumi.Input<boolean>;
    /**
     * The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: pulumi.Input<string>;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`.
     */
    valueType?: pulumi.Input<string>;
    /**
     * The list of values associated with the rule clause.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetFeatureFlagEnvironmentTarget {
    /**
     * The list of values associated with the rule clause.
     */
    values: string[];
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation: number;
}

export interface GetFeatureFlagEnvironmentTargetArgs {
    /**
     * The list of values associated with the rule clause.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation: pulumi.Input<number>;
}

export interface GetFeatureFlagVariationArgs {
    /**
     * The variation's description.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the custom property.
     */
    name?: pulumi.Input<string>;
    /**
     * The list of custom property value strings.
     */
    value: pulumi.Input<string>;
}

export interface GetFeatureFlagVariation {
    /**
     * The variation's description.
     */
    description?: string;
    /**
     * The name of the custom property.
     */
    name?: string;
    /**
     * The list of custom property value strings.
     */
    value: string;
}

export interface GetFlagTriggerInstructionsArgs {
    kind: pulumi.Input<string>;
}

export interface GetFlagTriggerInstructions {
    kind: string;
}

export interface GetMetricUrlArgs {
    /**
     * The metric type. Available choices are `click`, `custom`, and `pageview`.
     */
    kind: pulumi.Input<string>;
    pattern?: pulumi.Input<string>;
    substring?: pulumi.Input<string>;
    url?: pulumi.Input<string>;
}

export interface GetMetricUrl {
    /**
     * The metric type. Available choices are `click`, `custom`, and `pageview`.
     */
    kind: string;
    pattern?: string;
    substring?: string;
    url?: string;
}

export interface GetRelayProxyConfigurationPolicy {
    actions?: string[];
    /**
     * Either `allow` or `deny`. This argument defines whether the rule policy allows or denies access to the named resources and actions.
     */
    effect: string;
    notActions?: string[];
    /**
     * The list of resource specifiers defining the resources to which the rule policy does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: string[];
    /**
     * The list of resource specifiers defining the resources to which the rule policy applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: string[];
}

export interface GetRelayProxyConfigurationPolicyArgs {
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Either `allow` or `deny`. This argument defines whether the rule policy allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the rule policy does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the rule policy applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetSegmentRuleArgs {
    /**
     * The attribute by which to group users together.
     */
    bucketBy?: pulumi.Input<string>;
    /**
     * List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
     */
    clauses?: pulumi.Input<pulumi.Input<inputs.GetSegmentRuleClauseArgs>[]>;
    /**
     * The integer weight of the rule (between 0 and 100000).
     */
    weight?: pulumi.Input<number>;
}

export interface GetSegmentRule {
    /**
     * The attribute by which to group users together.
     */
    bucketBy?: string;
    /**
     * List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
     */
    clauses?: inputs.GetSegmentRuleClause[];
    /**
     * The integer weight of the rule (between 0 and 100000).
     */
    weight?: number;
}

export interface GetSegmentRuleClause {
    /**
     * The user attribute operated on.
     */
    attribute: string;
    /**
     * Whether the rule clause is negated.
     */
    negate?: boolean;
    /**
     * The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: string;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`.
     */
    valueType?: string;
    /**
     * The list of values associated with the rule clause.
     */
    values: string[];
}

export interface GetSegmentRuleClauseArgs {
    /**
     * The user attribute operated on.
     */
    attribute: pulumi.Input<string>;
    /**
     * Whether the rule clause is negated.
     */
    negate?: pulumi.Input<boolean>;
    /**
     * The operator associated with the rule clause. This will be one of `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: pulumi.Input<string>;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`.
     */
    valueType?: pulumi.Input<string>;
    /**
     * The list of values associated with the rule clause.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetWebhookStatement {
    actions?: string[];
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    notActions?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement applies. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: string[];
}

export interface GetWebhookStatementArgs {
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement applies. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface MetricUrl {
    /**
     * The URL type. Available choices are `exact`, `canonical`, `substring` and `regex`.
     */
    kind: pulumi.Input<string>;
    /**
     * The regex pattern to match by.
     */
    pattern?: pulumi.Input<string>;
    /**
     * The URL substring to match by.
     */
    substring?: pulumi.Input<string>;
    /**
     * The exact or canonical URL.
     */
    url?: pulumi.Input<string>;
}

export interface ProjectDefaultClientSideAvailability {
    /**
     * Whether feature flags created under the project are available to JavaScript SDKs using the client-side ID by default. Defaults to `false` when not using `defaultClientSideAvailability`.
     */
    usingEnvironmentId: pulumi.Input<boolean>;
    /**
     * Whether feature flags created under the project are available to mobile SDKs, and other non-JavaScript SDKs, using a mobile key by default. Defaults to `true` when not using `defaultClientSideAvailability`.
     */
    usingMobileKey: pulumi.Input<boolean>;
}

export interface ProjectEnvironment {
    apiKey?: pulumi.Input<string>;
    approvalSettings?: pulumi.Input<pulumi.Input<inputs.ProjectEnvironmentApprovalSetting>[]>;
    clientSideId?: pulumi.Input<string>;
    /**
     * The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     */
    color: pulumi.Input<string>;
    /**
     * Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     */
    confirmChanges?: pulumi.Input<boolean>;
    /**
     * Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
     */
    defaultTrackEvents?: pulumi.Input<boolean>;
    /**
     * The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
     */
    defaultTtl?: pulumi.Input<number>;
    /**
     * The project-unique key for the environment. A change in this field will force the destruction of the existing environment and the creation of a new one.
     */
    key: pulumi.Input<string>;
    mobileKey?: pulumi.Input<string>;
    /**
     * The name of the environment.
     */
    name: pulumi.Input<string>;
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

export interface ProjectEnvironmentApprovalSetting {
    /**
     * Set to `true` if changes can be applied as long as the `minNumApprovals` is met, regardless of whether any reviewers have declined a request. Defaults to `true`.
     */
    canApplyDeclinedChanges?: pulumi.Input<boolean>;
    /**
     * Set to `true` if requesters can approve or decline their own request. They may always comment. Defaults to `false`.
     */
    canReviewOwnRequest?: pulumi.Input<boolean>;
    /**
     * The number of approvals required before an approval request can be applied. This number must be between 1 and 5. Defaults to 1.
     */
    minNumApprovals?: pulumi.Input<number>;
    /**
     * Set to `true` for changes to flags in this environment to require approval. You may only set `required` to true if `requiredApprovalTags` is not set and vice versa. Defaults to `false`.
     */
    required?: pulumi.Input<boolean>;
    /**
     * An array of tags used to specify which flags with those tags require approval. You may only set `requiredApprovalTags` if `required` is not set to `true` and vice versa.
     */
    requiredApprovalTags?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface RelayProxyConfigurationPolicy {
    /**
     * The list of action specifiers defining the actions to which the rule policy applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - Either `allow` or `deny`. This argument defines whether the rule policy allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    /**
     * The list of action specifiers defining the actions to which the rule policy does not apply. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the rule policy does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * - The list of resource specifiers defining the resources to which the rule policy applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface SegmentRule {
    /**
     * The attribute by which to group users together.
     */
    bucketBy?: pulumi.Input<string>;
    /**
     * List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
     */
    clauses?: pulumi.Input<pulumi.Input<inputs.SegmentRuleClause>[]>;
    /**
     * The integer weight of the rule (between 1 and 100000).
     */
    weight?: pulumi.Input<number>;
}

export interface SegmentRuleClause {
    /**
     * The user attribute to operate on.
     */
    attribute: pulumi.Input<string>;
    /**
     * Whether to negate the rule clause.
     */
    negate?: pulumi.Input<boolean>;
    /**
     * The operator associated with the rule clause. Available options are `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: pulumi.Input<string>;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`. If omitted, `valueType` defaults to `string`.
     */
    valueType?: pulumi.Input<string>;
    /**
     * The list of values associated with the rule clause.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface WebhookStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: pulumi.Input<string>;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    notActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: pulumi.Input<pulumi.Input<string>[]>;
}

