package com.example.homworkc_;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homworkc_.data.Car;

public class CarViewHolders extends RecyclerView.ViewHolder {
    ImageView imageViewCar;
    TextView textViewSena, textViewCar;
    public CarViewHolders(@NonNull View itemView) {
        super(itemView);
        imageViewCar = itemView.findViewById(R.id.image_viem_car);
        textViewCar = itemView.findViewById(R.id.textView_car);
        textViewSena = itemView.findViewById(R.id.sena);

    }

    public void onBind(Car car) {
        imageViewCar.setImageResource(car.getImage());
        textViewCar.setText(car.getAge());
        textViewSena.setText(car.getSena());
    }
}
