package app.controllers;

import app.models.Message;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Message index() {
        return new Message("Get User");
    }

}
