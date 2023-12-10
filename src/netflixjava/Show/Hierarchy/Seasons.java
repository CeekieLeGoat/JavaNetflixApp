
package netflixjava.Show.Hierarchy;

import java.util.List;


public class Seasons {
    private int seasonNumber;
    private List<Episode> episodes;

    public Seasons(int seasonNumber, List<Episode> episodes) {
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
    @Override
    public String toString() {
        return "Seasons{" + "seasonNumber=" + seasonNumber + ", episodes=" + episodes + '}';
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }


    
}

