package com.github.leandrosouzasnts.domain.repository

import com.github.leandrosouzasnts.domain.to.CustomerTO
import com.github.leandrosouzasnts.infrastructure.mysql.repositories.CustomerRepository
import com.github.leandrosouzasnts.mappers.CustomerJpaMapper
import org.springframework.beans.factory.annotation.Autowired
import shared.infrastructure.annotations.Adapter

@Adapter
class WriteCustomerOutputAdapter: WriteCustomerOutputPort {

    @Autowired
    lateinit var customerRepository : CustomerRepository

    override fun create(customerTO: CustomerTO): CustomerTO {

        var customerEntity = CustomerJpaMapper.toEntity(customerTO)

        return CustomerJpaMapper.toDto(customerRepository.save(customerEntity))
    }
}