package netflixjava.Show; 



public class Plan {
    private double cost;
    private int screenNum;
    private int downloadDevices;
    private Quality quality;



    // Constructor
    public Plan(double cost, int screenNum, int downloadDevices, Quality quality) {
        this.cost = cost;
        this.screenNum = screenNum;
        this.downloadDevices = downloadDevices;
        this.quality = quality;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getScreenNum() {
        return screenNum;
    }

    public void setScreenNum(int screenNum) {
        this.screenNum = screenNum;
    }

    public int getDownloadDevices() {
        return downloadDevices;
    }

    public void setDownloadDevices(int downloadDevices) {
        this.downloadDevices = downloadDevices;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Plan{" +
               "cost=" + cost +
               ", screenNum=" + screenNum +
               ", downloadDevices=" + downloadDevices +
               ", quality=" + quality +
               '}';
    }
}
