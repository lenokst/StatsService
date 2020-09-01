package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateTotal() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;

        int actual = service.calculateTotal(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageAmountSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;

        int actual = service.calculateAverageAmountSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.calculateMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;

        int actual = service.calculateMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesBelowAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.calculateSalesBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesAboveAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.calculateSalesAboveAverage(sales);
        assertEquals(expected, actual);
    }
}