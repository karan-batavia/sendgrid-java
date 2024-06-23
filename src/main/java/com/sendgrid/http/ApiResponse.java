package com.sendgrid.http;

import lombok.Getter;
import org.apache.http.Header;
import java.util.Map;
import java.util.StringJoiner;

public class ApiResponse<T> {
    @Getter
    private Integer statusCode;
    @Getter
    private T body;
    @Getter
    private Header[] headers;


    public ApiResponse(int statusCode, Header[] headers) {
        this.body = null;
        this.headers = headers;
        this.statusCode = statusCode;
    }

    public ApiResponse(int statusCode, T body, Header[] headers) {
        this.statusCode = statusCode;
        this.body = body;
        this.headers = headers;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", ApiResponse.class.getSimpleName() + "(", ")");
        if (statusCode != null) joiner.add("statusCode=" + statusCode);
        if (headers != null) joiner.add("headers=" + headers);
        if (body != null) joiner.add("body=" + body);
        return joiner.toString();
    }
}
