package netflixjava.Show; 



public class MaturityLevel {
    private int minAge;
    private ContentRating rating; 

    


    // Constructor
    public MaturityLevel(int minAge, ContentRating rating) {
        this.minAge = minAge;
        this.rating = rating;
    }

    // Getters and setters
    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public ContentRating getRating() {
        return rating;
    }

    public void setRating(ContentRating rating) {
        this.rating = rating;
    }

    // toString method
    @Override
    public String toString() {
        return "MaturityLevel{" +
                "minAge=" + minAge +
                ", rating=" + rating +
                '}';
    }
}
