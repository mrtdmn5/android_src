package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreferenceGainBindingImpl extends PreferenceGainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"ring_progress", "ring_progress"},
            new int[] {1, 2},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.ring_progress,
                com.qualcomm.qti.gaiaclient.R.layout.ring_progress});
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

    public PreferenceGainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private PreferenceGainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.qualcomm.qti.gaiaclient.databinding.RingProgressBinding) bindings[1]
            , (com.qualcomm.qti.gaiaclient.databinding.RingProgressBinding) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            );
        setContainedBinding(this.leftRing);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.rightRing);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        leftRing.invalidateAll();
        rightRing.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (leftRing.hasPendingBindings()) {
            return true;
        }
        if (rightRing.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.GainPreferenceViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.GainPreferenceViewData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        leftRing.setLifecycleOwner(lifecycleOwner);
        rightRing.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRightRing((com.qualcomm.qti.gaiaclient.databinding.RingProgressBinding) object, fieldId);
            case 1 :
                return onChangeLeftRing((com.qualcomm.qti.gaiaclient.databinding.RingProgressBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRightRing(com.qualcomm.qti.gaiaclient.databinding.RingProgressBinding RightRing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLeftRing(com.qualcomm.qti.gaiaclient.databinding.RingProgressBinding LeftRing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.DualRings dataRight = null;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.DualRings dataLeft = null;
        com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.GainPreferenceViewData data = mData;

        if ((dirtyFlags & 0xcL) != 0) {



                if (data != null) {
                    // read data.right
                    dataRight = data.getRight();
                    // read data.left
                    dataLeft = data.getLeft();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.leftRing.setData(dataLeft);
            this.rightRing.setData(dataRight);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.leftRing.setTitle(java.lang.String.format(getRoot().getResources().getString(R.string.settings_audio_curation_left_earbud)));
            this.rightRing.setTitle(java.lang.String.format(getRoot().getResources().getString(R.string.settings_audio_curation_right_earbud)));
        }
        executeBindingsOn(leftRing);
        executeBindingsOn(rightRing);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): rightRing
        flag 1 (0x2L): leftRing
        flag 2 (0x3L): data
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}