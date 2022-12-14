// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamMemberPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamMemberPlainArgs Empty = new GetTeamMemberPlainArgs();

    /**
     * The unique email address associated with the team member.
     * 
     */
    @Import(name="email", required=true)
    private String email;

    /**
     * @return The unique email address associated with the team member.
     * 
     */
    public String email() {
        return this.email;
    }

    /**
     * The 24 character alphanumeric ID of the team member.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The 24 character alphanumeric ID of the team member.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetTeamMemberPlainArgs() {}

    private GetTeamMemberPlainArgs(GetTeamMemberPlainArgs $) {
        this.email = $.email;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamMemberPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamMemberPlainArgs $;

        public Builder() {
            $ = new GetTeamMemberPlainArgs();
        }

        public Builder(GetTeamMemberPlainArgs defaults) {
            $ = new GetTeamMemberPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The unique email address associated with the team member.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            $.email = email;
            return this;
        }

        /**
         * @param id The 24 character alphanumeric ID of the team member.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetTeamMemberPlainArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            return $;
        }
    }

}
