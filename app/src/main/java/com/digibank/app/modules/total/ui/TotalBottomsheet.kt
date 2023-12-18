package com.digibank.app.modules.total.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.digibank.app.R
import com.digibank.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.digibank.app.databinding.BottomsheetTotalBinding
import com.digibank.app.modules.total.`data`.viewmodel.TotalVM
import kotlin.String
import kotlin.Unit

class TotalBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetTotalBinding>(R.layout.bottomsheet_total) {
  private val viewModel: TotalVM by viewModels<TotalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.totalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TOTAL_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): TotalBottomsheet {
      val fragment = TotalBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
