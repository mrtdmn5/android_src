package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RingProgressBindingImpl extends RingProgressBinding  {

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

    public RingProgressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private RingProgressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.ring1.setTag(null);
        this.ring2.setTag(null);
        this.ringsLabel.setTag(null);
        this.value1.setTag(null);
        this.value2.setTag(null);
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
        if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.data == variableId) {
            setData((com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.DualRings) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setData(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.DualRings Data) {
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
        boolean dataIsDual = false;
        int dataOuterProgress = 0;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.GainRing dataInner = null;
        java.lang.String title = mTitle;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.GainRing dataOuter = null;
        int dataInnerProgress = 0;
        int dataIsDualViewVISIBLEViewINVISIBLE = 0;
        java.lang.String dataInnerLabel = null;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.DualRings data = mData;
        int dataIsDualViewVISIBLEViewGONE = 0;
        java.lang.String dataOuterLabel = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.isDual
                    dataIsDual = data.isDual();
                    // read data.inner
                    dataInner = data.getInner();
                    // read data.outer
                    dataOuter = data.getOuter();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(dataIsDual) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read data.isDual ? View.VISIBLE : View.INVISIBLE
                dataIsDualViewVISIBLEViewINVISIBLE = ((dataIsDual) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read data.isDual ? View.VISIBLE : View.GONE
                dataIsDualViewVISIBLEViewGONE = ((dataIsDual) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (dataInner != null) {
                    // read data.inner.progress
                    dataInnerProgress = dataInner.getProgress();
                    // read data.inner.label
                    dataInnerLabel = dataInner.getLabel();
                }
                if (dataOuter != null) {
                    // read data.outer.progress
                    dataOuterProgress = dataOuter.getProgress();
                    // read data.outer.label
                    dataOuterLabel = dataOuter.getLabel();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.ring1.setProgress(dataOuterProgress);
            this.ring2.setProgress(dataInnerProgress);
            this.ring2.setVisibility(dataIsDualViewVISIBLEViewINVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.value1, dataOuterLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.value2, dataInnerLabel);
            this.value2.setVisibility(dataIsDualViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ringsLabel, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): title
        flag 1 (0x2L): data
        flag 2 (0x3L): null
        flag 3 (0x4L): data.isDual ? View.VISIBLE : View.INVISIBLE
        flag 4 (0x5L): data.isDual ? View.VISIBLE : View.INVISIBLE
        flag 5 (0x6L): data.isDual ? View.VISIBLE : View.GONE
        flag 6 (0x7L): data.isDual ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}