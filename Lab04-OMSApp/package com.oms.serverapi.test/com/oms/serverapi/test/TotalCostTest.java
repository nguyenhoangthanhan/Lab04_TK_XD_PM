package com.oms.serverapi.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.oms.bean.Book;
import com.oms.bean.CompactDisc;
import com.oms.bean.Order;
import com.oms.bean.OrderLine;
import com.oms.serverapi.MediaApi;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class TotalCostTest {
    private MediaApi api = new MediaApi();

    @BeforeClass
    public static void beforeClass() {
        System.out.print("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.print("After Class");
    }

    @Test
    public void getTotalCostTC1() {
        ArrayList<Book> books = api.getBooks(null);
        System.out.print(books);
        System.out.print("\n");
        OrderLine orderLine = new OrderLine(books.get(0).getId(), books.get(0).getTitle(), 3, books.get(0).getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("Hi");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost(), order.getTotalCost(), 0.0);
    }

    @Test
    public void getTotalCostT2() {
        ArrayList<Book> books = api.getBooks(null);
        OrderLine orderLine = new OrderLine(books.get(0).getId(), books.get(0).getTitle(), 1, books.get(0).getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("Hn");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost() + 22000, order.getTotalCost(), 0.0);
    }

    @Test
    public void getTotalCostT3() {
        ArrayList<Book> books = api.getBooks(null);
        OrderLine orderLine = new OrderLine(books.get(2).getId(), books.get(2).getTitle(), 3, books.get(2).getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("Hn");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost() + 27000, order.getTotalCost(), 0.0);
    }

    @Test
    public void getTotalCostT4() {
        ArrayList<Book> books = api.getBooks(null);
        ArrayList<CompactDisc> compactDiscs = api.getCds(null);
        System.out.print(compactDiscs);
        OrderLine orderLine = new OrderLine(books.get(2).getId(), books.get(2).getTitle(), 3, books.get(2).getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("Hn");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost() + 27000, order.getTotalCost(), 0.0);
    }

    @Test
    public void getTotalCostT5() {
        ArrayList<Book> books = api.getBooks(null);
        OrderLine orderLine = new OrderLine(books.get(0).getId(), books.get(0).getTitle(), 1, books.get(0).getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("kkkkk");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost() + 35000, order.getTotalCost(), 0.0);
    }

    @Test
    public void getTotalCostT6() {
        ArrayList<Book> books = api.getBooks(null);
        OrderLine orderLine = new OrderLine(books.get(2).getId(), books.get(2).getTitle(), 3, books.get(2).getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("llllllllll");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost() + 2500 * 7, order.getTotalCost(), 0.0);
    }

    @Test
    public void getTotalCostT7() {
        Book book = new Book("boo", "Book Test", "", 10000, 0.2f);

        OrderLine orderLine = new OrderLine(book.getId(), book.getTitle(), 3, book.getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("hn");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost() + 22000, order.getTotalCost(), 0.0);
    }
    @Test
    public void getTotalCostT8() {
        Book book = new Book("boo", "Book Test", "", 10000, 0.2f);

        OrderLine orderLine = new OrderLine(book.getId(), book.getTitle(), 3, book.getCost());
        System.out.print(orderLine);
        Order order = new Order();
        order.setCustomerAddress("hch");
        order.addOrderLine(orderLine);
        assertEquals(orderLine.getProductQuantity() * orderLine.getProductCost() + 30000, order.getTotalCost(), 0.0);
    }
}
