package com.vid.stockmarketapp.di

import com.vid.stockmarketapp.data.csv.CSVParser
import com.vid.stockmarketapp.data.csv.CompanyListingParser
import com.vid.stockmarketapp.data.repository.StockRepositoryImpl
import com.vid.stockmarketapp.domain.model.CompanyListing
import com.vid.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}