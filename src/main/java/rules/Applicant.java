package rules;

public class Applicant {
    private int age;
    private boolean isValid;
    public Applicant(int age) {
        this.age = age;
        this.isValid = true;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public int getAge() {
        return age;
    }
}
