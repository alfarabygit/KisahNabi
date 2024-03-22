package com.example.kisahnabi;

import android.view.View;
import android.widget.TextView;


import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MainHolder extends RecyclerView.ViewHolder {
    public TextView txtName;
    public CardView cvList;

    public MainHolder(View view) {
        super(view);
        cvList = view.findViewById(R.id.cvList);
        txtName = view.findViewById(R.id.txtName);
    }
}
