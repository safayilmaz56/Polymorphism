package org.turkcell.com.business.concretes;

import org.turkcell.com.business.abstracts.ProductManager;
import org.turkcell.com.dataAccess.abstracts.DataBase;

public class NeroProductManager extends ProductManager {
    public NeroProductManager() {
        save();
    }

    public NeroProductManager(DataBase dataBase) {
        super(dataBase);
        save();
    }
}
