/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Single Sign-On API
 * The Single Sign-On API allows you to manage your SAML 2.0 SSO configurations. You can also work with your SSO integrations using the SSO section of the [Twilio SendGrid application user interface](https://app.sendgrid.com/settings/sso).  The Single Sign-On Settings operations allow you to create, retrieve, modify, and delete SSO integrations for your Twilio SendGrid account. Each integration will correspond to a specific IdP such as Okta, Duo, or Microsoft Azure Active Directory.  The Single Sign-On Certificates operations allow you to create, modify, and delete SSO certificates. A SAML certificate allows your IdP and Twilio SendGrid to verify requests are coming from one another using the `public_certificate` and `integration_id` parameters.  The Single Sign-On Teammates operations allow you to add and modify SSO Teammates. SSO Teammates are the individual user accounts who will access your Twilio SendGrid account with SSO credentials. To retrieve or delete an SSO Teammate, you will use the separate [Teammates API](https://docs.sendgrid.com/api-reference/teammates/).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.sso;

import com.fasterxml.jackson.core.type.TypeReference;
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
import com.sendgrid.rest.api.v3.sso.models.PostSsoTeammates201;
import com.sendgrid.rest.api.v3.sso.models.PostSsoTeammatesRequest;
import com.sendgrid.rest.api.v3.sso.models.SsoErrorResponseInner;
import com.sendgrid.util.JsonUtil;
import com.sendgrid.util.Matcher;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class CreateSsoTeammate extends ApiKeyBase {

    @Setter
    private PostSsoTeammatesRequest postSsoTeammatesRequest;

    public ApiResponse<PostSsoTeammates201> send(
        final ApiKeyRestClient client
    ) {
        String path = "/v3/sso/teammates";
        Request request = new Request(
            HttpMethod.POST,
            path,
            Domains.API.toString()
        );
        addBody(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "CreateSsoTeammate creation failed: Unable to connect to server"
            );
        } else if (
            !ApplicationConstants.SUCCESS.test(response.getStatusCode())
        ) {
            int statusCode = response.getStatusCode();
            if (Matcher.matches(Integer.toString(statusCode), "400")) {
                TypeReference listTypeReference = new TypeReference<
                    List<SsoErrorResponseInner>
                >() {};
                List<SsoErrorResponseInner> error = (List<
                        SsoErrorResponseInner
                    >) JsonUtil.fromJson(
                    response.getStream(),
                    listTypeReference
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "401")) {
                TypeReference listTypeReference = new TypeReference<
                    List<SsoErrorResponseInner>
                >() {};
                List<SsoErrorResponseInner> error = (List<
                        SsoErrorResponseInner
                    >) JsonUtil.fromJson(
                    response.getStream(),
                    listTypeReference
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "403")) {
                TypeReference listTypeReference = new TypeReference<
                    List<SsoErrorResponseInner>
                >() {};
                List<SsoErrorResponseInner> error = (List<
                        SsoErrorResponseInner
                    >) JsonUtil.fromJson(
                    response.getStream(),
                    listTypeReference
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "429")) {
                TypeReference listTypeReference = new TypeReference<
                    List<SsoErrorResponseInner>
                >() {};
                List<SsoErrorResponseInner> error = (List<
                        SsoErrorResponseInner
                    >) JsonUtil.fromJson(
                    response.getStream(),
                    listTypeReference
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "500")) {
                TypeReference listTypeReference = new TypeReference<
                    List<SsoErrorResponseInner>
                >() {};
                List<SsoErrorResponseInner> error = (List<
                        SsoErrorResponseInner
                    >) JsonUtil.fromJson(
                    response.getStream(),
                    listTypeReference
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
        return new ApiResponse(
            statusCode,
            JsonUtil.fromJson(response.getStream(), PostSsoTeammates201.class),
            response.getHeaders()
        );
    }

    private void addBody(final Request request) {
        if (postSsoTeammatesRequest != null) {
            request.addBody(JsonUtil.toJson(postSsoTeammatesRequest));
        }
    }
}
