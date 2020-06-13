package ru.kpfu.itis.lpgallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.kpfu.itis.lpgallery.models.User;
import ru.kpfu.itis.lpgallery.services.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private UserService userService;


    @GetMapping("/test-page")
    public String getTestPage(ModelMap map) {
        map.put("authors", getUsers(1));
        return "authors-test";
    }

    @GetMapping("test-page/next-group")
    @ResponseBody
    public List<String> getNextGroup(@RequestParam("page") int page) {
        return getUsersNicknames(page);
    }

    private List<String> getUsersNicknames(int page) {
        List<String> result = new ArrayList<>();
        String nickname = "Test User " + page;
        for (int i = 0; i < 5; i++) {
            result.add(nickname);
        }
        return result;
    }

    private User[] getUsers(int page) {
        String nickname = "Test User " + page;
        User user = new User(nickname, "default.png");
        User[] users = new User[5];
        Arrays.fill(users, user);
        return users;
    }

}
