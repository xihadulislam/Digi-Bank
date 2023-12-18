package com.digibank.app.modules.addcardone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityAddCardOneBinding
import com.digibank.app.modules.addcardone.`data`.viewmodel.AddCardOneVM
import com.digibank.app.modules.paymentsuccess.ui.PaymentSuccessActivity
import kotlin.String
import kotlin.Unit

class AddCardOneActivity : BaseActivity<ActivityAddCardOneBinding>(R.layout.activity_add_card_one) {
  private val viewModel: AddCardOneVM by viewModels<AddCardOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addCardOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = PaymentSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_CARD_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddCardOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
