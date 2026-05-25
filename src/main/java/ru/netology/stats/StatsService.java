package ru.netology.stats;

public class StatsService {


    public long sumSales(long[] sales) {           // сумма всех продаж
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(long[] sales) {   // средние продажи
        return (int) sumSales(sales) / sales.length;

    }

    public int maxSales(long[] sales) {    // Макс продажи
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsBelowAverage(long[] sales) {   // количество меньше среднего
        int average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverage(long[] sales) { // количество больше среднего
        int average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}




