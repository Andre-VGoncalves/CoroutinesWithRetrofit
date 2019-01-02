package com.goncalves.coroutines.api

import com.goncalves.coroutines.model.PostResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("/posts")
    fun getPosts(): Deferred<Response<List<PostResponse>>>

}