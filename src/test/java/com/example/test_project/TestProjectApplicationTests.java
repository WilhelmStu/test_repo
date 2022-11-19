package com.example.test_project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestProjectApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testTest (){
        assert true;
    }

    @Test
    void testBook(){
        Book book = new Book(1,"a book", "the book");
        assertEquals(1, book.getId());
        assertEquals("a book", book.getName());
        assertEquals("the book", book.getTitle());
    }

    @Test
    void testFail(){
        fail();
    }

}
