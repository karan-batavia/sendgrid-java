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

package com.sendgrid.rest.api.v3.mcsenders;

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
import com.sendgrid.rest.api.v3.mcsenders.models.ErrorResponse;
import com.sendgrid.util.JsonUtil;
import com.sendgrid.util.Matcher;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class ResetSenderVerification extends ApiKeyBase {

    private final Integer id;

    @Setter
    private String onBehalfOf;

    public ApiResponse<Void> send(final ApiKeyRestClient client) {
        String path = "/v3/marketing/senders/{id}/resend_verification";
        Request request = new Request(
            HttpMethod.POST,
            path,
            Domains.API.toString()
        );
        addPathParams(request);
        addHeaderParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "ResetSenderVerification creation failed: Unable to connect to server"
            );
        } else if (
            !ApplicationConstants.SUCCESS.test(response.getStatusCode())
        ) {
            int statusCode = response.getStatusCode();
            if (Matcher.matches(Integer.toString(statusCode), "400")) {
                ErrorResponse error = JsonUtil.fromJson(
                    response.getStream(),
                    ErrorResponse.class
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "404")) {
                ErrorResponse error = JsonUtil.fromJson(
                    response.getStream(),
                    ErrorResponse.class
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

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
        return new ApiResponse(statusCode, response.getHeaders());
    }

    private void addPathParams(Request request) {
        if (id != null) {
            request.addPathParam("id", id.toString());
        }
    }

    private void addHeaderParams(Request request) {
        if (onBehalfOf != null) {
            request.addHeaderParam("on-behalf-of", onBehalfOf.toString());
        }
    }
}
