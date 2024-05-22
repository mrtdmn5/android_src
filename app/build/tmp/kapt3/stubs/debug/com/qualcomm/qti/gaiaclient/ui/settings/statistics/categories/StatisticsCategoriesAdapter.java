package com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/CategoryViewData;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesAdapter$CategoryViewHolder;", "onSelected", "Lkotlin/Function1;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories;", "Lkotlin/ParameterName;", "name", "categoryInfo", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CategoryViewHolder", "app_debug"})
public final class StatisticsCategoriesAdapter extends androidx.recyclerview.widget.ListAdapter<com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.CategoryViewData, com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesAdapter.CategoryViewHolder> {
    private final kotlin.jvm.functions.Function1<com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories, kotlin.Unit> onSelected = null;
    
    public StatisticsCategoriesAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories, kotlin.Unit> onSelected) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesAdapter.CategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesAdapter.CategoryViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/qualcomm/qti/gaiaclient/databinding/StatisticsCategoryItemBinding;", "onSelected", "Lkotlin/Function1;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories;", "", "(Lcom/qualcomm/qti/gaiaclient/databinding/StatisticsCategoryItemBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "viewData", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/CategoryViewData;", "app_debug"})
    public static final class CategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.qualcomm.qti.gaiaclient.databinding.StatisticsCategoryItemBinding binding = null;
        private final kotlin.jvm.functions.Function1<com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories, kotlin.Unit> onSelected = null;
        
        public CategoryViewHolder(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.databinding.StatisticsCategoryItemBinding binding, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories, kotlin.Unit> onSelected) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable
        com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.CategoryViewData viewData) {
        }
    }
}