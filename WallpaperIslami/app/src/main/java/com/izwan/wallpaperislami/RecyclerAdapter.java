package com.izwan.wallpaperislami;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by izwan on 20/09/17.
 */
public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder>{
    private final Context context;

    String [] name={"Wallpaper1","Wallpaper2","Wallpaper3","Wallpaper4",
            "Wallpaper5","Wallpaper6","Wallpaper7", "Wallpaper8"};
    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.r1.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,GridActivity.class);
            context.startActivity(intent);
        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }

}
