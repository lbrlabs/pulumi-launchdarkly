// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.launchdarkly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.launchdarkly.inputs.GetMetricUrlArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetricArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetricArgs Empty = new GetMetricArgs();

    /**
     * The description of the metric&#39;s purpose.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the metric&#39;s purpose.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The event key to watch for `custom` metrics.
     * 
     */
    @Import(name="eventKey")
    private @Nullable Output<String> eventKey;

    /**
     * @return The event key to watch for `custom` metrics.
     * 
     */
    public Optional<Output<String>> eventKey() {
        return Optional.ofNullable(this.eventKey);
    }

    @Import(name="isActive")
    private @Nullable Output<Boolean> isActive;

    public Optional<Output<Boolean>> isActive() {
        return Optional.ofNullable(this.isActive);
    }

    @Import(name="isNumeric")
    private @Nullable Output<Boolean> isNumeric;

    public Optional<Output<Boolean>> isNumeric() {
        return Optional.ofNullable(this.isNumeric);
    }

    /**
     * The metric&#39;s unique key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The metric&#39;s unique key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The metric type. Available choices are `click`, `custom`, and `pageview`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The metric type. Available choices are `click`, `custom`, and `pageview`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    @Import(name="maintainerId")
    private @Nullable Output<String> maintainerId;

    public Optional<Output<String>> maintainerId() {
        return Optional.ofNullable(this.maintainerId);
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the metric.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The metric&#39;s project key.
     * 
     */
    @Import(name="projectKey", required=true)
    private Output<String> projectKey;

    /**
     * @return The metric&#39;s project key.
     * 
     */
    public Output<String> projectKey() {
        return this.projectKey;
    }

    /**
     * The CSS selector for `click` metrics.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return The CSS selector for `click` metrics.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * The success criteria for numeric `custom` metrics.
     * 
     */
    @Import(name="successCriteria")
    private @Nullable Output<String> successCriteria;

    /**
     * @return The success criteria for numeric `custom` metrics.
     * 
     */
    public Optional<Output<String>> successCriteria() {
        return Optional.ofNullable(this.successCriteria);
    }

    /**
     * Set of tags associated with the metric.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Set of tags associated with the metric.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The unit for numeric `custom` metrics.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    /**
     * @return The unit for numeric `custom` metrics.
     * 
     */
    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    /**
     * Which URLs the metric watches.
     * 
     */
    @Import(name="urls")
    private @Nullable Output<List<GetMetricUrlArgs>> urls;

    /**
     * @return Which URLs the metric watches.
     * 
     */
    public Optional<Output<List<GetMetricUrlArgs>>> urls() {
        return Optional.ofNullable(this.urls);
    }

    private GetMetricArgs() {}

    private GetMetricArgs(GetMetricArgs $) {
        this.description = $.description;
        this.eventKey = $.eventKey;
        this.isActive = $.isActive;
        this.isNumeric = $.isNumeric;
        this.key = $.key;
        this.kind = $.kind;
        this.maintainerId = $.maintainerId;
        this.name = $.name;
        this.projectKey = $.projectKey;
        this.selector = $.selector;
        this.successCriteria = $.successCriteria;
        this.tags = $.tags;
        this.unit = $.unit;
        this.urls = $.urls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetricArgs $;

        public Builder() {
            $ = new GetMetricArgs();
        }

        public Builder(GetMetricArgs defaults) {
            $ = new GetMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the metric&#39;s purpose.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the metric&#39;s purpose.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eventKey The event key to watch for `custom` metrics.
         * 
         * @return builder
         * 
         */
        public Builder eventKey(@Nullable Output<String> eventKey) {
            $.eventKey = eventKey;
            return this;
        }

        /**
         * @param eventKey The event key to watch for `custom` metrics.
         * 
         * @return builder
         * 
         */
        public Builder eventKey(String eventKey) {
            return eventKey(Output.of(eventKey));
        }

        public Builder isActive(@Nullable Output<Boolean> isActive) {
            $.isActive = isActive;
            return this;
        }

        public Builder isActive(Boolean isActive) {
            return isActive(Output.of(isActive));
        }

        public Builder isNumeric(@Nullable Output<Boolean> isNumeric) {
            $.isNumeric = isNumeric;
            return this;
        }

        public Builder isNumeric(Boolean isNumeric) {
            return isNumeric(Output.of(isNumeric));
        }

        /**
         * @param key The metric&#39;s unique key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The metric&#39;s unique key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param kind The metric type. Available choices are `click`, `custom`, and `pageview`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The metric type. Available choices are `click`, `custom`, and `pageview`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder maintainerId(@Nullable Output<String> maintainerId) {
            $.maintainerId = maintainerId;
            return this;
        }

        public Builder maintainerId(String maintainerId) {
            return maintainerId(Output.of(maintainerId));
        }

        /**
         * @param name The name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the metric.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectKey The metric&#39;s project key.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(Output<String> projectKey) {
            $.projectKey = projectKey;
            return this;
        }

        /**
         * @param projectKey The metric&#39;s project key.
         * 
         * @return builder
         * 
         */
        public Builder projectKey(String projectKey) {
            return projectKey(Output.of(projectKey));
        }

        /**
         * @param selector The CSS selector for `click` metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector The CSS selector for `click` metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param successCriteria The success criteria for numeric `custom` metrics.
         * 
         * @return builder
         * 
         */
        public Builder successCriteria(@Nullable Output<String> successCriteria) {
            $.successCriteria = successCriteria;
            return this;
        }

        /**
         * @param successCriteria The success criteria for numeric `custom` metrics.
         * 
         * @return builder
         * 
         */
        public Builder successCriteria(String successCriteria) {
            return successCriteria(Output.of(successCriteria));
        }

        /**
         * @param tags Set of tags associated with the metric.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Set of tags associated with the metric.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Set of tags associated with the metric.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param unit The unit for numeric `custom` metrics.
         * 
         * @return builder
         * 
         */
        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The unit for numeric `custom` metrics.
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param urls Which URLs the metric watches.
         * 
         * @return builder
         * 
         */
        public Builder urls(@Nullable Output<List<GetMetricUrlArgs>> urls) {
            $.urls = urls;
            return this;
        }

        /**
         * @param urls Which URLs the metric watches.
         * 
         * @return builder
         * 
         */
        public Builder urls(List<GetMetricUrlArgs> urls) {
            return urls(Output.of(urls));
        }

        /**
         * @param urls Which URLs the metric watches.
         * 
         * @return builder
         * 
         */
        public Builder urls(GetMetricUrlArgs... urls) {
            return urls(List.of(urls));
        }

        public GetMetricArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.projectKey = Objects.requireNonNull($.projectKey, "expected parameter 'projectKey' to be non-null");
            return $;
        }
    }

}