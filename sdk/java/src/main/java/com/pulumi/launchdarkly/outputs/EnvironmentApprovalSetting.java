// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentApprovalSetting {
    /**
     * @return Set to `true` if changes can be applied as long as the `min_num_approvals` is met, regardless of whether any reviewers have declined a request. Defaults to `true`.
     * 
     */
    private @Nullable Boolean canApplyDeclinedChanges;
    /**
     * @return Set to `true` if requesters can approve or decline their own request. They may always comment. Defaults to `false`.
     * 
     */
    private @Nullable Boolean canReviewOwnRequest;
    /**
     * @return The number of approvals required before an approval request can be applied. This number must be between 1 and 5. Defaults to 1.
     * 
     */
    private @Nullable Integer minNumApprovals;
    /**
     * @return Set to `true` for changes to flags in this environment to require approval. You may only set `required` to true if `required_approval_tags` is not set and vice versa. Defaults to `false`.
     * 
     */
    private @Nullable Boolean required;
    /**
     * @return An array of tags used to specify which flags with those tags require approval. You may only set `required_approval_tags` if `required` is not set to `true` and vice versa.
     * 
     */
    private @Nullable List<String> requiredApprovalTags;

    private EnvironmentApprovalSetting() {}
    /**
     * @return Set to `true` if changes can be applied as long as the `min_num_approvals` is met, regardless of whether any reviewers have declined a request. Defaults to `true`.
     * 
     */
    public Optional<Boolean> canApplyDeclinedChanges() {
        return Optional.ofNullable(this.canApplyDeclinedChanges);
    }
    /**
     * @return Set to `true` if requesters can approve or decline their own request. They may always comment. Defaults to `false`.
     * 
     */
    public Optional<Boolean> canReviewOwnRequest() {
        return Optional.ofNullable(this.canReviewOwnRequest);
    }
    /**
     * @return The number of approvals required before an approval request can be applied. This number must be between 1 and 5. Defaults to 1.
     * 
     */
    public Optional<Integer> minNumApprovals() {
        return Optional.ofNullable(this.minNumApprovals);
    }
    /**
     * @return Set to `true` for changes to flags in this environment to require approval. You may only set `required` to true if `required_approval_tags` is not set and vice versa. Defaults to `false`.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    /**
     * @return An array of tags used to specify which flags with those tags require approval. You may only set `required_approval_tags` if `required` is not set to `true` and vice versa.
     * 
     */
    public List<String> requiredApprovalTags() {
        return this.requiredApprovalTags == null ? List.of() : this.requiredApprovalTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentApprovalSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean canApplyDeclinedChanges;
        private @Nullable Boolean canReviewOwnRequest;
        private @Nullable Integer minNumApprovals;
        private @Nullable Boolean required;
        private @Nullable List<String> requiredApprovalTags;
        public Builder() {}
        public Builder(EnvironmentApprovalSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canApplyDeclinedChanges = defaults.canApplyDeclinedChanges;
    	      this.canReviewOwnRequest = defaults.canReviewOwnRequest;
    	      this.minNumApprovals = defaults.minNumApprovals;
    	      this.required = defaults.required;
    	      this.requiredApprovalTags = defaults.requiredApprovalTags;
        }

        @CustomType.Setter
        public Builder canApplyDeclinedChanges(@Nullable Boolean canApplyDeclinedChanges) {
            this.canApplyDeclinedChanges = canApplyDeclinedChanges;
            return this;
        }
        @CustomType.Setter
        public Builder canReviewOwnRequest(@Nullable Boolean canReviewOwnRequest) {
            this.canReviewOwnRequest = canReviewOwnRequest;
            return this;
        }
        @CustomType.Setter
        public Builder minNumApprovals(@Nullable Integer minNumApprovals) {
            this.minNumApprovals = minNumApprovals;
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        @CustomType.Setter
        public Builder requiredApprovalTags(@Nullable List<String> requiredApprovalTags) {
            this.requiredApprovalTags = requiredApprovalTags;
            return this;
        }
        public Builder requiredApprovalTags(String... requiredApprovalTags) {
            return requiredApprovalTags(List.of(requiredApprovalTags));
        }
        public EnvironmentApprovalSetting build() {
            final var o = new EnvironmentApprovalSetting();
            o.canApplyDeclinedChanges = canApplyDeclinedChanges;
            o.canReviewOwnRequest = canReviewOwnRequest;
            o.minNumApprovals = minNumApprovals;
            o.required = required;
            o.requiredApprovalTags = requiredApprovalTags;
            return o;
        }
    }
}