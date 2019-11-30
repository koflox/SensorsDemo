package com.example.sensorsdemo.ui

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.sensorsdemo.R
import com.example.sensorsdemo.ui.tabs.EnvironmentalSensorsFragment
import com.example.sensorsdemo.ui.tabs.MotionSensorsFragment
import com.example.sensorsdemo.ui.tabs.PositionSensorsFragment

private val TAB_TITLES = arrayOf(
        R.string.tab_motion_sensors,
        R.string.tab_position_sensors,
        R.string.tab_environmental_sensors
)

class SectionsPagerAdapter(
        private val context: Context,
        fm: FragmentManager
) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MotionSensorsFragment.newInstance()
            1 -> PositionSensorsFragment.newInstance()
            2 -> EnvironmentalSensorsFragment.newInstance()
            else -> MotionSensorsFragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int = TAB_TITLES.size

}