package com.digibank.app.modules.moneysentsuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityMoneySentSuccessBinding
import com.digibank.app.modules.moneysentsuccess.`data`.viewmodel.MoneySentSuccessVM
import kotlin.String
import kotlin.Unit

class MoneySentSuccessActivity :
    BaseActivity<ActivityMoneySentSuccessBinding>(R.layout.activity_money_sent_success) {
  private val viewModel: MoneySentSuccessVM by viewModels<MoneySentSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.moneySentSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MONEY_SENT_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MoneySentSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
