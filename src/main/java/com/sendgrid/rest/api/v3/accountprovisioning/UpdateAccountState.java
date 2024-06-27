/*
 * This code was generated by
 *
 * SENDGRID-OAI-GENERATOR
 *
 * Twilio SendGrid Account Provisioning API
 * The Twilio SendGrid Account Provisioning API provides a platform for Twilio SendGrid resellers to manage their customer accounts. This API is for companies that have a formal reseller partnership with Twilio SendGrid.  You can access Twilio SendGrid sub-account functionality without becoming a reseller. If you require sub-account functionality, see the Twilio [SendGrid Subusers](https://docs.sendgrid.com/ui/account-and-settings/subusers) feature, which is available with [Pro and Premier plans](https://sendgrid.com/pricing/).
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sendgrid.rest.api.v3.accountprovisioning;

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
import com.sendgrid.rest.api.v3.accountprovisioning.models.AccountProvisioningStateWrite;
import com.sendgrid.util.JsonUtil;
import com.sendgrid.util.Matcher;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class UpdateAccountState extends ApiKeyBase {

    private final String accountID;

    @Setter
    private AccountProvisioningStateWrite accountProvisioningStateWrite;

    public ApiResponse<Void> send(final ApiKeyRestClient client) {
        String path = "/v3/partners/accounts/{accountID}/state";
        Request request = new Request(
            HttpMethod.PUT,
            path,
            Domains.API.toString()
        );
        addPathParams(request);
        addBody(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "UpdateAccountState creation failed: Unable to connect to server"
            );
        } else if (
            !ApplicationConstants.SUCCESS.test(response.getStatusCode())
        ) {
            int statusCode = response.getStatusCode();
            if (Matcher.matches(Integer.toString(statusCode), "400")) {
                Object error = JsonUtil.fromJson(
                    response.getStream(),
                    Object.class
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "401")) {
                Object error = JsonUtil.fromJson(
                    response.getStream(),
                    Object.class
                );
                throw new ApiErrorResponse(
                    statusCode,
                    null,
                    error,
                    response.getHeaders()
                );
            }

            if (Matcher.matches(Integer.toString(statusCode), "403")) {
                Object error = JsonUtil.fromJson(
                    response.getStream(),
                    Object.class
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
        if (accountID != null) {
            request.addPathParam("accountID", accountID.toString());
        }
    }

    private void addBody(final Request request) {
        if (accountProvisioningStateWrite != null) {
            request.addBody(JsonUtil.toJson(accountProvisioningStateWrite));
        }
    }
}
