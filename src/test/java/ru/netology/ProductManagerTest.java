package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    Repository repo = new Repository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Marry", 100, "Polo");
    Product book2 = new Book(22, "Sor", 120, "Firr");
    Product book3 = new Book(458, "Ripp", 190, "Daloss");
    Product book4 = new Book(45, "Marry 4", 390, "Spoik");

    Product smartphone1 = new Smartphone( 1, "Aple", 50000, "USA");
    Product smartphone2 = new Smartphone( 2, "Aple11", 80000, "USA");
    Product smartphone3 = new Smartphone( 10, "Nokia", 1000, "China");



    @Test
    public void searchBook() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Marry");
        Product[] expected = {book1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBook2() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Marty");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBook3() {

        Product[] actual = manager.searchBy("LOST");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBook4() {
        manager.add(book1);


        Product[] actual = manager.searchBy("Marry");
        Product[] expected = {book1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBook5() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);

        Product[] actual = manager.searchBy("Marry");
        Product[] expected = {book1, book4};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void searchSmartphone() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Aple");
        Product[] expected = {smartphone1, smartphone2};

        assertArrayEquals(expected, actual);
    }
}
