package com.example.metier;

import com.example.dao.IDao;
import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de test unitaire pour MetierImpl.
 */
public class MetierImplTest {

    @Test
    public void testCalcul() {
        // Création d'une implémentation fictive de IDao pour le test
        IDao dao = new IDao() {
            @Override
            public double getValue() {
                return 10.0;
            }
        };

        // Création du métier et injection du DAO
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // Vérification du résultat attendu
        double result = metier.calcul();
        Assert.assertEquals(20.0, result, 0.001);
    }
}
