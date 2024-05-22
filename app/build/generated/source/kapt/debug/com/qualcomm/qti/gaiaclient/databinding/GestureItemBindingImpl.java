package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GestureItemBindingImpl extends GestureItemBinding  {

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
    private final android.widget.ImageView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GestureItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private GestureItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.gestureName.setTag(null);
        this.gestureSummary.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.gesture == variableId) {
            setGesture((com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GestureViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGesture(@Nullable com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GestureViewData Gesture) {
        this.mGesture = Gesture;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.gesture);
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
        int gestureSummaryJavaLangObjectNullViewGONEViewVISIBLE = 0;
        com.qualcomm.qti.gaiaclient.ui.common.ImageViewData gestureImage = null;
        boolean gestureSummaryJavaLangObjectNull = false;
        boolean gestureImageJavaLangObjectNull = false;
        java.lang.String gestureImageContentDescription = null;
        java.lang.String GestureSummary1 = null;
        java.lang.String GestureName1 = null;
        int gestureImageResourceId = 0;
        com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GestureViewData gesture = mGesture;
        int gestureImageJavaLangObjectNullViewINVISIBLEViewVISIBLE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (gesture != null) {
                    // read gesture.image
                    gestureImage = gesture.getImage();
                    // read gesture.summary
                    GestureSummary1 = gesture.getSummary();
                    // read gesture.name
                    GestureName1 = gesture.getName();
                }


                // read gesture.image == null
                gestureImageJavaLangObjectNull = (gestureImage) == (null);
                // read gesture.summary == null
                gestureSummaryJavaLangObjectNull = (GestureSummary1) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(gestureImageJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(gestureSummaryJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
                if (gestureImage != null) {
                    // read gesture.image.contentDescription
                    gestureImageContentDescription = gestureImage.getContentDescription();
                    // read gesture.image.resourceId
                    gestureImageResourceId = gestureImage.getResourceId();
                }


                // read gesture.image == null ? View.INVISIBLE : View.VISIBLE
                gestureImageJavaLangObjectNullViewINVISIBLEViewVISIBLE = ((gestureImageJavaLangObjectNull) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                // read gesture.summary == null ? View.GONE : View.VISIBLE
                gestureSummaryJavaLangObjectNullViewGONEViewVISIBLE = ((gestureSummaryJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gestureName, GestureName1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.gestureSummary, GestureSummary1);
            this.gestureSummary.setVisibility(gestureSummaryJavaLangObjectNullViewGONEViewVISIBLE);
            this.mboundView1.setVisibility(gestureImageJavaLangObjectNullViewINVISIBLEViewVISIBLE);
            this.mboundView1.setImageResource(gestureImageResourceId);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.mboundView0.setContentDescription(gestureImageContentDescription);
                this.mboundView1.setContentDescription(gestureImageContentDescription);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gesture
        flag 1 (0x2L): null
        flag 2 (0x3L): gesture.summary == null ? View.GONE : View.VISIBLE
        flag 3 (0x4L): gesture.summary == null ? View.GONE : View.VISIBLE
        flag 4 (0x5L): gesture.image == null ? View.INVISIBLE : View.VISIBLE
        flag 5 (0x6L): gesture.image == null ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}