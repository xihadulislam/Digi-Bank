package com.digibank.app.modules.home.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class OptionsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSendmoney: String? = MyApp.getInstance().resources.getString(R.string.lbl_send_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCard3303: String? = MyApp.getInstance().resources.getString(R.string.lbl_to_acc_to_acc)

)
