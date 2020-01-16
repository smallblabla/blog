package com.pfy.blog.service.impl;

import com.pfy.blog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PictureServiceImpl {

    @Autowired
    private PictureService pictureService;

    public String getAboutPicture(){
        return pictureService.getAboutPicture();
    }

    public List<String> getVisitorPicture(){
        return pictureService.getVisitorPicture();
    }

}
