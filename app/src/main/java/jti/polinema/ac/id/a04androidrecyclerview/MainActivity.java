package jti.polinema.ac.id.a04androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import jti.polinema.ac.id.a04androidrecyclerview.adapter.MahasiswaAdapter;
import jti.polinema.ac.id.a04androidrecyclerview.data.MahasiswaData;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Mahasiswa> mhsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setDataMahasiswa(MahasiswaData.dataMahasiswa());

        RecyclerView mhs_recyclerView = findViewById(R.id.main_recycler);
        MahasiswaAdapter adapter = new MahasiswaAdapter(mhsArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mhs_recyclerView.setLayoutManager(layoutManager);
        mhs_recyclerView.setAdapter(adapter);
    }

    public void setDataMahasiswa(String data){
        try {
            JSONArray jsonArray = new JSONArray(data);
            mhsArrayList = new ArrayList<>();
            for(int i=0; i<jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Mahasiswa mahasiswa = new Mahasiswa(jsonObject.getString("name"),
                        jsonObject.getString("nim"));
                mhsArrayList.add(mahasiswa);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}