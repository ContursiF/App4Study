package dev.contursif.app4study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View v)
    {
        EditText username=(EditText) findViewById(R.id.username);
        EditText password=(EditText) findViewById(R.id.password);
        String account_username=username.getText().toString();
        String account_password=password.getText().toString();
        if (account_username.equals("fabio") && account_password.equals("1")){
            goAhead();
        }else
            Toast.makeText(this, "Credenziali Errate", Toast.LENGTH_SHORT).show();

    }

    public void cancel(View v)
    {
        Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show();
    }
    private void goAhead() {
        final Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
/*    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages(null);
    }*/
}
