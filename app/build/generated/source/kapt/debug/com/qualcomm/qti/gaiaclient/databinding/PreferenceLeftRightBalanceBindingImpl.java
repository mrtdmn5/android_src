package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreferenceLeftRightBalanceBindingImpl extends PreferenceLeftRightBalanceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(android.R.id.title, 3);
        sViewsWithIds.put(R.id.left_touchpad, 4);
        sViewsWithIds.put(R.id.right_touchpad, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PreferenceLeftRightBalanceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private PreferenceLeftRightBalanceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (com.google.android.material.slider.Slider) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.label.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.slider.setTag(null);
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
        if (BR.labelForValue == variableId) {
            setLabelForValue((java.lang.String) variable);
        }
        else if (BR.value == variableId) {
            setValue((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLabelForValue(@Nullable java.lang.String LabelForValue) {
        this.mLabelForValue = LabelForValue;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.labelForValue);
        super.requestRebind();
    }
    public void setValue(@Nullable java.lang.Integer Value) {
        this.mValue = Value;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.value);
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
        int valueJavaLangObjectNullInt0Value = 0;
        java.lang.String labelForValue = mLabelForValue;
        java.lang.Integer value = mValue;
        boolean valueJavaLangObjectNull = false;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read value == null
                valueJavaLangObjectNull = (value) == (null);
            if((dirtyFlags & 0x6L) != 0) {
                if(valueJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read value == null ? 0 : value
                valueJavaLangObjectNullInt0Value = ((valueJavaLangObjectNull) ? (0) : (value));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.label, labelForValue);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.slider.setValue(valueJavaLangObjectNullInt0Value);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): labelForValue
        flag 1 (0x2L): value
        flag 2 (0x3L): null
        flag 3 (0x4L): value == null ? 0 : value
        flag 4 (0x5L): value == null ? 0 : value
    flag mapping end*/
    //end
}