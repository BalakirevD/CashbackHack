package ru.netology;


import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import org.testng.Assert;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();
    CashbackHackService radioActual = new CashbackHackService();

    @Test
    public void remain900() {
        Assert.assertEquals(cashbackHackService.remain(900), 100);
    }

    @Test
    public void remain1000() {
        Assert.assertEquals(cashbackHackService.remain(1000), 0);
    }

    @Test
    public void remain1100() {
        Assert.assertEquals(cashbackHackService.remain(1100), 900);
    }
}