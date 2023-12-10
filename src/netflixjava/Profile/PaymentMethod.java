package netflixjava.Profile; 

import java.util.GregorianCalendar;


public class PaymentMethod {
    private String holderName;
    private GregorianCalendar expiration;
    private PaymentType type; 
    private int number; 



    
    public PaymentMethod(String holderName, GregorianCalendar expiration, PaymentType type, int number) {
        this.holderName = holderName;
        this.expiration = expiration;
        this.type = type;
        this.number = number;
    }

    // Getters and setters
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public GregorianCalendar getExpiration() {
        return expiration;
    }

    public void setExpiration(GregorianCalendar expiration) {
        this.expiration = expiration;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // toString method
    @Override
    public String toString() {
        String formattedExpiration = expiration.getTime().toString();
        return "PaymentMethod{" +
                "holderName='" + holderName + '\'' +
                ", expiration=" + formattedExpiration +
                ", type=" + type +
                ", number=" + number +
                '}';
    }
}
