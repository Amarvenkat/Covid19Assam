package com.amar.covid19assam.ViewHolder;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19assam.R;

public class ZoneStateViewHolder extends RecyclerView.ViewHolder {
  public   Button btnstate;
    public ZoneStateViewHolder(@NonNull View itemView) {
        super(itemView);

        btnstate = (Button) itemView.findViewById(R.id.zonestatebtn);


    }
}
