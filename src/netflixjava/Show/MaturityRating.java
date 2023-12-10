package netflixjava.Show; 

import java.util.List;


public class MaturityRating {
    private List<String> ratingReasons; 

    // Constructor
    public MaturityRating(List<String> ratingReasons) {
        this.ratingReasons = ratingReasons;
    }

    // Getter
    public List<String> getRatingReasons() {
        return ratingReasons;
    }

    // Setter
    public void setRatingReasons(List<String> ratingReasons) {
        this.ratingReasons = ratingReasons;
    }

    // toString method
    @Override
    public String toString() {
        return "MaturityRating{" +
                "ratingReasons=" + ratingReasons +
                '}';
    }
}
