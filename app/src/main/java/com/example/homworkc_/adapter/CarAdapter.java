package com.example.homworkc_.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homworkc_.CarViewHolders;
import com.example.homworkc_.R;
import com.example.homworkc_.data.Car;
import com.example.homworkc_.data.Pizza;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolders> {
    ArrayList<Car> arrayListNAME;

    public CarAdapter(ArrayList<Car> arrayListNAME) {
        this.arrayListNAME = arrayListNAME;
    }

    @NonNull
    @Override
    public CarViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolders(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lalafo, parent, false ));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolders holder, int position) {
        holder.onBind(arrayListNAME.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayListNAME.size();
    }
}
