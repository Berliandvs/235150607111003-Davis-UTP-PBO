import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private List<Ticket> ticketLists;
    private int MaxTicket;

    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = 0.0;
        this.ticketLists = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket) {
        ticketLists.add(ticket);
        return true;
    }

    public void displayAllTickets() {
        for (Ticket ticket : ticketLists) {
            System.out.println("Ticket: " + ((Object) ticket.getMovie()) + " (Studio " + ticket.getStudioNumber() + ")");
        }
    }

    public boolean isMatch(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getEmail() {
        return email;
    }
}