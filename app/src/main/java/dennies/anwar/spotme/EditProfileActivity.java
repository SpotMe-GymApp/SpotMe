package dennies.anwar.spotme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
    private Button btnSave;
    private Button btnProfilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etWeight = findViewById(R.id.etWeight);
        etBio = findViewById(R.id.etBio);
        etBench = findViewById(R.id.etBench);
        etSquat = findViewById(R.id.etSquat);
        etDeadlift = findViewById(R.id.etDeadlift);
        btnProfilePic = findViewById(R.id.btnProfilePic);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick Save Button");
                String name = etName.getText().toString();
                Integer age = Integer.parseInt(String.valueOf(etAge.getText()));
                Integer weight = Integer.parseInt(String.valueOf(etWeight.getText()));
                String bio = etBio.getText().toString();
                Integer bench = Integer.parseInt(String.valueOf(etBench.getText()));
                Integer squat = Integer.parseInt(String.valueOf(etSquat.getText()));
                Integer deadlift = Integer.parseInt(String.valueOf(etDeadlift.getText()));

                
            }
        });
    }
}