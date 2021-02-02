package com.example.message;

import
import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText number,message;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send)

                send.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(Build.VERSION.SDK_INT>=Build.M);
                    }
                }; {
                    @override
                    public void onClick(View v) {
                        if (Build.VERSION.SDK_INT>=Build.VERSION.M){
                            if(checkSelfPermission(Manifest.permission.SEND_SMS) == packageManager.PERMISSION_GRANTED){
                                sendSMS();
                            }else{
                                requestPermissions(new String[]{Manifest.permission.SEND_SMS},requestCode:1);
                            }
                        }

                    }
                })
    }
    private void.sendSMS(){
        String phoneNO= number.getText().toString().trim();
        String SMS =message.getText().toString().trim();
        try{
            smsManager smsManager
        }
    }
}