/*
 * ************************************************************************************************
 * * © 2021-2022 Qualcomm Technologies, Inc. and/or its subsidiaries. All rights reserved.        *
 * ************************************************************************************************
 */

package com.qualcomm.qti.gaiaclient.ui.settings.statistics.category

class StatisticsStatisticsViewData(
    val isRecording: Boolean,
    val statistics: List<StatisticViewData>
) {
    constructor() : this(false, emptyList<StatisticViewData>())
}
