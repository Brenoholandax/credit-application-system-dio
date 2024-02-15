package me.dio.creditapplicationsystem.entity

import jakarta.validation.constraints.Email

data class Customer(
var firsName: String = "",
var LastName: String = "",
val  cpf : String,
var email: String,
        var password: String = "",
        var address: Address = Address(),
var credits: List <Credit> = mutableListOf(),
        val  id: Long? = null

)
