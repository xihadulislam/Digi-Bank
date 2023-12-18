package com.digibank.app.modules.homecontainer.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class HomeContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivityTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
