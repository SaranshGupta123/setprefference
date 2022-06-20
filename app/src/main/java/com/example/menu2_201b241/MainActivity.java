package com.example.menu2_201b241;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.eng:
                textView.setText("English");
                sharedPreferences.edit().putString("title","English").apply();
                return true;
            case R.id.hin:
                textView.setText("hindi");
                sharedPreferences.edit().putString("title","hindi").apply();
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu2_201b241,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        sharedPreferences=this.getSharedPreferences("com.example.menu2_201b241" , 0);
        String pref =sharedPreferences.getString("title" , "deafult");
        textView.setText(pref);
    }
}