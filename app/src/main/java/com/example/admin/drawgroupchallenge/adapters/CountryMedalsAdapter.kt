package com.example.admin.drawgroupchallenge.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.admin.drawgroupchallenge.R
import com.example.admin.drawgroupchallenge.data.entities.Country
import com.example.admin.drawgroupchallenge.databinding.RecyclerItemBinding

class CountryMedalsAdapter(var countryList: List<Country>) : RecyclerView.Adapter<CountryMedalsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CountryMedalsAdapter.ViewHolder {
        val binding = DataBindingUtil.inflate<RecyclerItemBinding>(
            LayoutInflater.from(viewGroup.context),
            R.layout.recycler_item, viewGroup, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount() = countryList.size

    override fun onBindViewHolder(holder: CountryMedalsAdapter.ViewHolder, position: Int) {
        val temp = countryList[position]
        holder.binding.apply {
            countryName.text = temp.countryName
            tvBronze.text = temp.bronzeMedals.toString()
            tvSilver.text = temp.silverMedals.toString()
            tvGold.text = temp.goldMedals.toString()
            tvTotal.text = "Total ${temp.totalMedals}"
        }
    }

    class ViewHolder(var binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)
}