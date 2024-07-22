package com.github.leandrosouzasnts.api.models.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

data class CustomerRequest(
    var id: Long?,
    @NotBlank(message = "Name is mandatory")
    val name: String,
    @Email(message = "Email should be valid")
    val email: String,
    @NotBlank(message = "Phone is mandatory")
    val phone: String
)
