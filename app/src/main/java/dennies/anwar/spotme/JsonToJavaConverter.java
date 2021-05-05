package dennies.anwar.spotme;

import android.util.Log;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/*
 * Java program to convert JSON String into Java object using Jackson library.
 * Jackson is very easy to use and require just two lines of code to create a Java object
 * from JSON String format.
 *
 * @author http://javarevisited.blogspot.com
 */
public class JsonToJavaConverter {

    public static void main(String args[]) throws JsonParseException
            , JsonMappingException, IOException{

        JsonToJavaConverter converter = new JsonToJavaConverter();

        String json = "{\n" +
                "    \"name\": \"Garima\",\n" +
                "    \"surname\": \"Joshi\",\n" +
                "    \"phone\": 9832734651}";

        //converting JSON String to Java object
        converter.fromJson(json);
    }


    public Object fromJson(String json) throws JsonParseException
            , JsonMappingException, IOException{
        User garima = new ObjectMapper().readValue(json, User.class);
        Log.i("JsonToJava", "Java Object created from JSON String ");
        Log.i("JsonToJava", "JSON String : " + json);
        Log.i("JsonToJava", "Java Object : " + garima);

        return garima;
    }


    public static class User{
        private String name;
        private String surname;
        private long phone;

        public String getName() {return name;}
        public void setName(String name) {this.name = name;}

        public String getSurname() {return surname;}
        public void setSurname(String surname) {this.surname = surname;}

        public long getPhone() {return phone;}
        public void setPhone(long phone) {this.phone = phone;}

        @Override
        public String toString() {
            return "User [name=" + name + ", surname=" + surname + ", phone="
                    + phone + "]";
        }


    }
}

