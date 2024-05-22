package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFeedbackBindingImpl extends FragmentFeedbackBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(1, 
            new String[] {"feedback_status_bar", "feedback_content"},
            new int[] {2, 3},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.feedback_status_bar,
                com.qualcomm.qti.gaiaclient.R.layout.feedback_content});
        sViewsWithIds = null;
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

    public FragmentFeedbackBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentFeedbackBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackContentBinding) bindings[3]
            , (com.qualcomm.qti.gaiaclient.databinding.FeedbackStatusBarBinding) bindings[2]
            );
        setContainedBinding(this.contentView);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.statusBar);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        statusBar.invalidateAll();
        contentView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (statusBar.hasPendingBindings()) {
            return true;
        }
        if (contentView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        statusBar.setLifecycleOwner(lifecycleOwner);
        contentView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelProgress((androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus>) object, fieldId);
            case 1 :
                return onChangeViewModelContent((androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent>) object, fieldId);
            case 2 :
                return onChangeStatusBar((com.qualcomm.qti.gaiaclient.databinding.FeedbackStatusBarBinding) object, fieldId);
            case 3 :
                return onChangeContentView((com.qualcomm.qti.gaiaclient.databinding.FeedbackContentBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelProgress(androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus> ViewModelProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContent(androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent> ViewModelContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStatusBar(com.qualcomm.qti.gaiaclient.databinding.FeedbackStatusBarBinding StatusBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContentView(com.qualcomm.qti.gaiaclient.databinding.FeedbackContentBinding ContentView, int fieldId) {
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
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus> viewModelProgress = null;
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent> viewModelContent = null;
        com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent viewModelContentGetValue = null;
        int viewModelProgressJavaLangObjectNullViewVISIBLEViewGONE = 0;
        com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel viewModel = mViewModel;
        boolean viewModelProgressJavaLangObjectNull = false;
        com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus viewModelProgressGetValue = null;

        if ((dirtyFlags & 0x33L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.progress
                        viewModelProgress = viewModel.getProgress();
                    }
                    updateLiveDataRegistration(0, viewModelProgress);


                    if (viewModelProgress != null) {
                        // read viewModel.progress.getValue()
                        viewModelProgressGetValue = viewModelProgress.getValue();
                    }


                    // read viewModel.progress.getValue() != null
                    viewModelProgressJavaLangObjectNull = (viewModelProgressGetValue) != (null);
                if((dirtyFlags & 0x31L) != 0) {
                    if(viewModelProgressJavaLangObjectNull) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.progress.getValue() != null ? View.VISIBLE : View.GONE
                    viewModelProgressJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelProgressJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.content
                        viewModelContent = viewModel.getContent();
                    }
                    updateLiveDataRegistration(1, viewModelContent);


                    if (viewModelContent != null) {
                        // read viewModel.content.getValue()
                        viewModelContentGetValue = viewModelContent.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.contentView.setContent(viewModelContentGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.statusBar.getRoot().setVisibility(viewModelProgressJavaLangObjectNullViewVISIBLEViewGONE);
            this.statusBar.setData(viewModelProgressGetValue);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.statusBar.setViewModel(viewModel);
        }
        executeBindingsOn(statusBar);
        executeBindingsOn(contentView);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.progress
        flag 1 (0x2L): viewModel.content
        flag 2 (0x3L): statusBar
        flag 3 (0x4L): contentView
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.progress.getValue() != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.progress.getValue() != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}