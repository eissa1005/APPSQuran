package com.example.appquran.Base;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;


public class BaseActivtiy extends AppCompatActivity {
     protected  AppCompatActivity activity;
     protected  MaterialDialog mDialog;
    @Override

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;


    }

    protected MaterialDialog showMessage(int reTitle,int reMessage , int position){

        mDialog = new MaterialDialog.Builder(activity)
                .title(reTitle)
                .content(reMessage)
                .positiveText(position)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        mDialog.dismiss();
                    }
                })
                .show();
        return mDialog;
    }

    protected MaterialDialog showMessage(String reTitle,String reMessage , String position){

        mDialog = new MaterialDialog.Builder(activity)
                .title(reTitle)
                .content(reMessage)
                .positiveText(position)
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        mDialog.dismiss();
                    }
                })
                .show();
        return mDialog;
    }

    protected MaterialDialog showConfirmMessage(int reTitle,int reMessage , int position,MaterialDialog.SingleButtonCallback onPosAction ){

        mDialog = new MaterialDialog.Builder(activity)
                .title(reTitle)
                .content(reMessage)
                .positiveText(position)
                .onPositive(onPosAction)
                .show();
        return mDialog;
    }

    protected  void hideDialog(){
        if(mDialog !=null && mDialog.isShowing())
        mDialog.dismiss();
    }
}
