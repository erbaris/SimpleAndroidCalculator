package com.erbaris.android.app.calculator.databinding;
import com.erbaris.android.app.calculator.R;
import com.erbaris.android.app.calculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.erbaris.android.app.calculator.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final android.widget.Button mboundView10;
    @NonNull
    private final android.widget.Button mboundView11;
    @NonNull
    private final android.widget.Button mboundView12;
    @NonNull
    private final android.widget.Button mboundView13;
    @NonNull
    private final android.widget.Button mboundView14;
    @NonNull
    private final android.widget.Button mboundView15;
    @NonNull
    private final android.widget.Button mboundView16;
    @NonNull
    private final android.widget.Button mboundView17;
    @NonNull
    private final android.widget.Button mboundView18;
    @NonNull
    private final android.widget.Button mboundView19;
    @NonNull
    private final android.widget.Button mboundView2;
    @NonNull
    private final android.widget.Button mboundView20;
    @NonNull
    private final android.widget.Button mboundView21;
    @NonNull
    private final android.widget.Button mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    @NonNull
    private final android.widget.Button mboundView5;
    @NonNull
    private final android.widget.Button mboundView6;
    @NonNull
    private final android.widget.Button mboundView7;
    @NonNull
    private final android.widget.Button mboundView8;
    @NonNull
    private final android.widget.Button mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            );
        this.mainActivityTextViewCalculator.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.Button) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.Button) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.Button) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.Button) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.Button) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.Button) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.Button) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.Button) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.Button) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.widget.Button) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.Button) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (android.widget.Button) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.Button) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.Button) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 17);
        mCallback15 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 15);
        mCallback13 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 13);
        mCallback11 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 11);
        mCallback19 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 19);
        mCallback8 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 8);
        mCallback6 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 2);
        mCallback20 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 20);
        mCallback16 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 16);
        mCallback14 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 14);
        mCallback12 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 12);
        mCallback10 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 10);
        mCallback9 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 9);
        mCallback18 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 18);
        mCallback7 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.erbaris.android.app.calculator.generated.callback.OnClickListener(this, 1);
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
        if (BR.screenView == variableId) {
            setScreenView((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setScreenView(@Nullable java.lang.String ScreenView) {
        this.mScreenView = ScreenView;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.screenView);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel ViewModel) {
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
        java.lang.String screenView = mScreenView;
        com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mainActivityTextViewCalculator, screenView);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(mCallback9);
            this.mboundView11.setOnClickListener(mCallback10);
            this.mboundView12.setOnClickListener(mCallback11);
            this.mboundView13.setOnClickListener(mCallback12);
            this.mboundView14.setOnClickListener(mCallback13);
            this.mboundView15.setOnClickListener(mCallback14);
            this.mboundView16.setOnClickListener(mCallback15);
            this.mboundView17.setOnClickListener(mCallback16);
            this.mboundView18.setOnClickListener(mCallback17);
            this.mboundView19.setOnClickListener(mCallback18);
            this.mboundView2.setOnClickListener(mCallback1);
            this.mboundView20.setOnClickListener(mCallback19);
            this.mboundView21.setOnClickListener(mCallback20);
            this.mboundView3.setOnClickListener(mCallback2);
            this.mboundView4.setOnClickListener(mCallback3);
            this.mboundView5.setOnClickListener(mCallback4);
            this.mboundView6.setOnClickListener(mCallback5);
            this.mboundView7.setOnClickListener(mCallback6);
            this.mboundView8.setOnClickListener(mCallback7);
            this.mboundView9.setOnClickListener(mCallback8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 17: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleDotButtonClicked();
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleThreeButtonClicked();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleOneButtonClicked();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleSixButtonClicked();
                }
                break;
            }
            case 19: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleSignButtonClicked();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleMultiplyButtonClicked();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleEigthButtonClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleDivideButtonClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handlepercantageButtonClicked();
                }
                break;
            }
            case 20: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleEqualButtonClicked();
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleMinusButtonClicked();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleTwoButtonClicked();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handlePlusButtonClicked();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleFiveButtonClicked();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleFourButtonClicked();
                }
                break;
            }
            case 18: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleZeroButtonClicked();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleNineButtonClicked();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleSevenButtonClicked();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleCEButtonClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.erbaris.android.app.calculator.viewmodel.MainActivityViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.handleCbuttonClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): screenView
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}