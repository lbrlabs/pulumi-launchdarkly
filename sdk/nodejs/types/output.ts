// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AccessTokenInlineRole {
    /**
     * The list of action specifiers defining the actions to which the statement applies.
     */
    actions?: string[];
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply.
     */
    notActions?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the statement does not apply.
     */
    notResources?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the statement applies.
     */
    resources?: string[];
}

export interface AccessTokenPolicyStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies.
     */
    actions?: string[];
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply.
     */
    notActions?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the statement does not apply.
     */
    notResources?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the statement applies.
     */
    resources?: string[];
}

export interface AuditLogSubscriptionStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     */
    actions?: string[];
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply. For a list of available actions, read [Using actions](https://docs.launchdarkly.com/home/members/role-actions).
     */
    notActions?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    notResources?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement applies. To learn more about how to configure these, read [Using resources](https://docs.launchdarkly.com/home/members/role-resources).
     */
    resources?: string[];
}

export interface CustomRolePolicy {
    /**
     * The list of action specifiers defining the actions to which the statement applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions: string[];
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    /**
     * - The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources: string[];
}

export interface CustomRolePolicyStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions?: string[];
    /**
     * - Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    notActions?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the statement does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: string[];
}

export interface EnvironmentApprovalSetting {
    /**
     * Set to `true` if changes can be applied as long as the `minNumApprovals` is met, regardless of whether any reviewers have declined a request. Defaults to `true`.
     */
    canApplyDeclinedChanges?: boolean;
    /**
     * Set to `true` if requesters can approve or decline their own request. They may always comment. Defaults to `false`.
     */
    canReviewOwnRequest?: boolean;
    /**
     * The number of approvals required before an approval request can be applied. This number must be between 1 and 5. Defaults to 1.
     */
    minNumApprovals?: number;
    /**
     * Set to `true` for changes to flags in this environment to require approval. You may only set `required` to true if `requiredApprovalTags` is not set and vice versa. Defaults to `false`.
     */
    required?: boolean;
    /**
     * An array of tags used to specify which flags with those tags require approval. You may only set `requiredApprovalTags` if `required` is not set to `true` and vice versa.
     */
    requiredApprovalTags?: string[];
}

export interface FeatureFlagClientSideAvailability {
    /**
     * Whether this flag is available to SDKs using the client-side ID.
     */
    usingEnvironmentId: boolean;
    /**
     * Whether this flag is available to SDKs using a mobile key.
     */
    usingMobileKey?: boolean;
}

export interface FeatureFlagCustomProperty {
    /**
     * The unique custom property key.
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

export interface FeatureFlagDefaults {
    /**
     * The index of the variation the flag will default to in all new environments when off.
     */
    offVariation: number;
    /**
     * The index of the variation the flag will default to in all new environments when on.
     */
    onVariation: number;
}

export interface FeatureFlagEnvironmentFallthrough {
    /**
     * Group percentage rollout by a custom attribute. This argument is only valid if `rolloutWeights` is also specified.
     */
    bucketBy?: string;
    /**
     * List of integer percentage rollout weights (in thousandths of a percent) to apply to each variation if the rule clauses evaluates to `true`. The sum of the `rolloutWeights` must equal 100000 and the number of rollout weights specified in the array must match the number of flag variations. You must specify either `variation` or `rolloutWeights`.
     */
    rolloutWeights?: number[];
    /**
     * The integer variation index to serve if the rule clauses evaluate to `true`. You must specify either `variation` or `rolloutWeights`.
     */
    variation?: number;
}

export interface FeatureFlagEnvironmentPrerequisite {
    /**
     * The prerequisite feature flag's `key`.
     */
    flagKey: string;
    /**
     * The index of the prerequisite feature flag's variation to target.
     */
    variation: number;
}

export interface FeatureFlagEnvironmentRule {
    /**
     * Group percentage rollout by a custom attribute. This argument is only valid if `rolloutWeights` is also specified.
     */
    bucketBy?: string;
    /**
     * List of nested blocks specifying the logical clauses to evaluate. To learn more, read Nested Clauses Blocks.
     */
    clauses?: outputs.FeatureFlagEnvironmentRuleClause[];
    /**
     * List of integer percentage rollout weights (in thousandths of a percent) to apply to each variation if the rule clauses evaluates to `true`. The sum of the `rolloutWeights` must equal 100000 and the number of rollout weights specified in the array must match the number of flag variations. You must specify either `variation` or `rolloutWeights`.
     */
    rolloutWeights?: number[];
    /**
     * The integer variation index to serve if the rule clauses evaluate to `true`. You must specify either `variation` or `rolloutWeights`.
     */
    variation?: number;
}

export interface FeatureFlagEnvironmentRuleClause {
    /**
     * The user attribute to operate on.
     */
    attribute: string;
    /**
     * Whether to negate the rule clause.
     */
    negate?: boolean;
    /**
     * The operator associated with the rule clause. Available options are `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: string;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`. If omitted, `valueType` defaults to `string`.
     */
    valueType?: string;
    /**
     * The list of values associated with the rule clause.
     */
    values: string[];
}

export interface FeatureFlagEnvironmentTarget {
    /**
     * List of `user` strings to target.
     */
    values: string[];
    /**
     * The index of the variation to serve is a user target value is matched.
     */
    variation: number;
}

export interface FeatureFlagVariation {
    /**
     * The variation's description.
     */
    description?: string;
    /**
     * The name of the variation.
     */
    name?: string;
    /**
     * The variation value. The value's type must correspond to the `variationType` argument. For example: `variationType = "boolean"` accepts only `true` or `false`. The `"number"` variation type accepts both floats and ints, but please note that any trailing zeroes on floats will be trimmed (i.e. `1.1` and `1.100` will both be converted to `1.1`).
     */
    value: string;
}

export interface FlagTriggerInstructions {
    kind: string;
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

export interface GetFeatureFlagClientSideAvailability {
    /**
     * When set to true, this flag is available to SDKs using the client-side ID.
     */
    usingEnvironmentId: boolean;
    /**
     * When set to true, this flag is available to SDKs using a mobile key.
     */
    usingMobileKey?: boolean;
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

export interface GetFeatureFlagEnvironmentRule {
    /**
     * Group percentage rollout by a custom attribute.
     */
    bucketBy?: string;
    /**
     * List of nested blocks specifying the logical clauses evaluated. To learn more, read Nested Clauses Blocks.
     */
    clauses?: outputs.GetFeatureFlagEnvironmentRuleClause[];
    /**
     * List of integer percentage rollout weights applied to each variation when the rule clauses evaluates to `true`.
     */
    rolloutWeights?: number[];
    /**
     * The integer variation index served when the rule clauses evaluate to `true`.
     */
    variation?: number;
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

export interface GetFlagTriggerInstructions {
    kind: string;
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

export interface GetProjectClientSideAvailability {
    /**
     * When set to true, the flags in this project are available to SDKs using the client-side ID by default.
     */
    usingEnvironmentId?: boolean;
    /**
     * When set to true, the flags in this project are available to SDKs using a mobile key by default.
     */
    usingMobileKey?: boolean;
}

export interface GetProjectDefaultClientSideAvailability {
    /**
     * When set to true, the flags in this project are available to SDKs using the client-side ID by default.
     */
    usingEnvironmentId: boolean;
    /**
     * When set to true, the flags in this project are available to SDKs using a mobile key by default.
     */
    usingMobileKey: boolean;
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

export interface GetSegmentRule {
    /**
     * The attribute by which to group users together.
     */
    bucketBy?: string;
    /**
     * List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
     */
    clauses?: outputs.GetSegmentRuleClause[];
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

export interface GetTeamMaintainer {
    email: string;
    firstName: string;
    id: string;
    lastName: string;
    role: string;
}

export interface GetTeamMembersTeamMember {
    customRoles: string[];
    email: string;
    /**
     * The team member's given name.
     */
    firstName: string;
    /**
     * The 24 character alphanumeric ID of the team member.
     */
    id: string;
    /**
     * The team member's family name.
     */
    lastName: string;
    /**
     * The role associated with team member. Possible roles are `owner`, `reader`, `writer`, or `admin`.
     */
    role: string;
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

export interface MetricUrl {
    /**
     * The URL type. Available choices are `exact`, `canonical`, `substring` and `regex`.
     */
    kind: string;
    /**
     * The regex pattern to match by.
     */
    pattern?: string;
    /**
     * The URL substring to match by.
     */
    substring?: string;
    /**
     * The exact or canonical URL.
     */
    url?: string;
}

export interface ProjectDefaultClientSideAvailability {
    /**
     * Whether feature flags created under the project are available to JavaScript SDKs using the client-side ID by default. Defaults to `false` when not using `defaultClientSideAvailability`.
     */
    usingEnvironmentId: boolean;
    /**
     * Whether feature flags created under the project are available to mobile SDKs, and other non-JavaScript SDKs, using a mobile key by default. Defaults to `true` when not using `defaultClientSideAvailability`.
     */
    usingMobileKey: boolean;
}

export interface ProjectEnvironment {
    apiKey: string;
    approvalSettings: outputs.ProjectEnvironmentApprovalSetting[];
    clientSideId: string;
    /**
     * The color swatch as an RGB hex value with no leading `#`. For example: `000000`.
     */
    color: string;
    /**
     * Set to `true` if this environment requires confirmation for flag and segment changes. This field will default to `false` when not set.
     */
    confirmChanges?: boolean;
    /**
     * Set to `true` to enable data export for every flag created in this environment after you configure this argument. This field will default to `false` when not set. To learn more, read [Data Export](https://docs.launchdarkly.com/docs/data-export).
     */
    defaultTrackEvents?: boolean;
    /**
     * The TTL for the environment. This must be between 0 and 60 minutes. The TTL setting only applies to environments using the PHP SDK. This field will default to `0` when not set. To learn more, read [TTL settings](https://docs.launchdarkly.com/docs/environments#section-ttl-settings).
     */
    defaultTtl?: number;
    /**
     * The project-unique key for the environment. A change in this field will force the destruction of the existing environment and the creation of a new one.
     */
    key: string;
    mobileKey: string;
    /**
     * The name of the environment.
     */
    name: string;
    /**
     * Set to `true` if this environment requires comments for flag and segment changes. This field will default to `false` when not set.
     */
    requireComments?: boolean;
    /**
     * Set to `true` to ensure a user of the client-side SDK cannot impersonate another user. This field will default to `false` when not set.
     */
    secureMode?: boolean;
    /**
     * Set of tags associated with the environment.
     */
    tags?: string[];
}

export interface ProjectEnvironmentApprovalSetting {
    /**
     * Set to `true` if changes can be applied as long as the `minNumApprovals` is met, regardless of whether any reviewers have declined a request. Defaults to `true`.
     */
    canApplyDeclinedChanges?: boolean;
    /**
     * Set to `true` if requesters can approve or decline their own request. They may always comment. Defaults to `false`.
     */
    canReviewOwnRequest?: boolean;
    /**
     * The number of approvals required before an approval request can be applied. This number must be between 1 and 5. Defaults to 1.
     */
    minNumApprovals?: number;
    /**
     * Set to `true` for changes to flags in this environment to require approval. You may only set `required` to true if `requiredApprovalTags` is not set and vice versa. Defaults to `false`.
     */
    required?: boolean;
    /**
     * An array of tags used to specify which flags with those tags require approval. You may only set `requiredApprovalTags` if `required` is not set to `true` and vice versa.
     */
    requiredApprovalTags?: string[];
}

export interface RelayProxyConfigurationPolicy {
    /**
     * The list of action specifiers defining the actions to which the rule policy applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions?: string[];
    /**
     * - Either `allow` or `deny`. This argument defines whether the rule policy allows or denies access to the named resources and actions.
     */
    effect: string;
    /**
     * The list of action specifiers defining the actions to which the rule policy does not apply. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    notActions?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the rule policy does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: string[];
    /**
     * - The list of resource specifiers defining the resources to which the rule policy applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: string[];
}

export interface SegmentRule {
    /**
     * The attribute by which to group users together.
     */
    bucketBy?: string;
    /**
     * List of nested custom rule clause blocks. To learn more, read Nested Clauses Blocks.
     */
    clauses?: outputs.SegmentRuleClause[];
    /**
     * The integer weight of the rule (between 1 and 100000).
     */
    weight?: number;
}

export interface SegmentRuleClause {
    /**
     * The user attribute to operate on.
     */
    attribute: string;
    /**
     * Whether to negate the rule clause.
     */
    negate?: boolean;
    /**
     * The operator associated with the rule clause. Available options are `in`, `endsWith`, `startsWith`, `matches`, `contains`, `lessThan`, `lessThanOrEqual`, `greaterThanOrEqual`, `before`, `after`, `segmentMatch`, `semVerEqual`, `semVerLessThan`, and `semVerGreaterThan`.
     */
    op: string;
    /**
     * The type for each of the clause's values. Available types are `boolean`, `string`, and `number`. If omitted, `valueType` defaults to `string`.
     */
    valueType?: string;
    /**
     * The list of values associated with the rule clause.
     */
    values: string[];
}

export interface WebhookStatement {
    /**
     * The list of action specifiers defining the actions to which the statement applies. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    actions?: string[];
    /**
     * Either `allow` or `deny`. This argument defines whether the statement allows or denies access to the named resources and actions.
     */
    effect: string;
    /**
     * The list of action specifiers defining the actions to which the statement does not apply. Either `actions` or `notActions` must be specified. For a list of available actions read [Actions reference](https://docs.launchdarkly.com/home/account-security/custom-roles/actions#actions-reference).
     */
    notActions?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement does not apply. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    notResources?: string[];
    /**
     * The list of resource specifiers defining the resources to which the statement applies. Either `resources` or `notResources` must be specified. For a list of available resources read [Understanding resource types and scopes](https://docs.launchdarkly.com/home/account-security/custom-roles/resources#understanding-resource-types-and-scopes).
     */
    resources?: string[];
}

