package org.turkcell.com.dataAccess.concretes;

import org.turkcell.com.dataAccess.abstracts.DataBase;
import org.turkcell.com.entity.BaseEntity;

public class NeroDataBase implements DataBase {
    @Override
    public void save() {
        System.out.println("Nero firması için müşteri veri tabanına eklendi");
    }
}
