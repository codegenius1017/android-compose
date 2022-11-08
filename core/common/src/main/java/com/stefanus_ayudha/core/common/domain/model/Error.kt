package com.stefanus_ayudha.core.common.domain.model

import com.google.gson.annotations.SerializedName
import com.stefanus_ayudha.core.common.util.gson.JsonConvertAble

data class Error(
    @field:SerializedName("message")
    val message: String?,
    @field:SerializedName("code")
    val code: Int?
) : JsonConvertAble