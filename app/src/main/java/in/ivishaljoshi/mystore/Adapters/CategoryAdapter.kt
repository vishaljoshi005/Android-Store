package `in`.ivishaljoshi.mystore.Adapters

import `in`.ivishaljoshi.mystore.Model.Category
import `in`.ivishaljoshi.mystore.R
import `in`.ivishaljoshi.mystore.Services.DataService.categories
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CategoryAdapter(val context: Context, val categories:List<Category>) : BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val holder:viewHolder
        val categoryView:View

        if(convertView==null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_listitem, null)
            holder = viewHolder()

            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)

            categoryView.tag=holder
            println("When created for the first time bro")
        }else{
            holder = convertView.tag as viewHolder
            categoryView = convertView
            println("Recycled bro")
        }



        val category = categories[position]

        val resourseId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        holder.categoryName?.text = category.title
        holder.categoryImage?.setImageResource(resourseId)
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
       return categories.count()
    }

    private class viewHolder(){
        var categoryImage:ImageView? = null
        var categoryName  :TextView? = null
    }
}