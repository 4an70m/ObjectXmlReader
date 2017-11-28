package classes;

import classes.objects.customobject.CustomObject;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;

/**
 * Created by User on 23.11.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException, CustomObject.MetadataException, IllegalAccessException {
        String filePath2 = "example\\object\\Account-full.object";
        CustomObject customObject2 = new CustomObject(filePath2);

        String filePath1 = "example\\object\\Account-full2.object";
        CustomObject customObject1 = new CustomObject(filePath1);

        CustomObject diffObject = (CustomObject) customObject1.diff(customObject2);
        JSONObject jsonObject = new JSONObject(diffObject.fields);
//        String jsonDiffObject = new Gson().toJson(diffObject.fields);
        System.out.println(jsonDiffObject);
        System.out.println(jsonObject.toString(4));
        System.out.println(XML.toString(jsonObject));
    }


}
