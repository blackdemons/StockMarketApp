package com.vid.stockmarketapp.presentation.screen.company_info

import com.vid.stockmarketapp.domain.model.CompanyInfo
import com.vid.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState (
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)