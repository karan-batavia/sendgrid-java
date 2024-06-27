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

package com.sendgrid.rest.api.v3.user;

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
import com.sendgrid.rest.api.v3.user.models.UpdateEmail200Response;
import com.sendgrid.rest.api.v3.user.models.UpdateEmailRequest;
import com.sendgrid.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class UpdateEmail extends ApiKeyBase {

    @Setter
    private String onBehalfOf;

    @Setter
    private UpdateEmailRequest updateEmailRequest;

    public ApiResponse<UpdateEmail200Response> send(
        final ApiKeyRestClient client
    ) {
        String path = "/v3/user/email";
        Request request = new Request(
            HttpMethod.PUT,
            path,
            Domains.API.toString()
        );
        addHeaderParams(request);
        addBody(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "UpdateEmail creation failed: Unable to connect to server"
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
            JsonUtil.fromJson(
                response.getStream(),
                UpdateEmail200Response.class
            ),
            response.getHeaders()
        );
    }

    private void addHeaderParams(Request request) {
        if (onBehalfOf != null) {
            request.addHeaderParam("on-behalf-of", onBehalfOf.toString());
        }
    }

    private void addBody(final Request request) {
        if (updateEmailRequest != null) {
            request.addBody(JsonUtil.toJson(updateEmailRequest));
        }
    }
}
