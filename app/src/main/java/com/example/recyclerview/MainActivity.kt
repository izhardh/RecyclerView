package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private var itemAdapter: ItemAdapter? = null
    private var exerciseList: ArrayList<CharacterModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        exerciseList = Constant.defaultCharacter()
        exerciseStatusRV()
    }

    //Menampilkan list recyclerview
    private fun exerciseStatusRV(){
        binding?.rvItemLists?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        itemAdapter = ItemAdapter(exerciseList!!)
        binding?.rvItemLists?.adapter = itemAdapter
    }
}