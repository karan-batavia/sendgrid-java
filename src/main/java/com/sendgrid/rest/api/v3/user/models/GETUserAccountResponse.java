/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid User API
 * The Twilio SendGrid User API allows you to modify the settings of a SendGrid user account such as the user's email address or username. Keeping your user profile up to date helps SendGrid verify who you are and share important communications with you.  See [**Account Details**](https://docs.sendgrid.com/ui/account-and-settings/account) for more information. You can also manage your user settings in the [SendGrid application user interface](https://app.sendgrid.com/account/details).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.user.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.user.models.Type;
import java.math.BigDecimal;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class GETUserAccountResponse {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("type")
    @Getter
    @Setter
    private Type type;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("reputation")
    @Getter
    @Setter
    private BigDecimal reputation;

    public GETUserAccountResponse() {}

    private GETUserAccountResponse(Builder builder) {
        this.type = builder.type;
        this.reputation = builder.reputation;
    }

    // Builder class for constructing object
    public static class Builder {

        private Type type;
        private BigDecimal reputation;

        public Builder(Type type, BigDecimal reputation) {
            this.type = type;
            this.reputation = reputation;
        }

        public GETUserAccountResponse build() {
            return new GETUserAccountResponse(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            GETUserAccountResponse.class.getSimpleName() + "(",
            ")"
        );
        if (type != null) joiner.add("type=" + type);
        if (reputation != null) joiner.add("reputation=" + reputation);
        return joiner.toString();
    }
}
