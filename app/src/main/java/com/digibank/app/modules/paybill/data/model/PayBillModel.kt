package com.digibank.app.modules.paybill.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class PayBillModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaybill: String? = MyApp.getInstance().resources.getString(R.string.lbl_pay_bill)

)
