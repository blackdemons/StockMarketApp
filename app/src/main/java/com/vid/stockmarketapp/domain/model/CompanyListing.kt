package com.vid.stockmarketapp.domain.model

data class CompanyListing(
    val name: String,
    val symbols: String,
    val exchange: String,
)