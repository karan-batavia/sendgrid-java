/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Webhook Configuration API
 * The Twilio SendGrid Webhooks API allows you to configure the Event and Parse Webhooks.  Email is a data-rich channel, and implementing the Event Webhook will allow you to consume those data in nearly real time. This means you can actively monitor and participate in the health of your email program throughout the send cycle.  The Inbound Parse Webhook processes all incoming email for a domain or subdomain, parses the contents and attachments and then POSTs `multipart/form-data` to a URL that you choose.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.webhooks;

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
import com.sendgrid.rest.api.v3.webhooks.models.EventWebhookTestRequest;
import com.sendgrid.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class TestEventWebhook extends ApiKeyBase {

    @Setter
    private String onBehalfOf;

    @Setter
    private EventWebhookTestRequest eventWebhookTestRequest;

    public ApiResponse<Void> send(final ApiKeyRestClient client) {
        String path = "/v3/user/webhooks/event/test";
        Request request = new Request(
            HttpMethod.POST,
            path,
            Domains.API.toString()
        );
        addHeaderParams(request);
        addBody(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "TestEventWebhook creation failed: Unable to connect to server"
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
        return new ApiResponse(statusCode, response.getHeaders());
    }

    private void addHeaderParams(Request request) {
        if (onBehalfOf != null) {
            request.addHeaderParam("on-behalf-of", onBehalfOf.toString());
        }
    }

    private void addBody(final Request request) {
        if (eventWebhookTestRequest != null) {
            request.addBody(JsonUtil.toJson(eventWebhookTestRequest));
        }
    }
}
