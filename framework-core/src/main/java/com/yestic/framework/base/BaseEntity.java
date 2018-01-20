package com.yestic.framework.base;

import java.sql.Date;

public abstract class BaseEntity extends IBean{

    private String id;

    private Date insDate;

    private Date lastUpdateDate;

    private String updateAccountId;

    private boolean deleteFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getUpdateAccountId() {
        return updateAccountId;
    }

    public void setUpdateAccountId(String updateAccountId) {
        this.updateAccountId = updateAccountId;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
