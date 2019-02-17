package `in`.ivishaljoshi.mystore.Adapters

import `in`.ivishaljoshi.mystore.Model.Category
import `in`.ivishaljoshi.mystore.R
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RecycleView(val context:Context, val categories:List<Category>): RecyclerView.Adapter<RecycleView.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.category_listitem, parent, false)
        println("I.m inside the onCreateViewHolder")
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        println("I.m inside the onBindViewHolder")
        holder?.bindCategory(categories[position] ,context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category:Category, context:Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            println("I.m inside the bindcategory")
            categoryImage?.setImageResource(resourceId)
            categoryName?.text=category.title
        }
    }
}