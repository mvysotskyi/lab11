import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.lab.task1.User;
import com.lab.task2.Client;
import com.lab.task2.strategy.BirthdayMailStrategy;
import com.lab.task2.strategy.GiftMailStrategy;

public class Tests {
    @Test
    public void testUser() {
        User user = User.builder()
                    .name("John")
                    .build();

        Assertions.assertEquals("John", user.getName());
    }

    @Test
    public void testCliens() {
        Client c1 = new Client("Rosa", 0, null);
        Client c2 = new Client("Bill", 0, null);

        Assertions.assertEquals(0, c1.getId());
        Assertions.assertEquals(1, c2.getId());

        Assertions.assertEquals("Rosa", c1.getName());
        Assertions.assertEquals("Bill", c2.getName());
    }

    @Test
    public void testStrategy() {
        BirthdayMailStrategy birthdayStrategy = new BirthdayMailStrategy();
        GiftMailStrategy giftStrategy = new GiftMailStrategy();

        Assertions.assertEquals("Sending birthday greetings to John",
                        birthdayStrategy.sendMail(new Client("John", 0, null)));

        Assertions.assertEquals("Sending gift letter to Mary",
                        giftStrategy.sendMail(new Client("Mary", 0, null)));
    }
}