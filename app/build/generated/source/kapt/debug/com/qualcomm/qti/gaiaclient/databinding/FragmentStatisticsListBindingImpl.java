package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentStatisticsListBindingImpl extends FragmentStatisticsListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"no_data_message"},
            new int[] {2},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.no_data_message});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.statistics_action_button, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStatisticsListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentStatisticsListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.qualcomm.qti.gaiaclient.databinding.NoDataMessageBinding) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.Button) bindings[3]
            );
        setContainedBinding(this.emptyListMessageId);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.statisticList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        emptyListMessageId.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (emptyListMessageId.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.message == variableId) {
            setMessage((com.qualcomm.qti.gaiaclient.ui.common.MessageData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMessage(@Nullable com.qualcomm.qti.gaiaclient.ui.common.MessageData Message) {
        this.mMessage = Message;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.message);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        emptyListMessageId.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEmptyListMessageId((com.qualcomm.qti.gaiaclient.databinding.NoDataMessageBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEmptyListMessageId(com.qualcomm.qti.gaiaclient.databinding.NoDataMessageBinding EmptyListMessageId, int fieldId) {
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
        boolean messageShow = false;
        int messageShowViewINVISIBLEViewVISIBLE = 0;
        int messageShowViewVISIBLEViewINVISIBLE = 0;
        com.qualcomm.qti.gaiaclient.ui.common.MessageData message = mMessage;

        if ((dirtyFlags & 0x6L) != 0) {



                if (message != null) {
                    // read message.show
                    messageShow = message.getShow();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(messageShow) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read message.show ? View.INVISIBLE : View.VISIBLE
                messageShowViewINVISIBLEViewVISIBLE = ((messageShow) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                // read message.show ? View.VISIBLE : View.INVISIBLE
                messageShowViewVISIBLEViewINVISIBLE = ((messageShow) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.emptyListMessageId.getRoot().setVisibility(messageShowViewVISIBLEViewINVISIBLE);
            this.emptyListMessageId.setMessage(message);
            this.statisticList.setVisibility(messageShowViewINVISIBLEViewVISIBLE);
        }
        executeBindingsOn(emptyListMessageId);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): emptyListMessageId
        flag 1 (0x2L): message
        flag 2 (0x3L): null
        flag 3 (0x4L): message.show ? View.INVISIBLE : View.VISIBLE
        flag 4 (0x5L): message.show ? View.INVISIBLE : View.VISIBLE
        flag 5 (0x6L): message.show ? View.VISIBLE : View.INVISIBLE
        flag 6 (0x7L): message.show ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}