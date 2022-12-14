// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.launchdarkly.outputs.GetWebhookStatement;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebhookResult {
    private String id;
    /**
     * @return The webhook&#39;s human-readable name.
     * 
     */
    private @Nullable String name;
    /**
     * @return Whether the webhook is enabled.
     * 
     */
    private Boolean on;
    /**
     * @return The secret used to sign the webhook.
     * 
     */
    private @Nullable String secret;
    /**
     * @return List of policy statement blocks used to filter webhook events. For more information on webhook policy filters read [Adding a policy filter](https://docs.launchdarkly.com/integrations/webhooks#adding-a-policy-filter). To learn more, read Policy Statement Blocks.
     * 
     */
    private @Nullable List<GetWebhookStatement> statements;
    /**
     * @return Set of tags associated with the webhook.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return The URL of the remote webhook.
     * 
     */
    private String url;

    private GetWebhookResult() {}
    public String id() {
        return this.id;
    }
    /**
     * @return The webhook&#39;s human-readable name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Whether the webhook is enabled.
     * 
     */
    public Boolean on() {
        return this.on;
    }
    /**
     * @return The secret used to sign the webhook.
     * 
     */
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * @return List of policy statement blocks used to filter webhook events. For more information on webhook policy filters read [Adding a policy filter](https://docs.launchdarkly.com/integrations/webhooks#adding-a-policy-filter). To learn more, read Policy Statement Blocks.
     * 
     */
    public List<GetWebhookStatement> statements() {
        return this.statements == null ? List.of() : this.statements;
    }
    /**
     * @return Set of tags associated with the webhook.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The URL of the remote webhook.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String name;
        private Boolean on;
        private @Nullable String secret;
        private @Nullable List<GetWebhookStatement> statements;
        private @Nullable List<String> tags;
        private String url;
        public Builder() {}
        public Builder(GetWebhookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.on = defaults.on;
    	      this.secret = defaults.secret;
    	      this.statements = defaults.statements;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder on(Boolean on) {
            this.on = Objects.requireNonNull(on);
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder statements(@Nullable List<GetWebhookStatement> statements) {
            this.statements = statements;
            return this;
        }
        public Builder statements(GetWebhookStatement... statements) {
            return statements(List.of(statements));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetWebhookResult build() {
            final var o = new GetWebhookResult();
            o.id = id;
            o.name = name;
            o.on = on;
            o.secret = secret;
            o.statements = statements;
            o.tags = tags;
            o.url = url;
            return o;
        }
    }
}
