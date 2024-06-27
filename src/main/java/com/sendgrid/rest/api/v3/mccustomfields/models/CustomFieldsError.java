/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Marketing Campaigns Custom Fields API
 * The Twilio SendGrid Marketing Campaigns Custom Fields API allows you to add extra information about your marketing contacts that is relevant to your needs. For example, a fashion retailer might create a custom field for customers' shoe sizes, an ice cream shop might store customers' favorite flavors in a custom field, and you can create custom fields that make sense for your business.  With custom fields, you can also create [segments](https://docs.sendgrid.com/api-reference/segmenting-contacts-v2/) based on custom fields values. Your custom fields are completely customizable to the use-cases and user information that you need.  You can also manage your Custom Fields using the SendGrid application user interface. See [**Using Custom Fields**](https://docs.sendgrid.com/ui/managing-contacts/custom-fields) for more information, including a list of Reserved Fields. You can also manage your custom fields in the [Marketing Campaigns application user interface](https://mc.sendgrid.com/custom-fields).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.mccustomfields.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CustomFieldsError {

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
    @JsonProperty("error_id")
    @Getter
    @Setter
    private String errorId;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("parameter")
    @Getter
    @Setter
    private String parameter;

    public CustomFieldsError() {}

    private CustomFieldsError(Builder builder) {
        this.message = builder.message;
        this.field = builder.field;
        this.errorId = builder.errorId;
        this.parameter = builder.parameter;
    }

    // Builder class for constructing object
    public static class Builder {

        private String message;
        private String field;
        private String errorId;
        private String parameter;

        public Builder(String message) {
            this.message = message;
        }

        public Builder field(String field) {
            this.field = field;
            return this;
        }

        public Builder errorId(String errorId) {
            this.errorId = errorId;
            return this;
        }

        public Builder parameter(String parameter) {
            this.parameter = parameter;
            return this;
        }

        public CustomFieldsError build() {
            return new CustomFieldsError(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            CustomFieldsError.class.getSimpleName() + "(",
            ")"
        );
        if (message != null) joiner.add("message=" + message);
        if (field != null) joiner.add("field=" + field);
        if (errorId != null) joiner.add("errorId=" + errorId);
        if (parameter != null) joiner.add("parameter=" + parameter);
        return joiner.toString();
    }
}
