/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Marketing Campaigns Lists API
 * The Twilio SendGrid Marketing Campaigns Lists API allows you to manage your contacts lists programmatically. Lists are static collections of Marketing Campaigns contacts. You can use this API to interact with the list objects themselves. To add contacts to a list, you must use the [Contacts API](https://docs.sendgrid.com/api-reference/contacts/).  You can also manage your lists using the Contacts menu in the [Marketing Campaigns application user interface](https://mc.sendgrid.com/contacts). For more information about lists and best practices for building them, see [**Building your Contact Lists**](https://sendgrid.com/docs/ui/managing-contacts/building-your-contact-list/).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.mclists.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.mclists.models.SelfMetadata;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.StringJoiner;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ContactDetails {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("id")
    @Getter
    @Setter
    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("first_name")
    @Getter
    @Setter
    private String firstName;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("last_name")
    @Getter
    @Setter
    private String lastName;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("unique_name")
    @Getter
    @Setter
    private String uniqueName;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
    @Getter
    @Setter
    private String email;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("phone_number_id")
    @Getter
    @Setter
    private String phoneNumberId;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("external_id")
    @Getter
    @Setter
    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("anonymous_id")
    @Getter
    @Setter
    private String anonymousId;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("alternate_emails")
    @Getter
    @Setter
    private List<String> alternateEmails;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("address_line_1")
    @Getter
    @Setter
    private String addressLine1;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("address_line_2")
    @Getter
    @Setter
    private String addressLine2;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("city")
    @Getter
    @Setter
    private String city;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("state_province_region")
    @Getter
    @Setter
    private String stateProvinceRegion;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("country")
    @Getter
    @Setter
    private String country;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("postal_code")
    @Getter
    @Setter
    private String postalCode;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("phone_number")
    @Getter
    @Setter
    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("whatsapp")
    @Getter
    @Setter
    private String whatsapp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("line")
    @Getter
    @Setter
    private String line;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("facebook")
    @Getter
    @Setter
    private String facebook;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("list_ids")
    @Getter
    @Setter
    private List<UUID> listIds;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("segment_ids")
    @Getter
    @Setter
    private List<UUID> segmentIds;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("custom_fields")
    @Getter
    @Setter
    private Object customFields;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("created_at")
    @Getter
    @Setter
    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("updated_at")
    @Getter
    @Setter
    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("_metadata")
    @Getter
    @Setter
    private SelfMetadata metadata;

    public ContactDetails() {}

    private ContactDetails(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.uniqueName = builder.uniqueName;
        this.email = builder.email;
        this.phoneNumberId = builder.phoneNumberId;
        this.externalId = builder.externalId;
        this.anonymousId = builder.anonymousId;
        this.alternateEmails = builder.alternateEmails;
        this.addressLine1 = builder.addressLine1;
        this.addressLine2 = builder.addressLine2;
        this.city = builder.city;
        this.stateProvinceRegion = builder.stateProvinceRegion;
        this.country = builder.country;
        this.postalCode = builder.postalCode;
        this.phoneNumber = builder.phoneNumber;
        this.whatsapp = builder.whatsapp;
        this.line = builder.line;
        this.facebook = builder.facebook;
        this.listIds = builder.listIds;
        this.segmentIds = builder.segmentIds;
        this.customFields = builder.customFields;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.metadata = builder.metadata;
    }

    // Builder class for constructing object
    public static class Builder {

        private UUID id;
        private String firstName;
        private String lastName;
        private String uniqueName;
        private String email;
        private String phoneNumberId;
        private String externalId;
        private String anonymousId;
        private List<String> alternateEmails;
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String stateProvinceRegion;
        private String country;
        private String postalCode;
        private String phoneNumber;
        private String whatsapp;
        private String line;
        private String facebook;
        private List<UUID> listIds;
        private List<UUID> segmentIds;
        private Object customFields;
        private OffsetDateTime createdAt;
        private OffsetDateTime updatedAt;
        private SelfMetadata metadata;

        public Builder(
            UUID id,
            List<UUID> listIds,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt
        ) {
            this.id = id;
            this.listIds = listIds;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder uniqueName(String uniqueName) {
            this.uniqueName = uniqueName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }

        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder anonymousId(String anonymousId) {
            this.anonymousId = anonymousId;
            return this;
        }

        public Builder alternateEmails(List<String> alternateEmails) {
            this.alternateEmails = alternateEmails;
            return this;
        }

        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder stateProvinceRegion(String stateProvinceRegion) {
            this.stateProvinceRegion = stateProvinceRegion;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder whatsapp(String whatsapp) {
            this.whatsapp = whatsapp;
            return this;
        }

        public Builder line(String line) {
            this.line = line;
            return this;
        }

        public Builder facebook(String facebook) {
            this.facebook = facebook;
            return this;
        }

        public Builder segmentIds(List<UUID> segmentIds) {
            this.segmentIds = segmentIds;
            return this;
        }

        public Builder customFields(Object customFields) {
            this.customFields = customFields;
            return this;
        }

        public Builder metadata(SelfMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public ContactDetails build() {
            return new ContactDetails(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            ContactDetails.class.getSimpleName() + "(",
            ")"
        );
        if (id != null) joiner.add("id=" + id);
        if (firstName != null) joiner.add("firstName=" + firstName);
        if (lastName != null) joiner.add("lastName=" + lastName);
        if (uniqueName != null) joiner.add("uniqueName=" + uniqueName);
        if (email != null) joiner.add("email=" + email);
        if (phoneNumberId != null) joiner.add("phoneNumberId=" + phoneNumberId);
        if (externalId != null) joiner.add("externalId=" + externalId);
        if (anonymousId != null) joiner.add("anonymousId=" + anonymousId);
        if (alternateEmails != null) joiner.add(
            "alternateEmails=" + alternateEmails
        );
        if (addressLine1 != null) joiner.add("addressLine1=" + addressLine1);
        if (addressLine2 != null) joiner.add("addressLine2=" + addressLine2);
        if (city != null) joiner.add("city=" + city);
        if (stateProvinceRegion != null) joiner.add(
            "stateProvinceRegion=" + stateProvinceRegion
        );
        if (country != null) joiner.add("country=" + country);
        if (postalCode != null) joiner.add("postalCode=" + postalCode);
        if (phoneNumber != null) joiner.add("phoneNumber=" + phoneNumber);
        if (whatsapp != null) joiner.add("whatsapp=" + whatsapp);
        if (line != null) joiner.add("line=" + line);
        if (facebook != null) joiner.add("facebook=" + facebook);
        if (listIds != null) joiner.add("listIds=" + listIds);
        if (segmentIds != null) joiner.add("segmentIds=" + segmentIds);
        if (customFields != null) joiner.add("customFields=" + customFields);
        if (createdAt != null) joiner.add("createdAt=" + createdAt);
        if (updatedAt != null) joiner.add("updatedAt=" + updatedAt);
        if (metadata != null) joiner.add("metadata=" + metadata);
        return joiner.toString();
    }
}
