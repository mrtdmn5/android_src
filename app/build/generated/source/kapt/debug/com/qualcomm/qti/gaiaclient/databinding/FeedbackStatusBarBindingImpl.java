package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FeedbackStatusBarBindingImpl extends FeedbackStatusBarBinding implements com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FeedbackStatusBarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FeedbackStatusBarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.Button) bindings[6]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[2]
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
        mCallback5 = new com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.qualcomm.qti.gaiaclient.generated.callback.OnClickListener(this, 1);
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
        if (BR.data == variableId) {
            setData((com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel ViewModel) {
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
        com.qualcomm.qti.gaiaclient.ui.feedback.Action dataActionsPrimary = null;
        boolean dataActionsSecondaryJavaLangObjectNull = false;
        java.lang.String dataContent = null;
        com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus data = mData;
        android.graphics.drawable.Drawable dataErrorImageAndroidDrawableIcWarning40dpImageAndroidDrawableIcCheck = null;
        java.lang.String dataErrorImageAndroidStringContDescFeedbackProgressErrorImageAndroidStringContDescFeedbackProgressSuccess = null;
        int dataProgressViewVISIBLEViewINVISIBLE = 0;
        com.qualcomm.qti.gaiaclient.ui.feedback.Action dataActionsSecondary = null;
        boolean dataRefsJavaLangObjectNullBooleanTrueDataRefsIsEmpty = false;
        boolean dataError = false;
        java.lang.String dataTitle = null;
        int dataActionsSecondaryJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean dataRefsIsEmpty = false;
        java.lang.String stringFormatRefsAndroidStringDefaultRefsDataRefs = null;
        java.lang.String dataActionsSecondaryLabel = null;
        boolean dataRefsJavaLangObjectNull = false;
        java.lang.String dataActionsPrimaryLabel = null;
        java.lang.String dataTitleJavaLangObjectNullTitleAndroidStringFeedbackSendingDataTitle = null;
        com.qualcomm.qti.gaiaclient.ui.feedback.Actions dataActions = null;
        int dataRefsJavaLangObjectNullBooleanTrueDataRefsIsEmptyViewGONEViewVISIBLE = 0;
        boolean dataActionsPrimaryJavaLangObjectNull = false;
        int dataSuccessBooleanTrueDataErrorViewVISIBLEViewGONE = 0;
        boolean dataTitleJavaLangObjectNull = false;
        boolean dataSuccess = false;
        int dataActionsPrimaryJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String dataRefs = null;
        boolean dataSuccessBooleanTrueDataError = false;
        boolean dataProgress = false;
        com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x5L) != 0) {



                if (data != null) {
                    // read data.content
                    dataContent = data.getContent();
                    // read data.error
                    dataError = data.getError();
                    // read data.title
                    dataTitle = data.getTitle();
                    // read data.actions
                    dataActions = data.getActions();
                    // read data.success
                    dataSuccess = data.getSuccess();
                    // read data.refs
                    dataRefs = data.getRefs();
                    // read data.progress
                    dataProgress = data.getProgress();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(dataError) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(dataSuccess) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(dataProgress) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read data.error ? @android:drawable/ic_warning_40dp : @android:drawable/ic_check
                dataErrorImageAndroidDrawableIcWarning40dpImageAndroidDrawableIcCheck = ((dataError) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(image.getContext(), R.drawable.ic_warning_40dp)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(image.getContext(), R.drawable.ic_check)));
                // read data.error ? @android:string/cont_desc_feedback_progress_error : @android:string/cont_desc_feedback_progress_success
                dataErrorImageAndroidStringContDescFeedbackProgressErrorImageAndroidStringContDescFeedbackProgressSuccess = ((dataError) ? (image.getResources().getString(R.string.cont_desc_feedback_progress_error)) : (image.getResources().getString(R.string.cont_desc_feedback_progress_success)));
                // read data.title == null
                dataTitleJavaLangObjectNull = (dataTitle) == (null);
                // read String.format(@android:string/default_refs, data.refs)
                stringFormatRefsAndroidStringDefaultRefsDataRefs = java.lang.String.format(refs.getResources().getString(R.string.default_refs), dataRefs);
                // read data.refs == null
                dataRefsJavaLangObjectNull = (dataRefs) == (null);
                // read data.progress ? View.VISIBLE : View.INVISIBLE
                dataProgressViewVISIBLEViewINVISIBLE = ((dataProgress) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            if((dirtyFlags & 0x5L) != 0) {
                if(dataTitleJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(dataRefsJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
                if (dataActions != null) {
                    // read data.actions.primary
                    dataActionsPrimary = dataActions.getPrimary();
                    // read data.actions.secondary
                    dataActionsSecondary = dataActions.getSecondary();
                }


                if (dataActionsPrimary != null) {
                    // read data.actions.primary.label
                    dataActionsPrimaryLabel = dataActionsPrimary.getLabel();
                }
                // read data.actions.primary != null
                dataActionsPrimaryJavaLangObjectNull = (dataActionsPrimary) != (null);
                // read data.actions.secondary != null
                dataActionsSecondaryJavaLangObjectNull = (dataActionsSecondary) != (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(dataActionsPrimaryJavaLangObjectNull) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(dataActionsSecondaryJavaLangObjectNull) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
                if (dataActionsSecondary != null) {
                    // read data.actions.secondary.label
                    dataActionsSecondaryLabel = dataActionsSecondary.getLabel();
                }


                // read data.actions.primary != null ? View.VISIBLE : View.GONE
                dataActionsPrimaryJavaLangObjectNullViewVISIBLEViewGONE = ((dataActionsPrimaryJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read data.actions.secondary != null ? View.VISIBLE : View.GONE
                dataActionsSecondaryJavaLangObjectNullViewVISIBLEViewGONE = ((dataActionsSecondaryJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

                if (dataRefs != null) {
                    // read data.refs.isEmpty()
                    dataRefsIsEmpty = dataRefs.isEmpty();
                }
        }
        if ((dirtyFlags & 0x5L) != 0) {

                // read data.title == null ? @android:string/feedback_sending : data.title
                dataTitleJavaLangObjectNullTitleAndroidStringFeedbackSendingDataTitle = ((dataTitleJavaLangObjectNull) ? (title.getResources().getString(R.string.feedback_sending)) : (dataTitle));
                // read data.success ? true : data.error
                dataSuccessBooleanTrueDataError = ((dataSuccess) ? (true) : (dataError));
            if((dirtyFlags & 0x5L) != 0) {
                if(dataSuccessBooleanTrueDataError) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read data.success ? true : data.error ? View.VISIBLE : View.GONE
                dataSuccessBooleanTrueDataErrorViewVISIBLEViewGONE = ((dataSuccessBooleanTrueDataError) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x5L) != 0) {

                // read data.refs == null ? true : data.refs.isEmpty()
                dataRefsJavaLangObjectNullBooleanTrueDataRefsIsEmpty = ((dataRefsJavaLangObjectNull) ? (true) : (dataRefsIsEmpty));
            if((dirtyFlags & 0x5L) != 0) {
                if(dataRefsJavaLangObjectNullBooleanTrueDataRefsIsEmpty) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read data.refs == null ? true : data.refs.isEmpty() ? View.GONE : View.VISIBLE
                dataRefsJavaLangObjectNullBooleanTrueDataRefsIsEmptyViewGONEViewVISIBLE = ((dataRefsJavaLangObjectNullBooleanTrueDataRefsIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.content, dataContent);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.image, dataErrorImageAndroidDrawableIcWarning40dpImageAndroidDrawableIcCheck);
            this.image.setVisibility(dataSuccessBooleanTrueDataErrorViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.primaryAction, dataActionsPrimaryLabel);
            this.primaryAction.setVisibility(dataActionsPrimaryJavaLangObjectNullViewVISIBLEViewGONE);
            this.progress.setVisibility(dataProgressViewVISIBLEViewINVISIBLE);
            this.refs.setVisibility(dataRefsJavaLangObjectNullBooleanTrueDataRefsIsEmptyViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.refs, stringFormatRefsAndroidStringDefaultRefsDataRefs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondaryAction, dataActionsSecondaryLabel);
            this.secondaryAction.setVisibility(dataActionsSecondaryJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, dataTitleJavaLangObjectNullTitleAndroidStringFeedbackSendingDataTitle);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.image.setContentDescription(dataErrorImageAndroidStringContDescFeedbackProgressErrorImageAndroidStringContDescFeedbackProgressSuccess);
            }
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.primaryAction.setOnClickListener(mCallback5);
            this.secondaryAction.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // data.actions.primary
                com.qualcomm.qti.gaiaclient.ui.feedback.Action dataActionsPrimary = null;
                // data.actions
                com.qualcomm.qti.gaiaclient.ui.feedback.Actions dataActions = null;
                // data.actions != null
                boolean dataActionsJavaLangObjectNull = false;
                // data != null
                boolean dataJavaLangObjectNull = false;
                // viewModel
                com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel viewModel = mViewModel;
                // data
                com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus data = mData;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    dataJavaLangObjectNull = (data) != (null);
                    if (dataJavaLangObjectNull) {


                        dataActions = data.getActions();

                        dataActionsJavaLangObjectNull = (dataActions) != (null);
                        if (dataActionsJavaLangObjectNull) {


                            dataActionsPrimary = dataActions.getPrimary();

                            viewModel.onClick(dataActionsPrimary);
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // data.actions
                com.qualcomm.qti.gaiaclient.ui.feedback.Actions dataActions = null;
                // data.actions.secondary
                com.qualcomm.qti.gaiaclient.ui.feedback.Action dataActionsSecondary = null;
                // data.actions != null
                boolean dataActionsJavaLangObjectNull = false;
                // data != null
                boolean dataJavaLangObjectNull = false;
                // viewModel
                com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel viewModel = mViewModel;
                // data
                com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus data = mData;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    dataJavaLangObjectNull = (data) != (null);
                    if (dataJavaLangObjectNull) {


                        dataActions = data.getActions();

                        dataActionsJavaLangObjectNull = (dataActions) != (null);
                        if (dataActionsJavaLangObjectNull) {


                            dataActionsSecondary = dataActions.getSecondary();

                            viewModel.onClick(dataActionsSecondary);
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
        flag 0 (0x1L): data
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): data.error ? @android:drawable/ic_warning_40dp : @android:drawable/ic_check
        flag 4 (0x5L): data.error ? @android:drawable/ic_warning_40dp : @android:drawable/ic_check
        flag 5 (0x6L): data.error ? @android:string/cont_desc_feedback_progress_error : @android:string/cont_desc_feedback_progress_success
        flag 6 (0x7L): data.error ? @android:string/cont_desc_feedback_progress_error : @android:string/cont_desc_feedback_progress_success
        flag 7 (0x8L): data.progress ? View.VISIBLE : View.INVISIBLE
        flag 8 (0x9L): data.progress ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): data.refs == null ? true : data.refs.isEmpty()
        flag 10 (0xbL): data.refs == null ? true : data.refs.isEmpty()
        flag 11 (0xcL): data.actions.secondary != null ? View.VISIBLE : View.GONE
        flag 12 (0xdL): data.actions.secondary != null ? View.VISIBLE : View.GONE
        flag 13 (0xeL): data.title == null ? @android:string/feedback_sending : data.title
        flag 14 (0xfL): data.title == null ? @android:string/feedback_sending : data.title
        flag 15 (0x10L): data.refs == null ? true : data.refs.isEmpty() ? View.GONE : View.VISIBLE
        flag 16 (0x11L): data.refs == null ? true : data.refs.isEmpty() ? View.GONE : View.VISIBLE
        flag 17 (0x12L): data.success ? true : data.error ? View.VISIBLE : View.GONE
        flag 18 (0x13L): data.success ? true : data.error ? View.VISIBLE : View.GONE
        flag 19 (0x14L): data.actions.primary != null ? View.VISIBLE : View.GONE
        flag 20 (0x15L): data.actions.primary != null ? View.VISIBLE : View.GONE
        flag 21 (0x16L): data.success ? true : data.error
        flag 22 (0x17L): data.success ? true : data.error
    flag mapping end*/
    //end
}