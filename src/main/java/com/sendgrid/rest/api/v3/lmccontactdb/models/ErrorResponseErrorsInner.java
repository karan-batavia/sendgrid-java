/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Legacy Marketing Campaigns Contacts API
 * The Twilio SendGrid Legacy Marketing Campaigns Contacts API allows you to manage your marketing contacts programmatically. This API is operational, but we recommend using the current version of Marketing Campaigns' [Contacts API](https://docs.sendgrid.com/api-reference/contacts/), [Lists API](https://docs.sendgrid.com/api-reference/lists/), and [Segments API](https://docs.sendgrid.com/api-reference/segmenting-contacts-v2/) to manage your contacts.  See [**Migrating from Legacy Marketing Campaigns**](https://docs.sendgrid.com/ui/sending-email/migrating-from-legacy-marketing-campaigns) for more information.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.lmccontactdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ErrorResponseErrorsInner {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("message")
    @Getter
    @Setter
    private String message;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("field")
    @Getter
    @Setter
    private String field;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("help")
    @Getter
    @Setter
    private Object help;

    public ErrorResponseErrorsInner() {}

    private ErrorResponseErrorsInner(Builder builder) {
        this.message = builder.message;
        this.field = builder.field;
        this.help = builder.help;
    }

    // Builder class for constructing object
    public static class Builder {

        private String message;
        private String field;
        private Object help;

        public Builder() {}

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder field(String field) {
            this.field = field;
            return this;
        }

        public Builder help(Object help) {
            this.help = help;
            return this;
        }

        public ErrorResponseErrorsInner build() {
            return new ErrorResponseErrorsInner(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            ErrorResponseErrorsInner.class.getSimpleName() + "(",
            ")"
        );
        if (message != null) joiner.add("message=" + message);
        if (field != null) joiner.add("field=" + field);
        if (help != null) joiner.add("help=" + help);
        return joiner.toString();
    }
}
