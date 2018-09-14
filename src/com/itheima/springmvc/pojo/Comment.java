package com.itheima.springmvc.pojo;

import java.util.List;


public class Comment {
    private Integer customerId;

    private Integer shopId;

    private Integer logistics;

	private Integer service;

    private Integer consistency;
    
    private Integer commentId;

    private List<Goodscomment> list;
    public List<Goodscomment> getList() {
		return list;
	}
    
    public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	
	public void setList(List<Goodscomment> list) {
		this.list = list;
	}

	//private List<Comment_Info> list;
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getConsistency() {
        return consistency;
    }

    public void setConsistency(Integer consistency) {
        this.consistency = consistency;
    }

	public Integer getLogistics() {
		return logistics;
	}

	public void setLogistics(Integer logistics) {
		this.logistics = logistics;
	}
	public float getAverageGrade(){
		Float f1=(float)consistency;
		Float f2=(float)logistics;
		Float f3=(float)service;
		return (f1+f2+f3)/3.0f;
	}

	@Override
	public String toString() {
		return "Comment [customerId=" + customerId + ", shopId=" + shopId + ", logistics=" + logistics + ", service="
				+ service + ", consistency=" + consistency + ", commentId=" + commentId + ", list=" + list + "]";
	}
	
}