package com.manager.bean;

import java.util.Date;

public class TOrg {
    private String orgId;

    private String managerId;

    private String orgPid;

    private String orgName;

    private String orgIdent;

    private String orgDesc;

    private String orgModelby;

    private Date orgCreate;

    private Integer orgStatus;

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getOrgPid() {
        return orgPid;
    }

    public void setOrgPid(String orgPid) {
        this.orgPid = orgPid;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgIdent() {
        return orgIdent;
    }

    public void setOrgIdent(String orgIdent) {
        this.orgIdent = orgIdent;
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    public String getOrgModelby() {
        return orgModelby;
    }

    public void setOrgModelby(String orgModelby) {
        this.orgModelby = orgModelby;
    }

    public Date getOrgCreate() {
        return orgCreate;
    }

    public void setOrgCreate(Date orgCreate) {
        this.orgCreate = orgCreate;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }
}