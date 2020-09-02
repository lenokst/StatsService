package ru.netology.stats;

public class StatsService {
    public int calculateTotal(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageAmountSales(int[] sales) {
        int sum = calculateTotal(sales);
        int amount = sum / sales.length;
        return amount;
    }

    public int calculateMaxSales(int[] sales) {
        int currentMax = sales[0];
        int indexMax = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (currentMax <= sale) {
                currentMax = sale;
                indexMax = i;
            }
        }
        return indexMax;
    }

    public int calculateMinSales(int[] sales) {
        int currentMin = sales[0];
        int indexMin = 0;
        for (int i = 0; i < sales.length; i++) {
            int sale = sales[i];
            if (currentMin >= sale) {
                currentMin = sale;
                indexMin = i;
            }
        }
        return indexMin;
    }

    public int calculateSalesBelowAverage(int[] sales) {
        int index = 0;
        int amount = calculateAverageAmountSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amount)
                index++;
        }
        return index;
    }


    public int calculateSalesAboveAverage(int[] sales) {
        int index = 0;
        int amount = calculateAverageAmountSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amount)
                index++;
        }
        return index;
    }
}