package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ModeItemBindingImpl extends ModeItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ModeItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ModeItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.modeId.setTag(null);
        this.modeLabel.setTag(null);
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
            setData((com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.ModeItemViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.ModeItemViewData Data) {
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
        boolean dataIsEnabled = false;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.ModeItemViewData data = mData;
        java.lang.String dataLabel = null;
        java.lang.String dataValue = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.isEnabled
                    dataIsEnabled = data.isEnabled();
                    // read data.label
                    dataLabel = data.getLabel();
                    // read data.value
                    dataValue = data.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.modeId.setEnabled(dataIsEnabled);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.modeId, dataValue);
            this.modeLabel.setEnabled(dataIsEnabled);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.modeLabel, dataLabel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}