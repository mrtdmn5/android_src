package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMusicProcessingBindingImpl extends FragmentMusicProcessingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(2, 
            new String[] {"fragment_music_processing_labels"},
            new int[] {4},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.fragment_music_processing_labels});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.errorTextView, 5);
        sViewsWithIds.put(R.id.eqContainer, 6);
        sViewsWithIds.put(R.id.graphView, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMusicProcessingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentMusicProcessingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.GraphView) bindings[7]
            , (com.qualcomm.qti.gaiaclient.databinding.FragmentMusicProcessingLabelsBinding) bindings[4]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[3]
            );
        setContainedBinding(this.labels);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.presetRowsContainerView.setTag(null);
        this.sliderHorizontalContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        labels.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (labels.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        labels.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLabels((com.qualcomm.qti.gaiaclient.databinding.FragmentMusicProcessingLabelsBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLabels(com.qualcomm.qti.gaiaclient.databinding.FragmentMusicProcessingLabelsBinding Labels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        // batch finished
        executeBindingsOn(labels);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): labels
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}