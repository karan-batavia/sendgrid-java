/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid IP Warmup API
 * The Twilio SendGrid IP Warm Up API allows you to gradually increasing the volume of mail sent with a dedicated IP address according to a predetermined schedule. This gradual process helps to establish a reputation with ISPs (Internet Service Providers) as a legitimate email sender.  SendGrid can automatically warm up dedicated IP addresses by limiting the amount of mail that can be sent through them per hour. The limit is determined by how long the IP address has been warming up.  See the [warmup schedule](https://sendgrid.com/docs/ui/sending-email/warming-up-an-ip-address/#automated-ip-warmup-hourly-send-schedule) to learn how SendGrid limits your email traffic for IPs in warmup.  You can also choose to use Twilio SendGrid's automated IP warmup for any of your IPs from the **IP Addresses** settings menu in the [Twilio SendGrid application user interface](https://app.sendgrid.com/settings/ip_addresses).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.ipwarmup.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sendgrid.rest.api.v3.ipwarmup.models.WarmUpIp404ResponseErrorsInner;
import java.util.List;
import java.util.StringJoiner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class WarmUpIp404Response {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("errors")
    @Getter
    @Setter
    private List<WarmUpIp404ResponseErrorsInner> errors;

    public WarmUpIp404Response() {}

    private WarmUpIp404Response(Builder builder) {
        this.errors = builder.errors;
    }

    // Builder class for constructing object
    public static class Builder {

        private List<WarmUpIp404ResponseErrorsInner> errors;

        public Builder() {}

        public Builder errors(List<WarmUpIp404ResponseErrorsInner> errors) {
            this.errors = errors;
            return this;
        }

        public WarmUpIp404Response build() {
            return new WarmUpIp404Response(this);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(
            ", ",
            WarmUpIp404Response.class.getSimpleName() + "(",
            ")"
        );
        if (errors != null) joiner.add("errors=" + errors);
        return joiner.toString();
    }
}
