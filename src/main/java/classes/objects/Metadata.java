package classes.objects;

import classes.objects.customobject.element.JSONable;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by User on 27.11.2017.
 */
public abstract class Metadata {

    private JSONObject jsonObject;


    public Metadata() {}

    public Metadata(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public Metadata(String filePath) {
        try {
            File f = new File(filePath);
            String xmlFile = readFile(f);
            this.jsonObject = XML.toJSONObject(xmlFile);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    public void constructJsonObject(JSONable toJsonObject) {
        String jsonObject = new Gson().toJson(toJsonObject);
        this.jsonObject = new JSONObject(jsonObject);
    }

    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public abstract String toXml();


    public class MetadataException extends Exception {

        public MetadataException() {
        }

        public MetadataException(String msg) {
            super(msg);
        }
    }



    private String readFile(File file) throws IOException {
        StringBuilder result = new StringBuilder();
        BufferedReader brs = new BufferedReader(new FileReader(file));

        String line = null;
        while ((line = brs.readLine()) != null) {
            result.append(line);
        }

        return result.toString();
    }
}
