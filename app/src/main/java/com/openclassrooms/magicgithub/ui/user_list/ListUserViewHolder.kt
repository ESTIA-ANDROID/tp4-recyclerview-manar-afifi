package com.openclassrooms.magicgithub.ui.user_list


import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import androidx.core.content.ContextCompat
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.databinding.ItemListUserBinding
import com.openclassrooms.magicgithub.model.User
//Etape2
/*class ListUserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)*/
// Etape3
class ListUserViewHolder(private val binding: ItemListUserBinding) : RecyclerView.ViewHolder(binding.root)
{
    // FOR DESIGN ---
    // Etape 2
    /*
    private var avatar: ImageView = itemView.findViewById(R.id.item_list_user_avatar)
    private val username: TextView = itemView.findViewById(R.id.item_list_user_username)
    private val deleteButton: ImageButton = itemView.findViewById(R.id.item_list_user_delete_button)*/

    /*fun bind(user: User, callback: UserListAdapter.Listener) {
        Glide.with(itemView.context)
            .load(user.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(avatar)
        username.text = user.login
        deleteButton.setOnClickListener { callback.onClickDelete(user) }
    }*/
    // Etape 3
    fun bind(user: User, callback: UserListAdapter.Listener) {
        Glide.with(itemView.context)
            .load(user.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.itemListUserAvatar)

        binding.itemListUserUsername.text = user.login

        val backgroundColor = if (user.isActive) R.color.user_active else R.color.user_inactive
        val textColor = if (user.isActive) android.R.color.black else android.R.color.white

        binding.root.setBackgroundColor(ContextCompat.getColor(itemView.context, backgroundColor))
        binding.itemListUserUsername.setTextColor(ContextCompat.getColor(itemView.context, textColor))

        binding.itemListUserDeleteButton.setOnClickListener { callback.onClickDelete(user) }
    }



}