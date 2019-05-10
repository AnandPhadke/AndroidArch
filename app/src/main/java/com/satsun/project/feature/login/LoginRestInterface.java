package com.satsun.project.feature.login;

import com.satsun.project.pojo.TempResponse;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface LoginRestInterface {

    @GET("jfkwq")
    Observable<TempResponse> getDetails();
}
