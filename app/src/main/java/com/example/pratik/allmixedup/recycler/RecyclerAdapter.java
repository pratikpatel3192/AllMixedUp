package com.example.pratik.allmixedup.recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.example.pratik.allmixedup.BeverageActivity;
import com.example.pratik.allmixedup.BurgerActivity;
import com.example.pratik.allmixedup.BurritoActivity;
import com.example.pratik.allmixedup.CateringActivity;
import com.example.pratik.allmixedup.HummusFalafelActivity;
import com.example.pratik.allmixedup.MainActivity;
import com.example.pratik.allmixedup.PaniniActivity;
import com.example.pratik.allmixedup.R;
import com.example.pratik.allmixedup.SaladActivity;
import com.example.pratik.allmixedup.SmoothieActivity;
import com.example.pratik.allmixedup.SnacksActivity;
import com.example.pratik.allmixedup.SoupsActivity;
import com.example.pratik.allmixedup.WingsActivity;
import com.example.pratik.allmixedup.WrapActivity;
import com.example.pratik.allmixedup.menuFragments.ClickListener;
import com.example.pratik.allmixedup.menuFragments.Items;
import com.example.pratik.allmixedup.menuFragments.Smoothie;

import java.util.ArrayList;

/**
 * Created by prati on 05-06-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<Items> itemses;

    public RecyclerAdapter(Context c, ArrayList<Items> itemses) {
        this.c = c;
        this.itemses = itemses;
    }

    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);
        MyViewHolder holder=new MyViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.img.setImageResource(itemses.get(position).getImage());
        holder.txt.setText(itemses.get(position).getName());

        holder.setItemClickListner(new ClickListener() {
            @Override
            public void onClick(View view, int pos) {
                /*if(itemses.get(pos).getName()=="Salad") {
                   // Toast.makeText(c, "Salad Selected", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(c.getApplicationContext(), SaladActivity.class);
                    c.startActivity(intent);


                }
                else
                {
                    Toast.makeText(c, itemses.get(pos).getName(), Toast.LENGTH_SHORT).show();
                }*/

                switch(itemses.get(pos).getName())
                {
                    case "Salad":
                        Intent intent1=new Intent(c.getApplicationContext(), SaladActivity.class);
                        c.startActivity(intent1);
                        break;
                    case "Panini":
                        Intent intent2=new Intent(c.getApplicationContext(), PaniniActivity.class);
                        c.startActivity(intent2);
                        break;
                    case "Wrap":
                        Intent intent3=new Intent(c.getApplicationContext(), WrapActivity.class);
                        c.startActivity(intent3);
                        break;
                    case "Wings":
                        Intent intent4=new Intent(c.getApplicationContext(), WingsActivity.class);
                        c.startActivity(intent4);
                        break;
                    case "Burrito":
                        Intent intent5=new Intent(c.getApplicationContext(), BurritoActivity.class);
                        c.startActivity(intent5);
                        break;
                    case "Beverage":
                        Intent intent6=new Intent(c.getApplicationContext(), BeverageActivity.class);
                        c.startActivity(intent6);
                        break;
                    case "Snacks":
                        Intent intent7=new Intent(c.getApplicationContext(), SnacksActivity.class);
                        c.startActivity(intent7);
                        break;
                    case "Catering":
                        Intent intent8=new Intent(c.getApplicationContext(), CateringActivity.class);
                        c.startActivity(intent8);
                        break;
                    case "Burger":
                        Intent intent9=new Intent(c.getApplicationContext(), BurgerActivity.class);
                        c.startActivity(intent9);
                        break;
                    case "Hummus & Falafel":
                        Intent intent10=new Intent(c.getApplicationContext(), HummusFalafelActivity.class);
                        c.startActivity(intent10);
                        break;
                    case "Soups":
                        Intent intent11=new Intent(c.getApplicationContext(), SoupsActivity.class);
                        c.startActivity(intent11);
                        break;
                    case "Smoothies":
                        Intent intent12=new Intent(c.getApplicationContext(), SmoothieActivity.class);
                        c.startActivity(intent12);
                        break;
                }
                Toast.makeText(c, itemses.get(pos).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return itemses.size();
    }
}
