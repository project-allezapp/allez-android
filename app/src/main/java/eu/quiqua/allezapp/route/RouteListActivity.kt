package eu.quiqua.allezapp.route

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import eu.quiqua.allezapp.R
import kotlinx.android.synthetic.main.activity_route_list.*

class RouteListActivity : AppCompatActivity() {

  @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_route_list)

    val model = RouteItemModel("My Nemesis", "blue", "Destroyed my pants", getDrawable(R.drawable.ic_launcher_foreground))

    val modelList = mutableListOf(model, model)
    val adapter = RouteListAdapter()

    route_list.adapter = adapter
    route_list.layoutManager = LinearLayoutManager(this)
    route_list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    adapter.updateRouteModelList(modelList)
  }
}
