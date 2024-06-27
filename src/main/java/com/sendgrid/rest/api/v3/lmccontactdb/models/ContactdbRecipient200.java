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
import com.sendgrid.rest.api.v3.lmccontactdb.models.ContactdbRecipient200RecipientsInner;
import java.util.List;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ContactdbRecipient200 {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("recipients")
    @Getter
    @Setter
    private List<ContactdbRecipient200RecipientsInner> recipients;

    public ContactdbRecipient200() {}

    private ContactdbRecipient200(Builder builder) {
        this.recipients = builder.recipients;
    }

    // Builder class for constructing object
    public static class Builder {

        private List<ContactdbRecipient200RecipientsInner> recipients;

        public Builder() {}

        public Builder recipients(
            List<ContactdbRecipient200RecipientsInner> recipients
        ) {
            this.recipients = recipients;
            return this;
        }

        public ContactdbRecipient200 build() {
            return new ContactdbRecipient200(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            ContactdbRecipient200.class.getSimpleName() + "(",
            ")"
        );
        if (recipients != null) joiner.add("recipients=" + recipients);
        return joiner.toString();
    }
}
