package fr.uvsq.exercice5;

import java.time.LocalDateTime;

public class UseClassMetier {
	private Aaffichage aff;

	public UseClassMetier(Aaffichage aff) {
		this.aff = aff;
	}
	public void intruction() {
		aff.afficher(LocalDateTime.now() + " : Dé but  de  uneMethodeMetier ");
		aff.afficher(LocalDateTime.now() + " :  Fin  de  uneMethodeMetier ");
	}

}
