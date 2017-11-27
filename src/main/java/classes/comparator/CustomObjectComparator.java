package classes.comparator;

import classes.objects.customobject.CustomObject;
import java.io.IOException;

/**
 * Created by User on 27.11.2017.
 */
public class CustomObjectComparator {

    public void compare() {

    }

    public static void main(String[] args) throws IOException, CustomObject.MetadataException {
        String filePath1 = "C:\\Users\\User\\Documents\\ObjectXmlReader\\example\\object\\Account.object";
        String filePath2 = "C:\\Users\\User\\Documents\\ObjectXmlReader\\example\\object\\Account2.object";

        CustomObject customObject1 = new CustomObject(filePath1);
        CustomObject customObject2 = new CustomObject(filePath2);

        customObject1.diff(customObject2);

    }

}
