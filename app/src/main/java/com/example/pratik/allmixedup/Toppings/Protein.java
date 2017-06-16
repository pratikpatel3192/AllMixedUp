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

public class Protein extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.protein,null);

        RecyclerView recyclerView= (RecyclerView) v.findViewById(R.id.recycler_view_protein);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(),getprotein()));
        return v;
    }
    public String toString()
    {
        return "Protein";
    }
    public ArrayList<Items> getprotein() {
        ArrayList<Items> i=new ArrayList<>();
        Items m;
        m=new Items("Grilled Chicken",R.drawable.salad);
        i.add(m);

        m=new Items("Tuna",R.drawable.panini);
        i.add(m);

        m=new Items("Individual Tuna",R.drawable.wings);
        i.add(m);

        m=new Items("Ham",R.drawable.salad);
        i.add(m);

        m=new Items("Smoked Turkey",R.drawable.panini);
        i.add(m);

        m=new Items("Salmon",R.drawable.wings);
        i.add(m);

        m=new Items("Crispy/Breaded Chicken",R.drawable.panini);
        i.add(m);

        m=new Items("Steak",R.drawable.wings);
        i.add(m);

        m=new Items("Tofu",R.drawable.wings);
        i.add(m);




        return i;
    }

}
