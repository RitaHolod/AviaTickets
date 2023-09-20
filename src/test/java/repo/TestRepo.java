package repo;

import domain.Ticket;
import manager.Manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRepo {

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
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
    }
    @Test
    public void ShouldRemoveById(){

        repo.RemoveById(17);

        Ticket[] expected = {ticket1,ticket2,ticket3,ticket4,ticket5,ticket6};
        Ticket[] actual= repo.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
}
