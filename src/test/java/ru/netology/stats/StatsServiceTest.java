package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

public void shouldCalculateSumSales() {

        StatsService service = new StatsService();
                long[] salesInt = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long expected = 180;
        long actual = service.sumSales(sales);


        Assertions.assertEquals(expected, actual);
    }
}
