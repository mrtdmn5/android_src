package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DeviceItemBindingImpl extends DeviceItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontal_guideline, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DeviceItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DeviceItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            );
        this.bluetoothImage.setTag(null);
        this.bluetoothType.setTag(null);
        this.deviceAddress.setTag(null);
        this.deviceName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.device == variableId) {
            setDevice((com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDevice(@Nullable com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData Device) {
        this.mDevice = Device;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.device);
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
        java.lang.String deviceImageJavaLangObjectNullDeviceImageContentDescriptionBluetoothImageAndroidStringContDescNotPaired = null;
        boolean deviceNameJavaLangObjectNull = false;
        int deviceImageResourceId = 0;
        java.lang.String deviceBluetoothType = null;
        boolean deviceBluetoothAddressJavaLangObjectNull = false;
        com.qualcomm.qti.gaiaclient.ui.common.ImageViewData deviceImage = null;
        com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData device = mDevice;
        java.lang.String DeviceName1 = null;
        int deviceNameJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String stringFormatMboundView0AndroidStringContDescDiscoveryDeviceDeviceNameDeviceBluetoothAddress = null;
        boolean deviceImageJavaLangObjectNull = false;
        int deviceBluetoothAddressJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String deviceBluetoothAddress = null;
        java.lang.String deviceImageContentDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (device != null) {
                    // read device.bluetoothType
                    deviceBluetoothType = device.getBluetoothType();
                    // read device.image
                    deviceImage = device.getImage();
                    // read device.name
                    DeviceName1 = device.getName();
                    // read device.bluetoothAddress
                    deviceBluetoothAddress = device.getBluetoothAddress();
                }


                if (deviceImage != null) {
                    // read device.image.resourceId
                    deviceImageResourceId = deviceImage.getResourceId();
                }
                // read device.image != null
                deviceImageJavaLangObjectNull = (deviceImage) != (null);
                // read device.name == null
                deviceNameJavaLangObjectNull = (DeviceName1) == (null);
                // read device.bluetoothAddress == null
                deviceBluetoothAddressJavaLangObjectNull = (deviceBluetoothAddress) == (null);
                // read String.format(@android:string/cont_desc_discovery_device, device.name, device.bluetoothAddress)
                stringFormatMboundView0AndroidStringContDescDiscoveryDeviceDeviceNameDeviceBluetoothAddress = java.lang.String.format(mboundView0.getResources().getString(R.string.cont_desc_discovery_device), DeviceName1, deviceBluetoothAddress);
            if((dirtyFlags & 0x3L) != 0) {
                if(deviceImageJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(deviceNameJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(deviceBluetoothAddressJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read device.name == null ? View.GONE : View.VISIBLE
                deviceNameJavaLangObjectNullViewGONEViewVISIBLE = ((deviceNameJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read device.bluetoothAddress == null ? View.GONE : View.VISIBLE
                deviceBluetoothAddressJavaLangObjectNullViewGONEViewVISIBLE = ((deviceBluetoothAddressJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (deviceImage != null) {
                    // read device.image.contentDescription
                    deviceImageContentDescription = deviceImage.getContentDescription();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read device.image != null ? device.image.contentDescription : @android:string/cont_desc_not_paired
                deviceImageJavaLangObjectNullDeviceImageContentDescriptionBluetoothImageAndroidStringContDescNotPaired = ((deviceImageJavaLangObjectNull) ? (deviceImageContentDescription) : (bluetoothImage.getResources().getString(R.string.cont_desc_not_paired)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.bluetoothImage.setContentDescription(deviceImageJavaLangObjectNullDeviceImageContentDescriptionBluetoothImageAndroidStringContDescNotPaired);
                this.mboundView0.setContentDescription(stringFormatMboundView0AndroidStringContDescDiscoveryDeviceDeviceNameDeviceBluetoothAddress);
            }
            // api target 1

            this.bluetoothImage.setImageResource(deviceImageResourceId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bluetoothType, deviceBluetoothType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceAddress, deviceBluetoothAddress);
            this.deviceAddress.setVisibility(deviceBluetoothAddressJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.deviceName, DeviceName1);
            this.deviceName.setVisibility(deviceNameJavaLangObjectNullViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): device
        flag 1 (0x2L): null
        flag 2 (0x3L): device.image != null ? device.image.contentDescription : @android:string/cont_desc_not_paired
        flag 3 (0x4L): device.image != null ? device.image.contentDescription : @android:string/cont_desc_not_paired
        flag 4 (0x5L): device.name == null ? View.GONE : View.VISIBLE
        flag 5 (0x6L): device.name == null ? View.GONE : View.VISIBLE
        flag 6 (0x7L): device.bluetoothAddress == null ? View.GONE : View.VISIBLE
        flag 7 (0x8L): device.bluetoothAddress == null ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}