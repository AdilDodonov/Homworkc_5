package com.example.homworkc_.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homworkc_.PizzaViewHolder;
import com.example.homworkc_.R;
import com.example.homworkc_.data.Pizza;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    ArrayList<Pizza> arrayListNAME;

    public PizzaAdapter(ArrayList<Pizza> arrayListNAME) {
        this.arrayListNAME = arrayListNAME;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PizzaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza, parent ,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        holder.onBind(arrayListNAME.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayListNAME.size();
    }
}
