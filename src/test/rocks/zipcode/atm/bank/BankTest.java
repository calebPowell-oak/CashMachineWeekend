package rocks.zipcode.atm.bank;

import com.sun.xml.internal.ws.wsdl.ActionBasedOperationSignature;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.atm.ActionResult;

import javax.swing.*;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void bankConstructorTest(){
        // Given
        Bank bank = new Bank();
        ActionResult<AccountData> acc1 = bank.getAccountById(1234);
        ActionResult<AccountData> acc2 = bank.getAccountById(4321);

        // When
        String acc1ExcpectedName = "Dolio Durant";
        String acc2ExcpectedName = "Kris Younger";

        // Assert
        Assert.assertEquals(acc1ExcpectedName, acc1.getData().getName());
        Assert.assertEquals(acc2ExcpectedName, acc2.getData().getName());
    }

    @org.junit.Test
    public void newAccountTest() {
        // Given
        Integer id = 6666;
        String name = "Caleb";
        String email = "Caleb@caleb.com";
        Bank bank = new Bank();

        // When
        bank.newAccount(id, new AccountData(id, name, email, 0d));
        ActionResult<AccountData> acc = bank.getAccountById(id);

        // Assert
        Assert.assertEquals(name, acc.getData().getName());
        Assert.assertEquals(email, acc.getData().getEmail());
        Assert.assertTrue(id.equals(acc.getData().getId()));

    }

    @org.junit.Test
    public void getAccountByIdTest() {
        // Given
        Bank bank = new Bank();
        String expectedName = "Dolio Durant";
        Integer expectedID = 1234;
        String expectedEmail = "gangstaBlueGrass@gmail.com";

        // When
        ActionResult<AccountData> actual = bank.getAccountById(1234);

        // Assert
        Assert.assertEquals(expectedName, actual.getData().getName());
        Assert.assertEquals(expectedEmail, actual.getData().getEmail());
        Assert.assertTrue(expectedID == actual.getData().getId());
    }

    @org.junit.Test
    public void depositTest() {
        // Given
        Double deposit = 1000d;
        Bank b = new Bank();
        ActionResult<AccountData> a = b.getAccountById(1234);
        Double expected = a.getData().getBalance() + deposit;

        // When
        b.deposit(a.getData(), deposit);

        // Assert
        Assert.assertEquals(expected, b.getAccountById(1234).getData().getBalance());
    }

    @org.junit.Test
    public void withdrawTest() {
        // Given
        Double withdraw = 1000d;
        Bank b = new Bank();
        ActionResult<AccountData> a = b.getAccountById(1234);
        Double expected = a.getData().getBalance() - withdraw;

        // When
        b.withdraw(a.getData(), withdraw);

        // Assert
        Assert.assertEquals(expected, b.getAccountById(1234).getData().getBalance());
    }

    @org.junit.Test
    public void checkExistingTest() {
        // Given
        Bank b = new Bank();

        // When
        Boolean actual = b.checkExisting(1234);

        // Assert
        Assert.assertTrue(actual);
    }
}