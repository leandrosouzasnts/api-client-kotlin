package com.github.leandrosouzasnts.domain.repository

import com.github.leandrosouzasnts.domain.to.CustomerTO
import com.github.leandrosouzasnts.infrastructure.mysql.repositories.CustomerRepository
import com.github.leandrosouzasnts.mappers.CustomerJpaMapper
import org.springframework.beans.factory.annotation.Autowired
import shared.infrastructure.annotations.Adapter

@Adapter
class ReadCustomerOutputAdapter: ReadCustomerOutputPort {

    @Autowired
    lateinit var customerRepository : CustomerRepository

    override fun findAll(): List<CustomerTO> {
        return CustomerJpaMapper.toDto(customerRepository.findAll())
    }
}