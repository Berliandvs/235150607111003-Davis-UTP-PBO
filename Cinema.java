import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {
    private String name;
    private List<User> listUsers;
    private List<Studio> listStudio;
    private int studioCapacity;

    public Cinema(String name) {
        this.name = name;
        this.listUsers = new ArrayList<>();
        this.listStudio = new ArrayList<>();
        this.studioCapacity = 0;
    }

    public boolean registerUser(String email, String password) {
        User user = new User(email, password, "Berlian Davis");
        listUsers.add(user);
        return true;
    }

    public User authenticateUser(String email, String password) {
        for (User user : listUsers) {
            if (user.isMatch(email, password)) {
                return user;
            }
        }
        return null;
    }

    public void displayListStudio() {
        for (int i = 0; i < listStudio.size(); i++) {
            System.out.println("Studio " + (i + 1) + ": " + listStudio.get(i).getStudioInfo());
        }
    }

    public void displayStudioDetail(int studioNumber) {
        Studio studio = listStudio.get(studioNumber - 1);
        System.out.println("Studio " + studioNumber + ": " + studio.getStudioInfo());
        Movie movie = studio.getMovie();
        System.out.println("Movie: " + movie.getTitle() + " (" + movie.getRating() + ")");
        System.out.println("Genres: " + Arrays.toString(movie.getGenres()));
    }

    public boolean addStudioWithMovies(String studioType, String movieTitle, double rating, String[] genres) {
        Movie movie = new Movie(movieTitle, rating, genres);
        Studio studio = new Studio(studioType);
        studio.setMovie(movie);
        listStudio.add(studio);
        return true;
    }

    public boolean bookTicket(int studioNumber) {
        Studio studio = listStudio.get(studioNumber - 1);
        Movie movie = studio.getMovie();
        Ticket ticket = new Ticket(movie, studioNumber, 10000.0);
        User user = authenticateUser("berliandavis@gmail.com", "DAVIS");
        if (user!= null) {
            user.addTicket(ticket);
            return true;
        }
        return false;
    }

    public void init() {
        for (int i = 0; i < 10; i++) {
            addStudioWithMovies("Imax", "Inception", 9.5, new String[]{"Action", "Thriller", "Science Fiction"});
        }
}
}