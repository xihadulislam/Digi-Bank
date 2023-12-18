package com.digibank.app.modules.addperson.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseActivity
import com.digibank.app.databinding.ActivityAddPersonBinding
import com.digibank.app.modules.addcardone.ui.AddCardOneActivity
import com.digibank.app.modules.addperson.`data`.viewmodel.AddPersonVM
import kotlin.String
import kotlin.Unit

class AddPersonActivity : BaseActivity<ActivityAddPersonBinding>(R.layout.activity_add_person) {
  private val viewModel: AddPersonVM by viewModels<AddPersonVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addPersonVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = AddCardOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_PERSON_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddPersonActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
