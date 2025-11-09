package com.example.dao;

import org.springframework.stereotype.Component;

/**
 * Deuxième implémentation de IDao.
 * Utilisée pour montrer la flexibilité de l’injection Spring.
 */
@Component("dao2")
public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        // Retourne une valeur différente
        return 150.0;
    }
}
