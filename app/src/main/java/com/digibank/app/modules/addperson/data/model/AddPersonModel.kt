package com.digibank.app.modules.addperson.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class AddPersonModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewcontact: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_contact)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCardNumberValue: String? = null
)
