package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreferenceDiscreteSliderBindingImpl extends PreferenceDiscreteSliderBinding  {

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

    public PreferenceDiscreteSliderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private PreferenceDiscreteSliderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
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
                mDirtyFlags = 0x20L;
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
        if (BR.value == variableId) {
            setValue((java.lang.Integer) variable);
        }
        else if (BR.stepSize == variableId) {
            setStepSize((java.lang.Integer) variable);
        }
        else if (BR.maxValue == variableId) {
            setMaxValue((java.lang.Integer) variable);
        }
        else if (BR.labelForValue == variableId) {
            setLabelForValue((java.lang.String) variable);
        }
        else if (BR.minValue == variableId) {
            setMinValue((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setValue(@Nullable java.lang.Integer Value) {
        this.mValue = Value;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.value);
        super.requestRebind();
    }
    public void setStepSize(@Nullable java.lang.Integer StepSize) {
        this.mStepSize = StepSize;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.stepSize);
        super.requestRebind();
    }
    public void setMaxValue(@Nullable java.lang.Integer MaxValue) {
        this.mMaxValue = MaxValue;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.maxValue);
        super.requestRebind();
    }
    public void setLabelForValue(@Nullable java.lang.String LabelForValue) {
        this.mLabelForValue = LabelForValue;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.labelForValue);
        super.requestRebind();
    }
    public void setMinValue(@Nullable java.lang.Integer MinValue) {
        this.mMinValue = MinValue;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.minValue);
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
        boolean minValueJavaLangObjectNull = false;
        java.lang.Integer value = mValue;
        int stepSizeJavaLangObjectNullInt1StepSize = 0;
        int minValueJavaLangObjectNullInt1MinValue = 0;
        boolean valueJavaLangObjectNull = false;
        boolean stepSizeJavaLangObjectNull = false;
        java.lang.Integer stepSize = mStepSize;
        int valueJavaLangObjectNullInt1Value = 0;
        boolean maxValueJavaLangObjectNull = false;
        java.lang.Integer maxValue = mMaxValue;
        java.lang.String labelForValue = mLabelForValue;
        java.lang.Integer minValue = mMinValue;
        int maxValueJavaLangObjectNullInt2MaxValue = 0;

        if ((dirtyFlags & 0x21L) != 0) {



                // read value == null
                valueJavaLangObjectNull = (value) == (null);
            if((dirtyFlags & 0x21L) != 0) {
                if(valueJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
        }
        if ((dirtyFlags & 0x22L) != 0) {



                // read stepSize == null
                stepSizeJavaLangObjectNull = (stepSize) == (null);
            if((dirtyFlags & 0x22L) != 0) {
                if(stepSizeJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        if ((dirtyFlags & 0x24L) != 0) {



                // read maxValue == null
                maxValueJavaLangObjectNull = (maxValue) == (null);
            if((dirtyFlags & 0x24L) != 0) {
                if(maxValueJavaLangObjectNull) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x30L) != 0) {



                // read minValue == null
                minValueJavaLangObjectNull = (minValue) == (null);
            if((dirtyFlags & 0x30L) != 0) {
                if(minValueJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x22L) != 0) {

                // read stepSize == null ? 1 : stepSize
                stepSizeJavaLangObjectNullInt1StepSize = ((stepSizeJavaLangObjectNull) ? (1) : (stepSize));
        }
        if ((dirtyFlags & 0x30L) != 0) {

                // read minValue == null ? 1 : minValue
                minValueJavaLangObjectNullInt1MinValue = ((minValueJavaLangObjectNull) ? (1) : (minValue));
        }
        if ((dirtyFlags & 0x21L) != 0) {

                // read value == null ? 1 : value
                valueJavaLangObjectNullInt1Value = ((valueJavaLangObjectNull) ? (1) : (value));
        }
        if ((dirtyFlags & 0x24L) != 0) {

                // read maxValue == null ? 2 : maxValue
                maxValueJavaLangObjectNullInt2MaxValue = ((maxValueJavaLangObjectNull) ? (2) : (maxValue));
        }
        // batch finished
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.label, labelForValue);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            this.slider.setStepSize(stepSizeJavaLangObjectNullInt1StepSize);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.slider.setValue(valueJavaLangObjectNullInt1Value);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.slider.setValueFrom(minValueJavaLangObjectNullInt1MinValue);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.slider.setValueTo(maxValueJavaLangObjectNullInt2MaxValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): value
        flag 1 (0x2L): stepSize
        flag 2 (0x3L): maxValue
        flag 3 (0x4L): labelForValue
        flag 4 (0x5L): minValue
        flag 5 (0x6L): null
        flag 6 (0x7L): stepSize == null ? 1 : stepSize
        flag 7 (0x8L): stepSize == null ? 1 : stepSize
        flag 8 (0x9L): minValue == null ? 1 : minValue
        flag 9 (0xaL): minValue == null ? 1 : minValue
        flag 10 (0xbL): value == null ? 1 : value
        flag 11 (0xcL): value == null ? 1 : value
        flag 12 (0xdL): maxValue == null ? 2 : maxValue
        flag 13 (0xeL): maxValue == null ? 2 : maxValue
    flag mapping end*/
    //end
}