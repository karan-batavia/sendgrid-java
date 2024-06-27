/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Templates API
 * The Twilio SendGrid Templates API allows you to create and manage email templates to be delivered with SendGrid's sending APIs. The templates you create will be available using a template ID that is passed to our sending APIs as part of the request. Each template may then have multiple versions associated with it. Whichever version is set as \"active\" at the time of the request will be sent to your recipients. This system allows you to update a single template's look and feel entirely without modifying your requests to our Mail Send API. For example, you could have a single template for welcome emails. That welcome template could then have a version for each season of the year that's themed appropriately and marked as active during the appropriate season. The template ID passed to our sending APIs never needs to change; you can just modify which version is active.  This API provides operations to create and manage your templates as well as their versions.  Each user can create up to 300 different templates. Templates are specific to accounts and Subusers. Templates created on a parent account will not be accessible from the Subusers' accounts.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.templates;

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
import com.sendgrid.rest.api.v3.templates.models.DuplicateTemplateRequest;
import com.sendgrid.rest.api.v3.templates.models.TransactionalTemplate;
import com.sendgrid.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class DuplicateTemplate extends ApiKeyBase {

    private final String templateId;

    @Setter
    private String onBehalfOf;

    @Setter
    private DuplicateTemplateRequest duplicateTemplateRequest;

    public ApiResponse<TransactionalTemplate> send(
        final ApiKeyRestClient client
    ) {
        String path = "/v3/templates/{template_id}";
        Request request = new Request(
            HttpMethod.POST,
            path,
            Domains.API.toString()
        );
        addPathParams(request);
        addHeaderParams(request);
        addBody(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "DuplicateTemplate creation failed: Unable to connect to server"
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
                TransactionalTemplate.class
            ),
            response.getHeaders()
        );
    }

    private void addPathParams(Request request) {
        if (templateId != null) {
            request.addPathParam("template_id", templateId.toString());
        }
    }

    private void addHeaderParams(Request request) {
        if (onBehalfOf != null) {
            request.addHeaderParam("on-behalf-of", onBehalfOf.toString());
        }
    }

    private void addBody(final Request request) {
        if (duplicateTemplateRequest != null) {
            request.addBody(JsonUtil.toJson(duplicateTemplateRequest));
        }
    }
}
