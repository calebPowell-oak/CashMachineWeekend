package rocks.zipcode.atm.bank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PremiumAccountTest {

    @Test
    public void canWithdraw() {
        // Given
        Bank a = new Bank();

        // When
        PremiumAccount acc = new PremiumAccount(a.getAccountById(4321).getData());

        // Assert
        Assert.assertTrue(acc.canWithdraw(10.00));
    }

    @Test
    public void canWithdraw2(){
        // Given
        Bank a = new Bank();

        // When
        PremiumAccount acc = new PremiumAccount(a.getAccountById(4321).getData());

        // Assert
        Assert.assertFalse(acc.canWithdraw(99999999.00));
    }
}