package com.digibank.app.modules.mobileprepaidtwo.ui

import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityMobilePrepaidTwoBinding
import com.digibank.app.modules.mobileprepaidthree.ui.MobilePrepaidThreeActivity
import com.digibank.app.modules.mobileprepaidtwo.`data`.viewmodel.MobilePrepaidTwoVM
import kotlin.String
import kotlin.Unit

class MobilePrepaidTwoActivity :
    BaseActivity<ActivityMobilePrepaidTwoBinding>(R.layout.activity_mobile_prepaid_two) {
  private val viewModel: MobilePrepaidTwoVM by viewModels<MobilePrepaidTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mobilePrepaidTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = MobilePrepaidThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MOBILE_PREPAID_TWO_ACTIVITY"

  }
}
