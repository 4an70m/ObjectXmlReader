package classes.objects.customobject.element.fields;

/**
 * Created by User on 28.11.2017.
 */
public class FilterItem {

    public String field;
    public String operation;
    public String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilterItem that = (FilterItem) o;

        if (field != null ? !field.equals(that.field) : that.field != null) return false;
        if (operation != null ? !operation.equals(that.operation) : that.operation != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = field != null ? field.hashCode() : 0;
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
