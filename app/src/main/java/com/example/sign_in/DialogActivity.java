package com.example.sign_in;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class DialogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }
    @Override
    public void onBackPressed() {
        AlertDialog builder = new AlertDialog.Builder(this)
                .setMessage("你他妈是真的要退吗？")
                .setTitle("一个贼鸡儿好看的提示框")
                .setIcon(android.R.drawable.ic_lock_power_off)
                .setPositiveButton("OK", new OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        System.exit(0);
                    }
                }).setNegativeButton("NO", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();
    }
}
