package com.digibank.app.modules.electricbill.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityElectricBillBinding
import com.digibank.app.modules.bilpaymentsuccess.ui.BilPaymentSuccessActivity
import com.digibank.app.modules.electricbill.`data`.viewmodel.ElectricBillVM
import kotlin.String
import kotlin.Unit

class ElectricBillActivity :
    BaseActivity<ActivityElectricBillBinding>(R.layout.activity_electric_bill) {
  private val viewModel: ElectricBillVM by viewModels<ElectricBillVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.electricBillVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSendOtp.setOnClickListener {
      val destIntent = BilPaymentSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ELECTRIC_BILL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ElectricBillActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
