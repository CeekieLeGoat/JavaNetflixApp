package netflixjava.Profile;
 
import java.util.GregorianCalendar;


public class Account {
    private String email;
    private String password;
    private GregorianCalendar creationDate;
    private AccountStatus status; 


    public Account(String email, String password, GregorianCalendar creationDate, AccountStatus status) {
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GregorianCalendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(GregorianCalendar creationDate) {
        this.creationDate = creationDate;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate.getTime() +
                ", status=" + status +
                '}';
    }
}
