package ru.netology.StatisticService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    @Test
    void shoudSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ru.netology.StatisticService.StatisticService statisticService = new ru.netology.StatisticService.StatisticService();
        int expected = 180;
        int actual = statisticService.sum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ru.netology.StatisticService.StatisticService statisticService = new ru.netology.StatisticService.StatisticService();
        int expected = 15;
        int actual = statisticService.avg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudTheNumberOfTheMonthWithTheMaximumSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ru.netology.StatisticService.StatisticService statisticService = new ru.netology.StatisticService.StatisticService();
        int expected = 8;
        int actual = statisticService.theNumberOfTheMonthWithTheMaximumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudTheNumberOfTheMonthWithTheMinimumSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ru.netology.StatisticService.StatisticService statisticService = new ru.netology.StatisticService.StatisticService();
        int expected = 9;
        int actual = statisticService.theNumberOfTheMonthWithTheMinimumSales(sales);

        assertEquals(expected, actual);

    }
    @Test
    void shoudculculateTheQuantityMonthwhenSalesAreBelowAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ru.netology.StatisticService.StatisticService statisticService = new ru.netology.StatisticService.StatisticService();
        int expected = 5;
        int actual = statisticService.theQuantityMonthwhenSalesAreBelowAverage(sales);

        assertEquals(expected, actual);

    }
    @Test
    void shoudculculateTheQuantityMonthwhenSalesArelessAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        ru.netology.StatisticService.StatisticService statisticService = new ru.netology.StatisticService.StatisticService();
        int expected = 5;
        int actual = statisticService.theQuantityMonthwhenSalesArelessAverage(sales);

        assertEquals(expected, actual);

    }
}
