package com.github.leandrosouzasnts.domain.services

import com.github.leandrosouzasnts.api.models.request.CustomerRequest
import com.github.leandrosouzasnts.api.models.response.CustomerResponse

interface CustomerUseCase {
    fun findAll() : List<CustomerResponse>

    fun create(request: CustomerRequest): CustomerResponse
}