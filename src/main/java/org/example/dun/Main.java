package org.example.dun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String incidentTitle;
        String location;
        int severity;
        Incident incident;
        List<Incident> incidentList = new ArrayList<Incident>();

        incidentList.add(new Incident(
                "Possessed Toaster",
                "Monterrey, Mexico",
                3
        ));

        incidentList.add(new Incident(
                "Sentient Coffee Machine",
                "San Antonio, Texas",
                4
        ));

        incidentList.add(new Incident(
                "Haunted Printer",
                "Chicago, Illinois",
                2
        ));

        incidentList.add(new Incident(
                "Microwave Communicating With Aliens",
                "Roswell, New Mexico",
                5
        ));

        incidentList.add(new Incident(
                "Office Chair Moving By Itself",
                "Austin, Texas",
                1
        ));

        incidentList.add(new Incident(
                "Refrigerator Demanding Human Sacrifices",
                "Detroit, Michigan",
                5
        ));

        incidentList.add(new Incident(
                "Intern Trapped Inside Excel Spreadsheet",
                "Seattle, Washington",
                3
        ));

        incidentList.add(new Incident(
                "Photocopier Printing Classified Documents",
                "Washington, D.C.",
                4
        ));

        System.out.println("DEPARTMENT OF UNEXPLAINED NONSENSE INCIDENT REPORT");
        int aux = 0;
        while(aux != 7){
            System.out.println("MAIN MENU:");
            System.out.println("1) ADD NEW INCIDENT");
            System.out.println("2) DISPLAY ALL REGISTERED INCIDENTS");
            System.out.println("3) VIEW INCIDENT");
            System.out.println("4) EDIT INCIDENT SEVERITY");
            System.out.println("5) EDIT INCIDENT LOCATION");
            System.out.println("6) EDIT INCIDENT TITLE");
            System.out.println("7) EXIT");
            System.out.print("CHOICE: ");
            aux = scanner.nextInt();
            scanner.nextLine();
            switch(aux){
                case 1:
                    System.out.print("INCIDENT TITLE: ");
                    incidentTitle = scanner.nextLine();
                    System.out.print("LOCATION: ");
                    location = scanner.nextLine();
                    System.out.print("SEVERITY(1 - 5): ");
                    severity = scanner.nextInt();
                    boolean flag = false;
                    do {
                        if (severity >= 1 && severity <= 5 ){
                            flag = true;
                        }
                        else{
                            System.out.println("INVALID RESPONSE, PLEASE TRY AGAIN");
                            System.out.print("SEVERITY(1 - 5): ");
                            severity = scanner.nextInt();
                        }
                    } while (!flag);

                    incident = new Incident(incidentTitle, location, severity);
                    incidentList.add(incident);
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    if(!incidentList.isEmpty()) {
                        System.out.println("TOTAL INCIDENTS: " + incidentList.size());
                        for (Incident value : incidentList) {
                            value.displayIncident();
                        }
                    }
                    else{
                        System.out.println("NO ACTIVE INCIDENTS FOUND.");
                    }
                    break;
                case 3:
                    if (!incidentList.isEmpty()) {
                        System.out.println("SELECT WHICH INCIDENT TO VIEW");
                        int i = 0;
                        for(Incident value: incidentList) {
                            System.out.println(i + ") " + value.getIncidentTitle());
                            i++;
                        }
                        int choice = 0;
                        choice = scanner.nextInt();
                        if(choice < incidentList.size() && choice >= 0){
                            Incident incidentAux = incidentList.get(choice);
                            incidentAux.displayIncident();
                        }
                        else{
                            System.out.println("INVALID CHOICE");
                        }

                    }
                    else{
                        System.out.println("THERE ARE NO INCIDENTS REPORTED");
                    }
                    break;
                case 4:
                    if (!incidentList.isEmpty()) {
                        System.out.println("SELECT WHICH INCIDENT TO EDIT SEVERITY");
                        int i = 0;
                        for (Incident value : incidentList) {
                            System.out.println(i + ") " + value.getIncidentTitle() + " SEVERITY: " + value.getSeverity());
                            i++;
                        }
                        int choice = 0;
                        choice = scanner.nextInt();
                        if (choice < incidentList.size() && choice >= 0) {
                            Incident incidentToModify = incidentList.get(choice);
                            incidentToModify.displayIncident();
                            System.out.println("PLEASE ENTER NEW LEVEL OF SEVERITY: ");
                            incidentToModify.setSeverity(scanner.nextInt());
                            System.out.println("CURRENT SEVERITY: " + incidentToModify.getSeverity());
                        }
                       else
                           System.out.println("INVALID RESPONSE");
                    }
                    else
                        System.out.println("THERE ARE NO REGISTERED INCIDENTS");
                    break;
                case 5:
                    if (!incidentList.isEmpty()) {
                        System.out.println("SELECT WHICH INCIDENT TO EDIT LOCATION");
                        int i = 0;
                        for (Incident value : incidentList) {
                            System.out.println(i + ") " + value.getIncidentTitle() + " LOCATION:" + value.getLocation());
                            i++;
                        }
                        int choice = 0;
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        if (choice < incidentList.size() && choice >= 0) {
                            Incident incidentToModify = incidentList.get(choice);
                            incidentToModify.displayIncident();
                            System.out.println("PLEASE ENTER NEW LOCATION: ");
                            incidentToModify.setLocation(scanner.nextLine());
                            System.out.println("CURRENT LOCATION: " + incidentToModify.getLocation());
                        }
                        else
                            System.out.println("INVALID RESPONSE");
                    }
                    else
                        System.out.println("THERE ARE NO REGISTERED INCIDENTS");
                    break;
                case 6:
                    if (!incidentList.isEmpty()) {
                        System.out.println("SELECT WHICH INCIDENT TO EDIT TITLE");
                        int i = 0;
                        for (Incident value : incidentList) {
                            System.out.println(i + ") " + value.getIncidentTitle());
                            i++;
                        }
                        int choice = 0;
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();
                        if (choice < incidentList.size() && choice >= 0) {
                            Incident incidentToModify = incidentList.get(choice);
                            incidentToModify.displayIncident();
                            System.out.println("PLEASE ENTER NEW TITLE: ");
                            incidentToModify.setIncidentTitle(scanner.nextLine());
                            System.out.println("CURRENT TITLE: " + incidentToModify.getIncidentTitle());
                        }
                        else
                            System.out.println("INVALID RESPONSE");
                    }
                    else
                        System.out.println("THERE ARE NO REGISTERED INCIDENTS");
                    break;
                case 7:
                    aux = 7;
                    break;
                default:
                    System.out.println("PLEASE SELECT A VALID OPTION");
                    break;


            }
        }

    }
}
