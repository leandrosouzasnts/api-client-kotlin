package com.github.leandrosouzasnts.api.controllers

import com.github.leandrosouzasnts.api.models.request.CustomerRequest
import com.github.leandrosouzasnts.api.models.response.CustomerResponse
import com.github.leandrosouzasnts.domain.services.CustomerUseCase
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.validation.Valid

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

@RestController
@RequestMapping("/v1/customers")
class CustomerController(private val customerUseCase: CustomerUseCase) { //Comumente em kotlin usamos @Autowired

    private val logger: Logger = LoggerFactory.getLogger(CustomerController::class.java)

    @GetMapping
    fun findAll(): ResponseEntity<List<CustomerResponse>>{
        logger.info("find all customers step=start")

        val customers = customerUseCase.findAll()

        logger.info("find all customers step=end")

        return ResponseEntity.ok(customers);
    }

    @PostMapping
    fun create(@RequestBody @Valid request: CustomerRequest): ResponseEntity<CustomerResponse> {
        logger.info("created customer step=start")

        val customer = customerUseCase.create(request)
        val location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(customer.id).toUri()

        logger.info("created customer step=end")

        return ResponseEntity.created(location).body(customer)

    }
}