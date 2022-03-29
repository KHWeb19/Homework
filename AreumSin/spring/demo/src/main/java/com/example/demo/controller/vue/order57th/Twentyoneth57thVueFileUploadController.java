package com.example.demo.controller.vue.order57th;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/file")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class Twentyoneth57thVueFileUploadController {

    @ResponseBody
    @PostMapping("/uploadImg")
    public String requestUploadFile (
            @RequestParam("fileList") List<MultipartFile> fileList) {

        log.info("requestUploadFile(): " + fileList);

        try {
            for (MultipartFile multipartFile : fileList) {
                log.info("requestUploadFile() - Make file: " +
                        multipartFile.getOriginalFilename());

                // 필요하다면 생성 날짜와 시간(date) 정보를 추가
                // 좀 더 구별이 필요하다면 아이디까지 결합시켜도 무방
                // 아이디/날짜/이미지
                FileOutputStream writer = new FileOutputStream("./src/main/resources/images/" + multipartFile.getOriginalFilename()); // demo를 기준으로 어디 저장되는지 지정 가능.

                log.info("여기까지 와? ");

                writer.write(multipartFile.getBytes());
                writer.close();
            }
        } catch (Exception e) {
            return "Upload Fail!!!";
        }

        log.info("requestUploadFile(): Success!!!");

        return "Upload Success!!!";
    }
}
