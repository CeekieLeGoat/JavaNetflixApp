package netflixjava.Profile; 

import java.util.GregorianCalendar;
import java.util.Map;
import netflixjava.Show.Plan;


public class Subscription {
    private GregorianCalendar subscribed;
    private Plan currentPlan; 
    private GregorianCalendar canceled;
    private String cancelReason;
    private Map<String, Double> billingByMonth; 

    // Constructor
    public Subscription(GregorianCalendar subscribed, Plan currentPlan, GregorianCalendar canceled,
                        String cancelReason, Map<String, Double> billingByMonth) {
        this.subscribed = subscribed;
        this.currentPlan = currentPlan;
        this.canceled = canceled;
        this.cancelReason = cancelReason;
        this.billingByMonth = billingByMonth;
    }

    public GregorianCalendar getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(GregorianCalendar subscribed) {
        this.subscribed = subscribed;
    }

    public Plan getCurrentPlan() {
        return currentPlan;
    }

    public void setCurrentPlan(Plan currentPlan) {
        this.currentPlan = currentPlan;
    }

    public GregorianCalendar getCanceled() {
        return canceled;
    }

    public void setCanceled(GregorianCalendar canceled) {
        this.canceled = canceled;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Map<String, Double> getBillingByMonth() {
        return billingByMonth;
    }

    public void setBillingByMonth(Map<String, Double> billingByMonth) {
        this.billingByMonth = billingByMonth;
    }


    public void changePlan(Plan newPlan) {
        this.currentPlan = newPlan;
        // Additional logic for changing a plan might be required here
    }

    public void billingByMonth(String month, Double amount) {
        billingByMonth.put(month, amount);
        // Additional logic to handle billing might be required here
    }

    public void cancel(String reason) {
        this.canceled = new GregorianCalendar(); // Set the cancel date to the current date
        this.cancelReason = reason;
        // Additional logic for cancellation might be required here
    }

    // toString method
    @Override
    public String toString() {
        return "Subscription{" +
               "subscribed=" + (subscribed != null ? subscribed.getTime() : "Not subscribed") +
               ", currentPlan=" + currentPlan +
               ", canceled=" + (canceled != null ? canceled.getTime() : "Not canceled") +
               ", cancelReason='" + cancelReason + '\'' +
               ", billingByMonth=" + billingByMonth +
               '}';
    }

}
