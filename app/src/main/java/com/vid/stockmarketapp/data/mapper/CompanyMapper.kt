package com.vid.stockmarketapp.data.mapper

import com.vid.stockmarketapp.data.local.CompanyListingEntity
import com.vid.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbols = symbols,
        exchange = exchange
    )
}
fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbols = symbols,
        exchange = exchange
    )
}
