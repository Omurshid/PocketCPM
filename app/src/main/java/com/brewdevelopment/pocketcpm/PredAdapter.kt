package com.brewdevelopment.pocketcpm

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Osama on 2017-08-28.
 */
class PredAdapter(context: Context, var list: ArrayList<Task>) : RecyclerView.Adapter<PredAdapter.ViewHolder>() {

    class ViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView){
        //val currentItem: Int=0
        val item_Title= itemView?.findViewById(R.id.Title) as TextView
        val item_pic= itemView?.findViewById(R.id.options_button) as ImageView
    }

    override  fun onCreateViewHolder(parent: ViewGroup?, i: Int): ViewHolder {
        val v: View? = LayoutInflater.from(parent?.context).inflate(R.layout.task_cards, parent, false)
        val viewHolder: ViewHolder= ViewHolder(v)
        return viewHolder

    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.item_pic?.visibility=View.GONE
        val temp: Task= list[position]
        holder?.item_Title?.text= temp.attribute.get(Task.NAME_COLUMN) as String

    }

    override fun getItemCount(): Int {
        return list.size
    }

}