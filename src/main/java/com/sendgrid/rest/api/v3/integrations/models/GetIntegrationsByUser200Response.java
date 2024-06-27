/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Integrations API
 * Integrations allows you to connect your SendGrid applications with third-party services and forward SendGrid email events to those external applications. Currently, Integrations supports event forwarding to [Segment](https://segment.com/docs). You can use this API to create, delete, view, and update your Integrations.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.integrations.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.integrations.models.Integration;
import java.util.List;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class GetIntegrationsByUser200Response {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("result")
    @Getter
    @Setter
    private List<Integration> result;

    public GetIntegrationsByUser200Response() {}

    private GetIntegrationsByUser200Response(Builder builder) {
        this.result = builder.result;
    }

    // Builder class for constructing object
    public static class Builder {

        private List<Integration> result;

        public Builder() {}

        public Builder result(List<Integration> result) {
            this.result = result;
            return this;
        }

        public GetIntegrationsByUser200Response build() {
            return new GetIntegrationsByUser200Response(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            GetIntegrationsByUser200Response.class.getSimpleName() + "(",
            ")"
        );
        if (result != null) joiner.add("result=" + result);
        return joiner.toString();
    }
}
