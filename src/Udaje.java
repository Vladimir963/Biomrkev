import java.math.BigDecimal;
import java.time.LocalDate;

public class Udaje {

    String name;
    LocalDate born;
    Integer numberOfContracts;
    Integer totalWeight;
    String city;
    String regnumber;
    Double consumption;
    String IP;
    BigDecimal priceOneContract = BigDecimal.valueOf(10000);


    //get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public Integer getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(Integer numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public BigDecimal getPriceOneContract() {
        return priceOneContract;
    }

    public void setPriceOneContract(BigDecimal priceOneContract) {
        this.priceOneContract = priceOneContract;
    }


    //konstruktor


}
