package org.example;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Михаил Афанасьевич Булгаков", 1891,123 );
        Book firstBook = new Book("Мастер и маргарита", "Небо",234,1928,400,firstAuthor );
        Book secondBook=new Book("Морфий","Русские писатели",145,1927,256,firstAuthor);
        Book thirdBook=new Book("Багровый остров","Пьесы Булгакова",340,1927,320,firstAuthor);
        Book fourthBook=new Book("Дьяволиада","Сборник",567,1923,352,firstAuthor);
        User firstUser=new User("Мария","Иванова","mera@yandex.ru");
        User secondUser=new User("Тимур","Петров","timka.pet@mail.ru");
        User thirdUser=new User("Александра","Потёмкина","sasha.t@google.ru");
        System.out.println("кол-во пользователей в сети"+User.totalonLine);
        System.out.println(fourthBook);
        System.out.println(firstAuthor);

    }

}
