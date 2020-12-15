package org.aplas.takono.services;

import org.aplas.takono.models.Message;
import org.aplas.takono.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {
    @GET("login/{username}/{password}")
    Call<Message> login(@Path("username") String username, @Path("password") String password);

//    @GET("login/siswa/{id}")
//    Call<List<User>> getUserbyId(@Path("id")int id);
//
//    @POST("login/siswa")
//    Call<List<User>> addUser(@Body User user);
//
//    @PUT("login/update/{id}")
//    Call<List<User>> updateUser(@Path("id") int id, @Body User user);
//
//    @DELETE
//    Call<List<User>> deleteUser(@Path("id")int id);
}
