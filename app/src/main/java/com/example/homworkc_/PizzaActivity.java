package com.example.homworkc_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homworkc_.adapter.PizzaAdapter;
import com.example.homworkc_.data.Pizza;
import com.example.homworkc_.databinding.ActivityPizzaBinding;

import java.util.ArrayList;

public class PizzaActivity extends AppCompatActivity {

    private ActivityPizzaBinding binding;
    ArrayList<Pizza> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPizzaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        init();
    }

    private void init() {
        PizzaAdapter adapter = new PizzaAdapter(arrayList);
        binding.recyclerview.setAdapter(adapter);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Pizza("good","200",R.drawable.pizza));
    }
}