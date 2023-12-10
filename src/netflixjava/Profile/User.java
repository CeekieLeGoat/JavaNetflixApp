package netflixjava.Profile; 


import java.util.List;
import netflixjava.Request;


public class User {
    private String phone;
    private List<Profile> profiles; 
    private List<Request> requests; 
    private PaymentMethod paymentMethod; 
    private Subscription subscription;

    public User(String phone, List<Profile> profiles, List<Request> requests,
                PaymentMethod paymentMethod, Subscription subscription) {
        this.phone = phone;
        this.profiles = profiles;
        this.requests = requests;
        this.paymentMethod = paymentMethod;
        this.subscription = subscription;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "User{" +
               "phone='" + phone + '\'' +
               ", profiles=" + profiles +
               ", requests=" + requests +
               ", paymentMethod=" + paymentMethod +
               ", subscription=" + subscription +
               '}';
    }
}
