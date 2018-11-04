package com.example.rifqiardian.myrecyclerview;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<President> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = (RecyclerView) findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(PresidentData.getListData());
        String title = getResources().getString(R.string.app_name);
        setActionBarTitle(title);
        showRecyclerList();


    }

    private void showRecyclerList() {

        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListPresidentAdapter listPresidentAdapter = new ListPresidentAdapter(this);
        listPresidentAdapter.setListPresident(list);
        rvCategory.setAdapter(listPresidentAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedPresident(list.get(position));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return  super.onCreateOptionsMenu(menu);
    }

    private void setActionBarTitle(String title){

        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.action_profile:
                Intent i = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(i);
                break;

            case R.id.action_ChangeLanguage:
                Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void showSelectedPresident(President president){
        String toast = getResources().getString(R.string.toast);
        Toast.makeText(this, toast + president.getName(), Toast.LENGTH_SHORT).show();
        Bundle bundle = new Bundle();
        bundle.putString("Name", president.getName());
        bundle.putString("Remarks", president.getRemarks());
        bundle.putString("Photo", president.getPhoto());
        bundle.putString("Detail", president.getDetail());
        Intent i = new Intent(MainActivity.this,PresidentDetail.class);
        i.putExtras(bundle);
        startActivity(i);
    }
}
