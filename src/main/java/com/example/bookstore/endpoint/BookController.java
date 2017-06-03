package com.example.bookstore.endpoint;

import com.example.bookstore.model.BookDto;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.Map;

/**
 * Created by Andrzej on 01.06.2017.
 */

@Controller
@RequestMapping("/books")//sciezka poprzedzajaca adresy  // klasa do JSP
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService=bookService;
    }


//    @RequestMapping(method = RequestMethod.GET, value="/hello")  // to samo co GetMapping
    @GetMapping(value="/kotek/{text}") // wywolanie czyli /books/kotek
    public String hello(@PathVariable("text") String text, Map<String, Object> model){
        model.put("text", text);
        return "hello";  // odwolanie do jsp
    }

    @GetMapping(value = "/czas")  //pod adresem /books/czas
    public String listing(Map<String, Object> model) {
        model.put("time" , new Date());
        model.put("listing", bookService.getListingData());
        return "book-listing";
    }

    @PostMapping(value = "/czas")
    public String addBook(@ModelAttribute BookDto bookDTO,
                          RedirectAttributes redirectAttributes) {

        bookService.addBook(bookDTO.fromDto());
        redirectAttributes.addFlashAttribute("result", "Ksiazka zostala dodana");
        return "redirect:/books/czas";
    }

    @GetMapping("/delete/{id}")
    public String removeBook(@PathVariable String id,
                          RedirectAttributes redirectAttributes) {
        bookService.deleteBook("id");
        redirectAttributes.addFlashAttribute("deteled","Book" + id + "has been deleted");
        return "redirect:/books";
    }
}
