package com.vid.stockmarketapp.domain.repository

import com.vid.stockmarketapp.domain.model.CompanyInfo
import com.vid.stockmarketapp.domain.model.CompanyListing
import com.vid.stockmarketapp.domain.model.IntradayInfo
import com.vid.stockmarketapp.utils.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}