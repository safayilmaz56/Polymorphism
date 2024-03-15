package org.turkcell.com.business.concretes;

import org.turkcell.com.business.abstracts.ProductManager;
import org.turkcell.com.dataAccess.abstracts.DataBase;

public class StarbucksProductManager extends ProductManager {
    public StarbucksProductManager() {
    }

    public StarbucksProductManager(DataBase dataBase) {
        super(dataBase);
        if (mernisValidation()){
            save();
        }
    }

    //Mernis doğrulaması default "true" olarak ayarlandı.
    public boolean mernisValidation(){
        return true;
    }

}
