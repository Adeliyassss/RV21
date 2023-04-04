package com.example.rv21

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rv21.databinding.ItemFlowerBinding

class FlowerAdapter(var arrayListFlowers: ArrayList<FlowerModel>) :
    RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        return FlowerViewHolder(
            ItemFlowerBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.onBind(arrayListFlowers[position])
    }

    override fun getItemCount(): Int {
        return arrayListFlowers.size
    }

    class FlowerViewHolder(private val binding: ItemFlowerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun onBind(flower: FlowerModel) {
            binding.textView.text = flower.name + " ,Price:  " + flower.price.toString()
            binding.imageFlower.setImageResource(flower.img)
        }
    }
}
