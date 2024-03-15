package org.turkcell.com.business.abstracts;

import org.turkcell.com.dataAccess.abstracts.DataBase;

public class ProductManager {
    private DataBase dataBase;

    public ProductManager() {
    }

    public ProductManager(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public void save(){
        dataBase.save();
    }
}
