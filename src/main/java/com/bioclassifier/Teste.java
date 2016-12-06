package com.bioclassifier;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Teste {
	public static void testarElementosTabela(){
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		Animal peixe = new Animal("aquatico", "escamas", "nadar", "ovoliparo", "carnivoro", "bronquial");
    	peixe.addAlimentacao("herbivoro");
    	peixe.addRevestimento("cartilagem");
    	kSession.insert(peixe);
    	Result r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal tubaraosalmao = new Animal("aquatico", "cartilagem", "nadar", "ovoliparo", "carnivoro", "bronquial");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(tubaraosalmao);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal anfibio = new Animal("aquatico", "pele", "andar", "ovoliparo", "carnivoro", "cutanea");
    	anfibio.addHabitat("terrestre");
    	anfibio.addLocomocao("rastejar");
    	anfibio.addLocomocao("nadar");
    	anfibio.addReproducao("oviparo");
    	anfibio.addRespiracao("pulmonar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(anfibio);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal sapo = new Animal("aquatico", "pele", "andar", "ovoliparo", "carnivoro", "cutanea");
    	sapo.addHabitat("terrestre");
    	sapo.addLocomocao("nadar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(sapo);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	
    	Animal salamandra = new Animal("aquatico", "pele", "andar", "oviparo", "carnivoro", "cutanea");
    	salamandra.addHabitat("terrestre");
    	salamandra.addLocomocao("nadar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(salamandra);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal repteis = new Animal("aquatico", "escamas", "andar", "oviparo", "carnivoro", "pulmonar");
    	repteis.addHabitat("terrestre");
    	repteis.addRevestimento("cartilagem");
    	repteis.addLocomocao("rastejar");
    	repteis.addLocomocao("nadar");
    	repteis.addAlimentacao("herbivoro");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(repteis);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal jacare = new Animal("aquatico", "escamas", "andar", "oviparo", "carnivoro", "pulmonar");
    	jacare.addHabitat("terrestre");
    	jacare.addLocomocao("nadar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(jacare);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
        
    	Animal cobra = new Animal("aquatico", "escamas", "rastejar", "oviparo", "carnivoro", "pulmonar");
    	cobra.addHabitat("terrestre");
    	cobra.addLocomocao("nadar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(cobra);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal tartaruga = new Animal("aquatico", "escamas", "andar", "oviparo", "herbivoro", "pulmonar");
    	tartaruga.addHabitat("terrestre");
    	tartaruga.addRevestimento("carapaca");
    	tartaruga.addLocomocao("nadar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(tartaruga);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal aves = new Animal("aereo", "penas", "andar", "oviparo", "herbivoro", "pulmonar");
    	aves.addHabitat("terrestre");
    	aves.addHabitat("aquatico");
    	aves.addLocomocao("nadar");
    	aves.addLocomocao("voar");
    	aves.addAlimentacao("carnivoro");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(aves);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal pinguim = new Animal("terrestre", "penas", "andar", "oviparo", "carnivoro", "pulmonar");
    	pinguim.addHabitat("aquatico");
    	pinguim.addLocomocao("nadar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(pinguim);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal pato = new Animal("terrestre", "penas", "andar", "oviparo", "herbivoro", "pulmonar");
    	pato.addHabitat("aquatico");
    	pato.addHabitat("aereo");
    	pato.addLocomocao("nadar");
    	pato.addLocomocao("voar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(pato);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal galinha = new Animal("terrestre", "penas", "andar", "oviparo", "herbivoro", "pulmonar");
    	galinha.addLocomocao("voar");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(galinha);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal mamifero = new Animal("terrestre", "pele", "andar", "viviparo", "herbivoro", "pulmonar");
    	mamifero.addHabitat("aquatico");
    	mamifero.addHabitat("aereo");
    	mamifero.addRevestimento("pelo");
    	mamifero.addLocomocao("nadar");
    	mamifero.addLocomocao("voar");
    	mamifero.addAlimentacao("carnivoro");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(mamifero);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal macaco = new Animal("terrestre", "pele", "andar", "viviparo", "herbivoro", "pulmonar");
    	macaco.addRevestimento("pelo");
    	macaco.addAlimentacao("carnivoro");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(macaco);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal baleia = new Animal("aquatico", "pele", "nadar", "viviparo", "herbivoro", "pulmonar");
    	baleia.addAlimentacao("carnivoro");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(baleia);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
    	
    	Animal morcego = new Animal("aereo", "pele", "voar", "viviparo", "herbivoro", "pulmonar");
    	morcego.addAlimentacao("carnivoro");
    	kSession = kContainer.newKieSession("ksession-rules");
    	kSession.insert(morcego);
    	r = new Result();
		kSession.insert(r);
    	kSession.fireAllRules();
	}

}
