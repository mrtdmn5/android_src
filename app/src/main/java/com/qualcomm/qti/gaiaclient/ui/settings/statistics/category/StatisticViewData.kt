/*
 * ************************************************************************************************
 * * © 2021-2022 Qualcomm Technologies, Inc. and/or its subsidiaries. All rights reserved.        *
 * ************************************************************************************************
 */

package com.qualcomm.qti.gaiaclient.ui.settings.statistics.category

import com.qualcomm.qti.gaiaclient.ui.common.ListAdapterItemData
import java.util.Objects

class StatisticViewData : ListAdapterItemData {
    val title: String
    val subtitle: String

    constructor(title: String, subtitle: String) {
        this.title = title
        this.subtitle = subtitle
    }

    constructor(data: StatisticViewData) {
        this.title = data.title
        this.subtitle = data.subtitle
    }

    override fun isSameContent(itemData: ListAdapterItemData): Boolean {
        if (this === itemData) {
            return true
        }
        if (javaClass != itemData.javaClass) {
            return false
        }
        val that = itemData as StatisticViewData
        return that.title == title && that.subtitle == subtitle
    }

    override fun isSameItem(itemData: ListAdapterItemData): Boolean {
        return this == itemData
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as StatisticViewData
        return that.title == title
    }

    override fun hashCode(): Int {
        return Objects.hash(title, subtitle)
    }
}
