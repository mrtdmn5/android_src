package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FeedbackContentBindingImpl extends FeedbackContentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"feedback_item", "feedback_item", "feedback_item", "feedback_item", "feedback_item", "feedback_item"},
            new int[] {1, 2, 3, 4, 5, 6},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.feedback_item,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_item,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_item,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_item,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_item,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_item});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FeedbackContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FeedbackContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) bindings[5]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) bindings[2]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) bindings[6]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) bindings[4]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) bindings[3]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) bindings[1]
            );
        setContainedBinding(this.client);
        setContainedBinding(this.description);
        setContainedBinding(this.device);
        setContainedBinding(this.hardwareVersion);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.reporter);
        setContainedBinding(this.title);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        title.invalidateAll();
        description.invalidateAll();
        reporter.invalidateAll();
        hardwareVersion.invalidateAll();
        client.invalidateAll();
        device.invalidateAll();
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
        if (client.hasPendingBindings()) {
            return true;
        }
        if (device.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.content == variableId) {
            setContent((com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContent(@Nullable com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent Content) {
        this.mContent = Content;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.content);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        title.setLifecycleOwner(lifecycleOwner);
        description.setLifecycleOwner(lifecycleOwner);
        reporter.setLifecycleOwner(lifecycleOwner);
        hardwareVersion.setLifecycleOwner(lifecycleOwner);
        client.setLifecycleOwner(lifecycleOwner);
        device.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDevice((com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) object, fieldId);
            case 1 :
                return onChangeHardwareVersion((com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) object, fieldId);
            case 2 :
                return onChangeDescription((com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) object, fieldId);
            case 3 :
                return onChangeReporter((com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) object, fieldId);
            case 4 :
                return onChangeClient((com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) object, fieldId);
            case 5 :
                return onChangeTitle((com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDevice(com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding Device, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHardwareVersion(com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding HardwareVersion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDescription(com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding Description, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeReporter(com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding Reporter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeClient(com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding Client, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTitle(com.qualcomm.qti.gaiaclient.databinding.FeedbackItemBinding Title, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent content = mContent;
        java.lang.String contentDeviceApplicationBuildIdJavaLangString = null;
        java.lang.String androidStringFeedbackDeviceContentContentDeviceApplicationVersionJavaLangStringContentDeviceApplicationBuildIdJavaLangString = null;
        java.lang.String contentClientSystemVersionJavaLangString = null;
        java.lang.String contentDescriptionAndroidStringFeedbackNoValue = null;
        java.lang.String contentTitleAndroidStringFeedbackNoValue = null;
        java.lang.String contentClientAppVersionJavaLangString = null;
        java.lang.String contentClientDeviceJavaLangString = null;
        java.lang.String contentDeviceHardwareVersionAndroidStringFeedbackNoValue = null;
        java.lang.String androidStringFeedbackClientContentContentClientAppVersionJavaLangStringContentClientSystemVersionJavaLangStringContentClientDeviceJavaLangString = null;
        java.lang.String contentDeviceApplicationVersionJavaLangString = null;
        java.lang.String contentReporterAndroidStringFeedbackNoValue = null;

        if ((dirtyFlags & 0xc0L) != 0) {



                if (content != null) {
                    // read content.deviceApplicationBuildId("-")
                    contentDeviceApplicationBuildIdJavaLangString = content.deviceApplicationBuildId("-");
                    // read content.clientSystemVersion("-")
                    contentClientSystemVersionJavaLangString = content.clientSystemVersion("-");
                    // read content.description(@android:string/feedback_no_value)
                    contentDescriptionAndroidStringFeedbackNoValue = content.description(getRoot().getResources().getString(R.string.feedback_no_value));
                    // read content.title(@android:string/feedback_no_value)
                    contentTitleAndroidStringFeedbackNoValue = content.title(getRoot().getResources().getString(R.string.feedback_no_value));
                    // read content.clientAppVersion("-")
                    contentClientAppVersionJavaLangString = content.clientAppVersion("-");
                    // read content.clientDevice("-")
                    contentClientDeviceJavaLangString = content.clientDevice("-");
                    // read content.deviceHardwareVersion(@android:string/feedback_no_value)
                    contentDeviceHardwareVersionAndroidStringFeedbackNoValue = content.deviceHardwareVersion(getRoot().getResources().getString(R.string.feedback_no_value));
                    // read content.deviceApplicationVersion("-")
                    contentDeviceApplicationVersionJavaLangString = content.deviceApplicationVersion("-");
                    // read content.reporter(@android:string/feedback_no_value)
                    contentReporterAndroidStringFeedbackNoValue = content.reporter(getRoot().getResources().getString(R.string.feedback_no_value));
                }


                // read @android:string/feedback_client_content
                androidStringFeedbackClientContentContentClientAppVersionJavaLangStringContentClientSystemVersionJavaLangStringContentClientDeviceJavaLangString = getRoot().getResources().getString(R.string.feedback_client_content, contentClientAppVersionJavaLangString, contentClientSystemVersionJavaLangString, contentClientDeviceJavaLangString);
                // read @android:string/feedback_device_content
                androidStringFeedbackDeviceContentContentDeviceApplicationVersionJavaLangStringContentDeviceApplicationBuildIdJavaLangString = getRoot().getResources().getString(R.string.feedback_device_content, contentDeviceApplicationVersionJavaLangString, contentDeviceApplicationBuildIdJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.client.setContent(androidStringFeedbackClientContentContentClientAppVersionJavaLangStringContentClientSystemVersionJavaLangStringContentClientDeviceJavaLangString);
            this.description.setContent(contentDescriptionAndroidStringFeedbackNoValue);
            this.device.setContent(androidStringFeedbackDeviceContentContentDeviceApplicationVersionJavaLangStringContentDeviceApplicationBuildIdJavaLangString);
            this.hardwareVersion.setContent(contentDeviceHardwareVersionAndroidStringFeedbackNoValue);
            this.reporter.setContent(contentReporterAndroidStringFeedbackNoValue);
            this.title.setContent(contentTitleAndroidStringFeedbackNoValue);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.client.setTitle(getRoot().getResources().getString(R.string.feedback_client));
            this.description.setTitle(getRoot().getResources().getString(R.string.feedback_description));
            this.device.setTitle(getRoot().getResources().getString(R.string.feedback_device));
            this.hardwareVersion.setTitle(getRoot().getResources().getString(R.string.feedback_hardware_version));
            this.reporter.setTitle(getRoot().getResources().getString(R.string.feedback_reporter));
            this.title.setTitle(getRoot().getResources().getString(R.string.feedback_title));
        }
        executeBindingsOn(title);
        executeBindingsOn(description);
        executeBindingsOn(reporter);
        executeBindingsOn(hardwareVersion);
        executeBindingsOn(client);
        executeBindingsOn(device);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): device
        flag 1 (0x2L): hardwareVersion
        flag 2 (0x3L): description
        flag 3 (0x4L): reporter
        flag 4 (0x5L): client
        flag 5 (0x6L): title
        flag 6 (0x7L): content
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}