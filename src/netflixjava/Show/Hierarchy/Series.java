
package netflixjava.Show.Hierarchy;

import java.util.GregorianCalendar;
import netflixjava.Show.*;

import java.util.ArrayList;
import java.util.List;

public class Series extends Show {

    private final List<Seasons> seasons;

    public Series(String title, Genre genre, GregorianCalendar releaseDate, Quality quality, List<Genre> genres, 
                  Language language, List<String> castNames, int numSeasons, String synopsis, double averageRating, 
                  List<MaturityLevel> maturityLevels, int totalWatchTime, MaturityRating maturityRating) {
        super(title, genre, releaseDate, quality, genres, language, castNames, numSeasons, synopsis, averageRating, maturityLevels, totalWatchTime, maturityRating);
        this.seasons = new ArrayList<>(); 
    }

    public void addSeason(Seasons season) {
        seasons.add(season);
    }
    public List<Seasons> getSeasons() {
        return this.seasons;
    }
    

}

