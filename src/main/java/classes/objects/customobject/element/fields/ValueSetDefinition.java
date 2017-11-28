package classes.objects.customobject.element.fields;

/**
 * Created by User on 27.11.2017.
 */
class ValueSetDefinition {

    public String sorted;
    public Object value;

    public ValueSetDefinition(String sorted, Object value) {
        this.sorted = sorted;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValueSetDefinition that = (ValueSetDefinition) o;

        if (sorted != null ? !sorted.equals(that.sorted) : that.sorted != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = sorted != null ? sorted.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    public String getSorted() {
        return sorted;
    }

    public void setSorted(String sorted) {
        this.sorted = sorted;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
