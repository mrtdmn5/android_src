package com.qualcomm.qti.gaiaclient.ui.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002J \u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackFormFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/qualcomm/qti/gaiaclient/databinding/FragmentFeedbackFormBinding;", "getValidationError", "", "text", "", "maxLength", "required", "", "(Ljava/lang/String;IZ)Ljava/lang/Integer;", "initTextInputLayout", "", "layout", "Lcom/google/android/material/textfield/TextInputLayout;", "isFormValid", "isInputValid", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSend", "validateInput", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class FeedbackFormFragment extends androidx.fragment.app.Fragment {
    private com.qualcomm.qti.gaiaclient.databinding.FragmentFeedbackFormBinding binding;
    
    public FeedbackFormFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initTextInputLayout(com.google.android.material.textfield.TextInputLayout layout, boolean required) {
    }
    
    private final void validateInput(com.google.android.material.textfield.TextInputLayout layout, java.lang.String text, boolean required) {
    }
    
    private final boolean isInputValid(com.google.android.material.textfield.TextInputLayout layout, boolean required) {
        return false;
    }
    
    private final java.lang.Integer getValidationError(java.lang.String text, int maxLength, boolean required) {
        return null;
    }
    
    private final boolean isFormValid() {
        return false;
    }
    
    private final void onSend() {
    }
}