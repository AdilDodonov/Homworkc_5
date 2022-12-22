package com.example.homworkc_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.homworkc_.adapter.CarAdapter;
import com.example.homworkc_.adapter.PizzaAdapter;
import com.example.homworkc_.data.Car;
import com.example.homworkc_.data.Pizza;
import com.example.homworkc_.databinding.ActivityPizzaBinding;

import java.util.ArrayList;

public class CarActivity extends AppCompatActivity {

    private ActivityPizzaBinding binding;
    ArrayList<Car> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPizzaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        init();
    }

    private void init() {
        CarAdapter adapter = new CarAdapter(arrayList);
        binding.recyclerview.setAdapter(adapter);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Car("good","21","200",R.drawable.img));
    }
}