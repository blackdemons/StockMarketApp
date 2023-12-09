package com.vid.stockmarketapp.domain.repository

import com.vid.stockmarketapp.domain.model.CompanyListing
import com.vid.stockmarketapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}