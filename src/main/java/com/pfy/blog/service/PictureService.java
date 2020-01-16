package com.pfy.blog.service;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PictureService {
     String getAboutPicture();
     List<String> getVisitorPicture();
}
