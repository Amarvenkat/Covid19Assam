package com.amar.covid19assam.ViewHolder;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19assam.R;

public class HelplineViewHolder extends RecyclerView.ViewHolder {

   public  Button statebtn;

    public HelplineViewHolder(@NonNull View itemView) {
        super(itemView);

        statebtn = (Button) itemView.findViewById(R.id.statebtn);

    }
}
