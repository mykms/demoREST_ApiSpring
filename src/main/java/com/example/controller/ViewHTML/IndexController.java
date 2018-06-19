package com.example.controller.ViewHTML;

import com.example.entity.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;

public class IndexController {
    @GetMapping("/")
    public ModelAndView index() {
        User item = new User();
        item.setFirstName("Aleksey");
        return new ModelAndView("index", "User", item);
    }
}
