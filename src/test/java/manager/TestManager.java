package manager;

import domain.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repo.Repo;
import manager.Manager;

import java.util.Comparator;

public class TestManager {


    Repo repo = new Repo();
    Manager manager = new Manager(repo);
    Ticket ticket1 = new Ticket(1, 2700, "KZN", "SVO", 78);
    Ticket ticket2 = new Ticket(2, 2300, "KZN", "SVO", 83);
    Ticket ticket3 = new Ticket(3, 3700, "SVO", "KZN", 92);
    Ticket ticket4 = new Ticket(4, 4500, "SVO", "KZN", 87);
    Ticket ticket5 = new Ticket(5, 2350, "KZN", "VKO", 94);
    Ticket ticket6 = new Ticket(6, 7600, "KZN", "SVO", 148);
    Ticket ticket7 = new Ticket(17, 6400, "KZN", "SVO", 132);

    @BeforeEach
    public void setup() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
    }

    @Test
    public void ShouldSortByTime(){
        Comparator<Ticket> comparator = new TicketComparator();

        Ticket[] expected = {ticket6, ticket7, ticket2, ticket1};
        Ticket[] actual = manager.findAll("KZN", "SVO", comparator);

        Assertions.assertArrayEquals(expected,actual);
    }



}
