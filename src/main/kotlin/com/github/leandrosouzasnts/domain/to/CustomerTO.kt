package com.github.leandrosouzasnts.domain.to

data class CustomerTO(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val active: Boolean
)
