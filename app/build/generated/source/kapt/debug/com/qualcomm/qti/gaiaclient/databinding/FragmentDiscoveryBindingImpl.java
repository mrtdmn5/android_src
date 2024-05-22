package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDiscoveryBindingImpl extends FragmentDiscoveryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(1, 
            new String[] {"no_data_message"},
            new int[] {3},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.no_data_message});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDiscoveryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentDiscoveryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.qualcomm.qti.gaiaclient.databinding.NoDataMessageBinding) bindings[3]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            );
        this.devicesList.setTag(null);
        setContainedBinding(this.emptyListMessageId);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.swipeRefreshLayout.setTag(null);
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
        boolean messageJavaLangObjectNullBooleanTrueMessageShow = false;
        boolean messageJavaLangObjectNull = false;
        com.qualcomm.qti.gaiaclient.ui.common.MessageData message = mMessage;
        int messageJavaLangObjectNullBooleanTrueMessageShowViewGONEViewVISIBLE = 0;
        boolean messageShow = false;

        if ((dirtyFlags & 0x6L) != 0) {



                // read message == null
                messageJavaLangObjectNull = (message) == (null);
            if((dirtyFlags & 0x6L) != 0) {
                if(messageJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (message != null) {
                    // read message.show
                    messageShow = message.getShow();
                }
        }

        if ((dirtyFlags & 0x6L) != 0) {

                // read message == null ? true : message.show
                messageJavaLangObjectNullBooleanTrueMessageShow = ((messageJavaLangObjectNull) ? (true) : (messageShow));
            if((dirtyFlags & 0x6L) != 0) {
                if(messageJavaLangObjectNullBooleanTrueMessageShow) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read message == null ? true : message.show ? View.GONE : View.VISIBLE
                messageJavaLangObjectNullBooleanTrueMessageShowViewGONEViewVISIBLE = ((messageJavaLangObjectNullBooleanTrueMessageShow) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.devicesList.setVisibility(messageJavaLangObjectNullBooleanTrueMessageShowViewGONEViewVISIBLE);
            this.emptyListMessageId.setMessage(message);
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
        flag 3 (0x4L): message == null ? true : message.show
        flag 4 (0x5L): message == null ? true : message.show
        flag 5 (0x6L): message == null ? true : message.show ? View.GONE : View.VISIBLE
        flag 6 (0x7L): message == null ? true : message.show ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}