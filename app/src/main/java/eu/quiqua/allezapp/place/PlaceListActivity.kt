package eu.quiqua.allezapp.place

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import eu.quiqua.allezapp.R
import kotlinx.android.synthetic.main.activity_main.*

class PlaceListActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val strings = mutableListOf("Berta Block", "Bouldergarten", "BoulderKlub", "Boulderworx",
        "Bright Site",
        "Cliffhanger", "Kegel", "Ostbloc", "Südbloc")

    val adapter = PlaceListAdapter()
    placeList.adapter = adapter
    placeList.layoutManager = LinearLayoutManager(this)
    placeList.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    adapter.updatePlaceModelList(strings)
  }
}
