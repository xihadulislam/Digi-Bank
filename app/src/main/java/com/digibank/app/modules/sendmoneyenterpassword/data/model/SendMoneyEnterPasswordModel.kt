package com.digibank.app.modules.sendmoneyenterpassword.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class SendMoneyEnterPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMoneytransfer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_money_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryouraccoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryouraccoun1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_account2)

)
