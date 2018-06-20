package com.example.sign_in;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class Sign_in_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);

        Spinner sex= findViewById(R.id.spinner1);
        Spinner hobby=findViewById(R.id.spinner2);
        Spinner np=findViewById(R.id.spinner3);
        Button date=findViewById(R.id.button1);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog builder = new AlertDialog.Builder(Sign_in_Activity.this)
                        .setView(R.layout.datapicker)
                        .setTitle("一个贼鸡儿好看的提示框")
                        .setIcon(android.R.drawable.ic_lock_power_off)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                            }
                        })
                        .show();
            }
        });


        List<String> sexdata = new ArrayList<String>(){{add("男");add("女");}};
        List<String> hobbydata=new ArrayList<String>(){{add("1");add("2");add("3");}};
        List<String> npdata=new ArrayList<String>(){{add("1");add("2");add("3");}};

        Spnner_Adapter s1=new Spnner_Adapter(this);
        Spnner_Adapter s2=new Spnner_Adapter(this);
        Spnner_Adapter s3=new Spnner_Adapter(this);


        sex.setAdapter(s1);
        hobby.setAdapter(s2);
        np.setAdapter(s3);

        s1.setDatas(sexdata);
        s2.setDatas(hobbydata);
        s3.setDatas(npdata);
    }
}
