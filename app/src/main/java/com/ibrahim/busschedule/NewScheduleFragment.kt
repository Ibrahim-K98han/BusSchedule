package com.ibrahim.busschedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import com.ibrahim.busschedule.databinding.FragmentNewScheduleBinding

class NewScheduleFragment : Fragment() {
    private lateinit var binding:FragmentNewScheduleBinding
    private var busType = busTypeEconomy
    private var from = "Dhaka"
    private var to = "Dhaka"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewScheduleBinding.inflate(inflater,container,false)
        initSpinner()
        initBusTypeRadioGroup()
        binding.showDateTV.setOnClickListener {

        }
        binding.showTimeTV.setOnClickListener {

        }
        return binding.root
    }

    private fun initBusTypeRadioGroup() {
        binding.busTypeRG.setOnCheckedChangeListener { radioGroup, i ->
            val rb:RadioButton = radioGroup.findViewById(i)
            busType = rb.text.toString()
        }
    }

    private fun initSpinner() {
        val adapter = ArrayAdapter<String>(
            requireActivity(),
            android.R.layout.simple_spinner_dropdown_item,
            cityList
        )
        binding.citySpinnerFrom.adapter = adapter
        binding.citySpinnerTo.adapter = adapter
        binding.citySpinnerFrom.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                from = p0?.getItemAtPosition(p2).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        binding.citySpinnerTo.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                to = p0?.getItemAtPosition(p2).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}