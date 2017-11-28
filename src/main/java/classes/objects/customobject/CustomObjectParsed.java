package classes.objects.customobject;

import classes.objects.customobject.element.actionoverride.ActionOverride;
import classes.objects.customobject.element.fields.Field;
import classes.objects.customobject.element.lsitview.ListView;
import classes.objects.customobject.element.namefield.NameField;
import classes.objects.customobject.element.searchlayout.SearchLayout;
import classes.objects.customobject.element.validationrule.ValidationRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28.11.2017.
 */ /*
 * Data model
 */
public final class CustomObjectParsed {

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

    public String label;
    public NameField nameField;
    public String pluralLabel;
    public String sharingModel;
    public String visibility;

    public List<Field> fields;
    public List<ActionOverride> actionOverrides;
    public List<ValidationRule> validationRules;
    public List<SearchLayout> searchLayouts;
    public List<ListView> listViews;

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
