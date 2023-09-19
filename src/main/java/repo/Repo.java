package repo;

import domain.Ticket;

public class Repo {
    private Ticket[] tickets = new Ticket[0];

    public Ticket[] findAll() {
        return tickets;
    }

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i< tickets.length; i++){
            tmp[i]=ticket;
            tickets = tmp;
        }
    }
}
