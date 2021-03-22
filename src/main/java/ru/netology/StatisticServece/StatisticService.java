package ru.netology.StatisticService;

public class StatisticService {
    public int sum(int[] sales) {
        int result = 0;

        for (int sale : sales) {
            result = result + sale;

        }
        return result;

    }

    public int avg(int[] sales) {
        int sum = sum(sales);
        return sum / sales.length;
    }

    public int theNumberOfTheMonthWithTheMaximumSales(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }

        }
        int monthNumber = 0;
        int theNumberOfTheMonthWithTheMaximumSales = 0;
        for (int sale : sales) {
            monthNumber = monthNumber + 1;

            if (sale == max) {
                theNumberOfTheMonthWithTheMaximumSales = monthNumber;


            }
        }
        return theNumberOfTheMonthWithTheMaximumSales;
    }

    public int theNumberOfTheMonthWithTheMinimumSales(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }

        }
        int monthNumber = 0;
        int theNumberOfTheMonthWithTheMinimumSales = 0;
        for (int sale : sales) {
            monthNumber = monthNumber + 1;

            if (sale == min) {
                theNumberOfTheMonthWithTheMinimumSales = monthNumber;


            }
        }

        return theNumberOfTheMonthWithTheMinimumSales;
    }

    public int theQuantityMonthwhenSalesAreBelowAverage(int[] sales) {
        int avg = avg(sales);
        int quantityMonth = 0;
        for (int sale : sales) {
            if (sale < avg) {
                quantityMonth = quantityMonth + 1;

            }
        }
        return quantityMonth;
    }

    public int theQuantityMonthwhenSalesArelessAverage(int[] sales) {
        int avg = avg(sales);
        int quantityMonth = 0;
        for (int sale : sales) {
            if (sale > avg) {
                quantityMonth = quantityMonth + 1;

            }
        }
        return quantityMonth;
    }
}

