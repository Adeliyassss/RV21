package com.example.rv21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rv21.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: FlowerAdapter
    var arrayList: ArrayList<FlowerModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillRecyclerView()
        binding.recyclerView.adapter = adapter
    }

    private fun fillRecyclerView() {
        arrayList.add(FlowerModel("Tulip", 250, R.drawable.tulip))
        arrayList.add(FlowerModel("Roses", 800, R.drawable.roses))
        arrayList.add(FlowerModel("Peony", 450, R.drawable.peony))
        arrayList.add(FlowerModel("Orchid", 900, R.drawable.orchid))
        arrayList.add(FlowerModel("Aster", 150, R.drawable.aster))
        arrayList.add(FlowerModel("Azalea", 520, R.drawable.azalea))
        arrayList.add(FlowerModel("Iris", 600, R.drawable.iris))
        arrayList.add(FlowerModel("Sunflower", 700, R.drawable.sunflower))
        arrayList.add(FlowerModel("Poppy", 365, R.drawable.poppy))
        arrayList.add(FlowerModel("Daisy", 870, R.drawable.daisy))
        adapter = FlowerAdapter(arrayList)
        binding.recyclerView.adapter
    }
}