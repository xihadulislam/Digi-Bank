package com.digibank.app.modules.sendmoney.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivitySendMoneyBinding
import com.digibank.app.modules.addperson.ui.AddPersonActivity
import com.digibank.app.modules.entermoney.ui.EnterMoneyActivity
import com.digibank.app.modules.sendmoney.`data`.model.ProfileRowModel
import com.digibank.app.modules.sendmoney.`data`.viewmodel.SendMoneyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SendMoneyActivity : BaseActivity<ActivitySendMoneyBinding>(R.layout.activity_send_money) {
  private val viewModel: SendMoneyVM by viewModels<SendMoneyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val profileAdapter = ProfileAdapter(viewModel.profileList.value?:mutableListOf())
    binding.recyclerProfile.adapter = profileAdapter
    profileAdapter.setOnItemClickListener(
    object : ProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileRowModel) {
        onClickRecyclerProfile(view, position, item)
      }
    }
    )
    viewModel.profileList.observe(this) {
      profileAdapter.updateData(it)
    }
    binding.sendMoneyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowovalOne.setOnClickListener {
      val destIntent = EnterMoneyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnPlusOne.setOnClickListener {
      val destIntent = AddPersonActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerProfile(
    view: View,
    position: Int,
    item: ProfileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEND_MONEY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SendMoneyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
