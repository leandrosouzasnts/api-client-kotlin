package com.github.leandrosouzasnts.api.models.response

data class CustomerResponse(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val active: Boolean
)
