package com.qualcomm.qti.gaiaclient.ui.information.dialog;

import java.lang.System;

/**
 * All the options that can apply for the confirmations used in the device info screen.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/information/dialog/DeviceInfoDialogOption;", "", "Lcom/qualcomm/qti/gaiaclient/ui/common/progress/DialogOption;", "Lcom/qualcomm/qti/gaiaclient/ui/information/dialog/Options;", "labelId", "", "option", "(Ljava/lang/String;IILcom/qualcomm/qti/gaiaclient/ui/information/dialog/Options;)V", "getIdentifier", "getLabel", "", "context", "Landroid/content/Context;", "OKAY", "app_debug"})
public enum DeviceInfoDialogOption implements com.qualcomm.qti.gaiaclient.ui.common.progress.DialogOption<com.qualcomm.qti.gaiaclient.ui.information.dialog.Options> {
    /*public static final*/ OKAY /* = new OKAY(0, null) */;
    private final int labelId = 0;
    private final com.qualcomm.qti.gaiaclient.ui.information.dialog.Options option = null;
    
    DeviceInfoDialogOption(int labelId, com.qualcomm.qti.gaiaclient.ui.information.dialog.Options option) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.qualcomm.qti.gaiaclient.ui.information.dialog.Options getIdentifier() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getLabel(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}