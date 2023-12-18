package com.digibank.app.modules.entermoney.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityEnterMoneyBinding
import com.digibank.app.modules.addperson.ui.AddPersonActivity
import com.digibank.app.modules.entermoney.`data`.viewmodel.EnterMoneyVM
import com.digibank.app.modules.sendmoneyenterpassword.ui.SendMoneyEnterPasswordActivity
import kotlin.String
import kotlin.Unit

class EnterMoneyActivity : BaseActivity<ActivityEnterMoneyBinding>(R.layout.activity_enter_money) {
  private val viewModel: EnterMoneyVM by viewModels<EnterMoneyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enterMoneyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPlusOne.setOnClickListener {
      val destIntent = AddPersonActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = SendMoneyEnterPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ENTER_MONEY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnterMoneyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
