package com.alibaba.study.ioc.generic;

/**
 * <pre>
 * 类BuyOfferOrderServiceImpl.java的实现描述：泛型接口的实现
 * </pre>
 * 
 * @author yangbolin Mar 23, 2013 11:32:51 AM
 */
public class BuyOfferOrderServiceImpl implements OrderService<BuyOffer> {

    @Override
    public BuyOffer getInfo() {
        System.out.println("get buy offer...");
        BuyOffer buyOffer = new BuyOffer();
        buyOffer.setId(1);
        buyOffer.setContent("nuaa");
        return buyOffer;
    }
}
