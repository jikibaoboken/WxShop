package com.itheima.springmvc.message;

public class queryGoodsMessage {
	    private String goodsName;
	    private Integer goodsInventory;
	    private String goodsPrice;
	    private String goodsShelftime;
	    private Integer goodsId;
	    private String goodsImgUrl;
	    private String goodsType;
	    public Integer getGoodsId() {
	        return goodsId;
	    }

	    public String getGoodsImgUrl() {
			return goodsImgUrl;
		}

		public void setGoodsImgUrl(String goodsImgUrl) {
			this.goodsImgUrl = goodsImgUrl;
		}

		public String getGoodsType() {
			return goodsType;
		}

		public void setGoodsType(String goodsType) {
			this.goodsType = goodsType;
		}

		public void setGoodsId(Integer goodsId) {
	        this.goodsId = goodsId;
	    }

		public String getGoodsShelftime() {
			return goodsShelftime;
		}
		public void setGoodsShelftime(String goodsShelftime) {
			this.goodsShelftime = goodsShelftime;
		}
		public String getGoodsName() {
			return goodsName;
		}
		public void setGoodsName(String goodsName) {
			this.goodsName = goodsName;
		}
		public Integer getGoodsInventory() {
			return goodsInventory;
		}
		public void setGoodsInventory(Integer goodsInventory) {
			this.goodsInventory = goodsInventory;
		}
		public String getGoodsPrice() {
			return goodsPrice;
		}
		public void setGoodsPrice(String goodsPrice) {
			this.goodsPrice = goodsPrice;
		}
		public queryGoodsMessage() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
