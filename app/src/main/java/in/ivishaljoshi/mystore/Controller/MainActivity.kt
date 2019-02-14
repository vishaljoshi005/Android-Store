package `in`.ivishaljoshi.mystore.Controller

import `in`.ivishaljoshi.mystore.Adapters.CategoryAdapter
import `in`.ivishaljoshi.mystore.Model.Category
import `in`.ivishaljoshi.mystore.R
import `in`.ivishaljoshi.mystore.Services.DataService
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }


}
