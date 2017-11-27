package classes.objects.customobject.actionoverride;

/**
 * Created by User on 27.11.2017.
 */
public class ActionOverride {

    public String actionName;
    public String type;

    @Override
    public String toString() {
        return "ActionOverride{" +
                "actionName='" + actionName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
