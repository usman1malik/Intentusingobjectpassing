package com.malik.usman.intentusingobjectpassing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
   TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Student abc =(Student) getIntent().getSerializableExtra("usman");
        result=findViewById(R.id.txt_v_act2);
        result.setText(abc.toString());


    }
}
