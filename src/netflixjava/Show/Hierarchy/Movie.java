package netflixjava.Show.Hierarchy;

import java.util.GregorianCalendar;
import java.util.List;
import netflixjava.Show.*;


public class Movie extends Show {
    private int duration; 

    public Movie(String title, Genre genre, GregorianCalendar releaseDate, Quality quality, List<Genre> genres, 
                 Language language, List<String> castNames, String synopsis, double averageRating, 
                 List<MaturityLevel> maturityLevels, int totalWatchTime, MaturityRating maturityRating, int duration) {
        super(title, genre, releaseDate, quality, genres, language, castNames, 0, synopsis, averageRating, maturityLevels, totalWatchTime, maturityRating);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public void setMaturityRating(MaturityRating maturityRating) {
        super.setMaturityRating(maturityRating); 
    }

    @Override
    public MaturityRating getMaturityRating() {
        return super.getMaturityRating(); 
    }

    @Override
    public void setTotalWatchTime(int totalWatchTime) {
        super.setTotalWatchTime(totalWatchTime); 
    }

    @Override
    public int getTotalWatchTime() {
        return super.getTotalWatchTime();
    }

    @Override
    public void setMaturityLevels(List<MaturityLevel> maturityLevels) {
        super.setMaturityLevels(maturityLevels); 
    }

    @Override
    public List<MaturityLevel> getMaturityLevels() {
        return super.getMaturityLevels(); 
    }

    @Override
    public void setAverageRating(double averageRating) {
        super.setAverageRating(averageRating); 
    }

    @Override
    public double getAverageRating() {
        return super.getAverageRating();
    }

    @Override
    public void setSynopsis(String synopsis) {
        super.setSynopsis(synopsis);
    }

    @Override
    public String getSynopsis() {
        return super.getSynopsis();
    }

    @Override
    public void setNumSeasons(int numSeasons) {
        super.setNumSeasons(numSeasons); 
    }

    @Override
    public int getNumSeasons() {
        return super.getNumSeasons(); 
    }

    @Override
    public void setCastNames(List<String> castNames) {
        super.setCastNames(castNames); 
    }

    @Override
    public List<String> getCastNames() {
        return super.getCastNames(); 
    }

    @Override
    public void setLanguage(Language language) {
        super.setLanguage(language);
    }

    @Override
    public Language getLanguage() {
        return super.getLanguage(); 
    }

    @Override
    public void setGenres(List<Genre> genres) {
        super.setGenres(genres); 
    }

    @Override
    public List<Genre> getGenres() {
        return super.getGenres(); 
    }

    @Override
    public void setQuality(Quality quality) {
        super.setQuality(quality); 
    }

    @Override
    public Quality getQuality() {
        return super.getQuality(); 
    }

    @Override
    public void setReleaseDate(GregorianCalendar releaseDate) {
        super.setReleaseDate(releaseDate); 
    }

    @Override
    public GregorianCalendar getReleaseDate() {
        return super.getReleaseDate(); 
    }

    @Override
    public void setGenre(Genre genre) {
        super.setGenre(genre); 
    }

    @Override
    public Genre getGenre() {
        return super.getGenre(); 
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title); 
    }

    @Override
    public String getTitle() {
        return super.getTitle(); 
    }

    
}


