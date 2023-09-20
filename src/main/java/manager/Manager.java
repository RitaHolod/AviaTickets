package manager;

import repo.Repo;
import domain.Ticket;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Manager {
    private Repo ticketRepo;
    Ticket[] tickets = new Ticket[0];

    public Manager(Repo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public void add(Ticket ticket) {
        ticketRepo.add(ticket);
    }

    public Ticket[] findAll(String departureIATA, String arrivalIATA) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : ticketRepo.findAll()) {
            if (matches(ticket, departureIATA, arrivalIATA)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }



    private boolean matches(Ticket ticket, String departureIATA, String arrivalIATA) {
        if (ticket.getDepartureIATA().contains(departureIATA) & ticket.getArrivalIATA().contains(arrivalIATA)) {
                return true;
            }

        return false;

    }
}
