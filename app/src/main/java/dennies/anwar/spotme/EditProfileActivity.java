package dennies.anwar.spotme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class EditProfileActivity extends AppCompatActivity {

    public static final String TAG = "EditProfileActivity";
    private EditText etName;
    private EditText etAge;
    private EditText etWeight;
    private EditText etBio;
    private EditText etBench;
    private EditText etSquat;
    private EditText etDeadlift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        et
    }
}