package com.qualcomm.qti.gaiaclient.ui.upgrade.files;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002J\u0017\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010&H\u0002\u00a2\u0006\u0002\u0010\'R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesFragmentArgs;", "getArgs", "()Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/qualcomm/qti/gaiaclient/databinding/FragmentFilesBinding;", "viewModel", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesViewModel;", "getViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "downloadFile", "", "file", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "refreshList", "subscribeUI", "adapter", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FilesAdapter;", "updateMessage", "message", "Lcom/qualcomm/qti/gaiaclient/ui/common/MessageData;", "updateRefreshingState", "isRefreshing", "", "(Ljava/lang/Boolean;)V", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class GetFilesFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.qualcomm.qti.gaiaclient.databinding.FragmentFilesBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public GetFilesFragment() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesViewModel getViewModel() {
        return null;
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void subscribeUI(com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesAdapter adapter) {
    }
    
    private final void updateMessage(com.qualcomm.qti.gaiaclient.ui.common.MessageData message) {
    }
    
    private final void updateRefreshingState(java.lang.Boolean isRefreshing) {
    }
    
    private final void downloadFile(com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData file) {
    }
    
    private final void refreshList() {
    }
}