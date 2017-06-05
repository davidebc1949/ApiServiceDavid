package com.david.example.apiservicedavid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.david.example.apiservicedavid.models.Despacho;

import java.util.ArrayList;


public class DespachoAdapter extends RecyclerView.Adapter<DespachoAdapter.ViewHolder> {
    private ArrayList<Despacho> dataset;

    private Context context;

    public DespachoAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_despacho, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Despacho d = dataset.get(position);
        holder.uno.setText(d.getCategorADeInformaciN());
        holder.dos.setText(d.getFormato());
        holder.tres.setText(d.getIdentificaciNDeLaSerie());
        holder.cuatro.setText(d.getIdioma());
        holder.cinco.setText(d.getLugarDeConsulta());
    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }
//adicionar la informacion del despacho desde un array
    public void adicionarListaDespacho(ArrayList<Despacho> listaDespacho) {
        dataset.addAll(listaDespacho);
        notifyDataSetChanged();
    }


    // inicializa las text view


    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView uno;
        private TextView dos;
        private TextView tres;
        private TextView cuatro;
        private TextView cinco;


        public ViewHolder(View itemView) {
            super(itemView);


            uno = (TextView) itemView.findViewById(R.id.uno);
            dos= (TextView) itemView.findViewById(R.id.dos);
            tres=(TextView) itemView.findViewById(R.id.tres);
            cuatro=(TextView) itemView.findViewById(R.id.cuatro);
            cinco=(TextView) itemView.findViewById(R.id.cinco);

        }
    }
}
