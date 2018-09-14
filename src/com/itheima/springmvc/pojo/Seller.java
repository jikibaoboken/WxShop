package com.itheima.springmvc.pojo;

public class Seller {
    private Integer sellerId;

    private String username;

    private String passeword;

    private String mailbox;

    private String phone;

    private String sex;

    private Integer age;

    private String nickname;

    private String accountCreatetime;

    private String cyberspaceAvatar;

    private Integer shopId;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPasseword() {
        return passeword;
    }

    public void setPasseword(String passeword) {
        this.passeword = passeword == null ? null : passeword.trim();
    }

    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox == null ? null : mailbox.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAccountCreatetime() {
        return accountCreatetime;
    }

    public void setAccountCreatetime(String accountCreatetime) {
        this.accountCreatetime = accountCreatetime == null ? null : accountCreatetime.trim();
    }

    public String getCyberspaceAvatar() {
        return cyberspaceAvatar;
    }

    public void setCyberspaceAvatar(String cyberspaceAvatar) {
        this.cyberspaceAvatar = cyberspaceAvatar == null ? null : cyberspaceAvatar.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}