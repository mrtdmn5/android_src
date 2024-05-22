package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FileItemBindingImpl extends FileItemBinding  {

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

    public FileItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FileItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.fileCreatedOn.setTag(null);
        this.fileDescription.setTag(null);
        this.fileTags.setTag(null);
        this.fileTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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
        if (BR.file == variableId) {
            setFile((com.qualcomm.qti.gaiaclient.ui.upgrade.files.FileViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFile(@Nullable com.qualcomm.qti.gaiaclient.ui.upgrade.files.FileViewData File) {
        this.mFile = File;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.file);
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
        com.qualcomm.qti.gaiaclient.ui.upgrade.files.FileViewData file = mFile;
        java.lang.String FileCreatedOn1 = null;
        boolean fileCreatedOnIsEmpty = false;
        java.lang.String[] FileTags1 = null;
        java.lang.String fileTitleFileTitleAndroidStringDownloadContentNoTitle = null;
        boolean fileTagsLengthInt0 = false;
        com.qualcomm.qti.gaiaclient.ui.upgrade.tags.TagsAdapter fileTagsAdapter = null;
        int fileTagsLengthInt0ViewVISIBLEViewGONE = 0;
        java.lang.String fileDescriptionFileDescriptionAndroidStringDownloadContentNoDescription = null;
        int fileTagsLength = 0;
        int fileCreatedOnIsEmptyViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (file != null) {
                    // read file.createdOn
                    FileCreatedOn1 = file.getCreatedOn();
                    // read file.tags
                    FileTags1 = file.getTags();
                    // read file.title(@android:string/download_content_no_title)
                    fileTitleFileTitleAndroidStringDownloadContentNoTitle = file.title(fileTitle.getResources().getString(R.string.download_content_no_title));
                    // read file.tagsAdapter
                    fileTagsAdapter = file.getTagsAdapter();
                    // read file.description(@android:string/download_content_no_description)
                    fileDescriptionFileDescriptionAndroidStringDownloadContentNoDescription = file.description(fileDescription.getResources().getString(R.string.download_content_no_description));
                }


                if (FileCreatedOn1 != null) {
                    // read file.createdOn.isEmpty()
                    fileCreatedOnIsEmpty = FileCreatedOn1.isEmpty();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(fileCreatedOnIsEmpty) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
                if (FileTags1 != null) {
                    // read file.tags.length
                    fileTagsLength = FileTags1.length;
                }


                // read file.createdOn.isEmpty() ? View.GONE : View.VISIBLE
                fileCreatedOnIsEmptyViewGONEViewVISIBLE = ((fileCreatedOnIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read file.tags.length > 0
                fileTagsLengthInt0 = (fileTagsLength) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(fileTagsLengthInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read file.tags.length > 0 ? View.VISIBLE : View.GONE
                fileTagsLengthInt0ViewVISIBLEViewGONE = ((fileTagsLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.fileCreatedOn.setVisibility(fileCreatedOnIsEmptyViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fileCreatedOn, FileCreatedOn1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fileDescription, fileDescriptionFileDescriptionAndroidStringDownloadContentNoDescription);
            this.fileTags.setAdapter(fileTagsAdapter);
            this.fileTags.setVisibility(fileTagsLengthInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fileTitle, fileTitleFileTitleAndroidStringDownloadContentNoTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): file
        flag 1 (0x2L): null
        flag 2 (0x3L): file.tags.length > 0 ? View.VISIBLE : View.GONE
        flag 3 (0x4L): file.tags.length > 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): file.createdOn.isEmpty() ? View.GONE : View.VISIBLE
        flag 5 (0x6L): file.createdOn.isEmpty() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}