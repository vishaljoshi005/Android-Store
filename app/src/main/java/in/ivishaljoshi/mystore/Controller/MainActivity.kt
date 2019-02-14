package `in`.ivishaljoshi.mystore.Controller

import `in`.ivishaljoshi.mystore.Adapters.CategoryAdapter
import `in`.ivishaljoshi.mystore.Adapters.CategoryRecycleAdapter
import `in`.ivishaljoshi.mystore.Model.Category
import `in`.ivishaljoshi.mystore.R
import `in`.ivishaljoshi.mystore.Services.DataService
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager =LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager


        //Selection of item in list view
        //  categoryListView.setOnItemClickListener { adapterView, view, position, id ->
        //  val category = DataService.categories[position]
        //   Toast.makeText(this, "You have selected ${category.title} category", Toast.LENGTH_SHORT).show()
        //   }
    }

}
