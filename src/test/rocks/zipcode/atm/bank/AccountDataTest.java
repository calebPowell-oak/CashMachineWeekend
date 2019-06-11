package rocks.zipcode.atm.bank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountDataTest {

    @Test
    public void constructorTest() {
        // Given
        Integer id = 3333;
        String name = "Caleb";
        String email = "caleb@caleb.com";
        Double balance = 200d;

        // When
        AccountData a = new AccountData(id, name, email, 200d);

        // Assert
        Assert.assertTrue(id == a.getId());
        Assert.assertEquals(name, a.getName());
        Assert.assertEquals(email, a.getEmail());
        Assert.assertTrue(balance.equals(a.getBalance()));
    }

    @Test
    public void getIdTest(){
        // Given
        Integer id = 3333;
        String name = "Caleb";
        String email = "caleb@caleb.com";
        Double balance = 200d;

        // When
        AccountData a = new AccountData(id, name, email, 200d);

        // Assert
        Assert.assertTrue(id == a.getId());
    }

    @Test
    public void getName() {
        // Given
        Integer id = 3333;
        String name = "Caleb";
        String email = "caleb@caleb.com";
        Double balance = 200d;

        // When
        AccountData a = new AccountData(id, name, email, 200d);

        // Assert
        Assert.assertEquals(name, a.getName());
    }

    @Test
    public void getEmail() {
        // Given
        Integer id = 3333;
        String name = "Caleb";
        String email = "caleb@caleb.com";
        Double balance = 200d;

        // When
        AccountData a = new AccountData(id, name, email, 200d);

        // Assert
        Assert.assertEquals(email, a.getEmail());
    }

    @Test
    public void getBalance() {
        // Given
        Integer id = 3333;
        String name = "Caleb";
        String email = "caleb@caleb.com";
        Double balance = 200d;

        // When
        AccountData a = new AccountData(id, name, email, 200d);

        // Assert
        Assert.assertTrue(balance.equals(a.getBalance()));
    }

    @Test
    public void toString1() {
        // Given
        Integer id = 3333;
        String name = "Caleb";
        String email = "caleb@caleb.com";
        Double balance = 200d;

        // When
        AccountData a = new AccountData(id, name, email, 200d);
        String expected = "Account ID: " + id + '\n' +
                "Name: " + name + '\n' +
                "Email: " + email + '\n' +
                String.format("Available Balance: %.2f", balance);

        // Assert
        Assert.assertEquals(expected, a.toString());
    }
}