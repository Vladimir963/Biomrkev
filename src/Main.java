import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Úkol Biomrkev");
        System.out.println("-------------");
        System.out.println("             ");

        Udaje Biomrkev = new Udaje();

        Biomrkev.setName("Pepa Prodejce");
        Biomrkev.setBorn(LocalDate.of(1973,6,6));
        Biomrkev.setNumberOfContracts(50);
        Biomrkev.setTotalWeight(500);
        Biomrkev.setCity("Liptákov");
        Biomrkev.setRegnumber("AAA112233");
        Biomrkev.setConsumption(6.6);
        Biomrkev.setIP("111.222.333.444");

        System.out.println(Biomrkev.getName() +", narozen: " + Biomrkev.getBorn() +", jezdící v autě se SPZ: " + Biomrkev.getRegnumber() + " a žijící v obci " + Biomrkev.getCity() + ", prodal průměrně " + Biomrkev.getTotalWeight()/Biomrkev.getNumberOfContracts()+" tun biomrkve za:" );
        System.out.println("Cena za jednu smlouvu = " + Biomrkev.getPriceOneContract());
        System.out.println(Biomrkev.getName() + " jezdí v autě značky: " + Biomrkev.getRegnumber() + " se spotřebou: " + Biomrkev.getConsumption() + " l/100km " + " a jeho počítač má IP: " + Biomrkev.getIP());

    }
}