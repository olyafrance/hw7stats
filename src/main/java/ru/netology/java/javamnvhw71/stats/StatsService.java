package ru.netology.java.javamnvhw71.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;

        }

        return sum;
    }

    public long averageSales(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long average = sum / 12;
        return average;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит в рассматриваемом i-м месяце продаж больше
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит в рассматриваемом i-м месяце продаж меньше
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int counterMonthLessAverage(long[] sales) {
        int counterLess = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) { // значит в рассматриваемом i-м месяце продажа меньше  среднего значения
                counterLess++;
            }
        }
        return counterLess;

    }

    public int counterMonthMoreAverage(long[] sales) {
        int counterMore = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) { // значит в рассматриваемом i-м месяце продажа больше среднего значения
                counterMore++;
            }
        }
        return counterMore;

    }
}

