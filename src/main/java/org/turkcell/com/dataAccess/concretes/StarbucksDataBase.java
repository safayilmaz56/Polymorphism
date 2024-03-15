package org.turkcell.com.dataAccess.concretes;

import org.turkcell.com.dataAccess.abstracts.DataBase;

public class StarbucksDataBase implements DataBase {
    @Override
    public void save() {
        System.out.println("Starbucks firması için müşteri veri tabanına eklendi");
    }
}
