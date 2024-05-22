package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GestureContextItemBindingImpl extends GestureContextItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.actions_list, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GestureContextItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private GestureContextItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (androidx.appcompat.widget.SwitchCompat) bindings[2]
            );
        this.contextTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.selectionTypeSwitch.setTag(null);
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
        if (BR.viewData == variableId) {
            setViewData((com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ContextViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewData(@Nullable com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ContextViewData ViewData) {
        this.mViewData = ViewData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewData);
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
        com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ContextViewData viewData = mViewData;
        boolean viewDataSwitchChecked = false;
        boolean viewDataIsSwitchVisible = false;
        int viewDataIsSwitchVisibleViewVISIBLEViewGONE = 0;
        java.lang.String viewDataLabel = null;
        boolean viewDataIsSwitchEnabled = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewData != null) {
                    // read viewData.switchChecked
                    viewDataSwitchChecked = viewData.isSwitchChecked();
                    // read viewData.isSwitchVisible
                    viewDataIsSwitchVisible = viewData.isSwitchVisible();
                    // read viewData.label
                    viewDataLabel = viewData.getLabel();
                    // read viewData.isSwitchEnabled
                    viewDataIsSwitchEnabled = viewData.isSwitchEnabled();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewDataIsSwitchVisible) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewData.isSwitchVisible ? View.VISIBLE : View.GONE
                viewDataIsSwitchVisibleViewVISIBLEViewGONE = ((viewDataIsSwitchVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contextTitle, viewDataLabel);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.selectionTypeSwitch, viewDataSwitchChecked);
            this.selectionTypeSwitch.setEnabled(viewDataIsSwitchEnabled);
            this.selectionTypeSwitch.setVisibility(viewDataIsSwitchVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewData
        flag 1 (0x2L): null
        flag 2 (0x3L): viewData.isSwitchVisible ? View.VISIBLE : View.GONE
        flag 3 (0x4L): viewData.isSwitchVisible ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}