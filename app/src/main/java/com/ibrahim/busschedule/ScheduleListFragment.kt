package com.ibrahim.busschedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ibrahim.busschedule.databinding.FragmentNewScheduleBinding
import com.ibrahim.busschedule.databinding.FragmentScheduleListBinding


class ScheduleListFragment : Fragment() {
   private lateinit var binding: FragmentScheduleListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleListBinding.inflate(inflater,container,false)
        findNavController().navigate(R.id.action_scheduleListFragment_to_newScheduleFragment)
        return binding.root
    }

}