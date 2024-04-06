package kz.android.lab2.model

import com.google.gson.annotations.SerializedName

data class MAIN(
    @SerializedName("name") val name: String,
    @SerializedName("image_link") val imageLink: String,
    @SerializedName("coat_length") val coatLenght: Int,
    @SerializedName("playfulness") val playfulness: Int,
    @SerializedName("min_life_expectancy") val minLifeExpectancy: Int,
    @SerializedName("max_life_expectancy") val maxLifeExpectancy: Int
)