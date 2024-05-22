package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreferenceSliderBindingImpl extends PreferenceSliderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.vertical_guideline, 3);
        sViewsWithIds.put(android.R.id.title, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PreferenceSliderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private PreferenceSliderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatSeekBar) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.modeLabel.setTag(null);
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
        if (BR.max == variableId) {
            setMax((int) variable);
        }
        else if (BR.data == variableId) {
            setData((com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.SliderViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMax(int Max) {
        this.mMax = Max;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.max);
        super.requestRebind();
    }
    public void setData(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.SliderViewData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        int max = mMax;
        int dataProgress = 0;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.SliderViewData data = mData;
        java.lang.String dataLabel = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.progress
                    dataProgress = data.getProgress();
                    // read data.label
                    dataLabel = data.getLabel();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.modeLabel, dataLabel);
            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.slider, dataProgress);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.slider.setMax(max);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): max
        flag 1 (0x2L): data
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}