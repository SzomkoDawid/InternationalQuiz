package germany;

import views.Countries;
import views.service.VariantsView;

import java.util.Map;

public class GermanyVariantsViewImpl implements VariantsView {

    private static final Countries COUNTRIES = new Countries();

    public void capitalVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.capital().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void populationVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.population().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void nationalDishVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.nationalDish().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }


    public void colorsOfFlagVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.colorsOfFlag().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }


    public void primeMinisterVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.primeMinister().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }


    public void currencyVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.currency().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void neighbourhoodVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.neighborhood().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void alcoholVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.alcohol().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void politicalSystemVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.politicalSystem().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void monumentsVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.germanyAnswer.monuments().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
}
