package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testToStringTrue() {
        User firstUser=new User("Мария","Иванова","mera@yandex.ru");
        User secondUser=new User("Тимур","Петров","timka.pet@mail.ru");
        User thirdUser=new User("Александра","Потёмкина","sasha.t@google.ru");
        assertEquals(3,User.totalonLine);
    }

    @Test
    public void testToStringFalse() {
        User firstUser=new User("Мария","Иванова","mera@yandex.ru");
        User secondUser=new User("Тимур","Петров","timka.pet@mail.ru");
        User thirdUser=new User("Александра","Потёмкина","sasha.t@google.ru");
        assertEquals(5,User.totalonLine);
    }
}