package com.example.admin.drawgroupchallenge.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.admin.drawgroupchallenge.R
import com.example.admin.drawgroupchallenge.data.entities.Country
import com.example.admin.drawgroupchallenge.databinding.AddCountryBinding
import com.example.admin.drawgroupchallenge.di.fragment.FragmentModule
import kotlinx.android.synthetic.main.add_country.*
import javax.inject.Inject

class AddCountryDialogFragment : BottomSheetDialogFragment() {

    @Inject
    lateinit var addCountryViewModel: AddCountryViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<AddCountryBinding>(inflater, R.layout.add_country, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        injectDependencies()
        setUpClickListeners()
    }

    private fun injectDependencies() {
        (activity as MainActivity).activityComponent.newFragmentComponent(FragmentModule(this)).inject(this)
    }

    private fun setUpClickListeners() {
        btnSave.setOnClickListener {
            addCountryViewModel.insertCountry(
                etCountryName.text.toString(),
                etGoldMedals.text.toString(),
                etSilverMedals.text.toString(),
                etBronzeMedals.text.toString()
            )
            dismiss()
        }
    }
}