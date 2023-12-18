package com.digibank.app.modules.rechargesuccess.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class RechargeSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratsorder: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recharge_done_successfully)

)
