package classes.objects.customobject;

import classes.objects.Metadata;
import classes.objects.customobject.actionoverride.ActionOverride;
import classes.objects.customobject.fields.Field;
import classes.objects.customobject.lsitview.ListView;
import classes.objects.customobject.searchlayout.SearchLayout;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 24.11.2017.
 */
public class CustomObject extends Metadata implements Differable {

    public final CustomObjectParsed fields;

    public CustomObject (String filePath) {
        super(filePath);
        this.fields = new Gson().fromJson(getObjectBody(), CustomObjectParsed.class);
    }

    private String getObjectBody() {
        return this.getJsonObject().get("CustomObject").toString();
    }

    @Override
    public Metadata diff(Metadata metadata) {
        return null;
    }

    /*
     * Data model
     */
    public final class CustomObjectParsed {
        public Object actionOverrides;
        public Boolean allowInChatterGroups;
        public String compactLayoutAssignment;
        public String deploymentStatus;
        public String description;

        public Boolean enableActivities;
        public Boolean enableBulkApi;
        public Boolean enableChangeDataCapture;
        public Boolean enableEnhancedLookup;
        public Boolean enableFeeds;
        public Boolean enableHistory;
        public Boolean enableReports;
        public Boolean enableSearch;
        public Boolean enableSharing;
        public Boolean enableStreamingApi;

        public Object fields;
        public String label;
        public Object listViews;
        public NameField nameField;
        public String pluralLabel;

        public Object searchLayouts;
        public String sharingModel;
        public Object validationRules;
        public String visibility;

        public List<ActionOverride> getActionOverride() {
            return this.getListFromField(this.actionOverrides);
        }

        public List<Field> getFields() {
            return this.getListFromField(this.fields);
        }

        public List<ListView> getListViews() {
            return this.getListFromField(this.listViews);
        }

        public List<SearchLayout> getSearchLayouts() {
            return this.getListFromField(this.searchLayouts);
        }

        public List<ValidationRule> getValidationRules() {
            return this.getListFromField(this.validationRules);
        }

        private <T> List<T> getListFromField(Object field) {
            final List<T> result = new ArrayList<>();
            if (field instanceof List) {
                result.addAll((List<T>) field);
            } else {
                result.add((T) field);
            }
            return result;
        }

        @Override
        public String toString() {
            return "{" +
                    "actionOverrides=" + actionOverrides +
                    ", allowInChatterGroups=" + allowInChatterGroups +
                    ", compactLayoutAssignment='" + compactLayoutAssignment + '\'' +
                    ", deploymentStatus='" + deploymentStatus + '\'' +
                    ", description='" + description + '\'' +
                    ", enableActivities=" + enableActivities +
                    ", enableBulkApi=" + enableBulkApi +
                    ", enableChangeDataCapture=" + enableChangeDataCapture +
                    ", enableEnhancedLookup=" + enableEnhancedLookup +
                    ", enableFeeds=" + enableFeeds +
                    ", enableHistory=" + enableHistory +
                    ", enableReports=" + enableReports +
                    ", enableSearch=" + enableSearch +
                    ", enableSharing=" + enableSharing +
                    ", enableStreamingApi=" + enableStreamingApi +
                    ", fields=" + fields +
                    ", label='" + label + '\'' +
                    ", listViews=" + listViews +
                    ", nameField=" + nameField +
                    ", pluralLabel='" + pluralLabel + '\'' +
                    ", searchLayouts=" + searchLayouts +
                    ", sharingModel='" + sharingModel + '\'' +
                    ", validationRules=" + validationRules +
                    ", visibility='" + visibility + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return fields.toString();
    }
}
