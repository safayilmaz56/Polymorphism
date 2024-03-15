package org.turkcell.com.entity;

import java.util.Date;

public class BaseEntity<T> {
    private T id;
    private Date createdDate;
    private Date updatedDate;
    private Date deletedDate;

    public BaseEntity(T id, Date createdDate, Date updatedDate, Date deletedDate) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.deletedDate = deletedDate;
    }
}
