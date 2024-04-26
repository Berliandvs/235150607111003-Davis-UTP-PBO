public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio(String type) {
        this.type = type;
        this.seats = new boolean[8][9];
    }

    public boolean isBooked(int row, int col) {
        // Implementasi is booked
        return false;
    }

    public String getStudioInfo() {
        // Implementasi get studio info
        return type;
    }

    public boolean reserve(int row, int col) {
        return true;
    }

    public void setSeats() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}