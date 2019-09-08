package com.example.midterm07600527;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button loginbtn = findViewById(R.id.buttonLogin);
        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                EditText username = findViewById(R.id.editTextUsername);
                EditText password = findViewById(R.id.editTextPassword);
                String inputusername = username.getText().toString();
                String inputpassword = password.getText().toString();

                Auth auth = new Auth();
                auth.setUsername(inputusername);
                auth.setPassword(inputpassword);
                int result = auth.check();
                if(result ==1){
                    Intent intent = new Intent(LoginActivity.this,ProfileActivity.class);
                    intent.putExtra("username","อัฐวุฒิ แย้มจินดา");
                    intent.putExtra("goesto","มหาวิทยาลัยศิลปากร");
                    intent.putExtra("livein","นครปฐม");
                    intent.putExtra("from","นครปฐม");
                    startActivity(intent);

                }else if(result ==2){
                    Intent intent = new Intent(LoginActivity.this,ProfileActivity.class);
                    intent.putExtra("username","Promlert Lovichit");
                    intent.putExtra("goesto","สวนกุหลาบวิทยาลัย");
                    intent.putExtra("livein","กรุงเทพมหานคร");
                    intent.putExtra("from","กรุงเทพมหานคร");
                    startActivity(intent);
                }else if(result == 3){
                    final AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle(R.string.login_fail);
                    dialog.setMessage(R.string.login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }

            }

        });


    }
}
