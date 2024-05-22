package com.qualcomm.qti.gaiaclient.databinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEarbudFitBindingImpl extends FragmentEarbudFitBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.horizontal_guideline_middle, 8);
        sViewsWithIds.put(R.id.horizontal_guideline_top, 9);
        sViewsWithIds.put(R.id.horizontal_guideline_bottom, 10);
        sViewsWithIds.put(R.id.vertical_guideline_left, 11);
        sViewsWithIds.put(R.id.vertical_guideline_right, 12);
        sViewsWithIds.put(R.id.left_device_image, 13);
        sViewsWithIds.put(R.id.right_device_image, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEarbudFitBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentEarbudFitBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            );
        this.buttonCancel.setTag(null);
        this.buttonStart.setTag(null);
        this.leftResultImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.rightResultImage.setTag(null);
        this.testMessage.setTag(null);
        this.testTitle.setTag(null);
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
        if (BR.data == variableId) {
            setData((com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.String dataTitle = null;
        int dataResultsRightResourceId = 0;
        java.lang.String dataMessage = null;
        int dataJavaLangObjectNullBooleanTrueDataStateEarbudFitStatePROGRESSViewVISIBLEViewGONE = 0;
        int dataStateEarbudFitStatePROGRESSViewVISIBLEViewGONE = 0;
        boolean dataJavaLangObjectNullBooleanTrueDataStateEarbudFitStatePROGRESS = false;
        com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewData data = mData;
        java.lang.String dataTitleJavaLangObjectNullTestTitleAndroidStringEarbudFitInitialTitleDataTitle = null;
        com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitState dataState = null;
        int dataResultsLeftResourceId = 0;
        com.qualcomm.qti.gaiaclient.ui.earbudfit.ResultsViewData dataResults = null;
        boolean dataStateEarbudFitStatePROGRESS = false;
        boolean dataTitleJavaLangObjectNull = false;
        boolean dataMessageJavaLangObjectNull = false;
        java.lang.String dataMessageJavaLangObjectNullTestMessageAndroidStringEarbudFitInitialMessageDataMessage = null;
        boolean dataJavaLangObjectNull = false;
        boolean DataStateEarbudFitStatePROGRESS1 = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.title
                    dataTitle = data.getTitle();
                    // read data.message
                    dataMessage = data.getMessage();
                    // read data.state
                    dataState = data.getState();
                    // read data.results
                    dataResults = data.getResults();
                }
                // read data == null
                dataJavaLangObjectNull = (data) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(dataJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read data.title == null
                dataTitleJavaLangObjectNull = (dataTitle) == (null);
                // read data.message == null
                dataMessageJavaLangObjectNull = (dataMessage) == (null);
                // read data.state == EarbudFitState.PROGRESS
                dataStateEarbudFitStatePROGRESS = (dataState) == (com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitState.PROGRESS);
            if((dirtyFlags & 0x3L) != 0) {
                if(dataTitleJavaLangObjectNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataMessageJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataStateEarbudFitStatePROGRESS) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
                if (dataResults != null) {
                    // read data.results.rightResourceId
                    dataResultsRightResourceId = dataResults.getRightResourceId();
                    // read data.results.leftResourceId
                    dataResultsLeftResourceId = dataResults.getLeftResourceId();
                }


                // read data.state == EarbudFitState.PROGRESS ? View.VISIBLE : View.GONE
                dataStateEarbudFitStatePROGRESSViewVISIBLEViewGONE = ((dataStateEarbudFitStatePROGRESS) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read data.title == null ? @android:string/earbud_fit_initial_title : data.title
                dataTitleJavaLangObjectNullTestTitleAndroidStringEarbudFitInitialTitleDataTitle = ((dataTitleJavaLangObjectNull) ? (testTitle.getResources().getString(R.string.earbud_fit_initial_title)) : (dataTitle));
                // read data.message == null ? @android:string/earbud_fit_initial_message : data.message
                dataMessageJavaLangObjectNullTestMessageAndroidStringEarbudFitInitialMessageDataMessage = ((dataMessageJavaLangObjectNull) ? (testMessage.getResources().getString(R.string.earbud_fit_initial_message)) : (dataMessage));
        }
        if ((dirtyFlags & 0x40L) != 0) {

                // read data.state != EarbudFitState.PROGRESS
                DataStateEarbudFitStatePROGRESS1 = (dataState) != (com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitState.PROGRESS);
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read data == null ? true : data.state != EarbudFitState.PROGRESS
                dataJavaLangObjectNullBooleanTrueDataStateEarbudFitStatePROGRESS = ((dataJavaLangObjectNull) ? (true) : (DataStateEarbudFitStatePROGRESS1));
            if((dirtyFlags & 0x3L) != 0) {
                if(dataJavaLangObjectNullBooleanTrueDataStateEarbudFitStatePROGRESS) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read data == null ? true : data.state != EarbudFitState.PROGRESS ? View.VISIBLE : View.GONE
                dataJavaLangObjectNullBooleanTrueDataStateEarbudFitStatePROGRESSViewVISIBLEViewGONE = ((dataJavaLangObjectNullBooleanTrueDataStateEarbudFitStatePROGRESS) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.buttonCancel.setVisibility(dataStateEarbudFitStatePROGRESSViewVISIBLEViewGONE);
            this.buttonStart.setVisibility(dataJavaLangObjectNullBooleanTrueDataStateEarbudFitStatePROGRESSViewVISIBLEViewGONE);
            this.leftResultImage.setImageResource(dataResultsLeftResourceId);
            this.progressBar.setVisibility(dataStateEarbudFitStatePROGRESSViewVISIBLEViewGONE);
            this.rightResultImage.setImageResource(dataResultsRightResourceId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.testMessage, dataMessageJavaLangObjectNullTestMessageAndroidStringEarbudFitInitialMessageDataMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.testTitle, dataTitleJavaLangObjectNullTestTitleAndroidStringEarbudFitInitialTitleDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data == null ? true : data.state != EarbudFitState.PROGRESS ? View.VISIBLE : View.GONE
        flag 3 (0x4L): data == null ? true : data.state != EarbudFitState.PROGRESS ? View.VISIBLE : View.GONE
        flag 4 (0x5L): data.state == EarbudFitState.PROGRESS ? View.VISIBLE : View.GONE
        flag 5 (0x6L): data.state == EarbudFitState.PROGRESS ? View.VISIBLE : View.GONE
        flag 6 (0x7L): data == null ? true : data.state != EarbudFitState.PROGRESS
        flag 7 (0x8L): data == null ? true : data.state != EarbudFitState.PROGRESS
        flag 8 (0x9L): data.title == null ? @android:string/earbud_fit_initial_title : data.title
        flag 9 (0xaL): data.title == null ? @android:string/earbud_fit_initial_title : data.title
        flag 10 (0xbL): data.message == null ? @android:string/earbud_fit_initial_message : data.message
        flag 11 (0xcL): data.message == null ? @android:string/earbud_fit_initial_message : data.message
    flag mapping end*/
    //end
}