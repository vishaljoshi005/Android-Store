package `in`.ivishaljoshi.mystore.Adapters

import `in`.ivishaljoshi.mystore.Model.Category
import `in`.ivishaljoshi.mystore.R
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class CategoryRecycleAdapter(val context:Context, val category:List<Category>):RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){


    override fun getItemCount(): Int {
        return category.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        println("I'm inside the onBindViewHolder")
        Log.d("Mymessage","I'm inside the onBindViewHolder")
        holder?.bindCategory(category[position],context )
    }

    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int): Holder {
        val view  = LayoutInflater.from(context).inflate(R.layout.category_listitem, parent ,false)
        println("I'm inside the onCreateViewHolder")
        Log.d("Mymessage","I'm inside the onCreateViewHolder")
        return Holder(view)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)
        val categoryImage= itemView.findViewById<ImageView>(R.id.categoryImage)


        fun bindCategory(category:Category, context:Context){
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text =category.title
            Log.d("Mymessage","I'm inside the bindCategory inside of holder class")
            println("I'm inside the bindCategory inside of holder class")
        }

    }

}