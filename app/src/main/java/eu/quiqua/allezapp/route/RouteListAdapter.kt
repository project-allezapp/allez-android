package eu.quiqua.allezapp.route

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.quiqua.allezapp.R
import kotlinx.android.synthetic.main.item_route.view.*

class RouteListAdapter: RecyclerView.Adapter<RouteListAdapter.ViewHolder>() {


  private var routeModelList: List<RouteItemModel> = listOf()


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RouteListAdapter.ViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(
        R.layout.item_place, parent,
        false)
    return ViewHolder(itemView)
  }

  override fun getItemCount(): Int = routeModelList.size


  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bindRouteModel(routeModelList[position])
  }

  fun updateRouteModelList(list: List<RouteItemModel>) {
    routeModelList = list
    notifyDataSetChanged()
  }

  inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {

    fun bindRouteModel(route: RouteItemModel) {
      view.route_description.text = route.description
      view.route_grade.text = route.grade
      view.route_logo.setImageDrawable(route.logo)
      view.route_name.text = route.name
    }
  }

}