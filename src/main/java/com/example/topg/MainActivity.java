package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }/*Tony Kalalian 51910025 */

    public void btnstart(View view) {
        Intent intent=new Intent(this,phone.class);
        startActivity(intent);
    }
}