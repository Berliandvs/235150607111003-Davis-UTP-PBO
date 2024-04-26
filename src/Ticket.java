public class Ticket {
    private Movie movie;
    private int studioNumber;
    private double price;
    private String seat;

    public Ticket(Movie movie, int studioNumber, double price) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.price = price;
    }

    public double getTicketPrice() {
        return price;
    }

	public Object getMovie() {
		return movie;
	}

	public int getStudioNumber() {
		return studioNumber;
	}
}
