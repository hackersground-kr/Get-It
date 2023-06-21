package kr.hackerground.getit.deps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/api/usage")
    public String redirect(){
        return "redirect:/swagger-ui.html";
    }
}
