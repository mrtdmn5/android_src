/*
 * ************************************************************************************************
 * * © 2021-2022 Qualcomm Technologies, Inc. and/or its subsidiaries. All rights reserved.        *
 * ************************************************************************************************
 */

package com.qualcomm.qti.gaiaclient.ui.settings.statistics.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.qualcomm.qti.gaiaclient.databinding.StatisticsStatisticItemBinding
import com.qualcomm.qti.gaiaclient.ui.common.ListAdapterDataItemCallback

private const val DEFAULT_ITEM_TYPE = 0

class StatisticsStatisticsAdapter : ListAdapter<StatisticViewData, StatisticsStatisticsAdapter.StatisticViewHolder>
    (ListAdapterDataItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatisticViewHolder {
        val binding = StatisticsStatisticItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return StatisticViewHolder(binding)
    }

    override fun getItemViewType(position: Int): Int {
        return DEFAULT_ITEM_TYPE // all items have the same view
    }

    override fun getItemId(position: Int): Long {
        return getItem(position).hashCode().toLong()
    }

    override fun onBindViewHolder(holder: StatisticViewHolder, position: Int) {
        val item: StatisticViewData = getItem(position)
        holder.bind(item)
    }

    class StatisticViewHolder internal constructor(private val binding: StatisticsStatisticItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(viewData: StatisticViewData?) {
            binding.data = viewData
        }
    }

    init {
        setHasStableIds(true)
    }
}
