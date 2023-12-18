package com.digibank.app.modules.rechargesuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityRechargeSuccessBinding
import com.digibank.app.modules.rechargesuccess.`data`.viewmodel.RechargeSuccessVM
import kotlin.String
import kotlin.Unit

class RechargeSuccessActivity :
    BaseActivity<ActivityRechargeSuccessBinding>(R.layout.activity_recharge_success) {
  private val viewModel: RechargeSuccessVM by viewModels<RechargeSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rechargeSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RECHARGE_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RechargeSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
