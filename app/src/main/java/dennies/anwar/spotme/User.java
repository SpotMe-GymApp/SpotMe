package dennies.anwar.spotme;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("User")
public class User extends ParseObject {
    public static final String KEY_STATS= "stats";

    public String getStats(){
        return getString(KEY_STATS);
    }
}
