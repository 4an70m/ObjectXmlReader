package classes;

import classes.objects.customobject.CustomObject;

import java.io.IOException;

/**
 * Created by User on 23.11.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException, CustomObject.MetadataException, IllegalAccessException {
        String originalPath = "C:\\Users\\User\\Documents\\4an70m\\src\\objects\\Quote2.object";
        CustomObject originalObject = new CustomObject(originalPath);

        String newPath = "C:\\Users\\User\\Documents\\4an70m\\src\\objects\\Quote.object";
        CustomObject newObject = new CustomObject(newPath);

        CustomObject diffObject = (CustomObject) originalObject.diff(newObject);
        System.out.println(diffObject.toXml());

    }


}
