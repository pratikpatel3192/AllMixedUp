package com.example.pratik.allmixedup.Toppings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pratik.allmixedup.R;
import com.example.pratik.allmixedup.menuFragments.Items;
import com.example.pratik.allmixedup.recycler.RecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by prati on 06-06-2017.
 */

public class Toppings extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.toppings,null);

        RecyclerView recyclerView= (RecyclerView) v.findViewById(R.id.recycler_view_toppings);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(),getToppings()));
        return v;
    }
    public String toString()
    {
        return "Toppings";
    }
    public ArrayList<Items> getToppings() {
        ArrayList<Items> i=new ArrayList<>();
        Items m;
        m=new Items("Romaine Hearts",R.drawable.salad);
        i.add(m);

        m=new Items("Spinach",R.drawable.panini);
        i.add(m);

        m=new Items("Iceburg",R.drawable.wings);
        i.add(m);

        m=new Items("Mix Greens",R.drawable.wings);
        i.add(m);



        return i;
    }

}
