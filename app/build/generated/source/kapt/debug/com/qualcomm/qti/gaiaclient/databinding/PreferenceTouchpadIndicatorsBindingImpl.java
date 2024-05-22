package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreferenceTouchpadIndicatorsBindingImpl extends PreferenceTouchpadIndicatorsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(android.R.id.title, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PreferenceTouchpadIndicatorsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private PreferenceTouchpadIndicatorsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.leftTouchpad.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rightTouchpad.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.rightTouchpadData == variableId) {
            setRightTouchpadData((com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.TouchpadViewData) variable);
        }
        else if (BR.leftTouchpadData == variableId) {
            setLeftTouchpadData((com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.TouchpadViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRightTouchpadData(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.TouchpadViewData RightTouchpadData) {
        this.mRightTouchpadData = RightTouchpadData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.rightTouchpadData);
        super.requestRebind();
    }
    public void setLeftTouchpadData(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.TouchpadViewData LeftTouchpadData) {
        this.mLeftTouchpadData = LeftTouchpadData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.leftTouchpadData);
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
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.TouchpadViewData rightTouchpadData = mRightTouchpadData;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.TouchpadViewData leftTouchpadData = mLeftTouchpadData;
        java.lang.String leftTouchpadDataContentDescription = null;
        java.lang.String rightTouchpadDataContentDescription = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (rightTouchpadData != null) {
                    // read rightTouchpadData.contentDescription
                    rightTouchpadDataContentDescription = rightTouchpadData.getContentDescription();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (leftTouchpadData != null) {
                    // read leftTouchpadData.contentDescription
                    leftTouchpadDataContentDescription = leftTouchpadData.getContentDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.leftTouchpad.setContentDescription(leftTouchpadDataContentDescription);
            }
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.rightTouchpad.setContentDescription(rightTouchpadDataContentDescription);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rightTouchpadData
        flag 1 (0x2L): leftTouchpadData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}