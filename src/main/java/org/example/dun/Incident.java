package org.example.dun;

public class Incident {
    private String incidentTitle;
    private String location;
    private int severity;
    private String status;

    public Incident(String incidentTitle, String location, int severity){
        this.incidentTitle = incidentTitle;
        this.location = location;
        this.severity = severity;
        this.status = "OPEN";
    }

    public void displayIncident(){
        System.out.println("INCIDENT REGISTRATION");
        System.out.println("INCIDENT TITLE: " + incidentTitle);
        System.out.println("LOCATION: " + location);
        System.out.println("SEVERITY: " + severity);
        System.out.println("STATUS: " + status);

    }

}
