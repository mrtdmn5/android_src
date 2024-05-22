package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentInformationBindingImpl extends FragmentInformationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.device_battery_level_title, 21);
        sViewsWithIds.put(R.id.device_serial_number_title, 22);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView18;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentInformationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentInformationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[3]
            );
        this.connectionState.setTag(null);
        this.deviceAddress.setTag(null);
        this.deviceApplicationBuildId.setTag(null);
        this.deviceApplicationVersion.setTag(null);
        this.deviceBatteryLevelCase.setTag(null);
        this.deviceBatteryLevelDevice.setTag(null);
        this.deviceBatteryLevelLeft.setTag(null);
        this.deviceBatteryLevelRight.setTag(null);
        this.deviceCharging.setTag(null);
        this.deviceGaiaVersion.setTag(null);
        this.deviceImage.setTag(null);
        this.deviceName.setTag(null);
        this.deviceSerialNumber.setTag(null);
        this.deviceSerialNumberEarbudLeft.setTag(null);
        this.deviceSerialNumberEarbudRight.setTag(null);
        this.deviceVariantName.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView18 = (android.widget.LinearLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.information == variableId) {
            setInformation((com.qualcomm.qti.gaiaclient.ui.information.InformationViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInformation(@Nullable com.qualcomm.qti.gaiaclient.ui.information.InformationViewData Information) {
        this.mInformation = Information;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.information);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String informationGetBatteryLevelBatterySINGLEDEVICE = null;
        int informationIsChargingViewVISIBLEViewGONE = 0;
        java.lang.String informationGetBatteryLevelBatteryRIGHTDEVICE = null;
        int informationApplicationVersionJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String stringFormatConnectionStateAndroidStringContDescInformationStateInformationState = null;
        boolean informationGaiaVersionJavaLangObjectNull = false;
        java.lang.Boolean informationIsCharging = null;
        java.lang.String stringFormatDeviceSerialNumberEarbudRightAndroidStringContDescInformationSerialNumberRightInformationSerialNumberRight = null;
        boolean informationHasBatteryLevels = false;
        int informationDeviceImageResourceId = 0;
        java.lang.String stringFormatDeviceApplicationBuildIdAndroidStringApplicationBuildIdInformationApplicationBuildId = null;
        boolean informationGetBatteryLevelBatteryRIGHTDEVICEJavaLangObjectNull = false;
        boolean informationVariantNameJavaLangObjectNull = false;
        boolean informationNameJavaLangObjectNull = false;
        boolean informationShowSingleSerialNumber = false;
        java.lang.String stringFormatDeviceApplicationBuildIdAndroidStringContDescInformationApplicationBuildIdInformationApplicationBuildId = null;
        int informationHasVersionsBooleanTrueInformationBluetoothAddressJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int informationGetBatteryLevelBatteryRIGHTDEVICEJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int informationSerialNumberLeftJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int informationShowSingleSerialNumberViewVISIBLEViewGONE = 0;
        java.lang.String stringFormatDeviceSerialNumberEarbudLeftAndroidStringContDescInformationSerialNumberLeftInformationSerialNumberLeft = null;
        int informationStateJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String stringFormatDeviceSerialNumberAndroidStringContDescInformationSerialNumberInformationSerialNumber = null;
        boolean informationHasVersionsBooleanTrueInformationBluetoothAddressJavaLangObjectNull = false;
        java.lang.String informationSerialNumberLeft = null;
        boolean informationHasVersions = false;
        int informationGaiaVersionJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int informationHasStatesViewVISIBLEViewGONE = 0;
        java.lang.String stringFormatDeviceAddressAndroidStringBluetoothAddressInformationBluetoothAddress = null;
        int informationBluetoothAddressJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean informationApplicationVersionJavaLangObjectNull = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxInformationIsCharging = false;
        java.lang.String informationGetBatteryLevelBatteryLEFTDEVICE = null;
        int informationNameJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String stringFormatDeviceVariantNameAndroidStringContDescInformationVariantNameInformationVariantName = null;
        java.lang.String stringFormatDeviceGaiaVersionAndroidStringGaiaVersionInformationGaiaVersion = null;
        com.qualcomm.qti.gaiaclient.ui.information.InformationViewData information = mInformation;
        boolean informationHasStates = false;
        java.lang.String informationApplicationBuildId = null;
        int informationApplicationBuildIdJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean informationSerialNumberLeftJavaLangObjectNull = false;
        int informationGetBatteryLevelBatteryCHARGERCASEJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String informationState = null;
        java.lang.String stringFormatDeviceApplicationVersionAndroidStringApplicationVersionInformationApplicationVersion = null;
        java.lang.String stringFormatDeviceAddressAndroidStringContDescInformationAddressInformationBluetoothAddress = null;
        java.lang.String stringFormatDeviceGaiaVersionAndroidStringContDescInformationGaiaVersionInformationGaiaVersion = null;
        java.lang.String informationDeviceImageJavaLangObjectNullInformationDeviceImageContentDescriptionDeviceImageAndroidStringContDescInformationImageHeadphones = null;
        java.lang.String informationSerialNumber = null;
        int informationGetBatteryLevelBatterySINGLEDEVICEJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String informationName = null;
        java.lang.String informationVariantName = null;
        boolean informationHasSerialNumbers = false;
        boolean informationGetBatteryLevelBatterySINGLEDEVICEJavaLangObjectNull = false;
        boolean informationApplicationBuildIdJavaLangObjectNull = false;
        java.lang.String stringFormatDeviceSerialNumberEarbudRightAndroidStringSerialNumberRightInformationSerialNumberRight = null;
        java.lang.String informationBluetoothAddress = null;
        boolean informationStateJavaLangObjectNull = false;
        boolean informationGetBatteryLevelBatteryCHARGERCASEJavaLangObjectNull = false;
        int informationHasSerialNumbersViewVISIBLEViewGONE = 0;
        boolean informationDeviceImageJavaLangObjectNull = false;
        java.lang.String informationDeviceImageContentDescription = null;
        int informationVariantNameJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int informationHasBatteryLevelsViewVISIBLEViewGONE = 0;
        java.lang.String stringFormatDeviceNameAndroidStringContDescInformationNameInformationName = null;
        com.qualcomm.qti.gaiaclient.ui.common.ImageViewData informationDeviceImage = null;
        java.lang.String stringFormatDeviceSerialNumberEarbudLeftAndroidStringSerialNumberLeftInformationSerialNumberLeft = null;
        boolean informationGetBatteryLevelBatteryLEFTDEVICEJavaLangObjectNull = false;
        int informationSerialNumberRightJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean informationBluetoothAddressJavaLangObjectNull = false;
        java.lang.String informationApplicationVersion = null;
        int informationGetBatteryLevelBatteryLEFTDEVICEJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String stringFormatDeviceApplicationVersionAndroidStringContDescInformationApplicationVersionInformationApplicationVersion = null;
        java.lang.String informationSerialNumberRight = null;
        java.lang.Integer informationGaiaVersion = null;
        java.lang.String informationGetBatteryLevelBatteryCHARGERCASE = null;
        boolean informationSerialNumberRightJavaLangObjectNull = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (information != null) {
                    // read information.getBatteryLevel(Battery.SINGLE_DEVICE)
                    informationGetBatteryLevelBatterySINGLEDEVICE = information.getBatteryLevel(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery.SINGLE_DEVICE);
                    // read information.getBatteryLevel(Battery.RIGHT_DEVICE)
                    informationGetBatteryLevelBatteryRIGHTDEVICE = information.getBatteryLevel(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery.RIGHT_DEVICE);
                    // read information.isCharging
                    informationIsCharging = information.isCharging();
                    // read information.hasBatteryLevels()
                    informationHasBatteryLevels = information.hasBatteryLevels();
                    // read information.showSingleSerialNumber()
                    informationShowSingleSerialNumber = information.showSingleSerialNumber();
                    // read information.serialNumberLeft
                    informationSerialNumberLeft = information.getSerialNumberLeft();
                    // read information.hasVersions()
                    informationHasVersions = information.hasVersions();
                    // read information.getBatteryLevel(Battery.LEFT_DEVICE)
                    informationGetBatteryLevelBatteryLEFTDEVICE = information.getBatteryLevel(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery.LEFT_DEVICE);
                    // read information.hasStates()
                    informationHasStates = information.hasStates();
                    // read information.applicationBuildId
                    informationApplicationBuildId = information.getApplicationBuildId();
                    // read information.state
                    informationState = information.getState();
                    // read information.serialNumber
                    informationSerialNumber = information.getSerialNumber();
                    // read information.name
                    informationName = information.getName();
                    // read information.variantName
                    informationVariantName = information.getVariantName();
                    // read information.hasSerialNumbers()
                    informationHasSerialNumbers = information.hasSerialNumbers();
                    // read information.bluetoothAddress
                    informationBluetoothAddress = information.getBluetoothAddress();
                    // read information.deviceImage
                    informationDeviceImage = information.getDeviceImage();
                    // read information.applicationVersion
                    informationApplicationVersion = information.getApplicationVersion();
                    // read information.serialNumberRight
                    informationSerialNumberRight = information.getSerialNumberRight();
                    // read information.gaiaVersion
                    informationGaiaVersion = information.getGaiaVersion();
                    // read information.getBatteryLevel(Battery.CHARGER_CASE)
                    informationGetBatteryLevelBatteryCHARGERCASE = information.getBatteryLevel(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery.CHARGER_CASE);
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationHasBatteryLevels) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationShowSingleSerialNumber) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationHasVersions) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationHasStates) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationHasSerialNumbers) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }


                // read information.getBatteryLevel(Battery.SINGLE_DEVICE) != null
                informationGetBatteryLevelBatterySINGLEDEVICEJavaLangObjectNull = (informationGetBatteryLevelBatterySINGLEDEVICE) != (null);
                // read information.getBatteryLevel(Battery.RIGHT_DEVICE) != null
                informationGetBatteryLevelBatteryRIGHTDEVICEJavaLangObjectNull = (informationGetBatteryLevelBatteryRIGHTDEVICE) != (null);
                // read androidx.databinding.ViewDataBinding.safeUnbox(information.isCharging)
                androidxDatabindingViewDataBindingSafeUnboxInformationIsCharging = androidx.databinding.ViewDataBinding.safeUnbox(informationIsCharging);
                // read information.hasBatteryLevels() ? View.VISIBLE : View.GONE
                informationHasBatteryLevelsViewVISIBLEViewGONE = ((informationHasBatteryLevels) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.showSingleSerialNumber() ? View.VISIBLE : View.GONE
                informationShowSingleSerialNumberViewVISIBLEViewGONE = ((informationShowSingleSerialNumber) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read String.format(@android:string/cont_desc_information_serial_number_left, information.serialNumberLeft)
                stringFormatDeviceSerialNumberEarbudLeftAndroidStringContDescInformationSerialNumberLeftInformationSerialNumberLeft = java.lang.String.format(deviceSerialNumberEarbudLeft.getResources().getString(R.string.cont_desc_information_serial_number_left), informationSerialNumberLeft);
                // read information.serialNumberLeft != null
                informationSerialNumberLeftJavaLangObjectNull = (informationSerialNumberLeft) != (null);
                // read String.format(@android:string/serial_number_left, information.serialNumberLeft)
                stringFormatDeviceSerialNumberEarbudLeftAndroidStringSerialNumberLeftInformationSerialNumberLeft = java.lang.String.format(deviceSerialNumberEarbudLeft.getResources().getString(R.string.serial_number_left), informationSerialNumberLeft);
                // read information.getBatteryLevel(Battery.LEFT_DEVICE) != null
                informationGetBatteryLevelBatteryLEFTDEVICEJavaLangObjectNull = (informationGetBatteryLevelBatteryLEFTDEVICE) != (null);
                // read information.hasStates() ? View.VISIBLE : View.GONE
                informationHasStatesViewVISIBLEViewGONE = ((informationHasStates) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read String.format(@android:string/application_build_id, information.applicationBuildId)
                stringFormatDeviceApplicationBuildIdAndroidStringApplicationBuildIdInformationApplicationBuildId = java.lang.String.format(deviceApplicationBuildId.getResources().getString(R.string.application_build_id), informationApplicationBuildId);
                // read String.format(@android:string/cont_desc_information_application_build_id, information.applicationBuildId)
                stringFormatDeviceApplicationBuildIdAndroidStringContDescInformationApplicationBuildIdInformationApplicationBuildId = java.lang.String.format(deviceApplicationBuildId.getResources().getString(R.string.cont_desc_information_application_build_id), informationApplicationBuildId);
                // read information.applicationBuildId != null
                informationApplicationBuildIdJavaLangObjectNull = (informationApplicationBuildId) != (null);
                // read String.format(@android:string/cont_desc_information_state, information.state)
                stringFormatConnectionStateAndroidStringContDescInformationStateInformationState = java.lang.String.format(connectionState.getResources().getString(R.string.cont_desc_information_state), informationState);
                // read information.state != null
                informationStateJavaLangObjectNull = (informationState) != (null);
                // read String.format(@android:string/cont_desc_information_serial_number, information.serialNumber)
                stringFormatDeviceSerialNumberAndroidStringContDescInformationSerialNumberInformationSerialNumber = java.lang.String.format(deviceSerialNumber.getResources().getString(R.string.cont_desc_information_serial_number), informationSerialNumber);
                // read information.name != null
                informationNameJavaLangObjectNull = (informationName) != (null);
                // read String.format(@android:string/cont_desc_information_name, information.name)
                stringFormatDeviceNameAndroidStringContDescInformationNameInformationName = java.lang.String.format(deviceName.getResources().getString(R.string.cont_desc_information_name), informationName);
                // read information.variantName != null
                informationVariantNameJavaLangObjectNull = (informationVariantName) != (null);
                // read String.format(@android:string/cont_desc_information_variant_name, information.variantName)
                stringFormatDeviceVariantNameAndroidStringContDescInformationVariantNameInformationVariantName = java.lang.String.format(deviceVariantName.getResources().getString(R.string.cont_desc_information_variant_name), informationVariantName);
                // read information.hasSerialNumbers() ? View.VISIBLE : View.GONE
                informationHasSerialNumbersViewVISIBLEViewGONE = ((informationHasSerialNumbers) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read String.format(@android:string/bluetooth_address, information.bluetoothAddress)
                stringFormatDeviceAddressAndroidStringBluetoothAddressInformationBluetoothAddress = java.lang.String.format(deviceAddress.getResources().getString(R.string.bluetooth_address), informationBluetoothAddress);
                // read String.format(@android:string/cont_desc_information_address, information.bluetoothAddress)
                stringFormatDeviceAddressAndroidStringContDescInformationAddressInformationBluetoothAddress = java.lang.String.format(deviceAddress.getResources().getString(R.string.cont_desc_information_address), informationBluetoothAddress);
                // read information.bluetoothAddress != null
                informationBluetoothAddressJavaLangObjectNull = (informationBluetoothAddress) != (null);
                // read information.deviceImage != null
                informationDeviceImageJavaLangObjectNull = (informationDeviceImage) != (null);
                // read information.applicationVersion != null
                informationApplicationVersionJavaLangObjectNull = (informationApplicationVersion) != (null);
                // read String.format(@android:string/application_version, information.applicationVersion)
                stringFormatDeviceApplicationVersionAndroidStringApplicationVersionInformationApplicationVersion = java.lang.String.format(deviceApplicationVersion.getResources().getString(R.string.application_version), informationApplicationVersion);
                // read String.format(@android:string/cont_desc_information_application_version, information.applicationVersion)
                stringFormatDeviceApplicationVersionAndroidStringContDescInformationApplicationVersionInformationApplicationVersion = java.lang.String.format(deviceApplicationVersion.getResources().getString(R.string.cont_desc_information_application_version), informationApplicationVersion);
                // read String.format(@android:string/cont_desc_information_serial_number_right, information.serialNumberRight)
                stringFormatDeviceSerialNumberEarbudRightAndroidStringContDescInformationSerialNumberRightInformationSerialNumberRight = java.lang.String.format(deviceSerialNumberEarbudRight.getResources().getString(R.string.cont_desc_information_serial_number_right), informationSerialNumberRight);
                // read String.format(@android:string/serial_number_right, information.serialNumberRight)
                stringFormatDeviceSerialNumberEarbudRightAndroidStringSerialNumberRightInformationSerialNumberRight = java.lang.String.format(deviceSerialNumberEarbudRight.getResources().getString(R.string.serial_number_right), informationSerialNumberRight);
                // read information.serialNumberRight != null
                informationSerialNumberRightJavaLangObjectNull = (informationSerialNumberRight) != (null);
                // read information.gaiaVersion != null
                informationGaiaVersionJavaLangObjectNull = (informationGaiaVersion) != (null);
                // read String.format(@android:string/gaia_version, information.gaiaVersion)
                stringFormatDeviceGaiaVersionAndroidStringGaiaVersionInformationGaiaVersion = java.lang.String.format(deviceGaiaVersion.getResources().getString(R.string.gaia_version), informationGaiaVersion);
                // read String.format(@android:string/cont_desc_information_gaia_version, information.gaiaVersion)
                stringFormatDeviceGaiaVersionAndroidStringContDescInformationGaiaVersionInformationGaiaVersion = java.lang.String.format(deviceGaiaVersion.getResources().getString(R.string.cont_desc_information_gaia_version), informationGaiaVersion);
                // read information.getBatteryLevel(Battery.CHARGER_CASE) != null
                informationGetBatteryLevelBatteryCHARGERCASEJavaLangObjectNull = (informationGetBatteryLevelBatteryCHARGERCASE) != (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(informationGetBatteryLevelBatterySINGLEDEVICEJavaLangObjectNull) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationGetBatteryLevelBatteryRIGHTDEVICEJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxInformationIsCharging) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationSerialNumberLeftJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationGetBatteryLevelBatteryLEFTDEVICEJavaLangObjectNull) {
                        dirtyFlags |= 0x80000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationApplicationBuildIdJavaLangObjectNull) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationStateJavaLangObjectNull) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationNameJavaLangObjectNull) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationVariantNameJavaLangObjectNull) {
                        dirtyFlags |= 0x2000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationBluetoothAddressJavaLangObjectNull) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationDeviceImageJavaLangObjectNull) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationApplicationVersionJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationSerialNumberRightJavaLangObjectNull) {
                        dirtyFlags |= 0x20000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationGaiaVersionJavaLangObjectNull) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(informationGetBatteryLevelBatteryCHARGERCASEJavaLangObjectNull) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
                if (informationDeviceImage != null) {
                    // read information.deviceImage.resourceId
                    informationDeviceImageResourceId = informationDeviceImage.getResourceId();
                }


                // read information.getBatteryLevel(Battery.SINGLE_DEVICE) != null ? View.VISIBLE : View.GONE
                informationGetBatteryLevelBatterySINGLEDEVICEJavaLangObjectNullViewVISIBLEViewGONE = ((informationGetBatteryLevelBatterySINGLEDEVICEJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.getBatteryLevel(Battery.RIGHT_DEVICE) != null ? View.VISIBLE : View.GONE
                informationGetBatteryLevelBatteryRIGHTDEVICEJavaLangObjectNullViewVISIBLEViewGONE = ((informationGetBatteryLevelBatteryRIGHTDEVICEJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(information.isCharging) ? View.VISIBLE : View.GONE
                informationIsChargingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxInformationIsCharging) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.serialNumberLeft != null ? View.VISIBLE : View.GONE
                informationSerialNumberLeftJavaLangObjectNullViewVISIBLEViewGONE = ((informationSerialNumberLeftJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.getBatteryLevel(Battery.LEFT_DEVICE) != null ? View.VISIBLE : View.GONE
                informationGetBatteryLevelBatteryLEFTDEVICEJavaLangObjectNullViewVISIBLEViewGONE = ((informationGetBatteryLevelBatteryLEFTDEVICEJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.applicationBuildId != null ? View.VISIBLE : View.GONE
                informationApplicationBuildIdJavaLangObjectNullViewVISIBLEViewGONE = ((informationApplicationBuildIdJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.state != null ? View.VISIBLE : View.GONE
                informationStateJavaLangObjectNullViewVISIBLEViewGONE = ((informationStateJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.name != null ? View.VISIBLE : View.GONE
                informationNameJavaLangObjectNullViewVISIBLEViewGONE = ((informationNameJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.variantName != null ? View.VISIBLE : View.GONE
                informationVariantNameJavaLangObjectNullViewVISIBLEViewGONE = ((informationVariantNameJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.bluetoothAddress != null ? View.VISIBLE : View.GONE
                informationBluetoothAddressJavaLangObjectNullViewVISIBLEViewGONE = ((informationBluetoothAddressJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.applicationVersion != null ? View.VISIBLE : View.GONE
                informationApplicationVersionJavaLangObjectNullViewVISIBLEViewGONE = ((informationApplicationVersionJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.serialNumberRight != null ? View.VISIBLE : View.GONE
                informationSerialNumberRightJavaLangObjectNullViewVISIBLEViewGONE = ((informationSerialNumberRightJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.gaiaVersion != null ? View.VISIBLE : View.GONE
                informationGaiaVersionJavaLangObjectNullViewVISIBLEViewGONE = ((informationGaiaVersionJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read information.getBatteryLevel(Battery.CHARGER_CASE) != null ? View.VISIBLE : View.GONE
                informationGetBatteryLevelBatteryCHARGERCASEJavaLangObjectNullViewVISIBLEViewGONE = ((informationGetBatteryLevelBatteryCHARGERCASEJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read information.hasVersions() ? true : information.bluetoothAddress != null
                informationHasVersionsBooleanTrueInformationBluetoothAddressJavaLangObjectNull = ((informationHasVersions) ? (true) : (informationBluetoothAddressJavaLangObjectNull));
            if((dirtyFlags & 0x3L) != 0) {
                if(informationHasVersionsBooleanTrueInformationBluetoothAddressJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read information.hasVersions() ? true : information.bluetoothAddress != null ? View.VISIBLE : View.GONE
                informationHasVersionsBooleanTrueInformationBluetoothAddressJavaLangObjectNullViewVISIBLEViewGONE = ((informationHasVersionsBooleanTrueInformationBluetoothAddressJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x80000000L) != 0) {

                if (informationDeviceImage != null) {
                    // read information.deviceImage.contentDescription
                    informationDeviceImageContentDescription = informationDeviceImage.getContentDescription();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read information.deviceImage != null ? information.deviceImage.contentDescription : @android:string/cont_desc_information_image_headphones
                informationDeviceImageJavaLangObjectNullInformationDeviceImageContentDescriptionDeviceImageAndroidStringContDescInformationImageHeadphones = ((informationDeviceImageJavaLangObjectNull) ? (informationDeviceImageContentDescription) : (deviceImage.getResources().getString(R.string.cont_desc_information_image_headphones)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.connectionState.setContentDescription(stringFormatConnectionStateAndroidStringContDescInformationStateInformationState);
                this.deviceAddress.setContentDescription(stringFormatDeviceAddressAndroidStringContDescInformationAddressInformationBluetoothAddress);
                this.deviceApplicationBuildId.setContentDescription(stringFormatDeviceApplicationBuildIdAndroidStringContDescInformationApplicationBuildIdInformationApplicationBuildId);
                this.deviceApplicationVersion.setContentDescription(stringFormatDeviceApplicationVersionAndroidStringContDescInformationApplicationVersionInformationApplicationVersion);
                this.deviceGaiaVersion.setContentDescription(stringFormatDeviceGaiaVersionAndroidStringContDescInformationGaiaVersionInformationGaiaVersion);
                this.deviceImage.setContentDescription(informationDeviceImageJavaLangObjectNullInformationDeviceImageContentDescriptionDeviceImageAndroidStringContDescInformationImageHeadphones);
                this.deviceName.setContentDescription(stringFormatDeviceNameAndroidStringContDescInformationNameInformationName);
                this.deviceSerialNumber.setContentDescription(stringFormatDeviceSerialNumberAndroidStringContDescInformationSerialNumberInformationSerialNumber);
                this.deviceSerialNumberEarbudLeft.setContentDescription(stringFormatDeviceSerialNumberEarbudLeftAndroidStringContDescInformationSerialNumberLeftInformationSerialNumberLeft);
                this.deviceSerialNumberEarbudRight.setContentDescription(stringFormatDeviceSerialNumberEarbudRightAndroidStringContDescInformationSerialNumberRightInformationSerialNumberRight);
                this.deviceVariantName.setContentDescription(stringFormatDeviceVariantNameAndroidStringContDescInformationVariantNameInformationVariantName);
            }
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.connectionState, informationState);
            this.connectionState.setVisibility(informationStateJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceAddress, stringFormatDeviceAddressAndroidStringBluetoothAddressInformationBluetoothAddress);
            this.deviceAddress.setVisibility(informationBluetoothAddressJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceApplicationBuildId, stringFormatDeviceApplicationBuildIdAndroidStringApplicationBuildIdInformationApplicationBuildId);
            this.deviceApplicationBuildId.setVisibility(informationApplicationBuildIdJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceApplicationVersion, stringFormatDeviceApplicationVersionAndroidStringApplicationVersionInformationApplicationVersion);
            this.deviceApplicationVersion.setVisibility(informationApplicationVersionJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceBatteryLevelCase, informationGetBatteryLevelBatteryCHARGERCASE);
            this.deviceBatteryLevelCase.setVisibility(informationGetBatteryLevelBatteryCHARGERCASEJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceBatteryLevelDevice, informationGetBatteryLevelBatterySINGLEDEVICE);
            this.deviceBatteryLevelDevice.setVisibility(informationGetBatteryLevelBatterySINGLEDEVICEJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceBatteryLevelLeft, informationGetBatteryLevelBatteryLEFTDEVICE);
            this.deviceBatteryLevelLeft.setVisibility(informationGetBatteryLevelBatteryLEFTDEVICEJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceBatteryLevelRight, informationGetBatteryLevelBatteryRIGHTDEVICE);
            this.deviceBatteryLevelRight.setVisibility(informationGetBatteryLevelBatteryRIGHTDEVICEJavaLangObjectNullViewVISIBLEViewGONE);
            this.deviceCharging.setVisibility(informationIsChargingViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceGaiaVersion, stringFormatDeviceGaiaVersionAndroidStringGaiaVersionInformationGaiaVersion);
            this.deviceGaiaVersion.setVisibility(informationGaiaVersionJavaLangObjectNullViewVISIBLEViewGONE);
            this.deviceImage.setImageResource(informationDeviceImageResourceId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceName, informationName);
            this.deviceName.setVisibility(informationNameJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceSerialNumber, informationSerialNumber);
            this.deviceSerialNumber.setVisibility(informationShowSingleSerialNumberViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceSerialNumberEarbudLeft, stringFormatDeviceSerialNumberEarbudLeftAndroidStringSerialNumberLeftInformationSerialNumberLeft);
            this.deviceSerialNumberEarbudLeft.setVisibility(informationSerialNumberLeftJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceSerialNumberEarbudRight, stringFormatDeviceSerialNumberEarbudRightAndroidStringSerialNumberRightInformationSerialNumberRight);
            this.deviceSerialNumberEarbudRight.setVisibility(informationSerialNumberRightJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceVariantName, informationVariantName);
            this.deviceVariantName.setVisibility(informationVariantNameJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView13.setVisibility(informationHasVersionsBooleanTrueInformationBluetoothAddressJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView18.setVisibility(informationHasStatesViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(informationHasBatteryLevelsViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(informationHasSerialNumbersViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): information
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(information.isCharging) ? View.VISIBLE : View.GONE
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(information.isCharging) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): information.applicationVersion != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): information.applicationVersion != null ? View.VISIBLE : View.GONE
        flag 6 (0x7L): information.hasVersions() ? true : information.bluetoothAddress != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): information.hasVersions() ? true : information.bluetoothAddress != null ? View.VISIBLE : View.GONE
        flag 8 (0x9L): information.getBatteryLevel(Battery.RIGHT_DEVICE) != null ? View.VISIBLE : View.GONE
        flag 9 (0xaL): information.getBatteryLevel(Battery.RIGHT_DEVICE) != null ? View.VISIBLE : View.GONE
        flag 10 (0xbL): information.serialNumberLeft != null ? View.VISIBLE : View.GONE
        flag 11 (0xcL): information.serialNumberLeft != null ? View.VISIBLE : View.GONE
        flag 12 (0xdL): information.showSingleSerialNumber() ? View.VISIBLE : View.GONE
        flag 13 (0xeL): information.showSingleSerialNumber() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): information.state != null ? View.VISIBLE : View.GONE
        flag 15 (0x10L): information.state != null ? View.VISIBLE : View.GONE
        flag 16 (0x11L): information.hasVersions() ? true : information.bluetoothAddress != null
        flag 17 (0x12L): information.hasVersions() ? true : information.bluetoothAddress != null
        flag 18 (0x13L): information.gaiaVersion != null ? View.VISIBLE : View.GONE
        flag 19 (0x14L): information.gaiaVersion != null ? View.VISIBLE : View.GONE
        flag 20 (0x15L): information.hasStates() ? View.VISIBLE : View.GONE
        flag 21 (0x16L): information.hasStates() ? View.VISIBLE : View.GONE
        flag 22 (0x17L): information.bluetoothAddress != null ? View.VISIBLE : View.GONE
        flag 23 (0x18L): information.bluetoothAddress != null ? View.VISIBLE : View.GONE
        flag 24 (0x19L): information.name != null ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): information.name != null ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): information.applicationBuildId != null ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): information.applicationBuildId != null ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): information.getBatteryLevel(Battery.CHARGER_CASE) != null ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): information.getBatteryLevel(Battery.CHARGER_CASE) != null ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): information.deviceImage != null ? information.deviceImage.contentDescription : @android:string/cont_desc_information_image_headphones
        flag 31 (0x20L): information.deviceImage != null ? information.deviceImage.contentDescription : @android:string/cont_desc_information_image_headphones
        flag 32 (0x21L): information.getBatteryLevel(Battery.SINGLE_DEVICE) != null ? View.VISIBLE : View.GONE
        flag 33 (0x22L): information.getBatteryLevel(Battery.SINGLE_DEVICE) != null ? View.VISIBLE : View.GONE
        flag 34 (0x23L): information.hasSerialNumbers() ? View.VISIBLE : View.GONE
        flag 35 (0x24L): information.hasSerialNumbers() ? View.VISIBLE : View.GONE
        flag 36 (0x25L): information.variantName != null ? View.VISIBLE : View.GONE
        flag 37 (0x26L): information.variantName != null ? View.VISIBLE : View.GONE
        flag 38 (0x27L): information.hasBatteryLevels() ? View.VISIBLE : View.GONE
        flag 39 (0x28L): information.hasBatteryLevels() ? View.VISIBLE : View.GONE
        flag 40 (0x29L): information.serialNumberRight != null ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): information.serialNumberRight != null ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): information.getBatteryLevel(Battery.LEFT_DEVICE) != null ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): information.getBatteryLevel(Battery.LEFT_DEVICE) != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}