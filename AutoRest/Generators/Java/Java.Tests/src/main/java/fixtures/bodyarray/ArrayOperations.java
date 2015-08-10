// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodyarray;

import com.microsoft.rest.ServiceException;
import retrofit.Callback;
import retrofit.client.Response;

public interface ArrayOperations {
    @GET("/array/null")
    List<Integer> getNull();

    @GET("/array/null")
    void getNullAsync(Callback<List<Integer>> cb);

    @GET("/array/invalid")
    List<Integer> getInvalid();

    @GET("/array/invalid")
    void getInvalidAsync(Callback<List<Integer>> cb);

    @GET("/array/empty")
    List<Integer> getEmpty();

    @GET("/array/empty")
    void getEmptyAsync(Callback<List<Integer>> cb);

    @PUT("/array/empty")
    void putEmpty(List<String> arrayBody);

    @PUT("/array/empty")
    void putEmptyAsync(List<String> arrayBody, Callback<Response> cb);

    @GET("/array/prim/boolean/tfft")
    List<Boolean> getBooleanTfft();

    @GET("/array/prim/boolean/tfft")
    void getBooleanTfftAsync(Callback<List<Boolean>> cb);

    @PUT("/array/prim/boolean/tfft")
    void putBooleanTfft(List<Boolean> arrayBody);

    @PUT("/array/prim/boolean/tfft")
    void putBooleanTfftAsync(List<Boolean> arrayBody, Callback<Response> cb);

    @GET("/array/prim/boolean/true.null.false")
    List<Boolean> getBooleanInvalidNull();

    @GET("/array/prim/boolean/true.null.false")
    void getBooleanInvalidNullAsync(Callback<List<Boolean>> cb);

    @GET("/array/prim/boolean/true.boolean.false")
    List<Boolean> getBooleanInvalidString();

    @GET("/array/prim/boolean/true.boolean.false")
    void getBooleanInvalidStringAsync(Callback<List<Boolean>> cb);

    @GET("/array/prim/integer/1.-1.3.300")
    List<Integer> getIntegerValid();

    @GET("/array/prim/integer/1.-1.3.300")
    void getIntegerValidAsync(Callback<List<Integer>> cb);

    @PUT("/array/prim/integer/1.-1.3.300")
    void putIntegerValid(List<Integer> arrayBody);

    @PUT("/array/prim/integer/1.-1.3.300")
    void putIntegerValidAsync(List<Integer> arrayBody, Callback<Response> cb);

    @GET("/array/prim/integer/1.null.zero")
    List<Integer> getIntInvalidNull();

    @GET("/array/prim/integer/1.null.zero")
    void getIntInvalidNullAsync(Callback<List<Integer>> cb);

    @GET("/array/prim/integer/1.integer.0")
    List<Integer> getIntInvalidString();

    @GET("/array/prim/integer/1.integer.0")
    void getIntInvalidStringAsync(Callback<List<Integer>> cb);

    @GET("/array/prim/long/1.-1.3.300")
    List<Long> getLongValid();

    @GET("/array/prim/long/1.-1.3.300")
    void getLongValidAsync(Callback<List<Long>> cb);

    @PUT("/array/prim/long/1.-1.3.300")
    void putLongValid(List<Long> arrayBody);

    @PUT("/array/prim/long/1.-1.3.300")
    void putLongValidAsync(List<Long> arrayBody, Callback<Response> cb);

    @GET("/array/prim/long/1.null.zero")
    List<Long> getLongInvalidNull();

    @GET("/array/prim/long/1.null.zero")
    void getLongInvalidNullAsync(Callback<List<Long>> cb);

    @GET("/array/prim/long/1.integer.0")
    List<Long> getLongInvalidString();

    @GET("/array/prim/long/1.integer.0")
    void getLongInvalidStringAsync(Callback<List<Long>> cb);

    @GET("/array/prim/float/0--0.01-1.2e20")
    List<Double> getFloatValid();

    @GET("/array/prim/float/0--0.01-1.2e20")
    void getFloatValidAsync(Callback<List<Double>> cb);

    @PUT("/array/prim/float/0--0.01-1.2e20")
    void putFloatValid(List<Double> arrayBody);

    @PUT("/array/prim/float/0--0.01-1.2e20")
    void putFloatValidAsync(List<Double> arrayBody, Callback<Response> cb);

    @GET("/array/prim/float/0.0-null-1.2e20")
    List<Double> getFloatInvalidNull();

    @GET("/array/prim/float/0.0-null-1.2e20")
    void getFloatInvalidNullAsync(Callback<List<Double>> cb);

    @GET("/array/prim/float/1.number.0")
    List<Double> getFloatInvalidString();

    @GET("/array/prim/float/1.number.0")
    void getFloatInvalidStringAsync(Callback<List<Double>> cb);

    @GET("/array/prim/double/0--0.01-1.2e20")
    List<Double> getDoubleValid();

    @GET("/array/prim/double/0--0.01-1.2e20")
    void getDoubleValidAsync(Callback<List<Double>> cb);

    @PUT("/array/prim/double/0--0.01-1.2e20")
    void putDoubleValid(List<Double> arrayBody);

    @PUT("/array/prim/double/0--0.01-1.2e20")
    void putDoubleValidAsync(List<Double> arrayBody, Callback<Response> cb);

    @GET("/array/prim/double/0.0-null-1.2e20")
    List<Double> getDoubleInvalidNull();

    @GET("/array/prim/double/0.0-null-1.2e20")
    void getDoubleInvalidNullAsync(Callback<List<Double>> cb);

    @GET("/array/prim/double/1.number.0")
    List<Double> getDoubleInvalidString();

    @GET("/array/prim/double/1.number.0")
    void getDoubleInvalidStringAsync(Callback<List<Double>> cb);

    @GET("/array/prim/string/foo1.foo2.foo3")
    List<String> getStringValid();

    @GET("/array/prim/string/foo1.foo2.foo3")
    void getStringValidAsync(Callback<List<String>> cb);

    @PUT("/array/prim/string/foo1.foo2.foo3")
    void putStringValid(List<String> arrayBody);

    @PUT("/array/prim/string/foo1.foo2.foo3")
    void putStringValidAsync(List<String> arrayBody, Callback<Response> cb);

    @GET("/array/prim/string/foo.null.foo2")
    List<String> getStringWithNull();

    @GET("/array/prim/string/foo.null.foo2")
    void getStringWithNullAsync(Callback<List<String>> cb);

    @GET("/array/prim/string/foo.123.foo2")
    List<String> getStringWithInvalid();

    @GET("/array/prim/string/foo.123.foo2")
    void getStringWithInvalidAsync(Callback<List<String>> cb);

    @GET("/array/prim/date/valid")
    List<Date> getDateValid();

    @GET("/array/prim/date/valid")
    void getDateValidAsync(Callback<List<Date>> cb);

    @PUT("/array/prim/date/valid")
    void putDateValid(List<Date> arrayBody);

    @PUT("/array/prim/date/valid")
    void putDateValidAsync(List<Date> arrayBody, Callback<Response> cb);

    @GET("/array/prim/date/invalidnull")
    List<Date> getDateInvalidNull();

    @GET("/array/prim/date/invalidnull")
    void getDateInvalidNullAsync(Callback<List<Date>> cb);

    @GET("/array/prim/date/invalidchars")
    List<Date> getDateInvalidChars();

    @GET("/array/prim/date/invalidchars")
    void getDateInvalidCharsAsync(Callback<List<Date>> cb);

    @GET("/array/prim/date-time/valid")
    List<Date> getDateTimeValid();

    @GET("/array/prim/date-time/valid")
    void getDateTimeValidAsync(Callback<List<Date>> cb);

    @PUT("/array/prim/date-time/valid")
    void putDateTimeValid(List<Date> arrayBody);

    @PUT("/array/prim/date-time/valid")
    void putDateTimeValidAsync(List<Date> arrayBody, Callback<Response> cb);

    @GET("/array/prim/date-time/invalidnull")
    List<Date> getDateTimeInvalidNull();

    @GET("/array/prim/date-time/invalidnull")
    void getDateTimeInvalidNullAsync(Callback<List<Date>> cb);

    @GET("/array/prim/date-time/invalidchars")
    List<Date> getDateTimeInvalidChars();

    @GET("/array/prim/date-time/invalidchars")
    void getDateTimeInvalidCharsAsync(Callback<List<Date>> cb);

    @GET("/array/prim/byte/valid")
    List<Byte[]> getByteValid();

    @GET("/array/prim/byte/valid")
    void getByteValidAsync(Callback<List<Byte[]>> cb);

    @PUT("/array/prim/byte/valid")
    void putByteValid(List<Byte[]> arrayBody);

    @PUT("/array/prim/byte/valid")
    void putByteValidAsync(List<Byte[]> arrayBody, Callback<Response> cb);

    @GET("/array/prim/byte/invalidnull")
    List<Byte[]> getByteInvalidNull();

    @GET("/array/prim/byte/invalidnull")
    void getByteInvalidNullAsync(Callback<List<Byte[]>> cb);

    @GET("/array/complex/null")
    List<Product> getComplexNull();

    @GET("/array/complex/null")
    void getComplexNullAsync(Callback<List<Product>> cb);

    @GET("/array/complex/empty")
    List<Product> getComplexEmpty();

    @GET("/array/complex/empty")
    void getComplexEmptyAsync(Callback<List<Product>> cb);

    @GET("/array/complex/itemnull")
    List<Product> getComplexItemNull();

    @GET("/array/complex/itemnull")
    void getComplexItemNullAsync(Callback<List<Product>> cb);

    @GET("/array/complex/itemempty")
    List<Product> getComplexItemEmpty();

    @GET("/array/complex/itemempty")
    void getComplexItemEmptyAsync(Callback<List<Product>> cb);

    @GET("/array/complex/valid")
    List<Product> getComplexValid();

    @GET("/array/complex/valid")
    void getComplexValidAsync(Callback<List<Product>> cb);

    @PUT("/array/complex/valid")
    void putComplexValid(List<Product> arrayBody);

    @PUT("/array/complex/valid")
    void putComplexValidAsync(List<Product> arrayBody, Callback<Response> cb);

    @GET("/array/array/null")
    List<List<String>> getArrayNull();

    @GET("/array/array/null")
    void getArrayNullAsync(Callback<List<List<String>>> cb);

    @GET("/array/array/empty")
    List<List<String>> getArrayEmpty();

    @GET("/array/array/empty")
    void getArrayEmptyAsync(Callback<List<List<String>>> cb);

    @GET("/array/array/itemnull")
    List<List<String>> getArrayItemNull();

    @GET("/array/array/itemnull")
    void getArrayItemNullAsync(Callback<List<List<String>>> cb);

    @GET("/array/array/itemempty")
    List<List<String>> getArrayItemEmpty();

    @GET("/array/array/itemempty")
    void getArrayItemEmptyAsync(Callback<List<List<String>>> cb);

    @GET("/array/array/valid")
    List<List<String>> getArrayValid();

    @GET("/array/array/valid")
    void getArrayValidAsync(Callback<List<List<String>>> cb);

    @PUT("/array/array/valid")
    void putArrayValid(List<List<String>> arrayBody);

    @PUT("/array/array/valid")
    void putArrayValidAsync(List<List<String>> arrayBody, Callback<Response> cb);

    @GET("/array/dictionary/null")
    List<Map<String>> getDictionaryNull();

    @GET("/array/dictionary/null")
    void getDictionaryNullAsync(Callback<List<Map<String>>> cb);

    @GET("/array/dictionary/empty")
    List<Map<String>> getDictionaryEmpty();

    @GET("/array/dictionary/empty")
    void getDictionaryEmptyAsync(Callback<List<Map<String>>> cb);

    @GET("/array/dictionary/itemnull")
    List<Map<String>> getDictionaryItemNull();

    @GET("/array/dictionary/itemnull")
    void getDictionaryItemNullAsync(Callback<List<Map<String>>> cb);

    @GET("/array/dictionary/itemempty")
    List<Map<String>> getDictionaryItemEmpty();

    @GET("/array/dictionary/itemempty")
    void getDictionaryItemEmptyAsync(Callback<List<Map<String>>> cb);

    @GET("/array/dictionary/valid")
    List<Map<String>> getDictionaryValid();

    @GET("/array/dictionary/valid")
    void getDictionaryValidAsync(Callback<List<Map<String>>> cb);

    @PUT("/array/dictionary/valid")
    void putDictionaryValid(List<Map<String>> arrayBody);

    @PUT("/array/dictionary/valid")
    void putDictionaryValidAsync(List<Map<String>> arrayBody, Callback<Response> cb);

}
