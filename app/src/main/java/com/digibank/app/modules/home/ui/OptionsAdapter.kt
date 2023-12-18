package com.digibank.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digibank.app.R
import com.digibank.app.databinding.RowOptionsBinding
import com.digibank.app.modules.home.`data`.model.OptionsRowModel
import kotlin.Int
import kotlin.collections.List

class OptionsAdapter(
  var list: List<OptionsRowModel>
) : RecyclerView.Adapter<OptionsAdapter.RowOptionsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOptionsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_options,parent,false)
    return RowOptionsVH(view)
  }

  override fun onBindViewHolder(holder: RowOptionsVH, position: Int) {
    val optionsRowModel = OptionsRowModel()
    // TODO uncomment following line after integration with data source
    // val optionsRowModel = list[position]
    holder.binding.optionsRowModel = optionsRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OptionsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: OptionsRowModel
    ) {
    }
  }

  inner class RowOptionsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOptionsBinding = RowOptionsBinding.bind(itemView)
    init {
      binding.linearOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, OptionsRowModel())
      }
    }
  }
}
