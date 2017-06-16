package com.example.pratik.allmixedup.menuFragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pratik.allmixedup.R;
import com.example.pratik.allmixedup.recycler.RecyclerAdapter;

import java.util.ArrayList;

public class Specials extends Fragment {

    private ArrayList<Items> specials;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.specials, null);

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_specials);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(), getSpecials()));
        return v;
    }

    public String toString()
    {
        return "Specials";
    }



    public ArrayList<Items> getSpecials() {
        ArrayList<Items> i=new ArrayList<>();
        Items m;
        m=new Items("Salad",R.drawable.salad);
        i.add(m);

        m=new Items("panini00",R.drawable.panini);
        i.add(m);

        m=new Items("wrap4",R.drawable.wings);
        i.add(m);

        m=new Items("wings5",R.drawable.wings);
        i.add(m);

        m=new Items("drinks7",R.drawable.apple_salad);
        i.add(m);

        m=new Items("snack8",R.drawable.smoothies);
        i.add(m);

        m=new Items("burger9",R.drawable.chicken_burrito);
        i.add(m);

        m=new Items("cater0",R.drawable.catering);
        i.add(m);

        return i;
    }
}