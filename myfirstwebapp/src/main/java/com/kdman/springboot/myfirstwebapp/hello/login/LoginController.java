package com.kdman.springboot.myfirstwebapp.hello.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Model : Model Map 추가 및 JSP 값 설정 가능
    @RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        System.out.println("Request Param is : " + name);
        return "login"; // 해당 return 값이 jsp 파일의 이름 (확장자 제외)
    }
}
