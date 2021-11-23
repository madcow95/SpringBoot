package com.example.demo.controller;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    public ProductService pService;

    @PostMapping("/imageUpload")
    public void imageUpload(MultipartHttpServletRequest mRequest) throws Exception {
        /*
        * TODO
        *  1. 파일 업로드 후 AJAX로 여기로 들어오면 오늘 날짜 폴더 생성
        *  2. 생성된 폴더에 사진 저장(일단 1개만 추후에 여러개 등록으로 수정)
        *  3. 저장된 사진 파일 경로를 return
        *  4. return된 파일 경로를 통해 이미지 미리보기
        *
        */
        System.out.println("formData >>> " + mRequest.getMultipartContentType("formData"));
//        Calendar calendar = Calendar.getInstance();
//        String folderUrl = "C:\\springboot\\src\\main\\resources\\static\\uploadedIMG";
//        String todayDate;
//        UUID uid = UUID.randomUUID();
//        todayDate = String.format("%04d-%02d-%02d", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
//        folderUrl = folderUrl + "\\" + todayDate; // 이미지 파일 이름을 오늘날짜 폴더 하위에 붙이기
//        File file = new File(folderUrl);
//        file.mkdir();



    }


}
