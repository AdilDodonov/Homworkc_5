package com.example.homworkc_.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homworkc_.ClothseViewHolders;
import com.example.homworkc_.R;
import com.example.homworkc_.data.Clothes;

import java.util.ArrayList;

public class ClotherAdapter extends RecyclerView.Adapter<ClothseViewHolders> {
    ArrayList<Clothes> arrayListName;

    public ClotherAdapter(ArrayList<Clothes> arrayListName) {
        this.arrayListName = arrayListName;
    }

    @NonNull
    @Override
    public ClothseViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClothseViewHolders(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_clothes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClothseViewHolders holder, int position) {
        holder.OnBind(arrayListName.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayListName.size();
    }
}
