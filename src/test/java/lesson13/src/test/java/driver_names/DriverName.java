package driver_names;

public enum DriverName {
    CHROME ("chrome"),
    FIREFOX ("firefox"),
    EDGE ("edge");

    String name;

    DriverName(String name) {
        this.name = name;
    }
}
