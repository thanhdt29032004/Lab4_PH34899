package com.example.lab4_ph34899;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class B2_activity extends AppCompatActivity implements Fragment2_b2.Isendata {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);

        Fragment1_b2 fragment1_b2=new Fragment1_b2();
        Fragment2_b2 fragment2_b2=new Fragment2_b2();

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fm1, fragment1_b2);
        transaction.add(R.id.fm2, fragment2_b2);
        transaction.commit();
    }

    @Override
    public void sendData(String data) {
        Fragment1_b2 fragment1_b2= (Fragment1_b2) getSupportFragmentManager().findFragmentById(R.id.fm1);
        fragment1_b2.nhanData(data);
    }
}