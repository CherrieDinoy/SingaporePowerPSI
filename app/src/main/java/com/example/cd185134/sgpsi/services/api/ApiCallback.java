package com.example.cd185134.sgpsi.services.api;

/**
 * this is callback for api request
 * Created by cherrie on 5/23/2018.
 */

public interface ApiCallback<T> {
    /**
     * callback method if api request success
     *
     * @param data abstract class of data model
     */
    void onSuccess(T data);

    /**
     * callback method if api request failed
     *
     * @param message {@link String} of failed message
     */
    void onFailed(String message);
}
