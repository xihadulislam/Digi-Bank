package com.digibank.app.modules.bilpaymentsuccess.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class BilPaymentSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratsorder: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bill_paid_successfully)

)
