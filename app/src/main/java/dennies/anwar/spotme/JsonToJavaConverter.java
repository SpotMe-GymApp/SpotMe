package dennies.anwar.spotme;

import android.util.Log;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Java program to convert JSON String into Java object using Jackson library.
 * Jackson is very easy to use and require just two lines of code to create a Java object
 * from JSON String format.
 *
 * @author http://javarevisited.blogspot.com
 */
import java.util.HashMap; // import the HashMap class
import java.util.Iterator;

public class JsonToJavaConverter {

    private static HashMap<String, String> map;
    private static String jString;

     public JsonToJavaConverter(String jsonString) throws JSONException {
        map = new HashMap<String, String>();
        jString = jsonString;

         JSONObject jObject = new JSONObject(jsonString);
         Iterator<?> keys = jObject.keys();

         while( keys.hasNext() ){
             String key = (String)keys.next();
             String value = jObject.getString(key);
             map.put(key, value);

         }

         System.out.println("json : "+jObject);
         System.out.println("map : "+map);
    }

    HashMap<String, String> getStats(){
         return map;
    }

    String getJString(){
         return jString;
    }

    void addAchievement(String name, String record) {
        map.put(name, record);
        jString = addAchievementToJsonString(name, record);
    }

    String addAchievementToJsonString(String name, String record){
         String newJsonString = jString.substring(0, jString.length() - 1) + ",\"" + name + "\"" + ":" + "\"" + record + "\"";
         return newJsonString;
    }
}

