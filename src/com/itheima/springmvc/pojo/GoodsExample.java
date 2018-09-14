package com.itheima.springmvc.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeIsNull() {
            addCriterion("goods_shelftime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeIsNotNull() {
            addCriterion("goods_shelftime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeEqualTo(String value) {
            addCriterion("goods_shelftime =", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeNotEqualTo(String value) {
            addCriterion("goods_shelftime <>", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeGreaterThan(String value) {
            addCriterion("goods_shelftime >", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_shelftime >=", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeLessThan(String value) {
            addCriterion("goods_shelftime <", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeLessThanOrEqualTo(String value) {
            addCriterion("goods_shelftime <=", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeLike(String value) {
            addCriterion("goods_shelftime like", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeNotLike(String value) {
            addCriterion("goods_shelftime not like", value, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeIn(List<String> values) {
            addCriterion("goods_shelftime in", values, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeNotIn(List<String> values) {
            addCriterion("goods_shelftime not in", values, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeBetween(String value1, String value2) {
            addCriterion("goods_shelftime between", value1, value2, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsShelftimeNotBetween(String value1, String value2) {
            addCriterion("goods_shelftime not between", value1, value2, "goodsShelftime");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryIsNull() {
            addCriterion("goods_inventory is null");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryIsNotNull() {
            addCriterion("goods_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryEqualTo(Integer value) {
            addCriterion("goods_inventory =", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryNotEqualTo(Integer value) {
            addCriterion("goods_inventory <>", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryGreaterThan(Integer value) {
            addCriterion("goods_inventory >", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_inventory >=", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryLessThan(Integer value) {
            addCriterion("goods_inventory <", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("goods_inventory <=", value, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryIn(List<Integer> values) {
            addCriterion("goods_inventory in", values, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryNotIn(List<Integer> values) {
            addCriterion("goods_inventory not in", values, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryBetween(Integer value1, Integer value2) {
            addCriterion("goods_inventory between", value1, value2, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_inventory not between", value1, value2, "goodsInventory");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarIsNull() {
            addCriterion("goods_avatar is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarIsNotNull() {
            addCriterion("goods_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarEqualTo(String value) {
            addCriterion("goods_avatar =", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarNotEqualTo(String value) {
            addCriterion("goods_avatar <>", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarGreaterThan(String value) {
            addCriterion("goods_avatar >", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("goods_avatar >=", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarLessThan(String value) {
            addCriterion("goods_avatar <", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarLessThanOrEqualTo(String value) {
            addCriterion("goods_avatar <=", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarLike(String value) {
            addCriterion("goods_avatar like", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarNotLike(String value) {
            addCriterion("goods_avatar not like", value, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarIn(List<String> values) {
            addCriterion("goods_avatar in", values, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarNotIn(List<String> values) {
            addCriterion("goods_avatar not in", values, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarBetween(String value1, String value2) {
            addCriterion("goods_avatar between", value1, value2, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsAvatarNotBetween(String value1, String value2) {
            addCriterion("goods_avatar not between", value1, value2, "goodsAvatar");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(String value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(String value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(String value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(String value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(String value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLike(String value) {
            addCriterion("goods_price like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotLike(String value) {
            addCriterion("goods_price not like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<String> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<String> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(String value1, String value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(String value1, String value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andBelongIsNull() {
            addCriterion("belong is null");
            return (Criteria) this;
        }

        public Criteria andBelongIsNotNull() {
            addCriterion("belong is not null");
            return (Criteria) this;
        }

        public Criteria andBelongEqualTo(String value) {
            addCriterion("belong =", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongNotEqualTo(String value) {
            addCriterion("belong <>", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongGreaterThan(String value) {
            addCriterion("belong >", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongGreaterThanOrEqualTo(String value) {
            addCriterion("belong >=", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongLessThan(String value) {
            addCriterion("belong <", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongLessThanOrEqualTo(String value) {
            addCriterion("belong <=", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongLike(String value) {
            addCriterion("belong like", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongNotLike(String value) {
            addCriterion("belong not like", value, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongIn(List<String> values) {
            addCriterion("belong in", values, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongNotIn(List<String> values) {
            addCriterion("belong not in", values, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongBetween(String value1, String value2) {
            addCriterion("belong between", value1, value2, "belong");
            return (Criteria) this;
        }

        public Criteria andBelongNotBetween(String value1, String value2) {
            addCriterion("belong not between", value1, value2, "belong");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIsNull() {
            addCriterion("goods_description is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIsNotNull() {
            addCriterion("goods_description is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionEqualTo(String value) {
            addCriterion("goods_description =", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotEqualTo(String value) {
            addCriterion("goods_description <>", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionGreaterThan(String value) {
            addCriterion("goods_description >", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("goods_description >=", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLessThan(String value) {
            addCriterion("goods_description <", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("goods_description <=", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionLike(String value) {
            addCriterion("goods_description like", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotLike(String value) {
            addCriterion("goods_description not like", value, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionIn(List<String> values) {
            addCriterion("goods_description in", values, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotIn(List<String> values) {
            addCriterion("goods_description not in", values, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionBetween(String value1, String value2) {
            addCriterion("goods_description between", value1, value2, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsDescriptionNotBetween(String value1, String value2) {
            addCriterion("goods_description not between", value1, value2, "goodsDescription");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIsNull() {
            addCriterion("goods_sale is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIsNotNull() {
            addCriterion("goods_sale is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleEqualTo(Integer value) {
            addCriterion("goods_sale =", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotEqualTo(Integer value) {
            addCriterion("goods_sale <>", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleGreaterThan(Integer value) {
            addCriterion("goods_sale >", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sale >=", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleLessThan(Integer value) {
            addCriterion("goods_sale <", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sale <=", value, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleIn(List<Integer> values) {
            addCriterion("goods_sale in", values, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotIn(List<Integer> values) {
            addCriterion("goods_sale not in", values, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale between", value1, value2, "goodsSale");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale not between", value1, value2, "goodsSale");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}