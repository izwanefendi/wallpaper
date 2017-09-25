package com.izwan.wallpaperislami;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by izwan on 20/09/17.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1, tv2;
    RelativeLayout r1;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.daftar_judul);
        tv2 = (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        r1 = (RelativeLayout) itemView.findViewById(R.id.relative);
    }
}
