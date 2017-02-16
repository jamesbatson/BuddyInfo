package buddyinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adambatson on 2/16/2017.
 */
@Controller
public class AddressBookController {

    @Autowired
    AddressBookRepository repo;

    @RequestMapping("/books")
    public String bookIndex(Model model) {
        model.addAttribute("books", repo.findAll());
        return "books";
    }

    @GetMapping("/books/new")
    public String buddyForm(Model model) {
        model.addAttribute("book", new AddressBook());
        return "book_form";
    }

    @PostMapping("/books/new")
    public String postNewBuddy(@ModelAttribute AddressBook book, Model model) {
        repo.save(book);
        model.addAttribute("books", repo.findAll());
        return "books";
    }

}
