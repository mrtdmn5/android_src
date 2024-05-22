package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogStatisticsSettingsBindingImpl extends DialogStatisticsSettingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.refresh_rate_title, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogStatisticsSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DialogStatisticsSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (com.google.android.material.slider.Slider) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recordButton.setTag(null);
        this.refreshRateSlider.setTag(null);
        this.refreshRateValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.isRecording == variableId) {
            setIsRecording((java.lang.Boolean) variable);
        }
        else if (BR.rate == variableId) {
            setRate((com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.RefreshRate) variable);
        }
        else if (BR.bounds == variableId) {
            setBounds((com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.RefreshRateBounds) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsRecording(@Nullable java.lang.Boolean IsRecording) {
        this.mIsRecording = IsRecording;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isRecording);
        super.requestRebind();
    }
    public void setRate(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.RefreshRate Rate) {
        this.mRate = Rate;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.rate);
        super.requestRebind();
    }
    public void setBounds(@Nullable com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.RefreshRateBounds Bounds) {
        this.mBounds = Bounds;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.bounds);
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
        float boundsMinimum = 0f;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsRecording = false;
        float rateRateInSeconds = 0f;
        float rateJavaLangObjectNullFloat50fRateRateInMilliseconds = 0f;
        java.lang.Boolean isRecording = mIsRecording;
        boolean rateJavaLangObjectNull = false;
        float boundsJavaLangObjectNullFloat100fBoundsMaximum = 0f;
        float boundsMaximum = 0f;
        com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.RefreshRate rate = mRate;
        com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.RefreshRateBounds bounds = mBounds;
        java.lang.String stringFormatRefreshRateValueAndroidStringStatisticRefreshRateValueRateRateInSeconds = null;
        boolean boundsJavaLangObjectNull = false;
        float rateRateInMilliseconds = 0f;
        float boundsJavaLangObjectNullFloat0fBoundsMinimum = 0f;
        java.lang.String isRecordingRecordButtonAndroidStringStatisticStopRecordingRecordButtonAndroidStringStatisticStartRecording = null;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isRecording)
                androidxDatabindingViewDataBindingSafeUnboxIsRecording = androidx.databinding.ViewDataBinding.safeUnbox(isRecording);
            if((dirtyFlags & 0x9L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsRecording) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isRecording) ? @android:string/statistic_stop_recording : @android:string/statistic_start_recording
                isRecordingRecordButtonAndroidStringStatisticStopRecordingRecordButtonAndroidStringStatisticStartRecording = ((androidxDatabindingViewDataBindingSafeUnboxIsRecording) ? (recordButton.getResources().getString(R.string.statistic_stop_recording)) : (recordButton.getResources().getString(R.string.statistic_start_recording)));
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (rate != null) {
                    // read rate.rateInSeconds
                    rateRateInSeconds = rate.getRateInSeconds();
                }
                // read rate == null
                rateJavaLangObjectNull = (rate) == (null);
            if((dirtyFlags & 0xaL) != 0) {
                if(rateJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read String.format(@android:string/statistic_refresh_rate_value, rate.rateInSeconds)
                stringFormatRefreshRateValueAndroidStringStatisticRefreshRateValueRateRateInSeconds = java.lang.String.format(refreshRateValue.getResources().getString(R.string.statistic_refresh_rate_value), rateRateInSeconds);
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read bounds == null
                boundsJavaLangObjectNull = (bounds) == (null);
            if((dirtyFlags & 0xcL) != 0) {
                if(boundsJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (bounds != null) {
                    // read bounds.minimum
                    boundsMinimum = bounds.getMinimum();
                }
        }
        if ((dirtyFlags & 0x40L) != 0) {

                if (bounds != null) {
                    // read bounds.maximum
                    boundsMaximum = bounds.getMaximum();
                }
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (rate != null) {
                    // read rate.rateInMilliseconds
                    rateRateInMilliseconds = rate.getRateInMilliseconds();
                }
        }

        if ((dirtyFlags & 0xaL) != 0) {

                // read rate == null ? 50f : rate.rateInMilliseconds
                rateJavaLangObjectNullFloat50fRateRateInMilliseconds = ((rateJavaLangObjectNull) ? (50f) : (rateRateInMilliseconds));
        }
        if ((dirtyFlags & 0xcL) != 0) {

                // read bounds == null ? 100f : bounds.maximum
                boundsJavaLangObjectNullFloat100fBoundsMaximum = ((boundsJavaLangObjectNull) ? (100f) : (boundsMaximum));
                // read bounds == null ? 0f : bounds.minimum
                boundsJavaLangObjectNullFloat0fBoundsMinimum = ((boundsJavaLangObjectNull) ? (0f) : (boundsMinimum));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.recordButton, isRecordingRecordButtonAndroidStringStatisticStopRecordingRecordButtonAndroidStringStatisticStartRecording);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.refreshRateSlider.setValueFrom(boundsJavaLangObjectNullFloat0fBoundsMinimum);
            this.refreshRateSlider.setValueTo(boundsJavaLangObjectNullFloat100fBoundsMaximum);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.refreshRateSlider.setValue(rateJavaLangObjectNullFloat50fRateRateInMilliseconds);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.refreshRateValue, stringFormatRefreshRateValueAndroidStringStatisticRefreshRateValueRateRateInSeconds);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isRecording
        flag 1 (0x2L): rate
        flag 2 (0x3L): bounds
        flag 3 (0x4L): null
        flag 4 (0x5L): rate == null ? 50f : rate.rateInMilliseconds
        flag 5 (0x6L): rate == null ? 50f : rate.rateInMilliseconds
        flag 6 (0x7L): bounds == null ? 100f : bounds.maximum
        flag 7 (0x8L): bounds == null ? 100f : bounds.maximum
        flag 8 (0x9L): bounds == null ? 0f : bounds.minimum
        flag 9 (0xaL): bounds == null ? 0f : bounds.minimum
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(isRecording) ? @android:string/statistic_stop_recording : @android:string/statistic_start_recording
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(isRecording) ? @android:string/statistic_stop_recording : @android:string/statistic_start_recording
    flag mapping end*/
    //end
}