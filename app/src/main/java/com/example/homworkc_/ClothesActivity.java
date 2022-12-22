package com.example.homworkc_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homworkc_.adapter.CarAdapter;
import com.example.homworkc_.adapter.ClotherAdapter;
import com.example.homworkc_.adapter.PizzaAdapter;
import com.example.homworkc_.data.Car;
import com.example.homworkc_.data.Clothes;
import com.example.homworkc_.data.Pizza;
import com.example.homworkc_.databinding.ActivityClothesBinding;

import java.util.ArrayList;

public class ClothesActivity extends AppCompatActivity {

    private ActivityClothesBinding binding;
    ArrayList<Clothes> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClothesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        init();
    }

    private void init() {
        ClotherAdapter adapter = new ClotherAdapter(arrayList);
        binding.recyclerview.setAdapter(adapter);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Clothes("good","21",R.drawable.bf93f38dd37dd26a86ebe7701130d513));
    }
}