package classes.objects.customobject.element.lsitview;

import java.util.List;

/**
 * Created by 4an70m on 28.11.2017.
 */
public class ListView {

    public String fullName;
    public List<String> columns;
    public String filterScope;
    public Object filters;
    public String label;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListView listView = (ListView) o;

        if (fullName != null ? !fullName.equals(listView.fullName) : listView.fullName != null) return false;
        if (columns != null ? !columns.equals(listView.columns) : listView.columns != null) return false;
        if (filterScope != null ? !filterScope.equals(listView.filterScope) : listView.filterScope != null)
            return false;
        if (filters != null ? !filters.equals(listView.filters) : listView.filters != null) return false;
        return label != null ? label.equals(listView.label) : listView.label == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (columns != null ? columns.hashCode() : 0);
        result = 31 * result + (filterScope != null ? filterScope.hashCode() : 0);
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ListView{" +
                "fullName='" + fullName + '\'' +
                ", columns=" + columns +
                ", filterScope='" + filterScope + '\'' +
                ", filters=" + filters +
                ", label='" + label + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String getFilterScope() {
        return filterScope;
    }

    public void setFilterScope(String filterScope) {
        this.filterScope = filterScope;
    }

    public Object getFilters() {
        return filters;
    }

    public void setFilters(Object filters) {
        this.filters = filters;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
