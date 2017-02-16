package buddyinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/books/view")
    public String viewBuddy(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("book", repo.findOne(id));
        model.addAttribute("buddies", repo.findOne(id).getBuddies());
        return "book_view";
    }

}
