package com.alibaba.study.ioc.generic;

/**
 * <pre>
 * ��CompanyService.java��ʵ������������ʵ���˷��ͽӿڵ�bean
 * 
 * Spring���ʵ���˷��ͽӿڵ�bean�������ע����û���κ������
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
