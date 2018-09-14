package com.itheima.springmvc.pojo;

public class Goodscomment {
    private Integer goodscommentId;

    private Integer goodsId;

    private Integer reputation;

    private String remark;

    private Integer commentId;

    public Integer getGoodscommentId() {
        return goodscommentId;
    }

    public void setGoodscommentId(Integer goodscommentId) {
        this.goodscommentId = goodscommentId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
}