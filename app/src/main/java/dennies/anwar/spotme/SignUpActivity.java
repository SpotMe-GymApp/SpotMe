package dennies.anwar.spotme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class SignUpActivity extends AppCompatActivity {

    public static final String TAG = "SignUp Activity";
    private EditText etUsername;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private Button btnLogin;
    private Button btnSignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick Login Button");
                goLoginActivity();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick Sign Up Button");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String confirm_password = etConfirmPassword.getText().toString();
                if (username.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Username can't be empty", Toast.LENGTH_SHORT);
                    return;
                }
                if (password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Username can't be empty", Toast.LENGTH_SHORT);
                    return;
                }
                createNewUser(username, password, confirm_password);
            }
        });
    }



    private void createNewUser(String username, String password, String confirm_password) {
        ParseUser user = new ParseUser();
        // Set the user's username and password, which can be obtained by a forms
        user.setUsername(username);
        user.setPassword(password);
        if (password == password){
            Toast.makeText(SignUpActivity.this, "Passwords have to match", Toast.LENGTH_SHORT).show();
            user.signUpInBackground(new SignUpCallback() {
                @Override
                public void done(ParseException e) {
                    if (e == null) {
                        Toast.makeText(SignUpActivity.this, "Welcome" + username + "1", Toast.LENGTH_SHORT).show();
                        goMainActivity();
                    } else {
                        ParseUser.logOut();
                        Toast.makeText(SignUpActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
        else {
            return;
        }


    }

    private void goLoginActivity() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}