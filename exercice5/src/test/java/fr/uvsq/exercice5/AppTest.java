package fr.uvsq.exercice5;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    UseClassMetier metier ;
   @Test
    public void testApp()
    {
	   metier=new UseClassMetier(new Aaffichage());
	   metier.intruction();
    }
}
