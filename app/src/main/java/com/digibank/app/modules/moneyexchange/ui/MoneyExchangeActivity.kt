package com.digibank.app.modules.moneyexchange.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityMoneyExchangeBinding
import com.digibank.app.modules.moneyexchange.`data`.viewmodel.MoneyExchangeVM
import kotlin.String
import kotlin.Unit

class MoneyExchangeActivity :
    BaseActivity<ActivityMoneyExchangeBinding>(R.layout.activity_money_exchange) {
  private val viewModel: MoneyExchangeVM by viewModels<MoneyExchangeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.moneyExchangeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MONEY_EXCHANGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MoneyExchangeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
