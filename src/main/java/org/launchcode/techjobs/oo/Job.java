package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String value;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

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

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }
    //
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    //
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    //
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    //
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        String emptyField = "";

        String jobString = "\nID: " + id + "\n";

            if(name == emptyField) {
                jobString += "Name: Data not available" + "\n";
            } else {
                jobString += "Name: " + name + "\n";
            }

            if(employer.value == emptyField) {
                jobString += "Employer: Data not available" + "\n";
            } else {
                jobString += "Employer: " + employer + "\n";
            }

            if(location.value == emptyField) {
                jobString += "Location: Data not available" + "\n";
            } else {
                jobString += "Location: " + location + "\n";
            }

            if(positionType.value == emptyField) {
                jobString += "Position Type: Data not available" + "\n";
            } else {
                jobString += "Position Type: " + positionType + "\n";
            }

            if(coreCompetency.value == emptyField) {
                jobString += "Core Competency: Data not available" + "\n";
            } else {
                jobString += "Core Competency: " + coreCompetency + "\n";
            }

            return jobString;
    }

}
