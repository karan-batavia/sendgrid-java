/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Marketing Campaigns Senders API
 * The Twilio SendGrid Marketing Campaigns Senders API allows you to create a verified sender from which your marketing emails will be sent. To ensure our customers maintain the best possible sender reputations and to uphold legitimate sending behavior, we require customers to verify their Senders. A Sender represents your “From” email address—the address your recipients will see as the sender of your emails.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.mcsenders.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.mcsenders.models.Sender;
import java.util.List;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ListSender200Response {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("results")
    @Getter
    @Setter
    private List<Sender> results;

    public ListSender200Response() {}

    private ListSender200Response(Builder builder) {
        this.results = builder.results;
    }

    // Builder class for constructing object
    public static class Builder {

        private List<Sender> results;

        public Builder() {}

        public Builder results(List<Sender> results) {
            this.results = results;
            return this;
        }

        public ListSender200Response build() {
            return new ListSender200Response(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            ListSender200Response.class.getSimpleName() + "(",
            ")"
        );
        if (results != null) joiner.add("results=" + results);
        return joiner.toString();
    }
}
