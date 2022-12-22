package com.example.homworkc_;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homworkc_.data.Clothes;

public class ClothseViewHolders extends RecyclerView.ViewHolder {
    ImageView imageViewClothes;
    TextView textView1, textView2;
    @SuppressLint("CutPasteId")
    public ClothseViewHolders(@NonNull View itemView) {
        super(itemView);
        imageViewClothes = itemView.findViewById(R.id.image_viem_clothes);
        textView1 = itemView.findViewById(R.id.textView_clothes);
        textView2 = itemView.findViewById(R.id.sena);
    }

    public void OnBind(Clothes clothes){
        imageViewClothes.setImageResource(clothes.getImage());
        textView1.setText(clothes.getName());
        textView1.setText(clothes.getSena());
    }
}
