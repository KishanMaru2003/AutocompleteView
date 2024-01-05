package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,password;
    EditText usm,pwd,usm_ans,pwd_ans;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usm=findViewById(R.id.usm);
        pwd=findViewById(R.id.pwd);
        button2=findViewById(R.id.button2);
        usm_ans=findViewById(R.id.usm_ans);
        pwd_ans=findViewById(R.id.pwd_ans);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usm_ans.setText(usm.getText());
                pwd_ans.setText(pwd.getText());
            }
        });



    }
}