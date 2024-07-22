package com.github.leandrosouzasnts.domain.repository

import com.github.leandrosouzasnts.domain.to.CustomerTO

interface WriteCustomerOutputPort {
    fun create(customerTO: CustomerTO): CustomerTO
}