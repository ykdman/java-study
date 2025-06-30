package com.kdman.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // "say-hello" => "Hello! What are you learning today?

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My FIRST HTML PAGE WITH BODY");
        sb.append("</body>");
        sb.append("</html>");
        
        return sb.toString();
        
        // 위 아래 두가지 방식 모두 가능
        
//        return """
//                <html>
//                    <head>
//                    <title>My First HTML Page</title>
//                    </head>
//                    <body>
//                    My FIRST HTML PAGE WITH BODY
//                    </body>
//                </html>
//                """;
    }

    // say-hlloe-jsp => sayHello.jsp 리디렉션
    // src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
