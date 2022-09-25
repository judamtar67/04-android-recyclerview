package jti.polinema.ac.id.a04androidrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import jti.polinema.ac.id.a04androidrecyclerview.Mahasiswa;
import jti.polinema.ac.id.a04androidrecyclerview.R;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaViewHolder> {

    private final ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder mahasiswaViewHolder, int i) {
        mahasiswaViewHolder.txtName.setText(dataList.get(i).getName());
        mahasiswaViewHolder.txtNim.setText(dataList.get(i).getNim());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

}
