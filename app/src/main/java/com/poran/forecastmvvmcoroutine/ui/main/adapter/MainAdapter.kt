package com.poran.forecastmvvmcoroutine.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.poran.forecastmvvmcoroutine.R
import com.poran.forecastmvvmcoroutine.data.model.User

class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.apply {
                println("Name :${ user.userName}")
                val textViewUserName=findViewById<TextView>(R.id.textViewUserName)
               val textViewUserEmail= findViewById<TextView>(R.id.textViewUserEmail)
                val imageViewAvatar=findViewById<ImageView>(R.id.imageViewAvatar)
                textViewUserName.text=user.userName
                textViewUserEmail.text=user.userEmail
                Glide.with(imageViewAvatar.context)
                    .load(user.image)
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false))

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }

    }
}