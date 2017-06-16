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
 * Created by prati on 06-06-2017.
 */

public class Snacks extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.snacks,null);

        RecyclerView recyclerView= (RecyclerView) v.findViewById(R.id.recycler_view_snacks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(),getSnacks()));
        return v;
    }
    public String toString()
    {
        return "Snack Items";
    }
    public ArrayList<Items> getSnacks() {
        ArrayList<Items> i=new ArrayList<>();
        Items m;

        m=new Items("Cheetos",R.drawable.salad);
        i.add(m);

        m=new Items("Gum",R.drawable.panini);
        i.add(m);

        m=new Items("Crackers",R.drawable.wings);
        i.add(m);

        m=new Items("Brownie",R.drawable.wings);
        i.add(m);

        m=new Items("Cookies",R.drawable.apple_salad);
        i.add(m);

        m=new Items("Dirty Chips",R.drawable.smoothies);
        i.add(m);

        m=new Items("Wise",R.drawable.chicken_burrito);
        i.add(m);

        m=new Items("Doritos",R.drawable.catering);
        i.add(m);

        m=new Items("Lays",R.drawable.catering);
        i.add(m);

        return i;

    }

}
