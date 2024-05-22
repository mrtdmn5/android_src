package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProgressBindingImpl extends FragmentProgressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontal_guideline, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProgressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentProgressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.cancel.setTag(null);
        this.done.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBarDeterminate.setTag(null);
        this.progressBarIndeterminate.setTag(null);
        this.progressMessage.setTag(null);
        this.progressStep.setTag(null);
        this.progressText.setTag(null);
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
        if (BR.staticData == variableId) {
            setStaticData((com.qualcomm.qti.gaiaclient.ui.common.progress.ProgressFragmentViewData) variable);
        }
        else if (BR.message == variableId) {
            setMessage((java.lang.String) variable);
        }
        else if (BR.progress == variableId) {
            setProgress((com.qualcomm.qti.gaiaclient.ui.common.progress.ProgressViewData) variable);
        }
        else if (BR.isInProgress == variableId) {
            setIsInProgress((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStaticData(@Nullable com.qualcomm.qti.gaiaclient.ui.common.progress.ProgressFragmentViewData StaticData) {
        this.mStaticData = StaticData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.staticData);
        super.requestRebind();
    }
    public void setMessage(@Nullable java.lang.String Message) {
        this.mMessage = Message;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.message);
        super.requestRebind();
    }
    public void setProgress(@Nullable com.qualcomm.qti.gaiaclient.ui.common.progress.ProgressViewData Progress) {
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    public void setIsInProgress(boolean IsInProgress) {
        this.mIsInProgress = IsInProgress;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isInProgress);
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
        java.lang.String stringFormatProgressTextAndroidStringProgressPercentProgressProgressInPercent = null;
        com.qualcomm.qti.gaiaclient.ui.common.progress.ProgressFragmentViewData staticData = mStaticData;
        java.lang.String progressLabelJavaLangObjectNullProgressStepAndroidStringProgressLabelProgressLabel = null;
        java.lang.String staticDataCancelButton = null;
        boolean staticDataCancelButtonJavaLangObjectNull = false;
        boolean isInProgressProgressIsDeterminateProgressBooleanFalse = false;
        int progressIsDeterminateProgressViewVISIBLEViewGONE = 0;
        int isInProgressViewVISIBLEViewGONE = 0;
        java.lang.String staticDataCancelButtonJavaLangObjectNullCancelAndroidStringButtonCancelStaticDataCancelButton = null;
        int isInProgressProgressIsDeterminateProgressBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        java.lang.String message = mMessage;
        int IsInProgressProgressIsDeterminateProgressBooleanFalseViewVISIBLEViewINVISIBLE1 = 0;
        java.lang.String staticDataDoneButtonJavaLangObjectNullDoneAndroidStringButtonDoneStaticDataDoneButton = null;
        boolean progressIsDeterminateProgress = false;
        java.lang.String progressLabel = null;
        java.lang.String staticDataDoneButton = null;
        int isInProgressViewGONEViewVISIBLE = 0;
        java.lang.String stringFormatProgressStepAndroidStringContDescProgressStepProgressLabel = null;
        boolean progressLabelJavaLangObjectNull = false;
        com.qualcomm.qti.gaiaclient.ui.common.progress.ProgressViewData progress = mProgress;
        java.lang.String stringFormatProgressMessageAndroidStringContDescMessageMessage = null;
        java.lang.String stringFormatProgressTextAndroidStringContDescProgressProgressProgressInPercent = null;
        boolean isInProgress = mIsInProgress;
        int progressProgressForProgressBar = 0;
        boolean ProgressIsDeterminateProgress1 = false;
        double progressProgressInPercent = 0.0;
        boolean IsInProgressProgressIsDeterminateProgressBooleanFalse1 = false;
        boolean staticDataDoneButtonJavaLangObjectNull = false;

        if ((dirtyFlags & 0x11L) != 0) {



                if (staticData != null) {
                    // read staticData.cancelButton
                    staticDataCancelButton = staticData.getCancelButton();
                    // read staticData.doneButton
                    staticDataDoneButton = staticData.getDoneButton();
                }


                // read staticData.cancelButton == null
                staticDataCancelButtonJavaLangObjectNull = (staticDataCancelButton) == (null);
                // read staticData.doneButton == null
                staticDataDoneButtonJavaLangObjectNull = (staticDataDoneButton) == (null);
            if((dirtyFlags & 0x11L) != 0) {
                if(staticDataCancelButtonJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x11L) != 0) {
                if(staticDataDoneButtonJavaLangObjectNull) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read String.format(@android:string/cont_desc_message, message)
                stringFormatProgressMessageAndroidStringContDescMessageMessage = java.lang.String.format(progressMessage.getResources().getString(R.string.cont_desc_message), message);
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (progress != null) {
                    // read progress.isDeterminateProgress
                    progressIsDeterminateProgress = progress.isDeterminateProgress();
                    // read progress.label
                    progressLabel = progress.getLabel();
                    // read progress.progressForProgressBar
                    progressProgressForProgressBar = progress.getProgressForProgressBar();
                    // read progress.progressInPercent
                    progressProgressInPercent = progress.getProgressInPercent();
                }
            if((dirtyFlags & 0x14L) != 0) {
                if(progressIsDeterminateProgress) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read progress.isDeterminateProgress ? View.VISIBLE : View.GONE
                progressIsDeterminateProgressViewVISIBLEViewGONE = ((progressIsDeterminateProgress) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read String.format(@android:string/cont_desc_progress_step, progress.label)
                stringFormatProgressStepAndroidStringContDescProgressStepProgressLabel = java.lang.String.format(progressStep.getResources().getString(R.string.cont_desc_progress_step), progressLabel);
                // read progress.label == null
                progressLabelJavaLangObjectNull = (progressLabel) == (null);
                // read String.format(@android:string/progress_percent, progress.progressInPercent)
                stringFormatProgressTextAndroidStringProgressPercentProgressProgressInPercent = java.lang.String.format(progressText.getResources().getString(R.string.progress_percent), progressProgressInPercent);
                // read String.format(@android:string/cont_desc_progress, progress.progressInPercent)
                stringFormatProgressTextAndroidStringContDescProgressProgressProgressInPercent = java.lang.String.format(progressText.getResources().getString(R.string.cont_desc_progress), progressProgressInPercent);
            if((dirtyFlags & 0x14L) != 0) {
                if(progressLabelJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        if ((dirtyFlags & 0x1cL) != 0) {

            if((dirtyFlags & 0x1cL) != 0) {
                if(isInProgress) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800000L;
                }
            }
            if((dirtyFlags & 0x18L) != 0) {
                if(isInProgress) {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x200000L;
                }
            }

            if ((dirtyFlags & 0x18L) != 0) {

                    // read isInProgress ? View.VISIBLE : View.GONE
                    isInProgressViewVISIBLEViewGONE = ((isInProgress) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read isInProgress ? View.GONE : View.VISIBLE
                    isInProgressViewGONEViewVISIBLE = ((isInProgress) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x14L) != 0) {

                // read progress.label == null ? @android:string/progress_label : progress.label
                progressLabelJavaLangObjectNullProgressStepAndroidStringProgressLabelProgressLabel = ((progressLabelJavaLangObjectNull) ? (progressStep.getResources().getString(R.string.progress_label)) : (progressLabel));
        }
        if ((dirtyFlags & 0x11L) != 0) {

                // read staticData.cancelButton == null ? @android:string/button_cancel : staticData.cancelButton
                staticDataCancelButtonJavaLangObjectNullCancelAndroidStringButtonCancelStaticDataCancelButton = ((staticDataCancelButtonJavaLangObjectNull) ? (cancel.getResources().getString(R.string.button_cancel)) : (staticDataCancelButton));
                // read staticData.doneButton == null ? @android:string/button_done : staticData.doneButton
                staticDataDoneButtonJavaLangObjectNullDoneAndroidStringButtonDoneStaticDataDoneButton = ((staticDataDoneButtonJavaLangObjectNull) ? (done.getResources().getString(R.string.button_done)) : (staticDataDoneButton));
        }
        if ((dirtyFlags & 0x1000100L) != 0) {



                if (progress != null) {
                    // read progress.isDeterminateProgress
                    progressIsDeterminateProgress = progress.isDeterminateProgress();
                }
            if((dirtyFlags & 0x14L) != 0) {
                if(progressIsDeterminateProgress) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }

            if ((dirtyFlags & 0x1000000L) != 0) {

                    // read !progress.isDeterminateProgress
                    ProgressIsDeterminateProgress1 = !progressIsDeterminateProgress;
            }
        }

        if ((dirtyFlags & 0x1cL) != 0) {

                // read isInProgress ? progress.isDeterminateProgress : false
                isInProgressProgressIsDeterminateProgressBooleanFalse = ((isInProgress) ? (progressIsDeterminateProgress) : (false));
                // read isInProgress ? !progress.isDeterminateProgress : false
                IsInProgressProgressIsDeterminateProgressBooleanFalse1 = ((isInProgress) ? (ProgressIsDeterminateProgress1) : (false));
            if((dirtyFlags & 0x1cL) != 0) {
                if(isInProgressProgressIsDeterminateProgressBooleanFalse) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }
            if((dirtyFlags & 0x1cL) != 0) {
                if(IsInProgressProgressIsDeterminateProgressBooleanFalse1) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read isInProgress ? progress.isDeterminateProgress : false ? View.VISIBLE : View.INVISIBLE
                IsInProgressProgressIsDeterminateProgressBooleanFalseViewVISIBLEViewINVISIBLE1 = ((isInProgressProgressIsDeterminateProgressBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read isInProgress ? !progress.isDeterminateProgress : false ? View.VISIBLE : View.INVISIBLE
                isInProgressProgressIsDeterminateProgressBooleanFalseViewVISIBLEViewINVISIBLE = ((IsInProgressProgressIsDeterminateProgressBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cancel, staticDataCancelButtonJavaLangObjectNullCancelAndroidStringButtonCancelStaticDataCancelButton);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.done, staticDataDoneButtonJavaLangObjectNullDoneAndroidStringButtonDoneStaticDataDoneButton);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.cancel.setVisibility(isInProgressViewVISIBLEViewGONE);
            this.done.setVisibility(isInProgressViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.progressBarDeterminate.setProgress(progressProgressForProgressBar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.progressStep, progressLabelJavaLangObjectNullProgressStepAndroidStringProgressLabelProgressLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.progressText, stringFormatProgressTextAndroidStringProgressPercentProgressProgressInPercent);
            this.progressText.setVisibility(progressIsDeterminateProgressViewVISIBLEViewGONE);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.progressStep.setContentDescription(stringFormatProgressStepAndroidStringContDescProgressStepProgressLabel);
                this.progressText.setContentDescription(stringFormatProgressTextAndroidStringContDescProgressProgressProgressInPercent);
            }
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.progressBarDeterminate.setVisibility(IsInProgressProgressIsDeterminateProgressBooleanFalseViewVISIBLEViewINVISIBLE1);
            this.progressBarIndeterminate.setVisibility(isInProgressProgressIsDeterminateProgressBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.progressMessage.setContentDescription(stringFormatProgressMessageAndroidStringContDescMessageMessage);
            }
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.progressMessage, message);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): staticData
        flag 1 (0x2L): message
        flag 2 (0x3L): progress
        flag 3 (0x4L): isInProgress
        flag 4 (0x5L): null
        flag 5 (0x6L): progress.label == null ? @android:string/progress_label : progress.label
        flag 6 (0x7L): progress.label == null ? @android:string/progress_label : progress.label
        flag 7 (0x8L): isInProgress ? progress.isDeterminateProgress : false
        flag 8 (0x9L): isInProgress ? progress.isDeterminateProgress : false
        flag 9 (0xaL): progress.isDeterminateProgress ? View.VISIBLE : View.GONE
        flag 10 (0xbL): progress.isDeterminateProgress ? View.VISIBLE : View.GONE
        flag 11 (0xcL): isInProgress ? View.VISIBLE : View.GONE
        flag 12 (0xdL): isInProgress ? View.VISIBLE : View.GONE
        flag 13 (0xeL): staticData.cancelButton == null ? @android:string/button_cancel : staticData.cancelButton
        flag 14 (0xfL): staticData.cancelButton == null ? @android:string/button_cancel : staticData.cancelButton
        flag 15 (0x10L): isInProgress ? !progress.isDeterminateProgress : false ? View.VISIBLE : View.INVISIBLE
        flag 16 (0x11L): isInProgress ? !progress.isDeterminateProgress : false ? View.VISIBLE : View.INVISIBLE
        flag 17 (0x12L): isInProgress ? progress.isDeterminateProgress : false ? View.VISIBLE : View.INVISIBLE
        flag 18 (0x13L): isInProgress ? progress.isDeterminateProgress : false ? View.VISIBLE : View.INVISIBLE
        flag 19 (0x14L): staticData.doneButton == null ? @android:string/button_done : staticData.doneButton
        flag 20 (0x15L): staticData.doneButton == null ? @android:string/button_done : staticData.doneButton
        flag 21 (0x16L): isInProgress ? View.GONE : View.VISIBLE
        flag 22 (0x17L): isInProgress ? View.GONE : View.VISIBLE
        flag 23 (0x18L): isInProgress ? !progress.isDeterminateProgress : false
        flag 24 (0x19L): isInProgress ? !progress.isDeterminateProgress : false
    flag mapping end*/
    //end
}