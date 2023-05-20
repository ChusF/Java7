package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяцы нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int sumSalesAvg(int[] sales) {
        int avgSum = 0;
        for (int i = 0; i < sales.length; i++) {
            avgSum += sales[i];
        }
        return avgSum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int upperAvg(int[] sales) {
        int upper = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sumSalesAvg(sales)) {
                upper = upper + 1;
            }
        }
        return upper;
    }

    public int underAvg(int[] sales) {
        int under = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sumSalesAvg(sales)) {
                under = under + 1;
            }
        }
        return under;
    }
}