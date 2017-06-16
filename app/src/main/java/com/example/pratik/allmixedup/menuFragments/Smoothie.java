package com.example.pratik.allmixedup.menuFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pratik.allmixedup.R;
import com.example.pratik.allmixedup.recycler.RecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by prati on 26-05-2017.
 */

public class Smoothie extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.smoothie, null);

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_smoothie);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(), getSmoothie()));
        return v;
    }

    public String toString() {
        return "Smoothies";
    }

    public ArrayList<Items> getSmoothie() {
        ArrayList<Items> i = new ArrayList<>();
        Items m;
        m = new Items("Strawberry Banana", R.drawable.salad);
        i.add(m);

        m = new Items("Mango Burst", R.drawable.panini);
        i.add(m);

        m = new Items("Breakfast Smoothie", R.drawable.wings);
        i.add(m);

        m = new Items("Tripple Berry", R.drawable.wings);
        i.add(m);

        m = new Items("Green Clean", R.drawable.apple_salad);
        i.add(m);

        m = new Items("Pina-colada", R.drawable.smoothies);
        i.add(m);



        return i;
    }


}
