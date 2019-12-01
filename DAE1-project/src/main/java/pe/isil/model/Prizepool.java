package pe.isil.model;

public class Prizepool {
    private Integer idPrizePool;
    private Integer place;
    private Double percentage;

    public Prizepool() {
    }

    public Prizepool(Integer idPrizePool, Integer place, Double percentage) {
        this.idPrizePool = idPrizePool;
        this.place = place;
        this.percentage = percentage;
    }

    public Integer getIdPrizePool() {
        return idPrizePool;
    }

    public void setIdPrizePool(Integer idPrizePool) {
        this.idPrizePool = idPrizePool;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Prizepool{" +
                "idPrizePool=" + idPrizePool +
                ", place=" + place +
                ", percentage=" + percentage +
                '}';
    }
}
