package netflixjava.Show; 


import java.util.GregorianCalendar;
import java.util.List;


public class Show {
    private String title;
    private Genre genre; 
    private GregorianCalendar releaseDate; 
    private Quality quality; 
    private List<Genre> genres; 
    private Language language; 
    private List<String> castNames; 
    private int numSeasons; 
    private String synopsis;
    private double averageRating;
    private List<MaturityLevel> maturityLevels; 
    private int totalWatchTime;
    private MaturityRating maturityRating; 

    // Constructor
    public Show(String title, Genre genre, GregorianCalendar releaseDate, Quality quality, List<Genre> genres, 
                Language language, List<String> castNames, int numSeasons, String synopsis, double averageRating, 
                List<MaturityLevel> maturityLevels, int totalWatchTime, MaturityRating maturityRating) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.quality = quality;
        this.genres = genres;
        this.language = language;
        this.castNames = castNames;
        this.numSeasons = numSeasons;
        this.synopsis = synopsis;
        this.averageRating = averageRating;
        this.maturityLevels = maturityLevels;
        this.totalWatchTime = totalWatchTime;
        this.maturityRating = maturityRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(GregorianCalendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<String> getCastNames() {
        return castNames;
    }

    public void setCastNames(List<String> castNames) {
        this.castNames = castNames;
    }

    public int getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(int numSeasons) {
        this.numSeasons = numSeasons;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public List<MaturityLevel> getMaturityLevels() {
        return maturityLevels;
    }

    public void setMaturityLevels(List<MaturityLevel> maturityLevels) {
        this.maturityLevels = maturityLevels;
    }

    public int getTotalWatchTime() {
        return totalWatchTime;
    }

    public void setTotalWatchTime(int totalWatchTime) {
        this.totalWatchTime = totalWatchTime;
    }

    public MaturityRating getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(MaturityRating maturityRating) {
        this.maturityRating = maturityRating;
    }


    // toString method
    @Override
    public String toString() {
        return "Show{" +
               "title='" + title + '\'' +
               ", genre=" + genre +
               ", releaseDate=" + (releaseDate != null ? releaseDate.getTime() : "Not set") +
               ", quality=" + quality +
               ", genres=" + genres +
               ", language=" + language +
               ", castNames=" + castNames +
               ", numSeasons=" + numSeasons +
               ", synopsis='" + synopsis + '\'' +
               ", averageRating=" + averageRating +
               ", maturityLevels=" + maturityLevels +
               ", totalWatchTime=" + totalWatchTime +
               ", maturityRating=" + maturityRating +
               '}';
    }




}