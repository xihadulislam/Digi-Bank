package com.digibank.app.modules.home.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeback: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalbalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_567_12)

)
