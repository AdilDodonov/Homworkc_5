package com.example.homworkc_;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homworkc_.data.Pizza;

public class PizzaViewHolder extends RecyclerView.ViewHolder {
    ImageView imageViewPizza;
    TextView textView1, textView2;

    @SuppressLint("CutPasteId")
    public PizzaViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewPizza = itemView.findViewById(R.id.image_viem_pizza);
        textView1 = itemView.findViewById(R.id.textView_pizza);
        textView2 = itemView.findViewById(R.id.sena);
    }

    public void onBind(Pizza pizza) {
        textView1.setText(pizza.getName());
        textView2.setText(pizza.getSena());
        imageViewPizza.setImageResource(pizza.getImage());
    }
}
