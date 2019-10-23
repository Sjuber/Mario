package mario;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Ordre {

    private int ordreNummer;
    private ArrayList<Pizza> bestiltePizzaer = new ArrayList<Pizza>();
    private double prisTotal;
    private LocalDate dato = LocalDate.now();
    private LocalTime tidspunkt;

    public Ordre(int ordreNummer, ArrayList<Pizza> bestiltePizzaer, double prisTotal,
            LocalDate dato, LocalTime tidspunkt) {
        this.ordreNummer = ordreNummer;
        this.bestiltePizzaer = bestiltePizzaer;
        this.prisTotal = prisTotal;
        this.dato = dato;
        this.tidspunkt = tidspunkt;
    }

    public double udregnPrisTotal() {
//TODO:     Metode, der udregner totalprisen
        return prisTotal;
    }
//TODO: Addpizza - metode, der tilføjer en pizza til ordren
    
    public int getOrdreNummer() {
        return ordreNummer;
    }

    public ArrayList<Pizza> getBestiltePizzaer() {
        return bestiltePizzaer;
    }

    public double getPrisTotal() {
        return prisTotal;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getTidspunkt() {
        return tidspunkt;
    }

}
