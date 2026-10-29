package com.example.disasterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ItemDisasterBinding

class DisasterAdapter(): RecyclerView.Adapter<DisasterAdapter.ItemDisasterViewHolder>() {
    inner class ItemDisasterViewHolder(private val binding: ItemDisasterBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemDisasterViewHolder {
        val binding =
            ItemDisasterBinding.inflate(LayoutInflater.from(parent.context), parent,
                false)
        return ItemDisasterViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return 5
    }
    override fun onBindViewHolder(holder: DisasterAdapter.ItemDisasterViewHolder, position:
    Int) {
        // TODO("Not yet implemented")
    }
}

