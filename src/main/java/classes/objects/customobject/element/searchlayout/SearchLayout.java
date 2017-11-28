package classes.objects.customobject.element.searchlayout;

/**
 * Created by 4an70m on 28.11.2017.
 */
public class SearchLayout {

    public Object customTabListAdditionalFields;
    public Object lookupDialogsAdditionalFields;
    public Object searchFilterFields;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchLayout that = (SearchLayout) o;

        if (customTabListAdditionalFields != null ? !customTabListAdditionalFields.equals(that.customTabListAdditionalFields) : that.customTabListAdditionalFields != null)
            return false;
        if (lookupDialogsAdditionalFields != null ? !lookupDialogsAdditionalFields.equals(that.lookupDialogsAdditionalFields) : that.lookupDialogsAdditionalFields != null)
            return false;
        return searchFilterFields != null ? searchFilterFields.equals(that.searchFilterFields) : that.searchFilterFields == null;
    }

    @Override
    public int hashCode() {
        int result = customTabListAdditionalFields != null ? customTabListAdditionalFields.hashCode() : 0;
        result = 31 * result + (lookupDialogsAdditionalFields != null ? lookupDialogsAdditionalFields.hashCode() : 0);
        result = 31 * result + (searchFilterFields != null ? searchFilterFields.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SearchLayout{" +
                "customTabListAdditionalFields=" + customTabListAdditionalFields +
                ", lookupDialogsAdditionalFields=" + lookupDialogsAdditionalFields +
                ", searchFilterFields=" + searchFilterFields +
                '}';
    }
}
