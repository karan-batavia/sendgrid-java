/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Marketing Campaigns Contacts API
 * The Twilio SendGrid Marketing Campaigns Contacts API allows you to manage all of your marketing contacts programmatically. You can also import and export contacts using this API. The Contacts API allows you to associate contacts with lists and segments; however, to manage the lists and segments themselves, see the [Lists API](https://docs.sendgrid.com/api-reference/lists/) and [Segments API](https://docs.sendgrid.com/api-reference/segmenting-contacts-v2/).  You can also manage your marketing contacts with the [Marketing Campaigns application user interface](https://mc.sendgrid.com/contacts). See [**How to Send Email with New Marketing Campaigns**](https://docs.sendgrid.com/ui/sending-email/how-to-send-email-with-marketing-campaigns) for more information.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.mccontacts.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.mccontacts.models.ContactImportResults;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ContactImport {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("id")
    @Getter
    @Setter
    private String id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("status")
    @Getter
    @Setter
    private String status;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("job_type")
    @Getter
    @Setter
    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("results")
    @Getter
    @Setter
    private ContactImportResults results;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("started_at")
    @Getter
    @Setter
    private String startedAt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("finished_at")
    @Getter
    @Setter
    private String finishedAt;

    public ContactImport() {}

    private ContactImport(Builder builder) {
        this.id = builder.id;
        this.status = builder.status;
        this.jobType = builder.jobType;
        this.results = builder.results;
        this.startedAt = builder.startedAt;
        this.finishedAt = builder.finishedAt;
    }

    // Builder class for constructing object
    public static class Builder {

        private String id;
        private String status;
        private String jobType;
        private ContactImportResults results;
        private String startedAt;
        private String finishedAt;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        public Builder results(ContactImportResults results) {
            this.results = results;
            return this;
        }

        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        public ContactImport build() {
            return new ContactImport(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            ContactImport.class.getSimpleName() + "(",
            ")"
        );
        if (id != null) joiner.add("id=" + id);
        if (status != null) joiner.add("status=" + status);
        if (jobType != null) joiner.add("jobType=" + jobType);
        if (results != null) joiner.add("results=" + results);
        if (startedAt != null) joiner.add("startedAt=" + startedAt);
        if (finishedAt != null) joiner.add("finishedAt=" + finishedAt);
        return joiner.toString();
    }
}
