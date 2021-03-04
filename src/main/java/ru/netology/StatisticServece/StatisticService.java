package ru.netology.StatisticService;

public class StatisticService {
    public int sum(int[] sales) {
        int result = 0;

        for (int sale : sales) {
            result = result + sale;

        }
        return result;

    }

    public int Avg(int[] sales) {
        int sum = sum(sales);
        return sum / sales.length;
    }

    public int TheNumberOfTheMonthWithTheMaximumSales(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }

        }
        int MonthNumber = 0;
        int TheNumberOfTheMonthWithTheMaximumSales = 0;
        for (int sale : sales) {
            MonthNumber = MonthNumber + 1;

            if (sale == max) {
                TheNumberOfTheMonthWithTheMaximumSales = MonthNumber;


            }
        }
        return TheNumberOfTheMonthWithTheMaximumSales;
    }

    public int TheNumberOfTheMonthWithTheMinimumSales(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }

        }
        int MonthNumber = 0;
        int TheNumberOfTheMonthWithTheMinimumSales = 0;
        for (int sale : sales) {
            MonthNumber = MonthNumber + 1;

            if (sale == min) {
                TheNumberOfTheMonthWithTheMinimumSales = MonthNumber;


            }
        }

        return TheNumberOfTheMonthWithTheMinimumSales;
    }

    public int TheQuantityMonthwhenSalesAreBelowAverage(int[] sales) {
        int Avg = Avg(sales);
        int quantityMonth = 0;
        for (int sale : sales) {
            if (sale < Avg) {
                quantityMonth = quantityMonth + 1;

            }
        }
        return quantityMonth;
    }

    public int TheQuantityMonthwhenSalesArelessAverage(int[] sales) {
        int Avg = Avg(sales);
        int quantityMonth = 0;
        for (int sale : sales) {
            if (sale > Avg) {
                quantityMonth = quantityMonth + 1;

            }
        }
        return quantityMonth;
    }
}

