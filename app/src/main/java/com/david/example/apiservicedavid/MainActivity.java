package com.david.example.apiservicedavid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.david.example.apiservicedavid.apiservicedavid.ApiServiceDavid;
import com.david.example.apiservicedavid.models.Despacho;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Retrofit retrofit;
    private static final String TAG = "DESPACHO";
    private RecyclerView recyclerView;
    private boolean aptoParaCargar;
    private DespachoAdapter despachoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        despachoAdapter = new DespachoAdapter(this);
        recyclerView.setAdapter(despachoAdapter);

        recyclerView.setHasFixedSize(true);
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                    if (aptoParaCargar) {
                        if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                            Log.i(TAG, " Llegamos al final.");

                            aptoParaCargar = false;
                            obtenerLista();
                        }
                    }
                }
            }
        });
// carga los links de los datos abiertos
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        aptoParaCargar = true;
        obtenerLista();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.primera) {
            Intent i = new Intent(this, AcercaDe.class );
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }




    private void obtenerLista() {

        ApiServiceDavid service = retrofit.create(ApiServiceDavid.class);
        Call<ArrayList<Despacho>> despachoRespuestaCall = service.obtenerListaDespacho();

        despachoRespuestaCall.enqueue(new Callback<ArrayList<Despacho>>() {
            @Override
            public void onResponse(Call<ArrayList<Despacho>> call, Response<ArrayList<Despacho>> response) {
                if(response.isSuccessful()){
                    ArrayList lista = response.body();
                    despachoAdapter.adicionarListaDespacho(lista);
                }
                else
                {
                    Log.e(TAG, "onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Despacho>> call, Throwable t) {
                Log.e(TAG," onFailure: "+t.getMessage());
            }
        });

    }

}
