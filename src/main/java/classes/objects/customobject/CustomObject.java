package classes.objects.customobject;

import classes.objects.Metadata;
import classes.objects.customobject.actionoverride.ActionOverride;
import classes.objects.customobject.fields.Field;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

/**
 * Created by User on 24.11.2017.
 */
public class CustomObject extends Metadata {

    private Map<String, Object> customObjectWrap;

    public CustomObject() {
        this.customObjectWrap = new HashMap<>();
    }

    public CustomObject (String path) {
        super(path);
        this.customObjectWrap = this.jsonObject.toMap();
    }

    @Override
    public Metadata diff(Metadata metadata) throws MetadataException {
        if (this.getClass() != metadata.getClass()) {
            throw new MetadataException("Invalid metadata diff");
        }
        CustomObject comapreToObject = (CustomObject) metadata;

        this.diff(this.getCustomObject(), comapreToObject.getCustomObject());
        return null;
    }

    public Boolean diff(Object nodeFrom, Object nodeTo) {
        if (nodeFrom instanceof List) {
            this.diffList((List<Object>)nodeFrom, (List<Object>)nodeTo);
        } else {
            this.diffObject((Map<String, Object>) nodeFrom, (Map<String, Object>) nodeTo);
        }
        return false;
    }

    public Boolean diffList(List<Object> nodeFrom, List<Object> nodeTo) {
        System.out.println("List");
        return false;
    }

    public Boolean diffObject(Map<String, Object> nodeFrom, Map<String, Object> nodeTo) {
        return false;
    }

    /*
     * Public methods
     */
    public List<Field> getFields() {
        return this.getRecordListByFieldName("fields", Field.class);

    }

    public List<ActionOverride> getActionsOverride() {
        return this.getRecordListByFieldName("actionOverrides", ActionOverride.class);
    }

    /*
     * Private methods
     */

    private Map<String, Object> getCustomObject() {
        return (Map<String, Object>) this.customObjectWrap.get("CustomObject");
    }

    private <T> List<T> getRecordListByFieldName(String fieldName, Class<T> className) {
        final List<T> result = new ArrayList<>();
        Object fields = this.getCustomObject().get(fieldName);
        System.out.println(fields);
        System.out.println("test:"  + ((List<Object>) fields).get(1));
        ObjectMapper mapper = new ObjectMapper();

        if (fields instanceof List) {
            for (Object field : (List<Object>) fields) {
                result.add(mapper.convertValue(field, className));
            }
        } else {
            result.add(mapper.convertValue(fields, className));
        }
        return result;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "customObjectWrap=" + customObjectWrap +
                '}';
    }

}
