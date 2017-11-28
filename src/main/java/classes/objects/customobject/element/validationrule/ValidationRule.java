package classes.objects.customobject.element.validationrule;

/**
 * Created by 4an70m on 28.11.2017.
 */
public class ValidationRule {

    public String fullName;
    public Boolean active;
    public String errorConditionFormula;
    public String errorDisplayField;
    public String errorMessage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidationRule that = (ValidationRule) o;

        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (errorConditionFormula != null ? !errorConditionFormula.equals(that.errorConditionFormula) : that.errorConditionFormula != null)
            return false;
        if (errorDisplayField != null ? !errorDisplayField.equals(that.errorDisplayField) : that.errorDisplayField != null)
            return false;
        return errorMessage != null ? errorMessage.equals(that.errorMessage) : that.errorMessage == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (errorConditionFormula != null ? errorConditionFormula.hashCode() : 0);
        result = 31 * result + (errorDisplayField != null ? errorDisplayField.hashCode() : 0);
        result = 31 * result + (errorMessage != null ? errorMessage.hashCode() : 0);
        return result;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getErrorConditionFormula() {
        return errorConditionFormula;
    }

    public void setErrorConditionFormula(String errorConditionFormula) {
        this.errorConditionFormula = errorConditionFormula;
    }

    public String getErrorDisplayField() {
        return errorDisplayField;
    }

    public void setErrorDisplayField(String errorDisplayField) {
        this.errorDisplayField = errorDisplayField;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
