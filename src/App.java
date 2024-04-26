public class App {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Starry Cinema");
        cinema.init();
        
        cinema.registerUser("berliandavis@gmail.com", "DAVIS");
        User user = cinema.authenticateUser("berliandavis@gmail.com", "DAVIS");
        if (user != null) {
            System.out.println("User : " + user.getEmail());
            cinema.displayListStudio();
            cinema.displayStudioDetail(1);
            cinema.bookTicket(1);
            user.displayAllTickets();
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
