package `in`.ivishaljoshi.mystore.Controller

import `in`.ivishaljoshi.mystore.R
import `in`.ivishaljoshi.mystore.Utilities.EXTRA_CATEGORY
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }
}
