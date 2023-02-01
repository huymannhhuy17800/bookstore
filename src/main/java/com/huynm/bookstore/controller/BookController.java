package com.huynm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huynm.bookstore.model.Book;
import com.huynm.bookstore.repository.BookRepository;


@Controller
//@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/")
	public ModelAndView getBooks(Model model) {
		List<Book> list = bookRepository.findAll();
		ModelAndView m = new ModelAndView();
		m.setViewName("home.html");
		model.addAttribute("list",list);
		return m;
	}
	
	@GetMapping("/details")
	public ModelAndView getDetails(Model model) {
		
		ModelAndView m = new ModelAndView();
		m.setViewName("details.html");
		return m;
	}
	
	@GetMapping("/home")
	public ModelAndView backHome() {
		ModelAndView m = new ModelAndView();
		m.setViewName("home.html");
		return m;
	}
	@GetMapping("/display")
	public ModelAndView display(Model model) {
		List<Book> list = bookRepository.findAll();
		
		ModelAndView m = new ModelAndView();
		m.setViewName("all_book_display.html");
		model.addAttribute("alllist",list);
		return m;
	}
	
	@GetMapping("/cart")
	public ModelAndView getCart(Model model) {
		
		ModelAndView m = new ModelAndView();
		m.setViewName("cart.html");
		return m;
	}
}
