package com.st17.workclass.data.file

import com.st17.workclass.R
import kotlinx.serialization.Serializable

@Serializable
data class File(
    val name: String = "text",
    val size: String = "",
    val fileIcon: Int = R.drawable.ic_file_empty,
    val url: String = ""
)