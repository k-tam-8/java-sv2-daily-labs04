package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> exchageRate = new ArrayList<>();
    private int MinRateSpot = 0;

    public Stock(List<Double> exchangeRate) {
        this.exchageRate = exchangeRate;
    }

    public double getMin() {
        double MinRate = exchageRate.get(0);
        for (int i = 0; i < exchageRate.size(); i++) {
            if (MinRate > exchageRate.get(i)) {
                MinRate = exchageRate.get(i);
                MinRateSpot = i;
            }
        }
        return MinRate;
    }

    public double getMax() {
        double MaxRate = 0;
        for (int i = 0; i < exchageRate.size(); i++) {
            if (MaxRate < exchageRate.get(i) && MinRateSpot < i) {
                MaxRate = exchageRate.get(i);
            }
        }
        return MaxRate;
    }

    public double maxProfit() {
        //MinRateSpot=-1;
        double MinRate = getMin();
        double MaxRate = getMax();
        return MaxRate - MinRate > 0 ? MaxRate - MinRate : 0;
    }
}
