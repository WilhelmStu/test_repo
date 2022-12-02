package com.example.test_project.controller;

import java.util.ArrayList;
import java.util.HashSet;

import com.example.test_project.Book;
import com.example.test_project.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    @Autowired
    BookServiceImpl bookServiceImpl;

    @PostMapping("/")
    public void addBook(@RequestBody Book book) {
        bookServiceImpl.addBook(book);
    }

    @GetMapping("/findall")
    public HashSet<Book> getAllBook() {
        return bookServiceImpl.findAllBook();
    }

    @GetMapping("/")
    public String hello() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Hello!</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Hello World!</h1>\n" +
                "    <p id=\"1\">Test 123</p>\n" +
                "    <button id=\"button\" onclick=\"myFunction()\">Click me!</button>\n" +
                "    <p id=\"2\"></p>\n" +
                "    <script>\n" +
                "        function myFunction() {\n" +
                "            document.getElementById(\"1\").innerHTML = \"Test 321\";\n" +
                "            document.getElementById(\"2\").innerHTML = \"Test 42\";\n" +
                "        }\n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
        /*" <!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Hello world!</h1>\n" +
                "<p>input</p>\n" +
                " <button type=\"button\">Click Me!</button> \n" +
                "\n" +
                "</body>\n" +
                "</html> ";*/
    }

    @GetMapping("/findbyid/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookServiceImpl.findBookByID(id);
    }

    @DeleteMapping("/delete")
    public void deleteBook() {
        bookServiceImpl.deleteAllData();
    }

}
