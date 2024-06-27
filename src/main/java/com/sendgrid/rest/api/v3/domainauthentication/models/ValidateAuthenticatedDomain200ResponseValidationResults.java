/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Domain Authentication API
 * The Twilio SendGrid Domain Authentication API allows you to manage your authenticated domains and their settings.  Domain Authentication is a required step when setting up your Twilio SendGrid account because it's essential to ensuring the deliverability of your email. Domain Authentication signals trustworthiness to email inbox providers and your recipients by approving SendGrid to send email on behalf of your domain. For more information, see [**How to Set Up Domain Authentication**](https://sendgrid.com/docs/ui/account-and-settings/how-to-set-up-domain-authentication/).  Each user may have a maximum of 3,000 authenticated domains and 3,000 link brandings. This limit is at the user level, meaning each Subuser belonging to a parent account may have its own 3,000 authenticated domains and 3,000 link brandings.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.domainauthentication.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.domainauthentication.models.ValidateAuthenticatedDomain200ResponseValidationResultsDkim1;
import com.sendgrid.rest.api.v3.domainauthentication.models.ValidateAuthenticatedDomain200ResponseValidationResultsMailCname;
import com.sendgrid.rest.api.v3.domainauthentication.models.ValidateAuthenticatedDomain200ResponseValidationResultsSpf;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ValidateAuthenticatedDomain200ResponseValidationResults {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mail_cname")
    @Getter
    @Setter
    private ValidateAuthenticatedDomain200ResponseValidationResultsMailCname mailCname;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dkim1")
    @Getter
    @Setter
    private ValidateAuthenticatedDomain200ResponseValidationResultsDkim1 dkim1;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("dkim2")
    @Getter
    @Setter
    private ValidateAuthenticatedDomain200ResponseValidationResultsDkim1 dkim2;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("spf")
    @Getter
    @Setter
    private ValidateAuthenticatedDomain200ResponseValidationResultsSpf spf;

    public ValidateAuthenticatedDomain200ResponseValidationResults() {}

    private ValidateAuthenticatedDomain200ResponseValidationResults(
        Builder builder
    ) {
        this.mailCname = builder.mailCname;
        this.dkim1 = builder.dkim1;
        this.dkim2 = builder.dkim2;
        this.spf = builder.spf;
    }

    // Builder class for constructing object
    public static class Builder {

        private ValidateAuthenticatedDomain200ResponseValidationResultsMailCname mailCname;
        private ValidateAuthenticatedDomain200ResponseValidationResultsDkim1 dkim1;
        private ValidateAuthenticatedDomain200ResponseValidationResultsDkim1 dkim2;
        private ValidateAuthenticatedDomain200ResponseValidationResultsSpf spf;

        public Builder() {}

        public Builder mailCname(
            ValidateAuthenticatedDomain200ResponseValidationResultsMailCname mailCname
        ) {
            this.mailCname = mailCname;
            return this;
        }

        public Builder dkim1(
            ValidateAuthenticatedDomain200ResponseValidationResultsDkim1 dkim1
        ) {
            this.dkim1 = dkim1;
            return this;
        }

        public Builder dkim2(
            ValidateAuthenticatedDomain200ResponseValidationResultsDkim1 dkim2
        ) {
            this.dkim2 = dkim2;
            return this;
        }

        public Builder spf(
            ValidateAuthenticatedDomain200ResponseValidationResultsSpf spf
        ) {
            this.spf = spf;
            return this;
        }

        public ValidateAuthenticatedDomain200ResponseValidationResults build() {
            return new ValidateAuthenticatedDomain200ResponseValidationResults(
                this
            );
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            ValidateAuthenticatedDomain200ResponseValidationResults.class.getSimpleName() +
            "(",
            ")"
        );
        if (mailCname != null) joiner.add("mailCname=" + mailCname);
        if (dkim1 != null) joiner.add("dkim1=" + dkim1);
        if (dkim2 != null) joiner.add("dkim2=" + dkim2);
        if (spf != null) joiner.add("spf=" + spf);
        return joiner.toString();
    }
}
