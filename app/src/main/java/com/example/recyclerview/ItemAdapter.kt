package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemsRowBinding

class ItemAdapter(private val items: ArrayList<CharacterModel>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    //binding tiap id
    class ViewHolder(binding: ItemsRowBinding):RecyclerView.ViewHolder(binding.root){
        val llMain = binding.llMain
        val tvName = binding.tvName
        val tvCharacter = binding.tvDeskripsi
        val ivImage = binding.ivVisual
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemsRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    //Menamplikna string tiap id item dan membuat warna ditiap garis
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: CharacterModel =items[position]

        holder.tvName.text = model.getName()
        holder.tvCharacter.text = model.getDeskripsi()
        holder.ivImage.setImageResource(model.getImage())

        if(position % 2 == 0){
            holder.llMain.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.lightgrey))
        }else{
            holder.llMain.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.white))
        }
    }

}