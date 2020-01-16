package com.pfy.blog.controller;
import com.pfy.blog.service.impl.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

    @Autowired
    private PictureServiceImpl pictureService;

    @RequestMapping("/about")
    public String archives(Model model){
        String picture = pictureService.getAboutPicture();
        model.addAttribute("picture",picture);
        return "about";
    }


}
