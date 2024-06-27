/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Marketing Campaigns Statistics API
 * The Marketing Campaigns Stats API allows you to retrieve statistics for both Automations and Single Sends. The statistics provided include bounces, clicks, opens, and more. You can export stats in CSV format for use in other applications. You can also retrieve Marketing Campaigns stats in the [Marketing Campaigns application user interface](https://mc.sendgrid.com/).  This API provides statistics for Marketing Campaigns only. For stats related to event tracking, please see the [Stats API](https://docs.sendgrid.com/api-reference/stats).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.mcstats.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Metrics {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("bounce_drops")
    @Getter
    @Setter
    private Integer bounceDrops;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("bounces")
    @Getter
    @Setter
    private Integer bounces;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("clicks")
    @Getter
    @Setter
    private Integer clicks;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("delivered")
    @Getter
    @Setter
    private Integer delivered;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("invalid_emails")
    @Getter
    @Setter
    private Integer invalidEmails;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("opens")
    @Getter
    @Setter
    private Integer opens;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("requests")
    @Getter
    @Setter
    private Integer requests;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("spam_report_drops")
    @Getter
    @Setter
    private Integer spamReportDrops;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("spam_reports")
    @Getter
    @Setter
    private Integer spamReports;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("unique_clicks")
    @Getter
    @Setter
    private Integer uniqueClicks;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("unique_opens")
    @Getter
    @Setter
    private Integer uniqueOpens;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("unsubscribes")
    @Getter
    @Setter
    private Integer unsubscribes;

    public Metrics() {}

    private Metrics(Builder builder) {
        this.bounceDrops = builder.bounceDrops;
        this.bounces = builder.bounces;
        this.clicks = builder.clicks;
        this.delivered = builder.delivered;
        this.invalidEmails = builder.invalidEmails;
        this.opens = builder.opens;
        this.requests = builder.requests;
        this.spamReportDrops = builder.spamReportDrops;
        this.spamReports = builder.spamReports;
        this.uniqueClicks = builder.uniqueClicks;
        this.uniqueOpens = builder.uniqueOpens;
        this.unsubscribes = builder.unsubscribes;
    }

    // Builder class for constructing object
    public static class Builder {

        private Integer bounceDrops;
        private Integer bounces;
        private Integer clicks;
        private Integer delivered;
        private Integer invalidEmails;
        private Integer opens;
        private Integer requests;
        private Integer spamReportDrops;
        private Integer spamReports;
        private Integer uniqueClicks;
        private Integer uniqueOpens;
        private Integer unsubscribes;

        public Builder(
            Integer bounceDrops,
            Integer bounces,
            Integer clicks,
            Integer delivered,
            Integer invalidEmails,
            Integer opens,
            Integer requests,
            Integer spamReportDrops,
            Integer spamReports,
            Integer uniqueClicks,
            Integer uniqueOpens,
            Integer unsubscribes
        ) {
            this.bounceDrops = bounceDrops;
            this.bounces = bounces;
            this.clicks = clicks;
            this.delivered = delivered;
            this.invalidEmails = invalidEmails;
            this.opens = opens;
            this.requests = requests;
            this.spamReportDrops = spamReportDrops;
            this.spamReports = spamReports;
            this.uniqueClicks = uniqueClicks;
            this.uniqueOpens = uniqueOpens;
            this.unsubscribes = unsubscribes;
        }

        public Metrics build() {
            return new Metrics(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            Metrics.class.getSimpleName() + "(",
            ")"
        );
        if (bounceDrops != null) joiner.add("bounceDrops=" + bounceDrops);
        if (bounces != null) joiner.add("bounces=" + bounces);
        if (clicks != null) joiner.add("clicks=" + clicks);
        if (delivered != null) joiner.add("delivered=" + delivered);
        if (invalidEmails != null) joiner.add("invalidEmails=" + invalidEmails);
        if (opens != null) joiner.add("opens=" + opens);
        if (requests != null) joiner.add("requests=" + requests);
        if (spamReportDrops != null) joiner.add(
            "spamReportDrops=" + spamReportDrops
        );
        if (spamReports != null) joiner.add("spamReports=" + spamReports);
        if (uniqueClicks != null) joiner.add("uniqueClicks=" + uniqueClicks);
        if (uniqueOpens != null) joiner.add("uniqueOpens=" + uniqueOpens);
        if (unsubscribes != null) joiner.add("unsubscribes=" + unsubscribes);
        return joiner.toString();
    }
}
