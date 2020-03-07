package com.skcc.mock.smsMs.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SmsHistoryField {

    @Id
    private String requester;

    private String befContents;

    private String aftContents;

    private Date regDt;

}
