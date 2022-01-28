
public class Kwadrat extends Prostokat{

    @Override
    public String toString() {
        return "Kwadrat{" +
                "wys=" + wys +
                ", punkt=" + punkt +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    Kwadrat(int wys, int szer) {
        super(wys, szer);
    }
}



