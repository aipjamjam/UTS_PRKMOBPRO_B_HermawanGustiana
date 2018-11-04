package com.example.rifqiardian.myrecyclerview;;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class PresidentDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_detail);
        final ImageView Photo = findViewById(R.id.img_president_photo);
        final TextView Name = findViewById(R.id.tv_president_name);
        final TextView Remarks = findViewById(R.id.tv_president_remarks);
        final TextView Detail = findViewById(R.id.tv_president_detail);
        Bundle bundle = getIntent().getExtras();
        Glide.with(this)
                .load(bundle.getString("Photo"))
                .override(350, 550)
                .crossFade()
                .into(Photo);
        Detail.setText(bundle.getString("Detail"));
        Name.setText(bundle.getString("Name"));
        Remarks.setText(bundle.getString("Remarks"));
    }
}
