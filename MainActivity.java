package com.example.yls.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Dog> mDogList = new ArrayList<Dog>();
    private MyAdapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initViews();
    }

    private void initDogList() {
        mDogList.add(new Dog( R.drawable.dog1));
        mDogList.add(new Dog(R.drawable.dog2));
        mDogList.add(new Dog( R.drawable.dog3));
        mDogList.add(new Dog( R.drawable.dog4));
        mDogList.add(new Dog( R.drawable.dog5));
        mDogList.add(new Dog(R.drawable.dog6));
        mDogList.add(new Dog( R.drawable.dog7));
        mDogList.add(new Dog( R.drawable.dog8));
        mDogList.add(new Dog( R.drawable.dog9));
        mDogList.add(new Dog( R.drawable.dog10));
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        LinearLayoutManager manger = new LinearLayoutManager(this);
//        manger.setOrientation(LinearLayoutManager.HORIZONTAL);
//        GridLayoutManager manager = new GridLayoutManager(this, 3);

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mAdapter = new MyAdapter(mDogList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
