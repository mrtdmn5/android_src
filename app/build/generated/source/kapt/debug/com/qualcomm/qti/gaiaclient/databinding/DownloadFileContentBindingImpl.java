package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DownloadFileContentBindingImpl extends DownloadFileContentBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DownloadFileContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DownloadFileContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.chipFamily.setTag(null);
        this.date.setTag(null);
        this.description.setTag(null);
        this.hardwareVersions.setTag(null);
        this.id.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tags.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelContent((androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.FileContent>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelContent(androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.FileContent> ViewModelContent, int fieldId) {
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
        java.lang.String viewModelContentDescriptionDescriptionAndroidStringDownloadContentNoDescription = null;
        java.lang.String stringFormatIdAndroidStringDownloadContentIdViewModelContentIdIdAndroidStringDownloadContentNoId = null;
        com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData viewModelContentFile = null;
        java.lang.String stringFormatHardwareVersionsAndroidStringDownloadContentHardwareVersionsViewModelContentHardwareVersions = null;
        java.lang.String[] viewModelContentFileTags = null;
        java.lang.String viewModelContentChipFamilyChipFamilyAndroidStringDownloadContentNoChipFamily = null;
        int viewModelContentFileTagsLength = 0;
        boolean viewModelContentFileHardwareVersionsLengthInt0 = false;
        androidx.recyclerview.widget.LinearLayoutManager viewModelContentLayoutManager = null;
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.FileContent> viewModelContent = null;
        java.lang.String viewModelContentDateDateAndroidStringDownloadContentNoDate = null;
        java.lang.String viewModelContentTitleTitleAndroidStringDownloadContentNoTitle = null;
        boolean viewModelContentFileTagsLengthInt0 = false;
        java.lang.String viewModelContentIdIdAndroidStringDownloadContentNoId = null;
        com.qualcomm.qti.gaiaclient.ui.upgrade.tags.TagsAdapter viewModelContentTagsAdapter = null;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.FileContent viewModelContentGetValue = null;
        int viewModelContentFileHardwareVersionsLength = 0;
        int viewModelContentFileTagsLengthInt0ViewVISIBLEViewGONE = 0;
        java.lang.String[] viewModelContentFileHardwareVersions = null;
        int viewModelContentFileHardwareVersionsLengthInt0ViewVISIBLEViewGONE = 0;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel viewModel = mViewModel;
        java.lang.String viewModelContentHardwareVersions = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.content
                    viewModelContent = viewModel.getContent();
                }
                updateLiveDataRegistration(0, viewModelContent);


                if (viewModelContent != null) {
                    // read viewModel.content.getValue()
                    viewModelContentGetValue = viewModelContent.getValue();
                }


                if (viewModelContentGetValue != null) {
                    // read viewModel.content.getValue().description(@android:string/download_content_no_description)
                    viewModelContentDescriptionDescriptionAndroidStringDownloadContentNoDescription = viewModelContentGetValue.description(description.getResources().getString(R.string.download_content_no_description));
                    // read viewModel.content.getValue().file
                    viewModelContentFile = viewModelContentGetValue.getFile();
                    // read viewModel.content.getValue().chipFamily(@android:string/download_content_no_chip_family)
                    viewModelContentChipFamilyChipFamilyAndroidStringDownloadContentNoChipFamily = viewModelContentGetValue.chipFamily(chipFamily.getResources().getString(R.string.download_content_no_chip_family));
                    // read viewModel.content.getValue().layoutManager
                    viewModelContentLayoutManager = viewModelContentGetValue.getLayoutManager();
                    // read viewModel.content.getValue().date(@android:string/download_content_no_date)
                    viewModelContentDateDateAndroidStringDownloadContentNoDate = viewModelContentGetValue.date(date.getResources().getString(R.string.download_content_no_date));
                    // read viewModel.content.getValue().title(@android:string/download_content_no_title)
                    viewModelContentTitleTitleAndroidStringDownloadContentNoTitle = viewModelContentGetValue.title(title.getResources().getString(R.string.download_content_no_title));
                    // read viewModel.content.getValue().id(@android:string/download_content_no_id)
                    viewModelContentIdIdAndroidStringDownloadContentNoId = viewModelContentGetValue.id(id.getResources().getString(R.string.download_content_no_id));
                    // read viewModel.content.getValue().tagsAdapter
                    viewModelContentTagsAdapter = viewModelContentGetValue.getTagsAdapter();
                    // read viewModel.content.getValue().hardwareVersions
                    viewModelContentHardwareVersions = viewModelContentGetValue.getHardwareVersions();
                }


                if (viewModelContentFile != null) {
                    // read viewModel.content.getValue().file.tags
                    viewModelContentFileTags = viewModelContentFile.getTags();
                    // read viewModel.content.getValue().file.hardwareVersions
                    viewModelContentFileHardwareVersions = viewModelContentFile.getHardwareVersions();
                }
                // read String.format(@android:string/download_content_id, viewModel.content.getValue().id(@android:string/download_content_no_id))
                stringFormatIdAndroidStringDownloadContentIdViewModelContentIdIdAndroidStringDownloadContentNoId = java.lang.String.format(id.getResources().getString(R.string.download_content_id), viewModelContentIdIdAndroidStringDownloadContentNoId);
                // read String.format(@android:string/download_content_hardware_versions, viewModel.content.getValue().hardwareVersions)
                stringFormatHardwareVersionsAndroidStringDownloadContentHardwareVersionsViewModelContentHardwareVersions = java.lang.String.format(hardwareVersions.getResources().getString(R.string.download_content_hardware_versions), viewModelContentHardwareVersions);


                if (viewModelContentFileTags != null) {
                    // read viewModel.content.getValue().file.tags.length
                    viewModelContentFileTagsLength = viewModelContentFileTags.length;
                }
                if (viewModelContentFileHardwareVersions != null) {
                    // read viewModel.content.getValue().file.hardwareVersions.length
                    viewModelContentFileHardwareVersionsLength = viewModelContentFileHardwareVersions.length;
                }


                // read viewModel.content.getValue().file.tags.length > 0
                viewModelContentFileTagsLengthInt0 = (viewModelContentFileTagsLength) > (0);
                // read viewModel.content.getValue().file.hardwareVersions.length > 0
                viewModelContentFileHardwareVersionsLengthInt0 = (viewModelContentFileHardwareVersionsLength) > (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelContentFileTagsLengthInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelContentFileHardwareVersionsLengthInt0) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewModel.content.getValue().file.tags.length > 0 ? View.VISIBLE : View.GONE
                viewModelContentFileTagsLengthInt0ViewVISIBLEViewGONE = ((viewModelContentFileTagsLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.content.getValue().file.hardwareVersions.length > 0 ? View.VISIBLE : View.GONE
                viewModelContentFileHardwareVersionsLengthInt0ViewVISIBLEViewGONE = ((viewModelContentFileHardwareVersionsLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chipFamily, viewModelContentChipFamilyChipFamilyAndroidStringDownloadContentNoChipFamily);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.date, viewModelContentDateDateAndroidStringDownloadContentNoDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewModelContentDescriptionDescriptionAndroidStringDownloadContentNoDescription);
            this.hardwareVersions.setVisibility(viewModelContentFileHardwareVersionsLengthInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hardwareVersions, stringFormatHardwareVersionsAndroidStringDownloadContentHardwareVersionsViewModelContentHardwareVersions);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.id, stringFormatIdAndroidStringDownloadContentIdViewModelContentIdIdAndroidStringDownloadContentNoId);
            this.tags.setAdapter(viewModelContentTagsAdapter);
            this.tags.setVisibility(viewModelContentFileTagsLengthInt0ViewVISIBLEViewGONE);
            this.tags.setLayoutManager(viewModelContentLayoutManager);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, viewModelContentTitleTitleAndroidStringDownloadContentNoTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.content
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.content.getValue().file.tags.length > 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.content.getValue().file.tags.length > 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.content.getValue().file.hardwareVersions.length > 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.content.getValue().file.hardwareVersions.length > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}