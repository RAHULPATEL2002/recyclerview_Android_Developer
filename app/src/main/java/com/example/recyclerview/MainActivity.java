package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ContactModel> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ContactModel model = new ContactModel(R.drawable.rishi_sharma,"Rishi Sharma","1234567890");
        arrContacts.add(new ContactModel(R.drawable.rishi_sharma,"Rishi Sir","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.abhishek_ghariya,"Abhishek Ghariya","7722996095"));
        arrContacts.add(new ContactModel(R.drawable.aditya_narayan_tiwari,"Aditya narayan tiwari","9198091147"));
        arrContacts.add(new ContactModel(R.drawable.aman_thakur,"Aman Thakur","8109665840"));
        arrContacts.add(new ContactModel(R.drawable.gajal,"Gajal Kumar","8209868448"));
        arrContacts.add(new ContactModel(R.drawable.gaurav,"Gaurav Kumar Saw","6291764905"));
        arrContacts.add(new ContactModel(R.drawable.riya_patel,"Riya Patel","9516940473"));
        arrContacts.add(new ContactModel(R.drawable.sanjay,"Sanjay Rajstan","9460172107"));
        arrContacts.add(new ContactModel(R.drawable.shivangi_patel,"Shivangi Patel","9361712537"));
        arrContacts.add(new ContactModel(R.drawable.rishi_sharma,"Rishi Sir","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.abhishek_ghariya,"Abhishek Ghariya","7722996095"));
        arrContacts.add(new ContactModel(R.drawable.aditya_narayan_tiwari,"Aditya narayan tiwari","9198091147"));
        arrContacts.add(new ContactModel(R.drawable.aman_thakur,"Aman Thakur","8109665840"));
        arrContacts.add(new ContactModel(R.drawable.gajal,"Gajal Kumar","8209868448"));
        arrContacts.add(new ContactModel(R.drawable.gaurav,"Gaurav Kumar Saw","6291764905"));
        arrContacts.add(new ContactModel(R.drawable.riya_patel,"Riya Patel","9516940473"));
        arrContacts.add(new ContactModel(R.drawable.sanjay,"Sanjay Rajstan","9460172107"));
        arrContacts.add(new ContactModel(R.drawable.shivangi_patel,"Shivangi Patel","9361712537"));
        arrContacts.add(new ContactModel(R.drawable.rishi_sharma,"Rishi Sir","1234567890"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}