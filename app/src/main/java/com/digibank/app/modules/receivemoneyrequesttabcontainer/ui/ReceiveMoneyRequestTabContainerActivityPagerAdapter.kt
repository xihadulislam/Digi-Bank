package com.digibank.app.modules.receivemoneyrequesttabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import com.digibank.app.modules.receivemoneypersonal.ui.ReceiveMoneyPersonalFragment
import com.digibank.app.modules.receivemoneyrequest.ui.ReceiveMoneyRequestFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class ReceiveMoneyRequestTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_personal),MyApp.getInstance().resources.getString(R.string.lbl_business))

        val viewPages: List<Fragment> =
                listOf(ReceiveMoneyPersonalFragment(),ReceiveMoneyRequestFragment())

    }
}
