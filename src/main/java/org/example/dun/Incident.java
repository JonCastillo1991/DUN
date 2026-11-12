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

    public String getIncidentTitle(){
        return this.incidentTitle;
    }

    public String getLocation(){return this.location;}

    public void setIncidentTitle(String incidentTitle) {
        if(incidentTitle != null && !incidentTitle.isBlank()) {
            this.incidentTitle = incidentTitle;
        }
        else
            System.out.println("INVALID TITLE");
    }

    public void setLocation(String location){
        if(location != null && !location.isBlank()) {
            this.location = location;
        }
        else
            System.out.println("INVALID LOCATION");
    }

    public int getSeverity(){
        return this.severity;
    }

    public void setSeverity(int severity){
        if(severity > 0 && severity < 6)
            this.severity = severity;
        else
            System.out.println("INVALID SEVERITY LEVEL");
    }

}
