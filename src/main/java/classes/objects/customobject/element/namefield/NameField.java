package classes.objects.customobject.element.namefield;

/**
 * Created by 4an70m on 28.11.2017.
 */
public class NameField {

    public String label;
    public Boolean trackHistory;
    public String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NameField nameField = (NameField) o;

        if (label != null ? !label.equals(nameField.label) : nameField.label != null) return false;
        if (trackHistory != null ? !trackHistory.equals(nameField.trackHistory) : nameField.trackHistory != null)
            return false;
        return type != null ? type.equals(nameField.type) : nameField.type == null;
    }

    @Override
    public int hashCode() {
        int result = label != null ? label.hashCode() : 0;
        result = 31 * result + (trackHistory != null ? trackHistory.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
