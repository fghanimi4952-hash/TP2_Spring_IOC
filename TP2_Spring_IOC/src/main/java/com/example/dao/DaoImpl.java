package com.example.dao;

import org.springframework.stereotype.Component;

/**
 * Première implémentation de l’interface IDao.
 * Déclarée comme un bean Spring avec l’identifiant "dao".
 */
@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        // Retourne une valeur fixe
        return 100.0;
    }
}
