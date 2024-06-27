/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Suppressions API
 * The Twilio SendGrid Suppressions API allows you to manage your Suppressions or Unsubscribes and Suppression or Unsubscribe groups. With SendGrid, an unsubscribe is the action an email recipient takes when they opt-out of receiving your messages. A suppression is the action you take as a sender to filter or suppress an unsubscribed address from your email send. From the perspective of the recipient, your suppression is the result of their unsubscribe.  You can have global suppressions, which represent addresses that have been unsubscribed from all of your emails. You can also have suppression groups, also known as ASM groups, which represent categories or groups of emails that your recipients can unsubscribe from, rather than unsubscribing from all of your messages.  SendGrid automatically suppresses emails sent to users for a variety of reasons, including blocks, bounces, invalid email addresses, spam reports, and unsubscribes. SendGrid suppresses these messages to help you maintain the best possible sender reputation by attempting to prevent unwanted mail. You may also add addresses to your suppressions.  See [**Suppressions**](https://docs.sendgrid.com/for-developers/sending-email/suppressions) for more information.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.suppressions;

import com.sendgrid.base.apikey.ApiKeyBase;
import com.sendgrid.constant.ApplicationConstants;
import com.sendgrid.constant.Domains;
import com.sendgrid.exception.ApiConnectionException;
import com.sendgrid.exception.ApiErrorResponse;
import com.sendgrid.exception.GenericApiError;
import com.sendgrid.http.ApiKeyRestClient;
import com.sendgrid.http.ApiResponse;
import com.sendgrid.http.HttpMethod;
import com.sendgrid.http.Request;
import com.sendgrid.http.Response;
import com.sendgrid.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class DeleteSuppressionBlock extends ApiKeyBase {

    private final String email;

    @Setter
    private String onBehalfOf;

    public ApiResponse<Object> send(final ApiKeyRestClient client) {
        String path = "/v3/suppression/blocks/{email}";
        Request request = new Request(
            HttpMethod.DELETE,
            path,
            Domains.API.toString()
        );
        addPathParams(request);
        addHeaderParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "DeleteSuppressionBlock creation failed: Unable to connect to server"
            );
        } else if (
            !ApplicationConstants.SUCCESS.test(response.getStatusCode())
        ) {
            int statusCode = response.getStatusCode();
            GenericApiError error = JsonUtil.fromJson(
                response.getStream(),
                GenericApiError.class
            );
            throw new ApiErrorResponse(
                statusCode,
                null,
                error,
                response.getHeaders()
            );
        }
        int statusCode = response.getStatusCode();
        return new ApiResponse(
            statusCode,
            JsonUtil.fromJson(response.getStream(), Object.class),
            response.getHeaders()
        );
    }

    private void addPathParams(Request request) {
        if (email != null) {
            request.addPathParam("email", email.toString());
        }
    }

    private void addHeaderParams(Request request) {
        if (onBehalfOf != null) {
            request.addHeaderParam("on-behalf-of", onBehalfOf.toString());
        }
    }
}
