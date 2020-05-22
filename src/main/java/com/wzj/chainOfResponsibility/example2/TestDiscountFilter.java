package com.wzj.chainOfResponsibility.example2;

/**
 * @Author: wzj
 * @Date: 2019/9/8 16:17
 * @Desc:
 */
public class TestDiscountFilter {
    public static void main(String[] args) {
        int price = 240;
        String productStr = String.format("商品清单：苹果、香蕉、桔子, 商品总金额为：%d元.", price);
        System.out.println(productStr);
        //声明责任链上的所有节点
        FullDiscountFilter fulDF = new FullDiscountFilter();
        FirstPurchaseDiscount firstDF = new FirstPurchaseDiscount();
        SecondPurchaseDiscountFilter secDF = new SecondPurchaseDiscountFilter();
        HolidayDiscountFilter holDF = new HolidayDiscountFilter();
        //设置链中的顺序:满减->首购减->第二件减->假日减
        fulDF.nextDiscountFilter = firstDF;
        firstDF.nextDiscountFilter = secDF;
        secDF.nextDiscountFilter = holDF;
        holDF.nextDiscountFilter = null;
        int total = fulDF.calculateBySourcePrice(price);
        System.out.println(String.format("所有商品优惠价后金额为:%d", total));
    }


}
