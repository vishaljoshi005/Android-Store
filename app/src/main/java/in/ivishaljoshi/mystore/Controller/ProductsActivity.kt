package `in`.ivishaljoshi.mystore.Controller

import `in`.ivishaljoshi.mystore.Adapters.ProductRecycleView
import `in`.ivishaljoshi.mystore.R
import `in`.ivishaljoshi.mystore.Services.DataService
import `in`.ivishaljoshi.mystore.Utilities.EXTRA_CATEGORY
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter:ProductRecycleView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductRecycleView(this, DataService.getProducts(categoryType))


        var spanCount=2
        var screenSize = resources.configuration.screenWidthDp
        var orientation = resources.configuration.orientation

        if(orientation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        if(screenSize>720){
            spanCount = 3
        }





        val layoutManager = GridLayoutManager(this,spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
