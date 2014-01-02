package com.manager.bean;

public class TRole {
    private String roleId;

    private String roleName;

    private String roleIdent;

    private Integer roleStatus;

    private String managerId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleIdent() {
        return roleIdent;
    }

    public void setRoleIdent(String roleIdent) {
        this.roleIdent = roleIdent;
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
}