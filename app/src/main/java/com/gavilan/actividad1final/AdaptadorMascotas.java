package com.gavilan.actividad1final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorMascotas extends RecyclerView.Adapter<AdaptadorMascotas.ViewHolderDatos> {

    private ArrayList<Mascota> listadoMascotas;

    public AdaptadorMascotas(ArrayList<Mascota> listadoMascotas) {
        this.listadoMascotas = listadoMascotas;
    }

    @NonNull
    @Override
    public AdaptadorMascotas.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mascota_item,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorMascotas.ViewHolderDatos holder, int position) {
        holder.cargarMascota(listadoMascotas.get(position));
    }

    @Override
    public int getItemCount() {
        return listadoMascotas.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtNom, txtTipo, txtSexo;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            txtNom = itemView.findViewById(R.id.txtNom);
            txtTipo = itemView.findViewById(R.id.txtTipo);
            txtSexo = itemView.findViewById(R.id.txtSexo);
        }


        public void cargarMascota(Mascota mascota) {
            txtNom.setText(mascota.getNombre());
            txtTipo.setText(mascota.getTipo());
            txtSexo.setText(mascota.getSexo());
        }
    }
}
