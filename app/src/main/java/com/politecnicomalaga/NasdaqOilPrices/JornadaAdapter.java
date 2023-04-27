package com.politecnicomalaga.NasdaqOilPrices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class JornadaAdapter extends RecyclerView.Adapter<JornadaViewHolder> {

    private final LinkedList<Price> mList;
    private LayoutInflater mInflater;

    public JornadaAdapter(Context context,
                          LinkedList<Price> list) {
        mInflater = LayoutInflater.from(context);
        this.mList = list;
    }


    @NonNull
    @Override
    public JornadaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.day_list_item,
                parent, false);
        return new JornadaViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull JornadaViewHolder holder, int position) {
        //TODO: fill data
       holder.setDay(this.mList.get(position).getDay());
       holder.setPrice(this.mList.get(position).getPrice());


    }



    @Override
    public int getItemCount() {
        return mList.size();
    }

}
