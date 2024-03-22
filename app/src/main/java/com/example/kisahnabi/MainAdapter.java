package com.example.kisahnabi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainHolder> {
    public List<ModelMain> modelMainList;
    private Context mContext;

    private MainAdapter.onSelectData onSelectData;

    public interface onSelectData {
        void onSelected(ModelMain modelMain);
    }

    public MainAdapter(Context context, List<ModelMain> android, MainAdapter.onSelectData onSelectData) {
        this.mContext = context;
        this.modelMainList = android;
        this.onSelectData = onSelectData;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item_main, viewGroup, false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(MainHolder viewHolder, int i) {
        final ModelMain gass = modelMainList.get(i);
        viewHolder.txtName.setText(gass.getName());
        viewHolder.cvList.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onSelectData.onSelected(gass);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelMainList.size();
    }
}
