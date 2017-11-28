package classes.objects.customobject;

import classes.objects.Metadata;
import classes.objects.customobject.element.adapter.ArrayAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by User on 24.11.2017.
 */
public class CustomObject extends Metadata implements Differable {

    public final CustomObjectParsed fields;

    public CustomObject () {
        this.fields = new CustomObjectParsed();
    }

    public CustomObject (String filePath) {
        super(filePath);
        Gson gson = new GsonBuilder().registerTypeAdapterFactory(new ArrayAdapterFactory()).create();
        this.fields = gson.fromJson(getObjectBody(), CustomObjectParsed.class);
    }

    @Override
    public Metadata diff(Metadata metadata) throws IllegalAccessException {
        CustomObject result = new CustomObject();
        CustomObject compareTo = (CustomObject) metadata;

        for (java.lang.reflect.Field field : CustomObjectParsed.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object thisValue = field.get(this.fields);
            Object compareToValue = field.get(compareTo.fields);

            if (this.compareListField(field)) {
                List<Object> compareToResult = this.diffListFields(thisValue, compareToValue);
                field.set(result.fields, compareToResult);
            } else if (this.compareSimpleField(thisValue, compareToValue)) {
                field.set(result.fields, compareToValue);
            }
        }
        return result;
    }

    private Boolean compareSimpleField(Object thisValue, Object compareToValue) {
        return (thisValue != null && !thisValue.equals(compareToValue))
            || (compareToValue != null && !compareToValue.equals(thisValue));
    }

    private Boolean compareListField(java.lang.reflect.Field field) {
        return field.getType() == List.class;
    }

    private List<Object> diffListFields(Object thisValue, Object compareToValue) {
        if (thisValue == null) {
            return (List<Object>) compareToValue;
        }
        List<Object> result = new ArrayList<>();

        Set<Object> thisListFrom = new HashSet<>((List<Object>) thisValue);
        Set<Object> compareToList = new HashSet<>((List<Object>) compareToValue);

        compareToList.removeAll(thisListFrom);
        result.addAll(compareToList);

        return result;
    }

    private String getObjectBody() {
        return this.getJsonObject().get("CustomObject").toString();
    }

    @Override
    public String toString() {
        return fields.toString();
    }
}
