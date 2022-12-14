// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentApprovalSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetEnvironmentApprovalSettingArgs Empty = new GetEnvironmentApprovalSettingArgs();

    @Import(name="canApplyDeclinedChanges")
    private @Nullable Output<Boolean> canApplyDeclinedChanges;

    public Optional<Output<Boolean>> canApplyDeclinedChanges() {
        return Optional.ofNullable(this.canApplyDeclinedChanges);
    }

    @Import(name="canReviewOwnRequest")
    private @Nullable Output<Boolean> canReviewOwnRequest;

    public Optional<Output<Boolean>> canReviewOwnRequest() {
        return Optional.ofNullable(this.canReviewOwnRequest);
    }

    @Import(name="minNumApprovals")
    private @Nullable Output<Integer> minNumApprovals;

    public Optional<Output<Integer>> minNumApprovals() {
        return Optional.ofNullable(this.minNumApprovals);
    }

    @Import(name="required")
    private @Nullable Output<Boolean> required;

    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    @Import(name="requiredApprovalTags")
    private @Nullable Output<List<String>> requiredApprovalTags;

    public Optional<Output<List<String>>> requiredApprovalTags() {
        return Optional.ofNullable(this.requiredApprovalTags);
    }

    private GetEnvironmentApprovalSettingArgs() {}

    private GetEnvironmentApprovalSettingArgs(GetEnvironmentApprovalSettingArgs $) {
        this.canApplyDeclinedChanges = $.canApplyDeclinedChanges;
        this.canReviewOwnRequest = $.canReviewOwnRequest;
        this.minNumApprovals = $.minNumApprovals;
        this.required = $.required;
        this.requiredApprovalTags = $.requiredApprovalTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentApprovalSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentApprovalSettingArgs $;

        public Builder() {
            $ = new GetEnvironmentApprovalSettingArgs();
        }

        public Builder(GetEnvironmentApprovalSettingArgs defaults) {
            $ = new GetEnvironmentApprovalSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder canApplyDeclinedChanges(@Nullable Output<Boolean> canApplyDeclinedChanges) {
            $.canApplyDeclinedChanges = canApplyDeclinedChanges;
            return this;
        }

        public Builder canApplyDeclinedChanges(Boolean canApplyDeclinedChanges) {
            return canApplyDeclinedChanges(Output.of(canApplyDeclinedChanges));
        }

        public Builder canReviewOwnRequest(@Nullable Output<Boolean> canReviewOwnRequest) {
            $.canReviewOwnRequest = canReviewOwnRequest;
            return this;
        }

        public Builder canReviewOwnRequest(Boolean canReviewOwnRequest) {
            return canReviewOwnRequest(Output.of(canReviewOwnRequest));
        }

        public Builder minNumApprovals(@Nullable Output<Integer> minNumApprovals) {
            $.minNumApprovals = minNumApprovals;
            return this;
        }

        public Builder minNumApprovals(Integer minNumApprovals) {
            return minNumApprovals(Output.of(minNumApprovals));
        }

        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public Builder requiredApprovalTags(@Nullable Output<List<String>> requiredApprovalTags) {
            $.requiredApprovalTags = requiredApprovalTags;
            return this;
        }

        public Builder requiredApprovalTags(List<String> requiredApprovalTags) {
            return requiredApprovalTags(Output.of(requiredApprovalTags));
        }

        public Builder requiredApprovalTags(String... requiredApprovalTags) {
            return requiredApprovalTags(List.of(requiredApprovalTags));
        }

        public GetEnvironmentApprovalSettingArgs build() {
            return $;
        }
    }

}
