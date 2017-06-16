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

public class Menu extends Fragment
{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.menu,null);

        RecyclerView recyclerView= (RecyclerView) v.findViewById(R.id.recycler_view_menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.setAdapter(new RecyclerAdapter(this.getActivity(),getMenu()));
        return v;
    }
public String toString()
{
    return "Menu";
}
    public ArrayList<Items> getMenu() {
        ArrayList<Items> i=new ArrayList<>();
        Items m;
        m=new Items("Salad",R.drawable.salad);
        i.add(m);

        m=new Items("Panini",R.drawable.panini);
        i.add(m);

        m=new Items("Wrap",R.drawable.wings);
        i.add(m);

        m=new Items("Wings",R.drawable.wings);
        i.add(m);

        m=new Items("Beverage",R.drawable.apple_salad);
        i.add(m);

        m=new Items("Snacks",R.drawable.smoothies);
        i.add(m);

        m=new Items("Burger",R.drawable.chicken_burrito);
        i.add(m);

        m=new Items("Catering",R.drawable.catering);
        i.add(m);

        m=new Items("Catering",R.drawable.catering);
        i.add(m);

        m=new Items("Smoothies",R.drawable.catering);
        i.add(m);

        m=new Items("Soups",R.drawable.catering);
        i.add(m);

        m=new Items("Hummus & Falafel",R.drawable.catering);
        i.add(m);

        return i;
    }




   /* Button salad,panini,wrap,falafel,burger,smoothie,drinks,snacks,soup,burritos,dessert,back_home,back_menu,wings;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        setTitle("Menu Items");

       // initUI();

        //setListener();

    }
*/
   /* private void initUI()
    {

        salad= (Button) findViewById(R.id.salad);
        panini= (Button) findViewById(R.id.panini);
        wrap= (Button) findViewById(R.id.wraps);
        falafel= (Button) findViewById(R.id.falafel);
        burritos= (Button) findViewById(R.id.burrito_qusedila);
        wings= (Button) findViewById(R.id.chicken_wings);
        burger= (Button) findViewById(R.id.beasty_burgers);
        soup= (Button) findViewById(R.id.soup);
        smoothie= (Button) findViewById(R.id.smoothies);
        snacks= (Button) findViewById(R.id.snacks);
        drinks= (Button) findViewById(R.id.drinks);
        dessert= (Button) findViewById(R.id.dessert);
        back_menu= (Button) findViewById(R.id.back_to_menu);
        back_home= (Button) findViewById(R.id.back_to_home);

    }

    private void setListener()
    {

        salad.setOnClickListener(this);
        panini.setOnClickListener(this);
        wrap.setOnClickListener(this);
        falafel.setOnClickListener(this);
        burritos.setOnClickListener(this);
        wings.setOnClickListener(this);
        burger.setOnClickListener(this);
        soup.setOnClickListener(this);
        smoothie.setOnClickListener(this);
        snacks.setOnClickListener(this);
        drinks.setOnClickListener(this);
        dessert.setOnClickListener(this);
        back_menu.setOnClickListener(this);
        back_home.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId()) {

            case R.id.salad:
                Intent i1=new Intent(Menu.this,Salads.class);
                startActivity(i1);
                break;

            case R.id.panini:
                break;

            case R.id.wraps:
                break;

            case R.id.falafel:
                break;

            case R.id.burrito_qusedila:
                break;

            case R.id.chicken_wings:
                break;

            case R.id.beasty_burgers:
                break;

            case R.id.soup:
                break;

            case R.id.smoothies:
                break;

            case R.id.snacks:
                break;

            case R.id.drinks:
                break;

            case R.id.dessert:
                break;

            case R.id.back_to_menu:
                break;

            case R.id.back_to_home:
                Intent i14 = new Intent(Menu.this, MainActivity.class);
                startActivity(i14);
                break;

            default:
                break;

        }
    }*/
}
