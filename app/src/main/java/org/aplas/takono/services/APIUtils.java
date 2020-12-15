package org.aplas.takono.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIUtils {

//    public static Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("http://takono-api.gopla.xyz/Takono-laravel/api/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();

    public static final String BASE_URL = "http://takono-api.gopla.xyz/Takono-laravel/api/";

    public static UserService getUserService() {
        return UserClient.getUser(BASE_URL).create(UserService.class);
    }
}
