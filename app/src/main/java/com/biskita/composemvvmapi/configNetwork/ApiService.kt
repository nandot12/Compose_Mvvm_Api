package com.ercode.udacoding.alibabapos.pages.pelanggan.configNetwork

import com.biskita.composemvvmapi.data.NewsData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {


    @GET("everything")
    fun getNews(@Query("q") q : String,
    @Query("from") from : String,
    @Query("apiKey") apiKey : String):Observable<NewsData>


}