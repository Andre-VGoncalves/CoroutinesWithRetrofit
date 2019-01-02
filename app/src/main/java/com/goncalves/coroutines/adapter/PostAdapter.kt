package com.goncalves.coroutines.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.goncalves.coroutines.R
import com.goncalves.coroutines.model.PostResponse
import org.jetbrains.anko.find

class PostAdapter (val list: List<PostResponse>, val context: Context) : RecyclerView.Adapter<PostAdapter.ItemHolder>()  {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): PostAdapter.ItemHolder {
        return ItemHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_list_post, viewGroup , false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(itemHolder: PostAdapter.ItemHolder, position: Int) {
        val item = list[position]
        itemHolder.bind(item)
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView = itemView.find<TextView>(R.id.tv_title)
        private val bodyTextView = itemView.find<TextView>(R.id.tv_text)

        fun bind(post: PostResponse) {
            titleTextView.text = post.title
            bodyTextView.text = post.body
        }
    }
}