package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FeedbackFormEntryBindingImpl extends FeedbackFormEntryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FeedbackFormEntryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FeedbackFormEntryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.inputLayout.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.maximumLength == variableId) {
            setMaximumLength((java.lang.Integer) variable);
        }
        else if (BR.helper == variableId) {
            setHelper((java.lang.String) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.placeholder == variableId) {
            setPlaceholder((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMaximumLength(@Nullable java.lang.Integer MaximumLength) {
        this.mMaximumLength = MaximumLength;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.maximumLength);
        super.requestRebind();
    }
    public void setHelper(@Nullable java.lang.String Helper) {
        this.mHelper = Helper;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.helper);
        super.requestRebind();
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setPlaceholder(@Nullable java.lang.String Placeholder) {
        this.mPlaceholder = Placeholder;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.placeholder);
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
        java.lang.Integer maximumLength = mMaximumLength;
        boolean maximumLengthJavaLangObjectNullMaximumLengthInt0BooleanFalse = false;
        java.lang.String helper = mHelper;
        boolean helperJavaLangObjectNull = false;
        boolean maximumLengthJavaLangObjectNull = false;
        boolean maximumLengthInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxMaximumLength = 0;
        java.lang.String title = mTitle;
        java.lang.String placeholder = mPlaceholder;

        if ((dirtyFlags & 0x11L) != 0) {



                // read maximumLength != null
                maximumLengthJavaLangObjectNull = (maximumLength) != (null);
                // read androidx.databinding.ViewDataBinding.safeUnbox(maximumLength)
                androidxDatabindingViewDataBindingSafeUnboxMaximumLength = androidx.databinding.ViewDataBinding.safeUnbox(maximumLength);
            if((dirtyFlags & 0x11L) != 0) {
                if(maximumLengthJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read helper != null
                helperJavaLangObjectNull = (helper) != (null);
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(maximumLength) > 0
                maximumLengthInt0 = (androidxDatabindingViewDataBindingSafeUnboxMaximumLength) > (0);
        }

        if ((dirtyFlags & 0x11L) != 0) {

                // read maximumLength != null ? androidx.databinding.ViewDataBinding.safeUnbox(maximumLength) > 0 : false
                maximumLengthJavaLangObjectNullMaximumLengthInt0BooleanFalse = ((maximumLengthJavaLangObjectNull) ? (maximumLengthInt0) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.inputLayout.setCounterEnabled(maximumLengthJavaLangObjectNullMaximumLengthInt0BooleanFalse);
            this.inputLayout.setCounterMaxLength(androidxDatabindingViewDataBindingSafeUnboxMaximumLength);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.inputLayout.setHelperText(helper);
            this.inputLayout.setHelperTextEnabled(helperJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.inputLayout.setPlaceholderText(placeholder);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): maximumLength
        flag 1 (0x2L): helper
        flag 2 (0x3L): title
        flag 3 (0x4L): placeholder
        flag 4 (0x5L): null
        flag 5 (0x6L): maximumLength != null ? androidx.databinding.ViewDataBinding.safeUnbox(maximumLength) > 0 : false
        flag 6 (0x7L): maximumLength != null ? androidx.databinding.ViewDataBinding.safeUnbox(maximumLength) > 0 : false
    flag mapping end*/
    //end
}