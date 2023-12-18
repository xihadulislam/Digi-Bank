package com.digibank.app.modules.banktobanktwo.ui

import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityBankToBankTwoBinding
import com.digibank.app.modules.banktobankthree.ui.BankToBankThreeActivity
import com.digibank.app.modules.banktobanktwo.`data`.viewmodel.BankToBankTwoVM
import kotlin.String
import kotlin.Unit

class BankToBankTwoActivity :
    BaseActivity<ActivityBankToBankTwoBinding>(R.layout.activity_bank_to_bank_two) {
  private val viewModel: BankToBankTwoVM by viewModels<BankToBankTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bankToBankTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = BankToBankThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BANK_TO_BANK_TWO_ACTIVITY"

  }
}
