package app.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import app.models.ExternalProperties;
import app.models.Message;

import app.models.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class IndexController {

    @Value("${DB_URL}")
    private String url = "";
    @Value("${DB_USER}")
    private String user = "";
    @Value("${DB_PASSWORD}")
    private String password = "";

    public void setProps() {
        new ExternalProperties(url,user,password);
    }

    @RequestMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String welcome(Map<String, Object> model) {
        setProps();
        User user = new User(1);
        model.put("user", user.getName());
        return "index";
    }

    @RequestMapping("/api/message")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ArrayList<Message> query() {
        setProps();
        return new Message().queryMessage();
    }

    @RequestMapping("/bank")
    public String bank(Map<String, Object> model) {
        model.put("user", "Potae");
        return "topupbank";
    }


    @RequestMapping("/fail")
    public Exception fail() {
        return new Exception("Fail!");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody Message handleMyRuntimeException(Exception exception) {
        return new Message("Failed Access.");
    }
}
