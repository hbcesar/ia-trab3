package com.bioclassifier;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {

	public static void main(String[] args) {
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	Animal peixe = new Animal("aquatico", "escamas", "nadar", "ovoliparo", "carnivoro", "bronquial");
        	peixe.setAlimentacao("herbivoro");
        	peixe.setRevestimento("cartilagem");
        	
        	Animal tubaraosalmao = new Animal("aquatico", "cartilagem", "nadar", "ovoliparo", "carnivoro", "bronquial");
        	
        	Animal anfibio = new Animal("aquatico", "pele", "andar", "ovoliparo", "carnivoro", "cutanea");
        	anfibio.setHabitat("terrestre");
        	anfibio.setLocomocao("rastejar");
        	anfibio.setLocomocao("nadar");
        	anfibio.setReproducao("oviparo");
        	anfibio.setRespiracao("pulmonar");
        	
        	Animal sapo = new Animal("aquatico", "pele", "andar", "ovoliparo", "carnivoro", "cutanea");
        	sapo.setHabitat("terrestre");
        	sapo.setLocomocao("nadar");
        	
        	
        	Animal salamandra = new Animal("aquatico", "pele", "andar", "oviparo", "carnivoro", "cutanea");
        	salamandra.setHabitat("terrestre");
        	salamandra.setLocomocao("nadar");
        	
        	Animal repteis = new Animal("aquatico", "escamas", "andar", "oviparo", "carnivoro", "pulmonar");
        	repteis.setHabitat("terrestre");
        	repteis.setRevestimento("cartilagem");
        	repteis.setLocomocao("rastejar");
        	repteis.setLocomocao("nadar");
        	repteis.setAlimentacao("herbivoro");
        	
        	Animal jacare = new Animal("aquatico", "escamas", "andar", "oviparo", "carnivoro", "pulmonar");
        	jacare.setHabitat("terrestre");
        	jacare.setLocomocao("nadar");
            
        	Animal cobra = new Animal("aquatico", "escamas", "rastejar", "oviparo", "carnivoro", "pulmonar");
        	cobra.setHabitat("terrestre");
        	cobra.setLocomocao("nadar");
        	
        	Animal tartaruga = new Animal("aquatico", "escamas", "andar", "oviparo", "herbivoro", "pulmonar");
        	tartaruga.setHabitat("terrestre");
        	tartaruga.setRevestimento("carapaca");
        	
        	Animal aves = new Animal("aereo", "penas", "andar", "oviparo", "herbivoro", "pulmonar");
        	aves.setHabitat("terrestre");
        	aves.setHabitat("aquatico");
        	aves.setLocomocao("nadar");
        	aves.setLocomocao("voar");
        	aves.setAlimentacao("carnivoro");
        	
        	Animal pinguim = new Animal("terrestre", "penas", "andar", "oviparo", "carnivoro", "pulmonar");
        	pinguim.setHabitat("aquatico");
        	pinguim.setLocomocao("nadar");
        	
        	Animal pato = new Animal("terrestre", "penas", "andar", "oviparo", "herbivoro", "pulmonar");
        	pato.setHabitat("aquatico");
        	pato.setHabitat("aereo");
        	pato.setLocomocao("nadar");
        	pato.setLocomocao("voar");
        	
        	Animal galinha = new Animal("terrestre", "penas", "andar", "oviparo", "herbivoro", "pulmonar");
        	galinha.setLocomocao("voar");
        	
        	Animal mamifero = new Animal("terrestre", "pele", "andar", "viviparo", "herbivoro", "pulmonar");
        	mamifero.setHabitat("aquatico");
        	mamifero.setHabitat("aereo");
        	mamifero.setRevestimento("pelo");
        	mamifero.setLocomocao("nadar");
        	mamifero.setLocomocao("voar");
        	mamifero.setAlimentacao("carnivoro");
        	
        	Animal macaco = new Animal("terrestre", "pele", "andar", "viviparo", "herbivoro", "pulmonar");
        	macaco.setRevestimento("pelo");
        	macaco.setAlimentacao("carnivoro");
        	
        	Animal baleia = new Animal("aquatico", "pele", "nadar", "viviparo", "herbivoro", "pulmonar");
        	baleia.setAlimentacao("carnivoro");
        	
        	Animal morcego = new Animal("aereo", "pele", "voar", "viviparo", "herbivoro", "pulmonar");
        	morcego.setAlimentacao("carnivoro");
        	
        	kSession.insert(peixe);
        	kSession.fireAllRules();
            kSession.insert(tubaraosalmao);
            kSession.fireAllRules();
            kSession.insert(anfibio);
            kSession.fireAllRules();
            kSession.insert(sapo);
            kSession.fireAllRules();
            kSession.insert(salamandra);
            kSession.fireAllRules();
            kSession.insert(repteis);
            kSession.fireAllRules();
            kSession.insert(jacare);
            kSession.fireAllRules();
            kSession.insert(cobra);
            kSession.fireAllRules();
            kSession.insert(tartaruga);
            kSession.fireAllRules();
        	kSession.insert(aves);
        	kSession.fireAllRules();
        	kSession.insert(pinguim);
        	kSession.fireAllRules();
        	kSession.insert(pato);
        	kSession.fireAllRules();
        	kSession.insert(galinha);
        	kSession.fireAllRules();
        	kSession.insert(mamifero);
        	kSession.fireAllRules();
        	kSession.insert(macaco);
        	kSession.fireAllRules();
        	kSession.insert(baleia);
        	kSession.fireAllRules();
        	kSession.insert(morcego);
            kSession.fireAllRules();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}

}
