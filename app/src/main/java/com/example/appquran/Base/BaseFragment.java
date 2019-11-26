package com.example.appquran.Base;

import android.content.Context;

import androidx.fragment.app.Fragment;
import com.afollestad.materialdialogs.MaterialDialog;

public class BaseFragment extends Fragment {

        BaseActivtiy activtiy;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activtiy = (BaseActivtiy)context;
    }

    protected MaterialDialog showMessage(int reTitle, int reMessage , int position){

        return  activtiy.showMessage(reTitle,reMessage,position);
    }

    protected MaterialDialog showMessage(String reTitle,String reMessage , String position){

        return activtiy.showMessage(reTitle,reMessage,position);
    }

    protected MaterialDialog showConfirmMessage(int reTitle,int reMessage , int position,MaterialDialog.SingleButtonCallback onPosAction ){

       return activtiy.showConfirmMessage(reTitle,reMessage,position,onPosAction);

    }

    protected  void hideDialog(){
        activtiy.hideDialog();
    }
}
