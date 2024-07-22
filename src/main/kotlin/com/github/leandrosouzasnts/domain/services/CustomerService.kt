package com.github.leandrosouzasnts.domain.services

import com.github.leandrosouzasnts.api.models.request.CustomerRequest
import com.github.leandrosouzasnts.api.models.response.CustomerResponse
import com.github.leandrosouzasnts.domain.mappers.CustomerMapper
import com.github.leandrosouzasnts.domain.repository.ReadCustomerOutputPort
import com.github.leandrosouzasnts.domain.repository.WriteCustomerOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService: CustomerUseCase{

    @Autowired
    lateinit var readCustomerOutputPort: ReadCustomerOutputPort

    @Autowired
    lateinit var writeCustomerOutputPort: WriteCustomerOutputPort

    override fun findAll(): List<CustomerResponse> {
        return CustomerMapper.toResponse(readCustomerOutputPort.findAll())
    }

    override fun create(request: CustomerRequest): CustomerResponse {
        var customerTO = CustomerMapper.toDto(request)

        customerTO = writeCustomerOutputPort.create(customerTO)

        return CustomerMapper.toResponse(customerTO)
    }
}