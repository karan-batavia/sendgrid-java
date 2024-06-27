/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Marketing Campaigns Single Sends API
 * The Twilio SendGrid Single Sends API allows you to create, manage, and send Single Sends. You can also search Single Sends and retrieve statistics about them to help you maintain, alter, and further develop your campaigns.  A Single Send is a one-time non-automated email message delivered to a list or segment of your audience. A Single Send may be sent immediately or scheduled for future delivery.  Single Sends can serve many use cases, including promotional offers, engagement campaigns, newsletters, announcements, legal notices, or policy updates. You can also create and manage Single Sends in the [Marketing Campaigns application user interface](https://mc.sendgrid.com/single-sends).  The Single Sends API changed on May 6, 2020. See [**Single Sends 2020 Update**](https://docs.sendgrid.com/for-developers/sending-email/single-sends-2020-update) for more information.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.mcsinglesends.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.mcsinglesends.models.Type;
import com.sendgrid.rest.api.v3.mcsinglesends.models.WinnerCriteria;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class AbTestSummary {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("type")
    @Getter
    @Setter
    private Type type;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("winner_criteria")
    @Getter
    @Setter
    private WinnerCriteria winnerCriteria;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("test_percentage")
    @Getter
    @Setter
    private Integer testPercentage;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("duration")
    @Getter
    @Setter
    private String duration;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("winning_template_id")
    @Getter
    @Setter
    private String winningTemplateId;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("winner_selected_at")
    @Getter
    @Setter
    private String winnerSelectedAt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("expiration_date")
    @Getter
    @Setter
    private String expirationDate;

    public AbTestSummary() {}

    private AbTestSummary(Builder builder) {
        this.type = builder.type;
        this.winnerCriteria = builder.winnerCriteria;
        this.testPercentage = builder.testPercentage;
        this.duration = builder.duration;
        this.winningTemplateId = builder.winningTemplateId;
        this.winnerSelectedAt = builder.winnerSelectedAt;
        this.expirationDate = builder.expirationDate;
    }

    // Builder class for constructing object
    public static class Builder {

        private Type type;
        private WinnerCriteria winnerCriteria;
        private Integer testPercentage;
        private String duration;
        private String winningTemplateId;
        private String winnerSelectedAt;
        private String expirationDate;

        public Builder(
            Type type,
            WinnerCriteria winnerCriteria,
            Integer testPercentage,
            String duration,
            String winningTemplateId,
            String winnerSelectedAt,
            String expirationDate
        ) {
            this.type = type;
            this.winnerCriteria = winnerCriteria;
            this.testPercentage = testPercentage;
            this.duration = duration;
            this.winningTemplateId = winningTemplateId;
            this.winnerSelectedAt = winnerSelectedAt;
            this.expirationDate = expirationDate;
        }

        public AbTestSummary build() {
            return new AbTestSummary(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            AbTestSummary.class.getSimpleName() + "(",
            ")"
        );
        if (type != null) joiner.add("type=" + type);
        if (winnerCriteria != null) joiner.add(
            "winnerCriteria=" + winnerCriteria
        );
        if (testPercentage != null) joiner.add(
            "testPercentage=" + testPercentage
        );
        if (duration != null) joiner.add("duration=" + duration);
        if (winningTemplateId != null) joiner.add(
            "winningTemplateId=" + winningTemplateId
        );
        if (winnerSelectedAt != null) joiner.add(
            "winnerSelectedAt=" + winnerSelectedAt
        );
        if (expirationDate != null) joiner.add(
            "expirationDate=" + expirationDate
        );
        return joiner.toString();
    }
}
