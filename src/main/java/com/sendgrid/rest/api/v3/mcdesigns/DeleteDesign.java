/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Marketing Campaigns Designs
 * The Twilio SendGrid Designs API offers the ability to manage assets stored in the Twilio SendGrid [Design Library](https://mc.sendgrid.com/design-library/my-designs).  The Design Library is a feature-rich email layout tool and media repository. You can [build designs for all your marketing email needs](https://sendgrid.com/docs/ui/sending-email/working-with-marketing-campaigns-email-designs/), including Single Sends and Automations.  You can also duplicate and then modify one of the pre-built designs provided by Twilio SendGrid to get you started.  The Designs API provides a REST-like interface for creating new designs, retrieving a list of existing designs, duplicating or updating a design, and deleting a design.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.mcdesigns;

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
import com.sendgrid.rest.api.v3.mcdesigns.models.ApiErrors;
import com.sendgrid.util.JsonUtil;
import com.sendgrid.util.Matcher;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteDesign extends ApiKeyBase {

    private final UUID id;

    public ApiResponse<Void> send(final ApiKeyRestClient client) {
        String path = "/v3/designs/{id}";
        Request request = new Request(
            HttpMethod.DELETE,
            path,
            Domains.API.toString()
        );
        addPathParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "DeleteDesign creation failed: Unable to connect to server"
            );
        } else if (
            !ApplicationConstants.SUCCESS.test(response.getStatusCode())
        ) {
            int statusCode = response.getStatusCode();
            if (Matcher.matches(Integer.toString(statusCode), "400")) {
                ApiErrors error = JsonUtil.fromJson(
                    response.getStream(),
                    ApiErrors.class
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "404")) {
                ApiErrors error = JsonUtil.fromJson(
                    response.getStream(),
                    ApiErrors.class
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
}
