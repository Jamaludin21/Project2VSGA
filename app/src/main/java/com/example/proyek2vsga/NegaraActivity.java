package com.example.proyek2vsga;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NegaraActivity extends AppCompatActivity{

//    private final List negaraList = new ArrayList();
//    private ArrayAdapter adapter = null;
//    private List my_nation;
//
//    public static class my_nation {
//
//        private String data;
//
//        public String getData() {
//            return data;
//        }
//
//        public void setData(String data) {
//            this.data = data;
//        }
//
//        @Override
//        public String toString() {
//            return "my_nation{" +
//                    "data='" + data + '\'' +
//                    '}';
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);

        EditText Negara = findViewById(R.id.editTextTextNationName);
        Button btn_submit = findViewById(R.id.button2);
        ListView list_negara = findViewById(R.id.listing_negara);

        // Masih belum bisa input data baru ke list array karena menggunakan adapter selalu error/force close

//        adapter = new ArrayAdapter(this,R.layout.activity_negara,R.id.listing_negara,negaraList);
//        list_negara.setAdapter(adapter);

//        btn_submit.setOnClickListener(view -> {
//            my_nation negara;
//            negara = new my_nation();
//            negara.setData(Negara.getText().toString());
//            adapter.add(my_nation);
//            Toast.makeText(NegaraActivity.this, "Data Tersimpan", Toast.LENGTH_SHORT).show();
//        });


    }
}