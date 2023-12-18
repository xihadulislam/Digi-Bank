package com.digibank.app.modules.paybill.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class BillRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtElectricitybill: String? =
      MyApp.getInstance().resources.getString(R.string.msg_electricity_bill)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCard3303: String? = MyApp.getInstance().resources.getString(R.string.msg_pay_bill_of_this)

)
