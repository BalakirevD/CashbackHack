package ru.netology;


import org.junit.Test;
import ru.netology.service.CashbackHackService;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

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