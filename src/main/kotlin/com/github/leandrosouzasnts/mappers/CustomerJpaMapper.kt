package com.github.leandrosouzasnts.mappers

import com.github.leandrosouzasnts.domain.to.CustomerTO
import com.github.leandrosouzasnts.infrastructure.mysql.entities.CustomerEntity

object CustomerJpaMapper {

    fun toDto(entity: CustomerEntity): CustomerTO{
        return CustomerTO(
            id = entity.id!!,
            name = entity.name ?: "",
            email = entity.email ?: "",
            phone = entity.phone ?: "",
            active = entity.active ?: false,
        )
    }

    fun toDto(entities: Iterable<CustomerEntity>) : List<CustomerTO>{
        return entities.map { toDto(it) }
    }

    fun toEntity(customerTO: CustomerTO) : CustomerEntity{
        return CustomerEntity(
            id = customerTO.id,
            name = customerTO.name,
            email = customerTO.email,
            phone = customerTO.phone,
            active = customerTO.active
        )
    }
}