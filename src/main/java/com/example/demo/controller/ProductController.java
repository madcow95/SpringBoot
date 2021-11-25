package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    public ProductService pService;

    @PostMapping("/imageUpload")
    public String imageUpload(@RequestParam("imageFile") MultipartFile multi, HttpServletRequest request) throws IOException {
        /*
        * TODO
        *  1. 파일 업로드 후 AJAX로 여기로 들어오면 오늘 날짜 폴더 생성
        *  2. 생성된 폴더에 사진 저장(일단 1개만 추후에 여러개 등록으로 수정)
        *  3. 저장된 사진 파일 경로를 return
        *  4. return된 파일 경로를 통해 이미지 미리보기
        *
        */
        String imgName = multi.getOriginalFilename();
        Calendar calendar = Calendar.getInstance();
        UUID uid = UUID.randomUUID();
        String folderUrl = "C:\\springboot\\src\\main\\resources\\static\\uploadedIMG";
        folderUrl += "\\" + String.format("%04d", calendar.get(Calendar.YEAR));
        folderUrl += "\\" + String.format("%02d", calendar.get(Calendar.MONTH) + 1);
        folderUrl += "\\" + String.format("%02d", calendar.get(Calendar.DAY_OF_MONTH));
        folderUrl += "\\" + uid;
        File imgFolder = new File(folderUrl);
        imgFolder.mkdirs();
        FileOutputStream fos = new FileOutputStream(folderUrl + "\\" + imgName);

        return folderUrl + "\\" + imgName;
    }


}
