package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NoDataMessageBindingImpl extends NoDataMessageBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NoDataMessageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private NoDataMessageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.message);
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
        java.lang.String messageTitleJavaLangObjectNullMboundView1AndroidStringDefaultNoDataTitleMessageTitle = null;
        boolean messageRefsJavaLangObjectNull = false;
        int messageJavaLangObjectNullBooleanTrueMessageShowViewGONEViewVISIBLE = 0;
        int messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNullBooleanTrueMessageRefsIsEmptyViewGONEViewVISIBLE = 0;
        java.lang.String stringFormatMboundView3AndroidStringDefaultRefsMessageRefs = null;
        boolean messageJavaLangObjectNull = false;
        boolean messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNull = false;
        boolean messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNullBooleanTrueMessageRefsIsEmpty = false;
        java.lang.String messageRefs = null;
        java.lang.String messageMessageJavaLangObjectNullMboundView2AndroidStringDefaultNoDataMessageMessageMessage = null;
        com.qualcomm.qti.gaiaclient.ui.common.MessageData message = mMessage;
        boolean messageShow = false;
        boolean messageJavaLangObjectNullBooleanTrueMessageShow = false;
        boolean messageMessageJavaLangObjectNull = false;
        boolean MessageShow1 = false;
        java.lang.String messageTitle = null;
        boolean messageRefsIsEmpty = false;
        boolean messageTitleJavaLangObjectNull = false;
        java.lang.String messageMessage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                // read message == null
                messageJavaLangObjectNull = (message) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(messageJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x4000L;
                }
            }
                if (message != null) {
                    // read message.refs
                    messageRefs = message.getRefs();
                    // read message.title
                    messageTitle = message.getTitle();
                    // read message.message
                    messageMessage = message.getMessage();
                }


                // read String.format(@android:string/default_refs, message.refs)
                stringFormatMboundView3AndroidStringDefaultRefsMessageRefs = java.lang.String.format(mboundView3.getResources().getString(R.string.default_refs), messageRefs);
                // read message.title == null
                messageTitleJavaLangObjectNull = (messageTitle) == (null);
                // read message.message == null
                messageMessageJavaLangObjectNull = (messageMessage) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(messageTitleJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(messageMessageJavaLangObjectNull) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read message.title == null ? @android:string/default_no_data_title : message.title
                messageTitleJavaLangObjectNullMboundView1AndroidStringDefaultNoDataTitleMessageTitle = ((messageTitleJavaLangObjectNull) ? (mboundView1.getResources().getString(R.string.default_no_data_title)) : (messageTitle));
                // read message.message == null ? @android:string/default_no_data_message : message.message
                messageMessageJavaLangObjectNullMboundView2AndroidStringDefaultNoDataMessageMessageMessage = ((messageMessageJavaLangObjectNull) ? (mboundView2.getResources().getString(R.string.default_no_data_message)) : (messageMessage));
        }
        if ((dirtyFlags & 0x100L) != 0) {

                // read message.refs == null
                messageRefsJavaLangObjectNull = (messageRefs) == (null);
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                if (message != null) {
                    // read message.show
                    MessageShow1 = message.getShow();
                }


                // read !message.show
                messageShow = !MessageShow1;
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read message == null ? true : message.refs == null
                messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNull = ((messageJavaLangObjectNull) ? (true) : (messageRefsJavaLangObjectNull));
                // read message == null ? true : !message.show
                messageJavaLangObjectNullBooleanTrueMessageShow = ((messageJavaLangObjectNull) ? (true) : (messageShow));
            if((dirtyFlags & 0x3L) != 0) {
                if(messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(messageJavaLangObjectNullBooleanTrueMessageShow) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read message == null ? true : !message.show ? View.GONE : View.VISIBLE
                messageJavaLangObjectNullBooleanTrueMessageShowViewGONEViewVISIBLE = ((messageJavaLangObjectNullBooleanTrueMessageShow) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (messageRefs != null) {
                    // read message.refs.isEmpty()
                    messageRefsIsEmpty = messageRefs.isEmpty();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read message == null ? true : message.refs == null ? true : message.refs.isEmpty()
                messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNullBooleanTrueMessageRefsIsEmpty = ((messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNull) ? (true) : (messageRefsIsEmpty));
            if((dirtyFlags & 0x3L) != 0) {
                if(messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNullBooleanTrueMessageRefsIsEmpty) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read message == null ? true : message.refs == null ? true : message.refs.isEmpty() ? View.GONE : View.VISIBLE
                messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNullBooleanTrueMessageRefsIsEmptyViewGONEViewVISIBLE = ((messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNullBooleanTrueMessageRefsIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(messageJavaLangObjectNullBooleanTrueMessageShowViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, messageTitleJavaLangObjectNullMboundView1AndroidStringDefaultNoDataTitleMessageTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, messageMessageJavaLangObjectNullMboundView2AndroidStringDefaultNoDataMessageMessageMessage);
            this.mboundView3.setVisibility(messageJavaLangObjectNullBooleanTrueMessageRefsJavaLangObjectNullBooleanTrueMessageRefsIsEmptyViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, stringFormatMboundView3AndroidStringDefaultRefsMessageRefs);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): message
        flag 1 (0x2L): null
        flag 2 (0x3L): message.title == null ? @android:string/default_no_data_title : message.title
        flag 3 (0x4L): message.title == null ? @android:string/default_no_data_title : message.title
        flag 4 (0x5L): message == null ? true : !message.show ? View.GONE : View.VISIBLE
        flag 5 (0x6L): message == null ? true : !message.show ? View.GONE : View.VISIBLE
        flag 6 (0x7L): message == null ? true : message.refs == null ? true : message.refs.isEmpty() ? View.GONE : View.VISIBLE
        flag 7 (0x8L): message == null ? true : message.refs == null ? true : message.refs.isEmpty() ? View.GONE : View.VISIBLE
        flag 8 (0x9L): message == null ? true : message.refs == null
        flag 9 (0xaL): message == null ? true : message.refs == null
        flag 10 (0xbL): message == null ? true : message.refs == null ? true : message.refs.isEmpty()
        flag 11 (0xcL): message == null ? true : message.refs == null ? true : message.refs.isEmpty()
        flag 12 (0xdL): message.message == null ? @android:string/default_no_data_message : message.message
        flag 13 (0xeL): message.message == null ? @android:string/default_no_data_message : message.message
        flag 14 (0xfL): message == null ? true : !message.show
        flag 15 (0x10L): message == null ? true : !message.show
    flag mapping end*/
    //end
}