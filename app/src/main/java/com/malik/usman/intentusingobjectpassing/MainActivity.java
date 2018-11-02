package com.malik.usman.intentusingobjectpassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView frst_name,last_name,departmnt,age,email,city,cntct_num,curnt_semster;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frst_name=findViewById(R.id.txtv1);
       last_name =findViewById(R.id.txtv2);
        departmnt=findViewById(R.id.txtv3);
        age=findViewById(R.id.txtv4);
        email=findViewById(R.id.txtv5);
        city=findViewById(R.id.txtv6);
        cntct_num=findViewById(R.id.txtv7);
        curnt_semster=findViewById(R.id.txtv8);

        b1=findViewById(R.id.btn1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent abc = new Intent(this,Main2Activity.class);
        Student stdnt = new Student();
        stdnt.getFrst_name(frst_name.getText().toString());
        stdnt.getLst_name(last_name.getText().toString());
        stdnt.getDeptmnt(departmnt.getText().toString());
        stdnt.getAge(Integer.parseInt(age.getText().toString()));
         stdnt.getEmail(email.getText().toString());
         stdnt.getCity(city.getText().toString());
         stdnt.getCntat_num(Integer.parseInt(cntct_num.getText().toString()));
         stdnt.getCurnt_smster(Integer.parseInt(curnt_semster.getText().toString()));
         abc.putExtra("usman",stdnt);
        startActivity(abc);

    }
}
