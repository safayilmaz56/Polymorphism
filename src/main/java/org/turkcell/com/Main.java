package org.turkcell.com;

import org.turkcell.com.business.concretes.NeroProductManager;
import org.turkcell.com.business.abstracts.ProductManager;
import org.turkcell.com.business.concretes.StarbucksProductManager;
import org.turkcell.com.dataAccess.concretes.NeroDataBase;
import org.turkcell.com.dataAccess.concretes.StarbucksDataBase;

public class Main {
    public static void main(String[] args) {
        /*
        * Kahve dükkanları için müşteri yönetimi yapan bir sistem yazmak istiyoruz.
        * Starbucks ve Nero firmaları için çalışıyoruz.
        * İki firma da müşterilerini veri tabanına kaydetmek istiyor.
        * Starbucks, müşterilerini kaydederken mernis doğrulamasını istiyor.
        * Nero müşterilerini kaydederken böyle bir şey istemiyor.
        * Starbucks, müşteriler için her kahve alımında yıldız kazandırmak istiyor
        * */
        
        ProductManager productManager1 = new StarbucksProductManager(new StarbucksDataBase());
        ProductManager productManager2 = new NeroProductManager(new NeroDataBase());
    }
}