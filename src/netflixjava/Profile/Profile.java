package netflixjava.Profile; 

import java.util.List;
import netflixjava.Show.*;



public class Profile {
    private String name;
    private MaturityLevel level; 
    private String email;
    private boolean toNotify;
    private Playback playback; 
    private boolean subtitles;
    private List<Show> favorites; 
    private List<Show> blocked; 
    private Language language; 

    // Constructor
     public Profile(String name, MaturityLevel level, String email, boolean toNotify,Language language,
                   Playback playback, boolean subtitles) {
        this.name = name;
        this.level = level;
        this.email = email;
        this.toNotify = toNotify;
        this.language = language;
        this.playback = playback;
        this.subtitles = subtitles;
  
    }
    public Profile(String name, MaturityLevel level, String email, boolean toNotify,Language language,
                   Playback playback, boolean subtitles, List<Show> favorites,
                   List<Show> blocked) {
        this.name = name;
        this.level = level;
        this.email = email;
        this.toNotify = toNotify;
        this.language = language;
        this.playback = playback;
        this.subtitles = subtitles;
        this.favorites = favorites;
        this.blocked = blocked;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaturityLevel getLevel() {
        return level;
    }

    public void setLevel(MaturityLevel level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isToNotify() {
        return toNotify;
    }

    public void setToNotify(boolean toNotify) {
        this.toNotify = toNotify;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Playback getPlayback() {
        return playback;
    }

    public void setPlayback(Playback playback) {
        this.playback = playback;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public List<Show> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Show> favorites) {
        this.favorites = favorites;
    }

    public List<Show> getBlocked() {
        return blocked;
    }

    public void setBlocked(List<Show> blocked) {
        this.blocked = blocked;
    }


    public void modifyMaturity(MaturityLevel newLevel) {
        this.level = newLevel;
    }

    public void addFavorite(Show show) {
        if (!favorites.contains(show)) {
            favorites.add(show);
        }
    }

    public void blockShow(Show show) {
        if (!blocked.contains(show)) {
            blocked.add(show);
        }
    }

    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", level=" + level + ", email=" + email + ", toNotify=" + toNotify + ", language=" + language + ", playback=" + playback + ", subtitles=" + subtitles + ", favorites=" + favorites + ", blocked=" + blocked + '}';
    }


    
}
