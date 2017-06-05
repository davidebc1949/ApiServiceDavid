package com.david.example.apiservicedavid.apiservicedavid;

import com.david.example.apiservicedavid.models.Despacho;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServiceDavid {
    @GET("9k32-7sfp.json")
    Call<ArrayList<Despacho>> obtenerListaDespacho();
}
