package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConnectionBindingImpl extends FragmentConnectionBinding  {

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

    public FragmentConnectionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentConnectionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            );
        this.back.setTag(null);
        this.connectionLabel.setTag(null);
        this.connectionProgress.setTag(null);
        this.connectionReason.setTag(null);
        this.imageTick.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.connection == variableId) {
            setConnection((com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConnection(@Nullable com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewData Connection) {
        this.mConnection = Connection;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.connection);
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
        int connectionReasonJavaLangObjectNullViewGONEViewVISIBLE = 0;
        boolean connectionStateJavaLangObjectNull = false;
        boolean connectionIsError = false;
        java.lang.String connectionReasonJavaLangObjectNullConnectionReasonAndroidStringConnectionReasonConnectionReason = null;
        java.lang.String connectionStateJavaLangObjectNullConnectionLabelAndroidStringConnectionStateConnectionState = null;
        int connectionInProgressViewVISIBLEViewINVISIBLE = 0;
        int connectionIsErrorViewVISIBLEViewGONE = 0;
        boolean connectionConnected = false;
        java.lang.String stringFormatConnectionReasonAndroidStringContDescConnectionErrorConnectionReason = null;
        boolean connectionReasonJavaLangObjectNull = false;
        boolean connectionInProgress = false;
        java.lang.String ConnectionReason1 = null;
        int connectionConnectedViewVISIBLEViewGONE = 0;
        com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewData connection = mConnection;
        java.lang.String stringFormatConnectionLabelAndroidStringContDescConnectionStateConnectionState = null;
        java.lang.String connectionState = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (connection != null) {
                    // read connection.isError
                    connectionIsError = connection.isError();
                    // read connection.connected
                    connectionConnected = connection.isConnected();
                    // read connection.inProgress
                    connectionInProgress = connection.isInProgress();
                    // read connection.reason
                    ConnectionReason1 = connection.getReason();
                    // read connection.state
                    connectionState = connection.getState();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(connectionIsError) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(connectionConnected) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(connectionInProgress) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read connection.isError ? View.VISIBLE : View.GONE
                connectionIsErrorViewVISIBLEViewGONE = ((connectionIsError) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read connection.connected ? View.VISIBLE : View.GONE
                connectionConnectedViewVISIBLEViewGONE = ((connectionConnected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read connection.inProgress ? View.VISIBLE : View.INVISIBLE
                connectionInProgressViewVISIBLEViewINVISIBLE = ((connectionInProgress) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read String.format(@android:string/cont_desc_connection_error, connection.reason)
                stringFormatConnectionReasonAndroidStringContDescConnectionErrorConnectionReason = java.lang.String.format(connectionReason.getResources().getString(R.string.cont_desc_connection_error), ConnectionReason1);
                // read connection.reason == null
                connectionReasonJavaLangObjectNull = (ConnectionReason1) == (null);
                // read connection.state == null
                connectionStateJavaLangObjectNull = (connectionState) == (null);
                // read String.format(@android:string/cont_desc_connection_state, connection.state)
                stringFormatConnectionLabelAndroidStringContDescConnectionStateConnectionState = java.lang.String.format(connectionLabel.getResources().getString(R.string.cont_desc_connection_state), connectionState);
            if((dirtyFlags & 0x3L) != 0) {
                if(connectionReasonJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(connectionStateJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read connection.reason == null ? View.GONE : View.VISIBLE
                connectionReasonJavaLangObjectNullViewGONEViewVISIBLE = ((connectionReasonJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read connection.reason == null ? @android:string/connection_reason : connection.reason
                connectionReasonJavaLangObjectNullConnectionReasonAndroidStringConnectionReasonConnectionReason = ((connectionReasonJavaLangObjectNull) ? (connectionReason.getResources().getString(R.string.connection_reason)) : (ConnectionReason1));
                // read connection.state == null ? @android:string/connection_state : connection.state
                connectionStateJavaLangObjectNullConnectionLabelAndroidStringConnectionStateConnectionState = ((connectionStateJavaLangObjectNull) ? (connectionLabel.getResources().getString(R.string.connection_state)) : (connectionState));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.back.setVisibility(connectionIsErrorViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.connectionLabel, connectionStateJavaLangObjectNullConnectionLabelAndroidStringConnectionStateConnectionState);
            this.connectionProgress.setVisibility(connectionInProgressViewVISIBLEViewINVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.connectionReason, connectionReasonJavaLangObjectNullConnectionReasonAndroidStringConnectionReasonConnectionReason);
            this.connectionReason.setVisibility(connectionReasonJavaLangObjectNullViewGONEViewVISIBLE);
            this.imageTick.setVisibility(connectionConnectedViewVISIBLEViewGONE);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.connectionLabel.setContentDescription(stringFormatConnectionLabelAndroidStringContDescConnectionStateConnectionState);
                this.connectionReason.setContentDescription(stringFormatConnectionReasonAndroidStringContDescConnectionErrorConnectionReason);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): connection
        flag 1 (0x2L): null
        flag 2 (0x3L): connection.reason == null ? View.GONE : View.VISIBLE
        flag 3 (0x4L): connection.reason == null ? View.GONE : View.VISIBLE
        flag 4 (0x5L): connection.reason == null ? @android:string/connection_reason : connection.reason
        flag 5 (0x6L): connection.reason == null ? @android:string/connection_reason : connection.reason
        flag 6 (0x7L): connection.state == null ? @android:string/connection_state : connection.state
        flag 7 (0x8L): connection.state == null ? @android:string/connection_state : connection.state
        flag 8 (0x9L): connection.inProgress ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): connection.inProgress ? View.VISIBLE : View.INVISIBLE
        flag 10 (0xbL): connection.isError ? View.VISIBLE : View.GONE
        flag 11 (0xcL): connection.isError ? View.VISIBLE : View.GONE
        flag 12 (0xdL): connection.connected ? View.VISIBLE : View.GONE
        flag 13 (0xeL): connection.connected ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}