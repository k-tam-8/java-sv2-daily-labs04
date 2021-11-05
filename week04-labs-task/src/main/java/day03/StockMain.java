package day03;

import java.util.Arrays;

public class StockMain {
    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0

        Stock stock3 = new Stock(Arrays.asList(5.9,5.9,5.9,5.9));
        System.out.println(stock3.maxProfit());

        Stock stock4 = new Stock(Arrays.asList(5.9,5.8,5.7,5.6));
        System.out.println(stock4.maxProfit());
    }
}
