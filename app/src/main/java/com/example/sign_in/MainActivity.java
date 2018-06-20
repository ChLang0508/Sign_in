package com.example.sign_in;
//双击返回键退出
//使用 android studio
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public long first_clink_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onBackPressed(){
        if(System.currentTimeMillis()-first_clink_time<=2000){
            super.onBackPressed();
        }
        else{
            Toast.makeText(MainActivity.this,"再次点击退出", Toast.LENGTH_LONG).show();
            System.out.println(first_clink_time);
            first_clink_time=System.currentTimeMillis();
        }
    }
}
