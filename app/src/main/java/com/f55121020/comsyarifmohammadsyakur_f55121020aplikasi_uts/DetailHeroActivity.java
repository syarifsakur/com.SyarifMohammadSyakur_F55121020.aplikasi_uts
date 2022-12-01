package com.f55121020.comsyarifmohammadsyakur_f55121020aplikasi_uts;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailHeroActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero);

        ImageView img_photo = findViewById(R.id.img_photo);
        TextView txt_name = findViewById(R.id.txt_name);
        TextView txt_description = findViewById(R.id.txt_description);

        Hero hero = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(hero != null){
            img_photo.setImageResource(hero.getPhoto());
            txt_name.setText(hero.getName());
            txt_description.setText(hero.getDescription());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Hero F55121020");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
