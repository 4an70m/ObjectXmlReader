package classes.objects.customobject.element.fields;

import java.util.List;

/**
 * Created by User on 27.11.2017.
 */
public class Field extends Object{

    public String fullName;
    public String label;
    public String type;
    public String formula;
    public String inlineHelpText;
    public String description;
    public String relationshipName;
    public String deleteConstraint;
    public String relationshipLabel;
    public String formulaTreatBlanksAs;
    public String referenceTo;
    public String visibleLines;
    public Boolean required;
    public Boolean trackTrending;
    public Boolean unique;
    public Boolean externalId;
    public Boolean trackHistory;
    public ValueSet valueSet;
    public Object lookupFilter;
    public Integer scale;
    public Integer length;
    public Integer precision;
    public Boolean deprecated;
    public Boolean trackFeedHistory;

    public Field() {
    }

    /*
     * Helper methods
     */
    @Override
    public String toString() {
        return "Field{" +
                "fullName='" + fullName + '\'' +
                ", trackTrending=" + trackTrending +
                ", unique=" + unique +
                ", externalId=" + externalId +
                ", formula='" + formula + '\'' +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +
                ", required=" + required +
                ", trackHistory=" + trackHistory +
                ", inlineHelpText='" + inlineHelpText + '\'' +
                ", description='" + description + '\'' +
                ", precision='" + precision + '\'' +
                ", scale='" + scale + '\'' +
                ", relationshipName='" + relationshipName + '\'' +
                ", deleteConstraint='" + deleteConstraint + '\'' +
                ", relationshipLabel='" + relationshipLabel + '\'' +
                ", referenceTo='" + referenceTo + '\'' +
                ", valueSet=" + valueSet +
                ", lookupFilter=" + lookupFilter +
                ", visibleLines='" + visibleLines + '\'' +
                ", length=" + length +
                ", formulaTreatBlanksAs='" + formulaTreatBlanksAs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        if (fullName != null ? !fullName.equals(field.fullName) : field.fullName != null) return false;
        if (label != null ? !label.equals(field.label) : field.label != null) return false;
        if (type != null ? !type.equals(field.type) : field.type != null) return false;
        if (formula != null ? !formula.equals(field.formula) : field.formula != null) return false;
        if (inlineHelpText != null ? !inlineHelpText.equals(field.inlineHelpText) : field.inlineHelpText != null)
            return false;
        if (description != null ? !description.equals(field.description) : field.description != null) return false;
        if (relationshipName != null ? !relationshipName.equals(field.relationshipName) : field.relationshipName != null)
            return false;
        if (deleteConstraint != null ? !deleteConstraint.equals(field.deleteConstraint) : field.deleteConstraint != null)
            return false;
        if (relationshipLabel != null ? !relationshipLabel.equals(field.relationshipLabel) : field.relationshipLabel != null)
            return false;
        if (formulaTreatBlanksAs != null ? !formulaTreatBlanksAs.equals(field.formulaTreatBlanksAs) : field.formulaTreatBlanksAs != null)
            return false;
        if (referenceTo != null ? !referenceTo.equals(field.referenceTo) : field.referenceTo != null) return false;
        if (visibleLines != null ? !visibleLines.equals(field.visibleLines) : field.visibleLines != null) return false;
        if (required != null ? !required.equals(field.required) : field.required != null) return false;
        if (trackTrending != null ? !trackTrending.equals(field.trackTrending) : field.trackTrending != null)
            return false;
        if (unique != null ? !unique.equals(field.unique) : field.unique != null) return false;
        if (externalId != null ? !externalId.equals(field.externalId) : field.externalId != null) return false;
        if (trackHistory != null ? !trackHistory.equals(field.trackHistory) : field.trackHistory != null) return false;
        if (valueSet != null ? !valueSet.equals(field.valueSet) : field.valueSet != null) return false;
        if (lookupFilter != null ? !lookupFilter.equals(field.lookupFilter) : field.lookupFilter != null) return false;
        if (scale != null ? !scale.equals(field.scale) : field.scale != null) return false;
        if (length != null ? !length.equals(field.length) : field.length != null) return false;
        if (precision != null ? !precision.equals(field.precision) : field.precision != null) return false;
        if (deprecated != null ? !deprecated.equals(field.deprecated) : field.deprecated != null) return false;
        return trackFeedHistory != null ? trackFeedHistory.equals(field.trackFeedHistory) : field.trackFeedHistory == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (formula != null ? formula.hashCode() : 0);
        result = 31 * result + (inlineHelpText != null ? inlineHelpText.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (relationshipName != null ? relationshipName.hashCode() : 0);
        result = 31 * result + (deleteConstraint != null ? deleteConstraint.hashCode() : 0);
        result = 31 * result + (relationshipLabel != null ? relationshipLabel.hashCode() : 0);
        result = 31 * result + (formulaTreatBlanksAs != null ? formulaTreatBlanksAs.hashCode() : 0);
        result = 31 * result + (referenceTo != null ? referenceTo.hashCode() : 0);
        result = 31 * result + (visibleLines != null ? visibleLines.hashCode() : 0);
        result = 31 * result + (required != null ? required.hashCode() : 0);
        result = 31 * result + (trackTrending != null ? trackTrending.hashCode() : 0);
        result = 31 * result + (unique != null ? unique.hashCode() : 0);
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        result = 31 * result + (trackHistory != null ? trackHistory.hashCode() : 0);
        result = 31 * result + (valueSet != null ? valueSet.hashCode() : 0);
        result = 31 * result + (lookupFilter != null ? lookupFilter.hashCode() : 0);
        result = 31 * result + (scale != null ? scale.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (precision != null ? precision.hashCode() : 0);
        result = 31 * result + (deprecated != null ? deprecated.hashCode() : 0);
        result = 31 * result + (trackFeedHistory != null ? trackFeedHistory.hashCode() : 0);
        return result;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getInlineHelpText() {
        return inlineHelpText;
    }

    public void setInlineHelpText(String inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    public String getDeleteConstraint() {
        return deleteConstraint;
    }

    public void setDeleteConstraint(String deleteConstraint) {
        this.deleteConstraint = deleteConstraint;
    }

    public String getRelationshipLabel() {
        return relationshipLabel;
    }

    public void setRelationshipLabel(String relationshipLabel) {
        this.relationshipLabel = relationshipLabel;
    }

    public String getFormulaTreatBlanksAs() {
        return formulaTreatBlanksAs;
    }

    public void setFormulaTreatBlanksAs(String formulaTreatBlanksAs) {
        this.formulaTreatBlanksAs = formulaTreatBlanksAs;
    }

    public String getReferenceTo() {
        return referenceTo;
    }

    public void setReferenceTo(String referenceTo) {
        this.referenceTo = referenceTo;
    }

    public String getVisibleLines() {
        return visibleLines;
    }

    public void setVisibleLines(String visibleLines) {
        this.visibleLines = visibleLines;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getTrackTrending() {
        return trackTrending;
    }

    public void setTrackTrending(Boolean trackTrending) {
        this.trackTrending = trackTrending;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Boolean getExternalId() {
        return externalId;
    }

    public void setExternalId(Boolean externalId) {
        this.externalId = externalId;
    }

    public Boolean getTrackHistory() {
        return trackHistory;
    }

    public void setTrackHistory(Boolean trackHistory) {
        this.trackHistory = trackHistory;
    }

    public ValueSet getValueSet() {
        return valueSet;
    }

    public void setValueSet(ValueSet valueSet) {
        this.valueSet = valueSet;
    }

    public Object getLookupFilter() {
        return lookupFilter;
    }

    public void setLookupFilter(Object lookupFilter) {
        this.lookupFilter = lookupFilter;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }
}

