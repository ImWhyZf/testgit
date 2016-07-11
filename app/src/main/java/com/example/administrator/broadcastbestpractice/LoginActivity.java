package com.example.administrator.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/11 0011.
 */
public class LoginActivity  extends BaseActivity{
    private Button button;
    private EditText account;
    private EditText password;
    protected void onCreate(Bundle savedInstanceState){
          super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        account=(EditText)findViewById(R.id.account);
        password=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String accounttext= account.getText().toString();
                String passwordtext= password.getText().toString();
                if(accounttext.equals("admin")&& passwordtext.equals("1234")){
                    Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,"password or account is fail",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
