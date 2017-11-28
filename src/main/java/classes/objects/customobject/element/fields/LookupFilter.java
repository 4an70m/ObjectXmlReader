package classes.objects.customobject.element.fields;

import java.util.List;

/**
 * Created by User on 28.11.2017.
 */
public class LookupFilter {

    public Boolean activer;
    public String booleanFilter;
    public List<FilterItem> filterItems;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LookupFilter that = (LookupFilter) o;

        if (activer != null ? !activer.equals(that.activer) : that.activer != null) return false;
        if (booleanFilter != null ? !booleanFilter.equals(that.booleanFilter) : that.booleanFilter != null)
            return false;
        return filterItems != null ? filterItems.equals(that.filterItems) : that.filterItems == null;
    }

    @Override
    public int hashCode() {
        int result = activer != null ? activer.hashCode() : 0;
        result = 31 * result + (booleanFilter != null ? booleanFilter.hashCode() : 0);
        result = 31 * result + (filterItems != null ? filterItems.hashCode() : 0);
        return result;
    }
}
