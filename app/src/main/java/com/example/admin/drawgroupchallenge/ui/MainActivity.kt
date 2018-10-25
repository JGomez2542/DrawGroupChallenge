package com.example.admin.drawgroupchallenge.ui

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.admin.drawgroupchallenge.AppController
import com.example.admin.drawgroupchallenge.databinding.ActivityMainBinding
import com.example.admin.drawgroupchallenge.di.activity.ActivityComponent
import com.example.admin.drawgroupchallenge.di.activity.ActivityModule
import com.example.admin.drawgroupchallenge.utils.BOTTOM_SHEET
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var mainBinding: ActivityMainBinding

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies()
        mainBinding.setLifecycleOwner(this)
        mainBinding.viewModel = mainViewModel
        mainViewModel.getMedals().observe(this, Observer {
            recyclerView.apply {
                adapter = it
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        })
    }

    fun addCountry(view: View) {
        val fragment = AddCountryDialogFragment()
        fragment.show(supportFragmentManager, BOTTOM_SHEET)
    }

    private fun injectDependencies() {
        activityComponent =
                (application as AppController).applicationComponent.newActivityComponent(ActivityModule(this))
        activityComponent.inject(this)
    }
}
