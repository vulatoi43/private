package com.example.thanhvu.aprivate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nhanvien nv = new nhanvien();
        nv.Setnamsinh(1987);
        Toast.makeText(MainActivity.this,""+nv.getTuoi(),Toast.LENGTH_LONG).show();
    }
}
