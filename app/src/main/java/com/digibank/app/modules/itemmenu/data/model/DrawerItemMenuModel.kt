package com.digibank.app.modules.itemmenu.`data`.model

import com.digibank.app.R
import com.digibank.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuzanejobs: String? = MyApp.getInstance().resources.getString(R.string.lbl_suzane_jobs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_gmail_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavoriteoutfits: String? = MyApp.getInstance().resources.getString(R.string.lbl_share_app)

)
