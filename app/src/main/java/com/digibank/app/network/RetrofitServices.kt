package com.digibank.app.network

import com.digibank.app.network.models.createlogin.CreateLoginRequest
import com.digibank.app.network.models.createlogin.CreateLoginResponse
import com.digibank.app.network.models.createregister.CreateRegisterRequest
import com.digibank.app.network.models.createregister.CreateRegisterResponse
import com.digibank.app.network.models.fetchme.FetchMeResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface RetrofitServices {
  @GET("/device/api/v1/user/me")
  suspend fun fetchMe(@Header("Content-type") contentType: String?, @Header("Authorization")
      authorization: String?): FetchMeResponse

  @POST("/device/auth/login")
  suspend fun createLogin(@Header("Content-Type") contentType: String?, @Body
      createLoginRequest: CreateLoginRequest?): CreateLoginResponse

  @POST("/device/auth/register")
  suspend fun createRegister(@Header("Content-Type") contentType: String?, @Body
      createRegisterRequest: CreateRegisterRequest?): CreateRegisterResponse
}

const val BASE_URL: String = "https://nodedemo.dhiwise.co"
