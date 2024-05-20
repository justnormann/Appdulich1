package com.travelappproject;

import com.travelappproject.model.hotel.Message;
import com.travelappproject.model.hotel.Result;
import com.travelappproject.model.hotel.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface SendMessageApi {
    @Headers({
            "Authorization: Bearer AAAAMJFIOp4:APA91bFWLvEb7yla2D-7MEkAuDwzHw1xJ0NYDKnQ7N5jbKM5J5W0_wslXEAh_PX8ljG5aZzHYhQ7EGkIhkXeQSvhpJ2eomxVCtJThjLMKFgofwBjblXz6kNJOVOC-iGE3R_Aef8NkPlT",
            "Content-Type: application/json"
    })
    @POST("fcm/send")
    Call<Message> sendMessage(@Body Message message);
    @GET("/api/auth/users")
    Call<List<User>> getUsers();

    @POST("/api/auth/signup")
    Call<Void> registerUser(@Body User user);

    @PUT("/api/auth/update")
    Call<Void> updateUser(@Body User user);

    @POST("/api/auth/login")
    Call<Void> loginUser(@Body User user);
}
