package com.digibank.app.modules.receivemoneyrequesttabcontainer.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class ReceiveMoneyRequestTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMoneyrequest: String? = MyApp.getInstance().resources.getString(R.string.lbl_money_request)

)
