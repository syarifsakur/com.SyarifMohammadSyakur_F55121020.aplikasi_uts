package com.f55121020.comsyarifmohammadsyakur_f55121020aplikasi_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

        private String[] dataName = {"Cut Nyak Dien","Ki Hajar Dewantara","Moh Yamin"};

             @Override
 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         ListView listView = findViewById(R.id.lv_list);
         ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this,
                 android.R.layout.simple_list_item_1,
                android.R.id.text1, dataName);
         listView.setAdapter(adapter);
         }
}
