package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DownloadFileStatusBarBindingImpl extends DownloadFileStatusBarBinding implements com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DownloadFileStatusBarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DownloadFileStatusBarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.Button) bindings[6]
            , (com.google.android.material.progressindicator.LinearProgressIndicator) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.content.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.primaryAction.setTag(null);
        this.progress.setTag(null);
        this.refs.setTag(null);
        this.secondaryAction.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener(this, 1);
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
                return onChangeViewModelProgress((androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> viewModelProgress = null;
        int viewModelProgressRefsJavaLangObjectNullBooleanTrueViewModelProgressRefsIsEmptyViewGONEViewVISIBLE = 0;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action viewModelProgressActionsSecondary = null;
        boolean viewModelProgressRefsJavaLangObjectNull = false;
        boolean viewModelProgressContentJavaLangObjectNullBooleanTrueViewModelProgressContentIsEmpty = false;
        java.lang.String viewModelProgressContent = null;
        boolean viewModelProgressSuccessBooleanTrueViewModelProgressError = false;
        java.lang.String viewModelProgressTitle = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelProgressProgress = 0;
        boolean viewModelProgressJavaLangObjectNull = false;
        int viewModelProgressActionsSecondaryJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean viewModelProgressProgressJavaLangObjectNull = false;
        java.lang.String viewModelProgressActionsSecondaryLabel = null;
        boolean viewModelProgressContentIsEmpty = false;
        java.lang.String viewModelProgressRefs = null;
        boolean viewModelProgressRefsJavaLangObjectNullBooleanTrueViewModelProgressRefsIsEmpty = false;
        int viewModelProgressActionsPrimaryJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelProgressProgress = null;
        boolean viewModelProgressActionsPrimaryJavaLangObjectNull = false;
        boolean viewModelProgressActionsSecondaryJavaLangObjectNull = false;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action viewModelProgressActionsPrimary = null;
        android.graphics.drawable.Drawable viewModelProgressErrorImageAndroidDrawableIcWarning40dpImageAndroidDrawableIcCheck32dp = null;
        int viewModelProgressProgressJavaLangObjectNullViewGONEViewVISIBLE = 0;
        boolean viewModelProgressContentJavaLangObjectNull = false;
        java.lang.String viewModelProgressErrorImageAndroidStringContDescFeedbackProgressErrorImageAndroidStringContDescFeedbackProgressSuccess = null;
        java.lang.String stringFormatRefsAndroidStringDefaultRefsViewModelProgressRefs = null;
        int viewModelProgressContentJavaLangObjectNullBooleanTrueViewModelProgressContentIsEmptyViewGONEViewVISIBLE = 0;
        boolean viewModelProgressSuccess = false;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus viewModelProgressGetValue = null;
        int viewModelProgressSuccessBooleanTrueViewModelProgressErrorViewVISIBLEViewGONE = 0;
        boolean viewModelProgressRefsIsEmpty = false;
        boolean viewModelProgressError = false;
        int viewModelProgressJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String viewModelProgressActionsPrimaryLabel = null;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.Actions viewModelProgressActions = null;
        com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.progress
                    viewModelProgress = viewModel.getProgress();
                }
                updateLiveDataRegistration(0, viewModelProgress);


                if (viewModelProgress != null) {
                    // read viewModel.progress.getValue()
                    viewModelProgressGetValue = viewModelProgress.getValue();
                }


                if (viewModelProgressGetValue != null) {
                    // read viewModel.progress.getValue().content
                    viewModelProgressContent = viewModelProgressGetValue.getContent();
                    // read viewModel.progress.getValue().title
                    viewModelProgressTitle = viewModelProgressGetValue.getTitle();
                    // read viewModel.progress.getValue().refs
                    viewModelProgressRefs = viewModelProgressGetValue.getRefs();
                    // read viewModel.progress.getValue().progress
                    viewModelProgressProgress = viewModelProgressGetValue.getProgress();
                    // read viewModel.progress.getValue().success
                    viewModelProgressSuccess = viewModelProgressGetValue.getSuccess();
                    // read viewModel.progress.getValue().error
                    viewModelProgressError = viewModelProgressGetValue.getError();
                    // read viewModel.progress.getValue().actions
                    viewModelProgressActions = viewModelProgressGetValue.getActions();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressSuccess) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressError) {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x80000L;
                }
            }
                // read viewModel.progress.getValue() == null
                viewModelProgressJavaLangObjectNull = (viewModelProgressGetValue) == (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressJavaLangObjectNull) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read viewModel.progress.getValue().content == null
                viewModelProgressContentJavaLangObjectNull = (viewModelProgressContent) == (null);
                // read viewModel.progress.getValue().refs == null
                viewModelProgressRefsJavaLangObjectNull = (viewModelProgressRefs) == (null);
                // read String.format(@android:string/default_refs, viewModel.progress.getValue().refs)
                stringFormatRefsAndroidStringDefaultRefsViewModelProgressRefs = java.lang.String.format(refs.getResources().getString(R.string.default_refs), viewModelProgressRefs);
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.progress.getValue().progress)
                androidxDatabindingViewDataBindingSafeUnboxViewModelProgressProgress = androidx.databinding.ViewDataBinding.safeUnbox(viewModelProgressProgress);
                // read viewModel.progress.getValue().progress == null
                viewModelProgressProgressJavaLangObjectNull = (viewModelProgressProgress) == (null);
                // read viewModel.progress.getValue().error ? @android:drawable/ic_warning_40dp : @android:drawable/ic_check_32dp
                viewModelProgressErrorImageAndroidDrawableIcWarning40dpImageAndroidDrawableIcCheck32dp = ((viewModelProgressError) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(image.getContext(), R.drawable.ic_warning_40dp)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(image.getContext(), R.drawable.ic_check_32dp)));
                // read viewModel.progress.getValue().error ? @android:string/cont_desc_feedback_progress_error : @android:string/cont_desc_feedback_progress_success
                viewModelProgressErrorImageAndroidStringContDescFeedbackProgressErrorImageAndroidStringContDescFeedbackProgressSuccess = ((viewModelProgressError) ? (image.getResources().getString(R.string.cont_desc_feedback_progress_error)) : (image.getResources().getString(R.string.cont_desc_feedback_progress_success)));
                // read viewModel.progress.getValue() == null ? View.GONE : View.VISIBLE
                viewModelProgressJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelProgressJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressContentJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressRefsJavaLangObjectNull) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressProgressJavaLangObjectNull) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }
                if (viewModelProgressActions != null) {
                    // read viewModel.progress.getValue().actions.secondary
                    viewModelProgressActionsSecondary = viewModelProgressActions.getSecondary();
                    // read viewModel.progress.getValue().actions.primary
                    viewModelProgressActionsPrimary = viewModelProgressActions.getPrimary();
                }


                // read viewModel.progress.getValue().progress == null ? View.GONE : View.VISIBLE
                viewModelProgressProgressJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelProgressProgressJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read viewModel.progress.getValue().actions.secondary != null
                viewModelProgressActionsSecondaryJavaLangObjectNull = (viewModelProgressActionsSecondary) != (null);
                // read viewModel.progress.getValue().actions.primary != null
                viewModelProgressActionsPrimaryJavaLangObjectNull = (viewModelProgressActionsPrimary) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressActionsSecondaryJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressActionsPrimaryJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
                if (viewModelProgressActionsSecondary != null) {
                    // read viewModel.progress.getValue().actions.secondary.label
                    viewModelProgressActionsSecondaryLabel = viewModelProgressActionsSecondary.getLabel();
                }
                if (viewModelProgressActionsPrimary != null) {
                    // read viewModel.progress.getValue().actions.primary.label
                    viewModelProgressActionsPrimaryLabel = viewModelProgressActionsPrimary.getLabel();
                }


                // read viewModel.progress.getValue().actions.secondary != null ? View.VISIBLE : View.GONE
                viewModelProgressActionsSecondaryJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelProgressActionsSecondaryJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.progress.getValue().actions.primary != null ? View.VISIBLE : View.GONE
                viewModelProgressActionsPrimaryJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelProgressActionsPrimaryJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.progress.getValue().success ? true : viewModel.progress.getValue().error
                viewModelProgressSuccessBooleanTrueViewModelProgressError = ((viewModelProgressSuccess) ? (true) : (viewModelProgressError));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressSuccessBooleanTrueViewModelProgressError) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read viewModel.progress.getValue().success ? true : viewModel.progress.getValue().error ? View.VISIBLE : View.GONE
                viewModelProgressSuccessBooleanTrueViewModelProgressErrorViewVISIBLEViewGONE = ((viewModelProgressSuccessBooleanTrueViewModelProgressError) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x20L) != 0) {

                if (viewModelProgressContent != null) {
                    // read viewModel.progress.getValue().content.isEmpty()
                    viewModelProgressContentIsEmpty = viewModelProgressContent.isEmpty();
                }
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (viewModelProgressRefs != null) {
                    // read viewModel.progress.getValue().refs.isEmpty()
                    viewModelProgressRefsIsEmpty = viewModelProgressRefs.isEmpty();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.progress.getValue().content == null ? true : viewModel.progress.getValue().content.isEmpty()
                viewModelProgressContentJavaLangObjectNullBooleanTrueViewModelProgressContentIsEmpty = ((viewModelProgressContentJavaLangObjectNull) ? (true) : (viewModelProgressContentIsEmpty));
                // read viewModel.progress.getValue().refs == null ? true : viewModel.progress.getValue().refs.isEmpty()
                viewModelProgressRefsJavaLangObjectNullBooleanTrueViewModelProgressRefsIsEmpty = ((viewModelProgressRefsJavaLangObjectNull) ? (true) : (viewModelProgressRefsIsEmpty));
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressContentJavaLangObjectNullBooleanTrueViewModelProgressContentIsEmpty) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelProgressRefsJavaLangObjectNullBooleanTrueViewModelProgressRefsIsEmpty) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.progress.getValue().content == null ? true : viewModel.progress.getValue().content.isEmpty() ? View.GONE : View.VISIBLE
                viewModelProgressContentJavaLangObjectNullBooleanTrueViewModelProgressContentIsEmptyViewGONEViewVISIBLE = ((viewModelProgressContentJavaLangObjectNullBooleanTrueViewModelProgressContentIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read viewModel.progress.getValue().refs == null ? true : viewModel.progress.getValue().refs.isEmpty() ? View.GONE : View.VISIBLE
                viewModelProgressRefsJavaLangObjectNullBooleanTrueViewModelProgressRefsIsEmptyViewGONEViewVISIBLE = ((viewModelProgressRefsJavaLangObjectNullBooleanTrueViewModelProgressRefsIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.content, viewModelProgressContent);
            this.content.setVisibility(viewModelProgressContentJavaLangObjectNullBooleanTrueViewModelProgressContentIsEmptyViewGONEViewVISIBLE);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.image, viewModelProgressErrorImageAndroidDrawableIcWarning40dpImageAndroidDrawableIcCheck32dp);
            this.image.setVisibility(viewModelProgressSuccessBooleanTrueViewModelProgressErrorViewVISIBLEViewGONE);
            this.mboundView0.setVisibility(viewModelProgressJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.primaryAction, viewModelProgressActionsPrimaryLabel);
            this.primaryAction.setVisibility(viewModelProgressActionsPrimaryJavaLangObjectNullViewVISIBLEViewGONE);
            this.progress.setProgress(androidxDatabindingViewDataBindingSafeUnboxViewModelProgressProgress);
            this.progress.setVisibility(viewModelProgressProgressJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.refs, stringFormatRefsAndroidStringDefaultRefsViewModelProgressRefs);
            this.refs.setVisibility(viewModelProgressRefsJavaLangObjectNullBooleanTrueViewModelProgressRefsIsEmptyViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondaryAction, viewModelProgressActionsSecondaryLabel);
            this.secondaryAction.setVisibility(viewModelProgressActionsSecondaryJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, viewModelProgressTitle);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.image.setContentDescription(viewModelProgressErrorImageAndroidStringContDescFeedbackProgressErrorImageAndroidStringContDescFeedbackProgressSuccess);
            }
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.primaryAction.setOnClickListener(mCallback2);
            this.secondaryAction.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel.progress
                androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> viewModelProgress = null;
                // viewModel.progress.getValue().actions != null
                boolean viewModelProgressActionsJavaLangObjectNull = false;
                // viewModel.progress.getValue() != null
                boolean viewModelProgressGetValueJavaLangObjectNull = false;
                // viewModel.progress.getValue().actions
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.Actions viewModelProgressActions = null;
                // viewModel
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel viewModel = mViewModel;
                // viewModel.progress.getValue().actions.primary
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action viewModelProgressActionsPrimary = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.progress != null
                boolean viewModelProgressJavaLangObjectNull = false;
                // viewModel.progress.getValue()
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus viewModelProgressGetValue = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelProgress = viewModel.getProgress();

                    viewModelProgressJavaLangObjectNull = (viewModelProgress) != (null);
                    if (viewModelProgressJavaLangObjectNull) {


                        viewModelProgressGetValue = viewModelProgress.getValue();

                        viewModelProgressGetValueJavaLangObjectNull = (viewModelProgressGetValue) != (null);
                        if (viewModelProgressGetValueJavaLangObjectNull) {


                            viewModelProgressActions = viewModelProgressGetValue.getActions();

                            viewModelProgressActionsJavaLangObjectNull = (viewModelProgressActions) != (null);
                            if (viewModelProgressActionsJavaLangObjectNull) {


                                viewModelProgressActionsPrimary = viewModelProgressActions.getPrimary();

                                viewModel.onClick(viewModelProgressActionsPrimary);
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.progress
                androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> viewModelProgress = null;
                // viewModel.progress.getValue().actions.secondary
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action viewModelProgressActionsSecondary = null;
                // viewModel.progress.getValue().actions != null
                boolean viewModelProgressActionsJavaLangObjectNull = false;
                // viewModel.progress.getValue() != null
                boolean viewModelProgressGetValueJavaLangObjectNull = false;
                // viewModel.progress.getValue().actions
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.Actions viewModelProgressActions = null;
                // viewModel
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.progress != null
                boolean viewModelProgressJavaLangObjectNull = false;
                // viewModel.progress.getValue()
                com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus viewModelProgressGetValue = null;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelProgress = viewModel.getProgress();

                    viewModelProgressJavaLangObjectNull = (viewModelProgress) != (null);
                    if (viewModelProgressJavaLangObjectNull) {


                        viewModelProgressGetValue = viewModelProgress.getValue();

                        viewModelProgressGetValueJavaLangObjectNull = (viewModelProgressGetValue) != (null);
                        if (viewModelProgressGetValueJavaLangObjectNull) {


                            viewModelProgressActions = viewModelProgressGetValue.getActions();

                            viewModelProgressActionsJavaLangObjectNull = (viewModelProgressActions) != (null);
                            if (viewModelProgressActionsJavaLangObjectNull) {


                                viewModelProgressActionsSecondary = viewModelProgressActions.getSecondary();

                                viewModel.onClick(viewModelProgressActionsSecondary);
                            }
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.progress
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.progress.getValue().refs == null ? true : viewModel.progress.getValue().refs.isEmpty() ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.progress.getValue().refs == null ? true : viewModel.progress.getValue().refs.isEmpty() ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewModel.progress.getValue().content == null ? true : viewModel.progress.getValue().content.isEmpty()
        flag 6 (0x7L): viewModel.progress.getValue().content == null ? true : viewModel.progress.getValue().content.isEmpty()
        flag 7 (0x8L): viewModel.progress.getValue().success ? true : viewModel.progress.getValue().error
        flag 8 (0x9L): viewModel.progress.getValue().success ? true : viewModel.progress.getValue().error
        flag 9 (0xaL): viewModel.progress.getValue().actions.secondary != null ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.progress.getValue().actions.secondary != null ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.progress.getValue().refs == null ? true : viewModel.progress.getValue().refs.isEmpty()
        flag 12 (0xdL): viewModel.progress.getValue().refs == null ? true : viewModel.progress.getValue().refs.isEmpty()
        flag 13 (0xeL): viewModel.progress.getValue().actions.primary != null ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.progress.getValue().actions.primary != null ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.progress.getValue().error ? @android:drawable/ic_warning_40dp : @android:drawable/ic_check_32dp
        flag 16 (0x11L): viewModel.progress.getValue().error ? @android:drawable/ic_warning_40dp : @android:drawable/ic_check_32dp
        flag 17 (0x12L): viewModel.progress.getValue().progress == null ? View.GONE : View.VISIBLE
        flag 18 (0x13L): viewModel.progress.getValue().progress == null ? View.GONE : View.VISIBLE
        flag 19 (0x14L): viewModel.progress.getValue().error ? @android:string/cont_desc_feedback_progress_error : @android:string/cont_desc_feedback_progress_success
        flag 20 (0x15L): viewModel.progress.getValue().error ? @android:string/cont_desc_feedback_progress_error : @android:string/cont_desc_feedback_progress_success
        flag 21 (0x16L): viewModel.progress.getValue().content == null ? true : viewModel.progress.getValue().content.isEmpty() ? View.GONE : View.VISIBLE
        flag 22 (0x17L): viewModel.progress.getValue().content == null ? true : viewModel.progress.getValue().content.isEmpty() ? View.GONE : View.VISIBLE
        flag 23 (0x18L): viewModel.progress.getValue().success ? true : viewModel.progress.getValue().error ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.progress.getValue().success ? true : viewModel.progress.getValue().error ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.progress.getValue() == null ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): viewModel.progress.getValue() == null ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}