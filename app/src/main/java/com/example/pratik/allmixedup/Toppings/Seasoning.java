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

public class Seasoning extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.recycler_view_model,null);

        RecyclerView recyclerView= (RecyclerView) v.findViewById(R.id.recycler_view_model);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(),getSeasoning()));
        return v;
    }
    public String toString()
    {
        return "Seasoning";
    }
    public ArrayList<Items> getSeasoning() {
        ArrayList<Items> i=new ArrayList<>();
        Items m;
        m=new Items("Salt",R.drawable.salad);
        i.add(m);

        m=new Items("Pepper",R.drawable.panini);
        i.add(m);

        m=new Items("Salt & Pepper",R.drawable.wings);
        i.add(m);

        m=new Items("Oregano",R.drawable.wings);
        i.add(m);



        return i;
    }

}
