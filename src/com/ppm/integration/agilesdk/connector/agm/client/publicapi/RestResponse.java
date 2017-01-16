package com.ppm.integration.agilesdk.connector.agm.client.publicapi;




public class RestResponse {

    private int statusCode;
    private String data;

    public RestResponse(int statusCode, String data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getData() {
        return data;
    }

}
