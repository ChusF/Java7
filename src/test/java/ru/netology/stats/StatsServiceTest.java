package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindBetweenEndsMin() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMin = 9;
        int actualMonthMin = service.minSales(sales);

        Assertions.assertEquals(expectedMonthMin, actualMonthMin);
    }

    @Test
    public void SummaSalesForYear() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void AvgSummaSalesForYear() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.sumSalesAvg(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindBetweenEndsMax() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMax = 8;
        int actualMonthMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
    }

    @Test
    public void countMonthUpAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUp = 5;
        int actualUp = service.upperAvg(sales);

        Assertions.assertEquals(expectedUp, actualUp);
    }

    @Test
    public void countMonthUnderAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUnder = 5;
        int actualUnder = service.underAvg(sales);

        Assertions.assertEquals(expectedUnder, actualUnder);
    }
}
