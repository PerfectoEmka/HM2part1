package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<People> people;
    private RecyclerView recyclerView;
    private UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createLists();
        initViews();
    }

    private void initViews(){
        recyclerView = findViewById(R.id.main_recycler_view);
        adapter = new UserAdapter();
        adapter.setlist(people);
        recyclerView.setAdapter(adapter);
    }

    private void createLists() {
        people = new ArrayList<>();

        People first = new People("Marimoto", 23);
        People second = new People("Marffffffimoto", 23);
        People third = new People("Marimoto", 23);
        People fourth = new People("Marimoto", 23);
        People fifths = new People("Marimoto", 23);
        People sixth = new People("Marimoto", 23);
        People seventh = new People("Marimoto", 23);
        People eights = new People("Marimoto", 23);
        People nines = new People("Marimoto", 23);
        People tens = new People("Marimoto", 23);

        people.add(first);
        people.add(second);
        people.add(third);
        people.add(fourth);
        people.add(fifths);
        people.add(sixth);
        people.add(seventh);
        people.add(eights);
        people.add(nines);
        people.add(tens);

    }
}