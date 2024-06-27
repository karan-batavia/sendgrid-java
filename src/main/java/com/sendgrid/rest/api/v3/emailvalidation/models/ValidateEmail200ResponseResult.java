/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Email Address Validation API
 * The Twilio SendGrid Email Address Validation API provides real-time detailed information on the validity of email addresses. You can integrate this validation process into your platform's signup form and customize the best use of email address validation for your use case.  Email Address Validation is available to [Email API Pro and Premier level accounts](https://sendgrid.com/pricing) only. Prior to upgrading your account to Pro or Premier, you will not see the option to create an Email Validation API key. An Email Validation API key is separate from and in addition to your other keys, including Full Access API keys.  You can use this API to: - Indicate to users that the address they have entered into a form is invalid. - Drop invalid email addresses from your database. - Suppress invalid email addresses from your sending to decrease your bounce rate.  See [**Email Address Validation**](https://docs.sendgrid.com/ui/managing-contacts/email-address-validation) for more information.  You can also view your Email Validation results and metrics in the Validation section of the [Twilio SendGrid application user interface](https://docs.sendgrid.com/ui/managing-contacts/email-address-validation).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.emailvalidation.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.emailvalidation.models.ValidateEmail200ResponseResultChecks;
import com.sendgrid.rest.api.v3.emailvalidation.models.Verdict;
import java.math.BigDecimal;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class ValidateEmail200ResponseResult {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("email")
    @Getter
    @Setter
    private String email;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("verdict")
    @Getter
    @Setter
    private Verdict verdict;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("score")
    @Getter
    @Setter
    private BigDecimal score;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("local")
    @Getter
    @Setter
    private String local;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("host")
    @Getter
    @Setter
    private String host;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("suggestion")
    @Getter
    @Setter
    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("checks")
    @Getter
    @Setter
    private ValidateEmail200ResponseResultChecks checks;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("source")
    @Getter
    @Setter
    private String source;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("ip_address")
    @Getter
    @Setter
    private String ipAddress;

    public ValidateEmail200ResponseResult() {}

    private ValidateEmail200ResponseResult(Builder builder) {
        this.email = builder.email;
        this.verdict = builder.verdict;
        this.score = builder.score;
        this.local = builder.local;
        this.host = builder.host;
        this.suggestion = builder.suggestion;
        this.checks = builder.checks;
        this.source = builder.source;
        this.ipAddress = builder.ipAddress;
    }

    // Builder class for constructing object
    public static class Builder {

        private String email;
        private Verdict verdict;
        private BigDecimal score;
        private String local;
        private String host;
        private String suggestion;
        private ValidateEmail200ResponseResultChecks checks;
        private String source;
        private String ipAddress;

        public Builder(
            String email,
            Verdict verdict,
            BigDecimal score,
            String local,
            String host,
            ValidateEmail200ResponseResultChecks checks,
            String ipAddress
        ) {
            this.email = email;
            this.verdict = verdict;
            this.score = score;
            this.local = local;
            this.host = host;
            this.checks = checks;
            this.ipAddress = ipAddress;
        }

        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public ValidateEmail200ResponseResult build() {
            return new ValidateEmail200ResponseResult(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            ValidateEmail200ResponseResult.class.getSimpleName() + "(",
            ")"
        );
        if (email != null) joiner.add("email=" + email);
        if (verdict != null) joiner.add("verdict=" + verdict);
        if (score != null) joiner.add("score=" + score);
        if (local != null) joiner.add("local=" + local);
        if (host != null) joiner.add("host=" + host);
        if (suggestion != null) joiner.add("suggestion=" + suggestion);
        if (checks != null) joiner.add("checks=" + checks);
        if (source != null) joiner.add("source=" + source);
        if (ipAddress != null) joiner.add("ipAddress=" + ipAddress);
        return joiner.toString();
    }
}
