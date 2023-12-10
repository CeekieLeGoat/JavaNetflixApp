
package netflixjava;


import java.util.Arrays;
import java.util.GregorianCalendar;
import netflixjava.Profile.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import netflixjava.Show.*;
import netflixjava.Show.Hierarchy.*;


public class NetflixJava {
    private List<Show> shows;
    private List<Account> customers;
    private List<Request> requests;
    private List<MaturityLevel> maturity;
    private Map<String, Plan> plansByCountry;
    private Map<String, MaturityRating> maturityByRegion;

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public List<Account> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Account> customers) {
        this.customers = customers;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public List<MaturityLevel> getMaturity() {
        return maturity;
    }

    public void setMaturity(List<MaturityLevel> maturity) {
        this.maturity = maturity;
    }

    public Map<String, Plan> getPlansByCountry() {
        return plansByCountry;
    }

    public void setPlansByCountry(Map<String, Plan> plansByCountry) {
        this.plansByCountry = plansByCountry;
    }

    public Map<String, MaturityRating> getMaturityByRegion() {
        return maturityByRegion;
    }

    public void setMaturityByRegion(Map<String, MaturityRating> maturityByRegion) {
        this.maturityByRegion = maturityByRegion;
    }

    public NetflixJava(List<Show> shows, List<Account> customers, List<Request> requests,
                       Map<String, Plan> plansByCountry, Map<String, MaturityRating> maturityByRegion) {
        this.shows = shows;
        this.customers = customers;
        this.requests = requests;
        this.plansByCountry = plansByCountry;
        this.maturityByRegion = maturityByRegion;
    }
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (option!=10) { //option 10 means that it doesnt exist
System.out.println("************************************************");
System.out.println("*                                              *");
System.out.println("*    __   __  _______  __   __  _______  __    *");
System.out.println("*   |  | |  ||   _   ||  | |  ||       ||  |   *");
System.out.println("*   |  |_|  ||  |_|  ||  | |  ||    ___||  |   *");
System.out.println("*   |       ||       ||  |_|  ||   |___ |  |   *");
System.out.println("*   |_     _||       ||       ||    ___||__|   *");
System.out.println("*     |   |  |   _   ||       ||   |___  __    *");
System.out.println("*     |___|  |__| |__||_______||_______||__|   *");
System.out.println("*                                              *");
System.out.println("************************************************");
System.out.println(" Welcome to Netflix! The powerhouse of films and series!");
System.out.println(" ------------------------------------------------------");
System.out.println("  Enter 1 to register.");
System.out.println("  Enter 2 to login.");
System.out.println("************************************************");
            int option = sc.nextInt(); 
                switch (option) {
                case 1: //Register
            System.out.println("Enter your email");
            System.out.println("Enter a password");
            break;
                case 2://login
            System.out.println("Enter your email");
            System.out.println("Enter a password");
              //If cant find exception and ask if they want to register 
              // If cant find exception and ask if they want to register 
            //If successfully entered, prompt them with the movies and shows 
            //Ask if they want to change password
            // Request movie or show. 
            // For with a loop inside
                default:
                // Optional default case
                // Statements for default case
            }
}

            



           
            
            
            
            
            
            
            
            
            
            
            
	    System.out.println("Please enter the email :");
            
            
	    String email = sc.next();

                            MaturityLevel maturity = new MaturityLevel(18,ContentRating.PG13);
                            MaturityLevel maturityLevel2 = new MaturityLevel(16, ContentRating.PG);
                            List<MaturityLevel> maturityLevels = Arrays.asList(maturity, maturityLevel2);
                            List<String> ratingReasons = Arrays.asList("Reason 1", "Reason 2"); // replace with actual reasons
                            MaturityRating maturityRating = new MaturityRating(ratingReasons);
                    Profile profile1 = new Profile("Mohamed Amine",maturity,email, true,Language.ENGLISH,Playback.CONTINUE_WATCHING, true);
                   
                    System.out.println(profile1.toString());
                    profile1.setLanguage(Language.GERMAN);
                    System.out.println("Here is the new Lnaguage: " + profile1.getLanguage());
Movie movie1 = new Movie(
    "A", 
    Genre.ACTION, // genre
    new GregorianCalendar(2020, 0, 1), 
    Quality.HD, 
    Arrays.asList(Genre.SCIFI), 
    Language.ENGLISH, 
    Arrays.asList("Leonardo DiCaprio", "Taha Chraibi"), 
    "s", 
    8.8, 
    maturityLevels, 
    10, 
    maturityRating, 
    120 // duration in minutes
);
Series series = new Series(
            "Stranger Things", 
            Genre.DRAMA, 
            new GregorianCalendar(2011, 6, 15), 
            Quality.HD, 
            Arrays.asList(Genre.DRAMA, Genre.FANTASY), 
            Language.ENGLISH, // language
            Arrays.asList("Winona Ryder", "David Harbour"), 
            2, 
            "When a young boy ", 
            8.7, 
            maturityLevels, 
            2040, 
            maturityRating 
        );

        series.addSeason(new Seasons(1, Arrays.asList(
            new Episode(1, "Chapter One", 50),
            new Episode(2, "Chapter Two", 55)
        )));
        series.addSeason(new Seasons(2, Arrays.asList(
            new Episode(1, "Chapter One", 48),
            new Episode(2, "Chapter Two", 56)
        )));
                                System.out.println(series.toString());
                                System.out.println(movie1.toString());
         displayShowDetails(movie1);
        displayShowDetails(series);


    
     }        

public static void displayShowDetails(Show show) {
    if (show instanceof Movie) {
        displayMovieDetails((Movie) show);
    } else if (show instanceof Series) {
        displaySeriesDetails((Series) show);
    }
}

private static void displayMovieDetails(Movie movie) {
    System.out.println("Movie Details:");
    System.out.println("Title: " + movie.getTitle());
    System.out.println("Duration: " + movie.getDuration() + " minutes");
}

private static void displaySeriesDetails(Series series) {
    System.out.println("Series Details:");
    System.out.println("Title: " + series.getTitle());
    System.out.println("Number of Seasons: " + series.getNumSeasons());
    series.getSeasons().forEach(season -> {
        System.out.println("Season " + season.getSeasonNumber() + ":");
        season.getEpisodes().forEach(episode -> 
            System.out.println("   Episode " + episode.getEpisodeNumber() + ": " + episode.getTitle() + " (Duration: " + episode.getDuration() + " minutes)")
        );
    }
);
}

 }