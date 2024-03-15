package org.turkcell.com.entity;

import java.util.Date;

public class Starbucks extends BaseEntity<Integer>{
    private int countStar;

    public Starbucks(Integer id, Date createdDate, Date updatedDate, Date deletedDate, int countStar) {
        super(id, createdDate, updatedDate, deletedDate);
        this.countStar = countStar;
    }
}
