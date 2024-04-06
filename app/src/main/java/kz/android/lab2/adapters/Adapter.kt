package kz.android.lab2.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kz.android.lab2.databinding.ItemDogBinding
import kz.android.lab2.model.MAIN

class Adapter : ListAdapter<MAIN, Adapter.DogViewHolder>(DogBreedDiffCallback) {
    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDogBinding.inflate(inflater, parent, false)
        return DogViewHolder(binding)
    }
    object DogBreedDiffCallback : DiffUtil.ItemCallback<MAIN>() {
        override fun areItemsTheSame(oldItem: MAIN, newItem: MAIN): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: MAIN, newItem: MAIN): Boolean {
            return oldItem == newItem
        }
    }
    class DogViewHolder(private val binding: ItemDogBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(dogBreed: MAIN) {
            with(binding) {
                tvDogName.text = dogBreed.name
                tvMaxFemaleHeight.text = "Coat Lenght: ${dogBreed.coatLenght}"
                tvMaxMaleHeight.text = "Playfulness: ${dogBreed.playfulness}"
                tvLifeExpectancy.text = "Life Expectancy: ${dogBreed.minLifeExpectancy}-${dogBreed.maxLifeExpectancy} years"

                Glide.with(ivDogImage.context)
                    .load(dogBreed.imageLink)
                    .into(ivDogImage)
            }
        }
    }
}
