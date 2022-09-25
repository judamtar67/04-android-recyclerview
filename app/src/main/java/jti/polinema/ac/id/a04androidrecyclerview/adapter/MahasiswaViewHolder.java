package jti.polinema.ac.id.a04androidrecyclerview.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import jti.polinema.ac.id.a04androidrecyclerview.R;

public class MahasiswaViewHolder extends ViewHolder {

    public TextView txtName, txtNim;

    public MahasiswaViewHolder(@NonNull View itemView) {
        super(itemView);
        txtName = (TextView) itemView.findViewById(R.id.mhs_name);
        txtNim = (TextView) itemView.findViewById(R.id.mhs_nim);
    }
}
