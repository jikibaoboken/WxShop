package com.itheima.springmvc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("shop_type like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("shop_type not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersIsNull() {
            addCriterion("goods_type_numbers is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersIsNotNull() {
            addCriterion("goods_type_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersEqualTo(Integer value) {
            addCriterion("goods_type_numbers =", value, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersNotEqualTo(Integer value) {
            addCriterion("goods_type_numbers <>", value, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersGreaterThan(Integer value) {
            addCriterion("goods_type_numbers >", value, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type_numbers >=", value, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersLessThan(Integer value) {
            addCriterion("goods_type_numbers <", value, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type_numbers <=", value, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersIn(List<Integer> values) {
            addCriterion("goods_type_numbers in", values, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersNotIn(List<Integer> values) {
            addCriterion("goods_type_numbers not in", values, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_numbers between", value1, value2, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_numbers not between", value1, value2, "goodsTypeNumbers");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNull() {
            addCriterion("shop_image is null");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNotNull() {
            addCriterion("shop_image is not null");
            return (Criteria) this;
        }

        public Criteria andShopImageEqualTo(String value) {
            addCriterion("shop_image =", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotEqualTo(String value) {
            addCriterion("shop_image <>", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThan(String value) {
            addCriterion("shop_image >", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThanOrEqualTo(String value) {
            addCriterion("shop_image >=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThan(String value) {
            addCriterion("shop_image <", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThanOrEqualTo(String value) {
            addCriterion("shop_image <=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLike(String value) {
            addCriterion("shop_image like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotLike(String value) {
            addCriterion("shop_image not like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageIn(List<String> values) {
            addCriterion("shop_image in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotIn(List<String> values) {
            addCriterion("shop_image not in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageBetween(String value1, String value2) {
            addCriterion("shop_image between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotBetween(String value1, String value2) {
            addCriterion("shop_image not between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNull() {
            addCriterion("shop_level is null");
            return (Criteria) this;
        }

        public Criteria andShopLevelIsNotNull() {
            addCriterion("shop_level is not null");
            return (Criteria) this;
        }

        public Criteria andShopLevelEqualTo(Integer value) {
            addCriterion("shop_level =", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotEqualTo(Integer value) {
            addCriterion("shop_level <>", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThan(Integer value) {
            addCriterion("shop_level >", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_level >=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThan(Integer value) {
            addCriterion("shop_level <", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelLessThanOrEqualTo(Integer value) {
            addCriterion("shop_level <=", value, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelIn(List<Integer> values) {
            addCriterion("shop_level in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotIn(List<Integer> values) {
            addCriterion("shop_level not in", values, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelBetween(Integer value1, Integer value2) {
            addCriterion("shop_level between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_level not between", value1, value2, "shopLevel");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(String value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(String value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(String value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(String value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLike(String value) {
            addCriterion("shop_phone like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotLike(String value) {
            addCriterion("shop_phone not like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<String> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<String> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(String value1, String value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopConditionIsNull() {
            addCriterion("shop_condition is null");
            return (Criteria) this;
        }

        public Criteria andShopConditionIsNotNull() {
            addCriterion("shop_condition is not null");
            return (Criteria) this;
        }

        public Criteria andShopConditionEqualTo(Integer value) {
            addCriterion("shop_condition =", value, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionNotEqualTo(Integer value) {
            addCriterion("shop_condition <>", value, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionGreaterThan(Integer value) {
            addCriterion("shop_condition >", value, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_condition >=", value, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionLessThan(Integer value) {
            addCriterion("shop_condition <", value, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionLessThanOrEqualTo(Integer value) {
            addCriterion("shop_condition <=", value, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionIn(List<Integer> values) {
            addCriterion("shop_condition in", values, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionNotIn(List<Integer> values) {
            addCriterion("shop_condition not in", values, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionBetween(Integer value1, Integer value2) {
            addCriterion("shop_condition between", value1, value2, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andShopConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_condition not between", value1, value2, "shopCondition");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionIsNull() {
            addCriterion("shop_introduction is null");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionIsNotNull() {
            addCriterion("shop_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionEqualTo(String value) {
            addCriterion("shop_introduction =", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotEqualTo(String value) {
            addCriterion("shop_introduction <>", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionGreaterThan(String value) {
            addCriterion("shop_introduction >", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("shop_introduction >=", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionLessThan(String value) {
            addCriterion("shop_introduction <", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionLessThanOrEqualTo(String value) {
            addCriterion("shop_introduction <=", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionLike(String value) {
            addCriterion("shop_introduction like", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotLike(String value) {
            addCriterion("shop_introduction not like", value, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionIn(List<String> values) {
            addCriterion("shop_introduction in", values, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotIn(List<String> values) {
            addCriterion("shop_introduction not in", values, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionBetween(String value1, String value2) {
            addCriterion("shop_introduction between", value1, value2, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andShopIntroductionNotBetween(String value1, String value2) {
            addCriterion("shop_introduction not between", value1, value2, "shopIntroduction");
            return (Criteria) this;
        }

        public Criteria andLeastCountIsNull() {
            addCriterion("least_count is null");
            return (Criteria) this;
        }

        public Criteria andLeastCountIsNotNull() {
            addCriterion("least_count is not null");
            return (Criteria) this;
        }

        public Criteria andLeastCountEqualTo(Integer value) {
            addCriterion("least_count =", value, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountNotEqualTo(Integer value) {
            addCriterion("least_count <>", value, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountGreaterThan(Integer value) {
            addCriterion("least_count >", value, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("least_count >=", value, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountLessThan(Integer value) {
            addCriterion("least_count <", value, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountLessThanOrEqualTo(Integer value) {
            addCriterion("least_count <=", value, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountIn(List<Integer> values) {
            addCriterion("least_count in", values, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountNotIn(List<Integer> values) {
            addCriterion("least_count not in", values, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountBetween(Integer value1, Integer value2) {
            addCriterion("least_count between", value1, value2, "leastCount");
            return (Criteria) this;
        }

        public Criteria andLeastCountNotBetween(Integer value1, Integer value2) {
            addCriterion("least_count not between", value1, value2, "leastCount");
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