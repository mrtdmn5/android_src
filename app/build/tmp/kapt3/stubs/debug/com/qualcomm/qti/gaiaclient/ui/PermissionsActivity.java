package com.qualcomm.qti.gaiaclient.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J/\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0013H\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J-\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010#\u001a\u00020$H\u0016\u00a2\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J$\u0010*\u001a\u00020\u00192\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0006H&R&\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006-"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/PermissionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/core/app/ActivityCompat$OnRequestPermissionsResultCallback;", "()V", "launchers", "Landroid/util/ArrayMap;", "Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "permissionViewModel", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionsViewModel;", "getPermissionViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/PermissionsViewModel;", "permissionViewModel$delegate", "Lkotlin/Lazy;", "arePermissionsGranted", "", "permissionsStateMap", "", "category", "containsKeys", "permissions", "(Ljava/util/Map;[Ljava/lang/String;)Z", "initActivityResultLauncher", "", "navigateToPermissionsSettings", "onPermissionsResult", "granted", "onPermissionsStateChanged", "state", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionState;", "onRequestPermissionsResult", "requestCode", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestCategoryPermissions", "requestNormalPermissions", "requestRuntimePermissions", "requirePermissionRationale", "showPermissionRequestRationale", "launcher", "showPermissionsError", "app_debug"})
public abstract class PermissionsActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy permissionViewModel$delegate = null;
    private final android.util.ArrayMap<com.qualcomm.qti.gaiaclient.ui.Permissions.Categories, androidx.activity.result.ActivityResultLauncher<java.lang.String[]>> launchers = null;
    
    public PermissionsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel getPermissionViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    /**
     * Checks if the permissions of the category have been granted.
     * If they have not, the function attempts to launch the permission request.
     * Shows the appropriate request rationale if necessary.
     *
     * @return True if the permission request was launched, false if the permission is granted and/or not required.
     */
    public final boolean requestCategoryPermissions(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
        return false;
    }
    
    public abstract void showPermissionsError(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category);
    
    public final void navigateToPermissionsSettings() {
    }
    
    private final boolean requestRuntimePermissions(com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
        return false;
    }
    
    private final void initActivityResultLauncher(com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
    }
    
    private final boolean containsKeys(java.util.Map<java.lang.String, java.lang.Boolean> permissionsStateMap, java.lang.String[] permissions) {
        return false;
    }
    
    private final boolean arePermissionsGranted(java.util.Map<java.lang.String, java.lang.Boolean> permissionsStateMap, com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
        return false;
    }
    
    private final void requestNormalPermissions(com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
    }
    
    private final void onPermissionsResult(com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category, java.util.Map<java.lang.String, java.lang.Boolean> granted) {
    }
    
    private final boolean requirePermissionRationale(com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
        return false;
    }
    
    private final void showPermissionRequestRationale(androidx.activity.result.ActivityResultLauncher<java.lang.String[]> launcher, com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
    }
    
    private final void onPermissionsStateChanged(com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category, com.qualcomm.qti.gaiaclient.ui.PermissionState state) {
    }
}