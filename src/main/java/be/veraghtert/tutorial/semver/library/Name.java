package be.veraghtert.tutorial.semver.library;

public class Name {

    private final String value;

    public Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return "the " + value;
    }
}
