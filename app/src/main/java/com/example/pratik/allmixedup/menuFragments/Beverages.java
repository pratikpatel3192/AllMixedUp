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

public class Beverages extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.beverages,null);

        RecyclerView recyclerView= (RecyclerView) v.findViewById(R.id.recycler_view_beverages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(),getBeverages()));
        return v;
    }
    public String toString()
    {
        return "Beverages Item";
    }
    public ArrayList<Items> getBeverages() {
        ArrayList<Items> i=new ArrayList<>();
        Items m;
        m=new Items("Pepsi",R.drawable.salad);
        i.add(m);

        m=new Items("Coke",R.drawable.panini);
        i.add(m);

        m=new Items("Dr. Pepper",R.drawable.wings);
        i.add(m);

        m=new Items("Lemonade",R.drawable.wings);
        i.add(m);

        m=new Items("Snapple",R.drawable.apple_salad);
        i.add(m);

        m=new Items("Diet Coke",R.drawable.smoothies);
        i.add(m);

        m=new Items("Water",R.drawable.chicken_burrito);
        i.add(m);

        m=new Items("Bai 5",R.drawable.catering);
        i.add(m);

        m=new Items("Vita Coco",R.drawable.catering);
        i.add(m);

        return i;
    }

}
