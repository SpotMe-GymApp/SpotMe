package dennies.anwar.spotme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.json.JSONException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParseUser currUser = ParseUser.getCurrentUser();
        String stats = (String) currUser.getString("stats");
        try {
            JsonToJavaConverter statsHandler = new JsonToJavaConverter(stats);
            statsHandler.addAchievement("mile", "4 minutes");
            currUser.put("stats", statsHandler.getJString());
            Log.i("Main", statsHandler.getStats().toString());
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }
}