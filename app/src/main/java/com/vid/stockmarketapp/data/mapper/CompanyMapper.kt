package com.vid.stockmarketapp.data.mapper

import com.vid.stockmarketapp.data.local.CompanyListingEntity
import com.vid.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.vid.stockmarketapp.domain.model.CompanyInfo
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

fun CompanyInfoDto.toCompanyInfo() : CompanyInfo {
    return  CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}