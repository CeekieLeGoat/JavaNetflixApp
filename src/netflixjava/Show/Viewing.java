package netflixjava.Show;

import java.util.GregorianCalendar;

public class Viewing {
    private GregorianCalendar date;
    private Show show;
    private Rate rating;

    // Constructor
    public Viewing(GregorianCalendar date, Show show, Rate rating) {
        this.date = date;
        this.show = show;
        this.rating = rating;
    }

    // Method to rate a show
    public void rate(Rate newRating) {
        this.rating = newRating;
        // Here you might want to update the show's average rating or perform other logic
    }

    // Getters and setters
    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Rate getRating() {
        return rating;
    }

    public void setRating(Rate rating) {
        this.rating = rating;
    }
    // Enum for Rating
    public enum Rate {
        ONE_STAR,
        TWO_STARS,
        THREE_STARS,
        FOUR_STARS,
        FIVE_STARS
    }
    // toString method
    @Override
    public String toString() {
        return "Viewing{" +
               "date=" + (date != null ? date.getTime() : "Not set") +
               ", show=" + show +
               ", rating=" + rating +
               '}';
    }
}
