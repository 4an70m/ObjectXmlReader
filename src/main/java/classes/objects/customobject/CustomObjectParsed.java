package classes.objects.customobject;

import classes.objects.customobject.element.JSONable;
import classes.objects.customobject.element.actionoverride.ActionOverride;
import classes.objects.customobject.element.fields.Field;
import classes.objects.customobject.element.lsitview.ListView;
import classes.objects.customobject.element.namefield.NameField;
import classes.objects.customobject.element.searchlayout.SearchLayout;
import classes.objects.customobject.element.validationrule.ValidationRule;

import java.util.List;

/**
 * Created by User on 28.11.2017.
 */ /*
 * Data model
 */
public final class CustomObjectParsed implements JSONable {

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

    public Boolean getAllowInChatterGroups() {
        return allowInChatterGroups;
    }

    public void setAllowInChatterGroups(Boolean allowInChatterGroups) {
        this.allowInChatterGroups = allowInChatterGroups;
    }

    public String getCompactLayoutAssignment() {
        return compactLayoutAssignment;
    }

    public void setCompactLayoutAssignment(String compactLayoutAssignment) {
        this.compactLayoutAssignment = compactLayoutAssignment;
    }

    public String getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnableActivities() {
        return enableActivities;
    }

    public void setEnableActivities(Boolean enableActivities) {
        this.enableActivities = enableActivities;
    }

    public Boolean getEnableBulkApi() {
        return enableBulkApi;
    }

    public void setEnableBulkApi(Boolean enableBulkApi) {
        this.enableBulkApi = enableBulkApi;
    }

    public Boolean getEnableChangeDataCapture() {
        return enableChangeDataCapture;
    }

    public void setEnableChangeDataCapture(Boolean enableChangeDataCapture) {
        this.enableChangeDataCapture = enableChangeDataCapture;
    }

    public Boolean getEnableEnhancedLookup() {
        return enableEnhancedLookup;
    }

    public void setEnableEnhancedLookup(Boolean enableEnhancedLookup) {
        this.enableEnhancedLookup = enableEnhancedLookup;
    }

    public Boolean getEnableFeeds() {
        return enableFeeds;
    }

    public void setEnableFeeds(Boolean enableFeeds) {
        this.enableFeeds = enableFeeds;
    }

    public Boolean getEnableHistory() {
        return enableHistory;
    }

    public void setEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
    }

    public Boolean getEnableReports() {
        return enableReports;
    }

    public void setEnableReports(Boolean enableReports) {
        this.enableReports = enableReports;
    }

    public Boolean getEnableSearch() {
        return enableSearch;
    }

    public void setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
    }

    public Boolean getEnableSharing() {
        return enableSharing;
    }

    public void setEnableSharing(Boolean enableSharing) {
        this.enableSharing = enableSharing;
    }

    public Boolean getEnableStreamingApi() {
        return enableStreamingApi;
    }

    public void setEnableStreamingApi(Boolean enableStreamingApi) {
        this.enableStreamingApi = enableStreamingApi;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public NameField getNameField() {
        return nameField;
    }

    public void setNameField(NameField nameField) {
        this.nameField = nameField;
    }

    public String getPluralLabel() {
        return pluralLabel;
    }

    public void setPluralLabel(String pluralLabel) {
        this.pluralLabel = pluralLabel;
    }

    public String getSharingModel() {
        return sharingModel;
    }

    public void setSharingModel(String sharingModel) {
        this.sharingModel = sharingModel;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<ActionOverride> getActionOverrides() {
        return actionOverrides;
    }

    public void setActionOverrides(List<ActionOverride> actionOverrides) {
        this.actionOverrides = actionOverrides;
    }

    public List<ValidationRule> getValidationRules() {
        return validationRules;
    }

    public void setValidationRules(List<ValidationRule> validationRules) {
        this.validationRules = validationRules;
    }
}
