package com.skcc.mock.smsMs.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SmsField {

    @Id
    private String requester;

    private String contents;

    private String fromNumber;

    private String toNumber;

    private IfStatus status;

    private Date regDt;

    private Date updDt;

    public SmsField(){

    }

    public SmsField(String requester, String contents, String fromNumber, String toNumber) {
        this.requester = requester;
        this.contents = contents;
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public IfStatus getStatus() {
        return status;
    }

    public void setStatus(IfStatus status) {
        this.status = status;
    }

    public Date getRegDt() {
        return regDt;
    }

    public void setRegDt(Date regDt) {
        this.regDt = regDt;
    }

    public Date getUpdDt() {
        return updDt;
    }

    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }
}
