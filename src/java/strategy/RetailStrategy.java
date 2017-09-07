package strategy;

import db.Vozilo;
import db.VoziloDB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mate
 */
public class RetailStrategy implements StrategyInterface {

    @Override
    public String promjeniStatus(Vozilo vozilo, String status) {
        String redirectURL="lista_vozila.jsp";
        if (status.equalsIgnoreCase("Prodano")){
            VoziloDB dbOps = new VoziloDB();
            dbOps.izbrisiVozilo(vozilo.getBroj_sasije());
            redirectURL="ispisi_racun.jsp";
        }
        return redirectURL;
    }

    @Override
    public List<String> dohvatiPopisStatusa() {
        List<String> popis = new ArrayList<>();
        popis.add("Lager");
        popis.add("Prodano");
        return popis;
    }    
}
