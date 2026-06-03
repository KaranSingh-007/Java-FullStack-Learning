class Reservation {

    private int availableSeats;

    public Reservation(int seats) {
        availableSeats = seats;
    }

    // synchronized method
    public synchronized void bookTicket(String passengerName, int seats) {

        System.out.println("\n" + passengerName +
                " is trying to book " + seats + " seat(s)");

        if (availableSeats >= seats) {

            System.out.println("Booking successful for "
                    + passengerName);

            availableSeats -= seats;

            System.out.println("Seats booked : " + seats);

            System.out.println("Remaining seats : "
                    + availableSeats);
        } else {

            System.out.println("Booking failed for "
                    + passengerName);

            System.out.println("Only "
                    + availableSeats
                    + " seat(s) available");
        }
    }
}

class Passenger extends Thread {

    Reservation reservation;
    String passengerName;
    int seats;

    public Passenger(
            Reservation reservation,
            String passengerName,
            int seats) {

        this.reservation = reservation;
        this.passengerName = passengerName;
        this.seats = seats;
    }

    @Override
    public void run() {

        reservation.bookTicket(
                passengerName,
                seats
        );
    }
}

public class Multithreads {

    public static void main(String[] args) {

        Reservation reservation =
                new Reservation(10);

        Passenger p1 =
                new Passenger(
                        reservation,
                        "Sachin",
                        4);

        Passenger p2 =
                new Passenger(
                        reservation,
                        "Rahul",
                        3);

        Passenger p3 =
                new Passenger(
                        reservation,
                        "Amit",
                        5);

        p1.start();
        p2.start();
        p3.start();
    }
}