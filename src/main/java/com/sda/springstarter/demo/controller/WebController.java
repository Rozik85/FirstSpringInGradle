package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.service.BookCategoryServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class WebController {
    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private PublisherServiceImpl publisherService;
    @Autowired
    private BookCategoryServiceImpl categoryService;


    @GetMapping(value = "lista")
    public ModelAndView showBooks() {
        ModelAndView model = new ModelAndView();
        model.addObject("books", bookService.getAllBooks());
        model.addObject("categories", categoryService.getAllBookCategory());
        model.addObject("publishers", publisherService.getAllPublisher());
        model.addObject("book", new Book());
        model.setViewName("booklist");
        return model;
    }

    @PostMapping(value = "addbook")
    public String addBook(@ModelAttribute("book")
                                @Valid Book book,
                                BindingResult bookresult,
                                RedirectAttributes redirectAttributes) {
        bookService.saveBook(book);
        redirectAttributes
                .addFlashAttribute("message", "ksiazka zostala dodana");

        return "redirect:/lista";
    }
}
