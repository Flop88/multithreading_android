package ru.mvlikhachev.myapplication.data.network


import retrofit2.Call
import retrofit2.http.GET
import ru.mvlikhachev.myapplication.data.model.CatsJson

interface ApiRequest {

    @GET("/facts/random")
    fun getCatFacts() : Call<CatsJson>
}