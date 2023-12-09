package com.vid.stockmarketapp.data.remote.dto

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?=function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    ): ResponseBody
    companion object{
        const val API_KEY = "ODYX5MVGER3LLEAB"
        const val BASE_URL = "https://www.alphavantage.co/"
    }
}