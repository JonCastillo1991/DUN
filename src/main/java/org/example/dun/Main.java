package org.example.dun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String incidentTitle;
        String location;
        int severity;
        Incident incident;

        System.out.println("DEPARTMENT OF UNEXPLAINED NONSENSE INCIDENT REPORT");
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

        System.out.println("-------------------------------------------");
        incident.displayIncident();
    }
}
