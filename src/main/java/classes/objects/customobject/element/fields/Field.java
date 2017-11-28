package classes.objects.customobject.element.fields;

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
}

