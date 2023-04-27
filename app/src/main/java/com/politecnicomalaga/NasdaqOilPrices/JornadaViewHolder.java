package com.politecnicomalaga.NasdaqOilPrices;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class JornadaViewHolder extends RecyclerView.ViewHolder {

    //ESTADO

    //TODO: declare attributes to hold two textviews, day and money
    final JornadaAdapter mAdapter;
    private TextView tvPrice;
    private TextView tvDay;


    //COMPORTAMIENTO
    public JornadaViewHolder(View itemView, JornadaAdapter adapter) {
        super(itemView);

        tvDay = itemView.findViewById(R.id.day);
        tvPrice = itemView.findViewById(R.id.price);
        this.mAdapter = adapter;
    }

    public void setDay(String data) {
        tvDay.setText(data);
    }

    public void setPrice(String data) {
        tvPrice.setText(data);
    }
}
