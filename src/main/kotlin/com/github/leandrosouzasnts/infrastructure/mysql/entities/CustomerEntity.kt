package com.github.leandrosouzasnts.infrastructure.mysql.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "customer")
class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var name: String? = null
    var email: String? = null
    var phone: String? = null
    var active: Boolean? = null

    constructor()

    constructor(id: Long?, name: String, email: String, phone: String, active: Boolean){
        this.id = id
        this.name = name
        this.email = email
        this.phone = phone
        this.active = active
    }
}