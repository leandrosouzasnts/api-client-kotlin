package com.github.leandrosouzasnts.infrastructure.mysql.repositories

import com.github.leandrosouzasnts.infrastructure.mysql.entities.CustomerEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: CrudRepository<CustomerEntity, Long> {
}