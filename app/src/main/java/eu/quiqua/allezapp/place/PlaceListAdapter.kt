package eu.quiqua.allezapp.place

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.quiqua.allezapp.R
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceListAdapter: RecyclerView.Adapter<PlaceListAdapter.ViewHolder>() {

  private var placeModelList: List<String> = listOf()


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(
        R.layout.item_place, parent,
        false)
    return ViewHolder(itemView)
  }

  override fun getItemCount(): Int = placeModelList.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bindPlaceModel(placeModelList[position])
  }

  fun updatePlaceModelList(list: List<String>) {
    placeModelList = list
    notifyDataSetChanged()
  }



  inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {

    fun bindPlaceModel(place: String) {
      view.place_name.text = place
    }
  }
}