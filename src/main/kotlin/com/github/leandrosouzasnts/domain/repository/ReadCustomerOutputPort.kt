package com.github.leandrosouzasnts.domain.repository

import com.github.leandrosouzasnts.domain.to.CustomerTO

interface ReadCustomerOutputPort {
    fun findAll(): List<CustomerTO>
}