package england;
import views.Countries;
import views.service.VariantsView;
import java.util.Map;

public class EnglandVariantsViewImpl implements VariantsView {

    private static final Countries COUNTRIES = new Countries();

    public void capitalVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.capital().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void populationVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.population().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void nationalDishVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.nationalDish().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }


    public void colorsOfFlagVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.colorsOfFlag().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void primeMinisterVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.primeMinister().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void currencyVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.currency().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void neighbourhoodVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.neighborhood().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void alcoholVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.alcohol().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
    public void politicalSystemVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.politicalSystem().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }

    public void monumentsVariants() throws InterruptedException {
        for (Map.Entry treeMap : COUNTRIES.englandAnswer.monuments().entrySet()) {
            Thread.sleep(1000);
            System.out.println(treeMap.getKey() + ") " + treeMap.getValue());
        }
    }
}
