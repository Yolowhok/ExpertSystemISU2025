package rules;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import java.util.Scanner;


public class DroolsTest {
    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
//        KieSession kSession = kContainer.newKieSession("instrument");
        KieSession kSession;

        Instrument instrument = new Instrument();

        while (instrument.getIsStart()) {
            kSession = kContainer.newKieSession("instrument");
            kSession.insert(instrument);
            kSession.fireAllRules();
            kSession.dispose();
            kSession.destroy();
        }
        System.out.println(instrument);

    }

}
