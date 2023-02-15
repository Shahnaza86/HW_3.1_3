package com.example.secondlesson;

import static com.example.secondlesson.R.id.rv_contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> contactList;
    private ContactAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_contacts);
        loadData();
        adapter = new ContactAdapter(contactList);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        contactList = new ArrayList<>();
        contactList.add("Kalbu");
        contactList.add("Shahnoza");
        contactList.add("Mirlan");
        contactList.add("Alina");
        contactList.add("Daniyar");
        contactList.add("Marat");
        contactList.add("Asel");
        contactList.add("Altynay");
        contactList.add("Rustam");
        contactList.add("Abdulla");
        contactList.add("Adelya");
        contactList.add("Meka");
        contactList.add("Dilnaz");


    }
}