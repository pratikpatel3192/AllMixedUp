package com.example.pratik.allmixedup.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pratik.allmixedup.R;
import com.example.pratik.allmixedup.menuFragments.ClickListener;

/**
 * Created by prati on 05-06-2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView img;
    TextView txt;
    ClickListener itemClickListner;

    public MyViewHolder(View itemView)
    {
        super(itemView);
        img= (ImageView) itemView.findViewById(R.id.imageView_rec);
        txt= (TextView) itemView.findViewById(R.id.textView_rec);

        itemView.setOnClickListener(this);
    }
    public void setItemClickListner(ClickListener cl)
    {
        this.itemClickListner =cl;
    }
    public void onClick(View v) {
        this.itemClickListner.onClick(v,getLayoutPosition());
    }
}

