package classes.objects.customobject.fields;

/**
 * Created by User on 27.11.2017.
 */ /*
 * Picklist objects
 */
class ValueSet {
    public ValueSetDefinition valueSetDefinition;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValueSet valueSet = (ValueSet) o;

        return valueSetDefinition != null ? valueSetDefinition.equals(valueSet.valueSetDefinition) : valueSet.valueSetDefinition == null;
    }

    @Override
    public int hashCode() {
        return valueSetDefinition != null ? valueSetDefinition.hashCode() : 0;
    }
}
