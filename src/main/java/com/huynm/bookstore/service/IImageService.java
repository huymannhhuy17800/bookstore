package com.huynm.bookstore.service;

import org.springframework.stereotype.Service;

import com.huynm.bookstore.entities.Image;

@Service
public interface IImageService {

	void updateImage(Image img);
}
