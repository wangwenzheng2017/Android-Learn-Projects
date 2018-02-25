package com.look.mark.loginview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private Button login;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.login);
        username = super.findViewById(R.id.username);
        password = super.findViewById(R.id.pwd);
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (username.getText().toString().equals("admin")&&password.getText().toString().equals("888888")){
                    Toast.makeText(getApplicationContext(),"登录成功！",Toast.LENGTH_SHORT).show();//提示用户登录成功
                    Intent t = new Intent(login.this,index.class);//从login页跳转到index页
                    startActivity(t);
                }else{
                    Toast.makeText(getApplicationContext(),"用户名或密码错误！",Toast.LENGTH_SHORT).show();//提示错误
                }
            }
        });
    }
}
