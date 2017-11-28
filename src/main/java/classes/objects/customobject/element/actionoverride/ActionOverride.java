package classes.objects.customobject.element.actionoverride;

/**
 * Created by User on 27.11.2017.
 */
public class ActionOverride {

    public String actionName;
    public String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActionOverride that = (ActionOverride) o;

        if (actionName != null ? !actionName.equals(that.actionName) : that.actionName != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = actionName != null ? actionName.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ActionOverride{" +
                "actionName='" + actionName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
