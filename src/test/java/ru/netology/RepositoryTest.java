package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RepositoryTest {
    Repository repo = new Repository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Marry", 100, "Polo");
    Product book2 = new Book(22, "Sor", 120, "Firr");
    Product book3 = new Book(458, "Ripp", 190, "Daloss");
    Product book4 = new Book(45, "Marry 4", 390, "Spoik");

    @Test
    public void removeBook() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Product[] actual = repo.remove(458);
        Product[] expected = {book1, book2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void removeBook2() {
        repo.add(book1);
        repo.add(book2);

        repo.remove(1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2};

        assertArrayEquals(actual, expected);
    }

}
