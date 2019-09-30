package poland;

import views.Countries;
import views.service.VariantsView;

import java.util.Map;

public class PolandVariantsViewImpl implements VariantsView {

    private static final Countries COUNTRIES = new Countries();

    public void capitalVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.capital().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void populationVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.population().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void nationalDishVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.nationalDish().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }


    public void colorsOfFlagVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.colorsOfFlag().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void primeMinisterVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.primeMinister().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void currencyVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.currency().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void neighbourhoodVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.neighborhood().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void alcoholVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.alcohol().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void politicalSystemVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.politicalSystem().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void monumentsVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.polandAnswer.monuments().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
}
