package com.ibrahim.busschedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ibrahim.busschedule.databinding.FragmentNewScheduleBinding
import com.ibrahim.busschedule.databinding.FragmentScheduleListBinding


class ScheduleListFragment : Fragment() {
   private lateinit var binding: FragmentScheduleListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleListBinding.inflate(inflater,container,false)
        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_scheduleListFragment_to_newScheduleFragment)
        }
        val adapter = ScheduleAdapter{
            //findNavController().navigate(R.id.action_scheduleListFragment_to_newScheduleFragment)
        }
        binding.scheduleRV.layoutManager = LinearLayoutManager(activity)
        binding.scheduleRV.adapter = adapter
        adapter.submitList(scheduleList)
        return binding.root
    }

}