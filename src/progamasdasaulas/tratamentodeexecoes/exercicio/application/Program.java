package progamasdasaulas.tratamentodeexecoes.exercicio.application;

import progamasdasaulas.tratamentodeexecoes.exercicio.model.entities.Reservation;
import progamasdasaulas.tratamentodeexecoes.exercicio.model.exceptions.DomainException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Room: ");
            Integer roomNumber = sc.nextInt();
            sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.print("Check-In(dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.nextLine(), formatter);

            System.out.print("Check-Out(dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.nextLine(), formatter);

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);

            System.out.println();

            System.out.println("Enter data to update the reservation: ");

            System.out.print("Update check-In date (dd/MM/yyyy):");
            checkIn = LocalDate.parse(sc.nextLine(), formatter);

            System.out.print("Update check-Out date (dd/MM/yyyy):");
            checkOut = LocalDate.parse(sc.nextLine(), formatter);

            reservation.updateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reservation);
        }

        catch(DateTimeParseException e){
            System.out.println("Invalid date formatter.");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error.");
        }

        sc.close();
    }
}
