package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActionItemBindingImpl extends ActionItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tick_touchpad_touch_area, 5);
        sViewsWithIds.put(R.id.left_touchpad, 6);
        sViewsWithIds.put(R.id.right_touchpad, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActionItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActionItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            );
        this.actionTitle.setTag(null);
        this.leftTouchpadTouchArea.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rightTouchpadTouchArea.setTag(null);
        this.tickTouchpad.setTag(null);
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
        if (BR.data == variableId) {
            setData((com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ActionViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ActionViewData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
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
        com.qualcomm.qti.gaiaclient.ui.gestures.configuration.TouchpadViewData dataLeftTouchpad = null;
        boolean dataTickDataIsVisible = false;
        java.lang.String dataLabel = null;
        int dataTickDataIsVisibleViewGONEDataTickDataIsSelectedViewVISIBLEViewINVISIBLE = 0;
        com.qualcomm.qti.gaiaclient.ui.gestures.configuration.TouchpadViewData dataRightTouchpad = null;
        com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ActionViewData data = mData;
        boolean DataTickDataIsVisible1 = false;
        boolean dataRightTouchpadIsVisible = false;
        int dataRightTouchpadIsVisibleViewVISIBLEViewGONE = 0;
        boolean dataTickDataIsSelected = false;
        int dataLeftTouchpadIsVisibleViewVISIBLEViewGONE = 0;
        com.qualcomm.qti.gaiaclient.ui.gestures.configuration.TouchpadViewData dataTickData = null;
        boolean dataLeftTouchpadIsVisible = false;
        int dataTickDataIsSelectedViewVISIBLEViewINVISIBLE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.leftTouchpad
                    dataLeftTouchpad = data.getLeftTouchpad();
                    // read data.label
                    dataLabel = data.getLabel();
                    // read data.rightTouchpad
                    dataRightTouchpad = data.getRightTouchpad();
                    // read data.tickData
                    dataTickData = data.getTickData();
                }


                if (dataLeftTouchpad != null) {
                    // read data.leftTouchpad.isVisible
                    dataLeftTouchpadIsVisible = dataLeftTouchpad.isVisible();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataLeftTouchpadIsVisible) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
                if (dataRightTouchpad != null) {
                    // read data.rightTouchpad.isVisible
                    dataRightTouchpadIsVisible = dataRightTouchpad.isVisible();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataRightTouchpadIsVisible) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
                if (dataTickData != null) {
                    // read data.tickData.isVisible
                    dataTickDataIsVisible = dataTickData.isVisible();
                }


                // read data.leftTouchpad.isVisible ? View.VISIBLE : View.GONE
                dataLeftTouchpadIsVisibleViewVISIBLEViewGONE = ((dataLeftTouchpadIsVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read data.rightTouchpad.isVisible ? View.VISIBLE : View.GONE
                dataRightTouchpadIsVisibleViewVISIBLEViewGONE = ((dataRightTouchpadIsVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !data.tickData.isVisible
                DataTickDataIsVisible1 = !dataTickDataIsVisible;
            if((dirtyFlags & 0x3L) != 0) {
                if(DataTickDataIsVisible1) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4L) != 0) {

                if (dataTickData != null) {
                    // read data.tickData.isSelected
                    dataTickDataIsSelected = dataTickData.isSelected();
                }
            if((dirtyFlags & 0x4L) != 0) {
                if(dataTickDataIsSelected) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read data.tickData.isSelected ? View.VISIBLE : View.INVISIBLE
                dataTickDataIsSelectedViewVISIBLEViewINVISIBLE = ((dataTickDataIsSelected) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read !data.tickData.isVisible ? View.GONE : data.tickData.isSelected ? View.VISIBLE : View.INVISIBLE
                dataTickDataIsVisibleViewGONEDataTickDataIsSelectedViewVISIBLEViewINVISIBLE = ((DataTickDataIsVisible1) ? (android.view.View.GONE) : (dataTickDataIsSelectedViewVISIBLEViewINVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.actionTitle, dataLabel);
            this.leftTouchpadTouchArea.setVisibility(dataLeftTouchpadIsVisibleViewVISIBLEViewGONE);
            this.rightTouchpadTouchArea.setVisibility(dataRightTouchpadIsVisibleViewVISIBLEViewGONE);
            this.tickTouchpad.setVisibility(dataTickDataIsVisibleViewGONEDataTickDataIsSelectedViewVISIBLEViewINVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): !data.tickData.isVisible ? View.GONE : data.tickData.isSelected ? View.VISIBLE : View.INVISIBLE
        flag 3 (0x4L): !data.tickData.isVisible ? View.GONE : data.tickData.isSelected ? View.VISIBLE : View.INVISIBLE
        flag 4 (0x5L): data.rightTouchpad.isVisible ? View.VISIBLE : View.GONE
        flag 5 (0x6L): data.rightTouchpad.isVisible ? View.VISIBLE : View.GONE
        flag 6 (0x7L): data.leftTouchpad.isVisible ? View.VISIBLE : View.GONE
        flag 7 (0x8L): data.leftTouchpad.isVisible ? View.VISIBLE : View.GONE
        flag 8 (0x9L): data.tickData.isSelected ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): data.tickData.isSelected ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}