package com.alibaba.study.ioc.generic;

/**
 * <pre>
 * 类CompanyService.java的实现描述：依赖实现了泛型接口的bean
 * 
 * Spring针对实现了泛型接口的bean对其进行注入是没有任何问题的
 * </pre>
 *  
 * @author yangbolin Mar 23, 2013 11:45:14 AM
 */
public class CompanyService {
    private OrderService<BuyOffer> buyOfferOrderService;

    public OrderService<BuyOffer> getBuyOfferOrderService() {
        return buyOfferOrderService;
    }

    
    public void setBuyOfferOrderService(OrderService<BuyOffer> buyOfferOrderService) {
        this.buyOfferOrderService = buyOfferOrderService;
    }
}
