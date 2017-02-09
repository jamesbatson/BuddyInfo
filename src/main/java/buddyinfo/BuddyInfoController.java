package buddyinfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adambatson on 2/9/2017.
 */
@Controller
public class BuddyInfoController {

    @GetMapping("/buddies/new")
    public String buddyForm(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        return "buddy_form";
    }

    @PostMapping("/buddies/new")
    public String postNewBuddy(@ModelAttribute BuddyInfo buddyInfo) {
        return "new_buddy_result";
    }

    @RequestMapping("/buddies")
    public String buddyIndex() {
        return "buddies";
    }
}
