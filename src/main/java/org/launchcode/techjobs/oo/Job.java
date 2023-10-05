package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //TODO: COMPLETE
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //TODO: COMPLETE
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //TODO: COMPLETE
    @Override
    public String toString() {
        if (getName() == null &&
                getEmployer() == null &&
                getLocation() == null &&
                getPositionType() == null &&
                getCoreCompetency() == null) {
            return "OOPS! This job does not seem to exist.";
        }

        String idStr = "ID: " + getId();
        String nameStr = "Name: " + (getName() != null && !getName().isEmpty() ? getName() : "Data not available");
        String employerStr = "Employer: " + (getEmployer() != null && !getEmployer().getValue().isEmpty() ? getEmployer().getValue() : "Data not available");
        String locationStr = "Location: " + (getLocation() != null && !getLocation().getValue().isEmpty() ? getLocation().getValue() : "Data not available");
        String positionTypeStr = "Position Type: " + (getPositionType() != null && !getPositionType().getValue().isEmpty() ? getPositionType().getValue() : "Data not available");
        String coreCompetencyStr = "Core Competency: " + (getCoreCompetency() != null && !getCoreCompetency().getValue().isEmpty() ? getCoreCompetency().getValue() : "Data not available");

        //TODO: ALTERNATIVELY COULD USE System.lineSeparator(), CURRENTLY USING "\n" TO PASS TESTS
        return System.lineSeparator() + idStr +
                System.lineSeparator() + nameStr +
                System.lineSeparator() + employerStr +
                System.lineSeparator() + locationStr +
                System.lineSeparator() + positionTypeStr +
                System.lineSeparator() + coreCompetencyStr +
                System.lineSeparator();
    }

    //TODO: COMPLETE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
