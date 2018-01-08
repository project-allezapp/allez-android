package eu.quiqua.allezapp.route_details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import eu.quiqua.allezapp.R

import kotlinx.android.synthetic.main.activity_route_detail.*

class RouteDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_detail)
        setSupportActionBar(toolbar)
        val position = intent.getIntExtra("ITEM_POSITION", 0)

        myId.text = String.format("Hello %d", position)
    }

    companion object {
        fun newIntent(context: Context, position: Int) : Intent {
            val intent = Intent(context, RouteDetailActivity::class.java)
            intent.putExtra("ITEM_POSITION", position)
            return intent
        }
    }

}
