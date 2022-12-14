// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTeamMaintainer {
    private String email;
    private String firstName;
    private String id;
    private String lastName;
    private String role;

    private GetTeamMaintainer() {}
    public String email() {
        return this.email;
    }
    public String firstName() {
        return this.firstName;
    }
    public String id() {
        return this.id;
    }
    public String lastName() {
        return this.lastName;
    }
    public String role() {
        return this.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamMaintainer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String firstName;
        private String id;
        private String lastName;
        private String role;
        public Builder() {}
        public Builder(GetTeamMaintainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.lastName = defaults.lastName;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public GetTeamMaintainer build() {
            final var o = new GetTeamMaintainer();
            o.email = email;
            o.firstName = firstName;
            o.id = id;
            o.lastName = lastName;
            o.role = role;
            return o;
        }
    }
}
