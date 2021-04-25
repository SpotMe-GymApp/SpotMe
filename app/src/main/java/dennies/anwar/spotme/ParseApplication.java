package dennies.anwar.spotme;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("sXvM7IhGyXojzk1TtsDgw1gWr90PbRfHCGmgIYBu")
                .clientKey("FqVyhhQcV0G9fWtcWRE3nnLoMQnnnSfGnCeccUaH")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
