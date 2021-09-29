package com.checkout;

import com.checkout.client.ClientOperation;
import com.checkout.common.AbstractFileRequest;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class FilesTransport extends ApacheHttpClientTransport {

    public FilesTransport(final String baseUri) {
        super(baseUri, null);
    }

    @Override
    public CompletableFuture<Response> submitFile(final String path, final SdkAuthorization authorization, final AbstractFileRequest fileRequest) {
        return super.submitFile(path, authorization, fileRequest);
    }

    @Override
    public CompletableFuture<Response> invoke(final ClientOperation clientOperation, final String path, final SdkAuthorization authorization, final String requestBody, final String idempotencyKey) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CompletableFuture<Response> invokeQuery(final String path, final SdkAuthorization authorization, final Map<String, String> queryParams) {
        throw new UnsupportedOperationException();
    }

}