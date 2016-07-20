package com.mojang.authlib.yggdrasil.response;

public class Response {
    private String error;
    private String errorMessage;
    private String cause;

    public String getError() {
        return error;
    }

    public String getCause() {
        return cause;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
