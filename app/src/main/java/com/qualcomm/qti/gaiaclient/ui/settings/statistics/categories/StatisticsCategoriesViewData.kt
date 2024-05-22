/*
 * ************************************************************************************************
 * * © 2021-2022 Qualcomm Technologies, Inc. and/or its subsidiaries. All rights reserved.        *
 * ************************************************************************************************
 */

package com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories

import com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo

data class StatisticsCategoriesViewData(
    val isRecording: Boolean,
    val categoriesInfo: List<StatisticsCategoriesCategoryInfo>
)
