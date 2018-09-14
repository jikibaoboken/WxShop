package com.itheima.springmvc.pojo;

public class Adeministrator {
    private Integer adminId;

    private Integer powerLevel;

    private String administratorName;

    private String administratorPwd;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(Integer powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName == null ? null : administratorName.trim();
    }

    public String getAdministratorPwd() {
        return administratorPwd;
    }

    public void setAdministratorPwd(String administratorPwd) {
        this.administratorPwd = administratorPwd == null ? null : administratorPwd.trim();
    }
}