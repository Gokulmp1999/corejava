package corejava;

import java.util.ArrayList;
import java.util.List;

public final class EmployeImutable {
    private final String name;
    private final String place;
    private final List<String> education;

    public List<String> getEducation() {
        return new ArrayList<>(education);
    }

    public EmployeImutable(String name, String place, List<String> education) {
        this.name = name;
        this.place = place;
        this.education = new ArrayList<>(education);
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }
}
