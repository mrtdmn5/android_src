package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFeedbackFormBindingImpl extends FragmentFeedbackFormBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"feedback_form_entry", "feedback_form_entry", "feedback_form_entry", "feedback_form_entry"},
            new int[] {2, 3, 4, 5},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.feedback_form_entry,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_form_entry,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_form_entry,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_form_entry});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.send, 6);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFeedbackFormBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentFeedbackFormBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) bindings[3]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) bindings[5]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) bindings[4]
            , (android.widget.Button) bindings[6]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) bindings[2]
            );
        setContainedBinding(this.description);
        setContainedBinding(this.hardwareVersion);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.reporter);
        setContainedBinding(this.title);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        title.invalidateAll();
        description.invalidateAll();
        reporter.invalidateAll();
        hardwareVersion.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (title.hasPendingBindings()) {
            return true;
        }
        if (description.hasPendingBindings()) {
            return true;
        }
        if (reporter.hasPendingBindings()) {
            return true;
        }
        if (hardwareVersion.hasPendingBindings()) {
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
        title.setLifecycleOwner(lifecycleOwner);
        description.setLifecycleOwner(lifecycleOwner);
        reporter.setLifecycleOwner(lifecycleOwner);
        hardwareVersion.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeReporter((com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) object, fieldId);
            case 1 :
                return onChangeHardwareVersion((com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) object, fieldId);
            case 2 :
                return onChangeTitle((com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) object, fieldId);
            case 3 :
                return onChangeDescription((com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeReporter(com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding Reporter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHardwareVersion(com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding HardwareVersion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTitle(com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding Title, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDescription(com.qualcomm.qti.gaiaclient.databinding.FeedbackFormEntryBinding Description, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.description.setHelper(getRoot().getResources().getString(R.string.feedback_form_helper_required));
            this.description.setMaximumLength(2000);
            this.description.setPlaceholder(getRoot().getResources().getString(R.string.feedback_form_description_placeholder));
            this.description.setTitle(getRoot().getResources().getString(R.string.feedback_form_description));
            this.hardwareVersion.setMaximumLength(50);
            this.hardwareVersion.setPlaceholder(getRoot().getResources().getString(R.string.feedback_form_hardware_version_place_holder));
            this.hardwareVersion.setTitle(getRoot().getResources().getString(R.string.feedback_form_hardware_version));
            this.reporter.setMaximumLength(50);
            this.reporter.setPlaceholder(getRoot().getResources().getString(R.string.feedback_form_reporter_placeholder));
            this.reporter.setTitle(getRoot().getResources().getString(R.string.feedback_form_reporter));
            this.title.setHelper(getRoot().getResources().getString(R.string.feedback_form_helper_required));
            this.title.setMaximumLength(50);
            this.title.setPlaceholder(getRoot().getResources().getString(R.string.feedback_form_title_placeholder));
            this.title.setTitle(getRoot().getResources().getString(R.string.feedback_form_title));
        }
        executeBindingsOn(title);
        executeBindingsOn(description);
        executeBindingsOn(reporter);
        executeBindingsOn(hardwareVersion);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reporter
        flag 1 (0x2L): hardwareVersion
        flag 2 (0x3L): title
        flag 3 (0x4L): description
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}