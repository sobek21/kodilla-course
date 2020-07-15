package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import net.bytebuddy.NamingStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;


    @Test
    public void testInvoiceDaoSave(){

        //Given
        Product product1 = new Product("Book");
        Product product2 = new Product("Book");
        Product product3 = new Product("Book");

        Item item1 = new Item(product1,new BigDecimal("500"),3);
        Item item2 = new Item(product1,new BigDecimal("200"),3);
        Item item3 = new Item(product1,new BigDecimal("50"),1);

        Invoice invoice1 = new Invoice("qwerst123");
        invoice1.setItems(Arrays.asList(item1, item2, item3));

        //When

        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        //Then

        Assert.assertEquals(3, productDao.count());
        Assert.assertEquals(3, itemDao.count());
        Assert.assertEquals(4, invoiceDao.count());
        Assert.assertNotEquals(0, id);

        //cleanup
        invoiceDao.delete(invoice1);
        }
    }


