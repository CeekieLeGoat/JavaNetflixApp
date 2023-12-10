
package netflixjava.Show.Hierarchy;


public class Episode {
    private int episodeNumber;
    private String title;
    private int duration; 


    public Episode(int episodeNumber, String title, int duration) {
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.duration = duration;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    
    
}