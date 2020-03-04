package fr.uvsq.exercice5;

import java.lang.invoke.MethodHandles;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;


public class Aaffichage implements Affichage{

	//private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	org.slf4j.Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	public void afficher(String chaine) {
		// TODO Auto-generated method stub
		System.out.println(chaine ) ; 
		logger.info(chaine);
	}

}
