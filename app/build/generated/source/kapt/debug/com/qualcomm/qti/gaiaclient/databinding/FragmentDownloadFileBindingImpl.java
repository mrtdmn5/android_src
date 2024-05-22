package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDownloadFileBindingImpl extends FragmentDownloadFileBinding implements com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(1, 
            new String[] {"download_file_status_bar", "download_file_content"},
            new int[] {3, 4},
            new int[] {com.qualcomm.qti.gaiaclient.R.layout.download_file_status_bar,
                com.qualcomm.qti.gaiaclient.R.layout.download_file_content});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDownloadFileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentDownloadFileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.qualcomm.qti.gaiaclient.databinding.DownloadFileContentBinding) bindings[4]
            , (android.widget.Button) bindings[2]
            , (com.qualcomm.qti.gaiaclient.databinding.DownloadFileStatusBarBinding) bindings[3]
            );
        setContainedBinding(this.contentView);
        this.download.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.statusBar);
        setRootTag(root);
        // listeners
        mCallback3 = new com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
                return onChangeViewModelProgress((androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus>) object, fieldId);
            case 1 :
                return onChangeStatusBar((com.qualcomm.qti.gaiaclient.databinding.DownloadFileStatusBarBinding) object, fieldId);
            case 2 :
                return onChangeContentView((com.qualcomm.qti.gaiaclient.databinding.DownloadFileContentBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelProgress(androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> ViewModelProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStatusBar(com.qualcomm.qti.gaiaclient.databinding.DownloadFileStatusBarBinding StatusBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeContentView(com.qualcomm.qti.gaiaclient.databinding.DownloadFileContentBinding ContentView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> viewModelProgress = null;
        int viewModelProgressJavaLangObjectNullViewVISIBLEViewGONE = 0;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel viewModel = mViewModel;
        boolean viewModelProgressJavaLangObjectNull = false;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus viewModelProgressGetValue = null;

        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.progress
                    viewModelProgress = viewModel.getProgress();
                }
                updateLiveDataRegistration(0, viewModelProgress);


                if (viewModelProgress != null) {
                    // read viewModel.progress.getValue()
                    viewModelProgressGetValue = viewModelProgress.getValue();
                }


                // read viewModel.progress.getValue() == null
                viewModelProgressJavaLangObjectNull = (viewModelProgressGetValue) == (null);
            if((dirtyFlags & 0x19L) != 0) {
                if(viewModelProgressJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewModel.progress.getValue() == null ? View.VISIBLE : View.GONE
                viewModelProgressJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelProgressJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.contentView.setViewModel(viewModel);
            this.statusBar.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.download.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.download.setVisibility(viewModelProgressJavaLangObjectNullViewVISIBLEViewGONE);
        }
        executeBindingsOn(statusBar);
        executeBindingsOn(contentView);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.downloadFile();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.progress
        flag 1 (0x2L): statusBar
        flag 2 (0x3L): contentView
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.progress.getValue() == null ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.progress.getValue() == null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}