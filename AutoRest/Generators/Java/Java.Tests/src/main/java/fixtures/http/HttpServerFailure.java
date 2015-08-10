// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.http;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface HttpServerFailure {
    @HEAD("/http/failure/server/501")
    ErrorModel head501();

    @HEAD("/http/failure/server/501")
    void head501Async(Callback<ErrorModel> cb);

    @GET("/http/failure/server/501")
    ErrorModel get501();

    @GET("/http/failure/server/501")
    void get501Async(Callback<ErrorModel> cb);

    @POST("/http/failure/server/505")
    ErrorModel post505(Boolean booleanValue);

    @POST("/http/failure/server/505")
    void post505Async(Boolean booleanValue, Callback<ErrorModel> cb);

    @DELETE("/http/failure/server/505")
    ErrorModel delete505(Boolean booleanValue);

    @DELETE("/http/failure/server/505")
    void delete505Async(Boolean booleanValue, Callback<ErrorModel> cb);

}
