package com.github.leandrosouzasnts.domain.mappers

import com.github.leandrosouzasnts.api.models.request.CustomerRequest
import com.github.leandrosouzasnts.api.models.response.CustomerResponse
import com.github.leandrosouzasnts.domain.to.CustomerTO

object CustomerMapper {

    fun toResponse(customerTO: CustomerTO) : CustomerResponse {
        return CustomerResponse(
            id = customerTO.id,
            name = customerTO.name,
            email = customerTO.email,
            phone = customerTO.phone,
            active = customerTO.active
        )
    }

    fun toResponse(customerTO: List<CustomerTO>): List<CustomerResponse>{
        return customerTO.map { toResponse(it) }
    }

    fun toDto(request : CustomerRequest): CustomerTO {
        return CustomerTO(
            id = request.id ?: 0,
            name = request.name,
            email = request.email,
            phone = request.phone,
            active = true
        )
    }
}