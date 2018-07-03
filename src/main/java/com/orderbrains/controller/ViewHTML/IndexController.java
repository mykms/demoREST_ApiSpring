package com.orderbrains.controller.ViewHTML;

import com.orderbrains.entity.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexController {
    @GetMapping("/")
    public ModelAndView index() {
        User item = new User();
        item.setFirstName("Aleksey");
        return new ModelAndView("index", "User", item);
    }
}
