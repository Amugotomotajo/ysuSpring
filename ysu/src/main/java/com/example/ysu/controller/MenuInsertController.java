package com.example.ysu.controller;

import com.example.ysu.model.dto.menuDTO;
import com.example.ysu.service.MenuInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/adminmenu")
public class MenuInsertController {
    @Autowired
    private MenuInsertService menuInsertService;

    private final String imageUploadPath = "C:/ysu-1/src/img"; // 이미지 저장 경로 지정

        @PostMapping("/menuinsert")
        public ResponseEntity<String> insertData(
                @RequestParam("menu_name") String menu_name,
                @RequestParam("menu_corner") String menu_corner,
                @RequestParam("menu_price") int menu_price,
                @RequestParam("menu_pack") int menu_pack,
                @RequestPart("menu_image") MultipartFile menu_image
        ) {
            try {
                // 이미지 파일을 저장
                String fileName = saveImage(menu_image);

                // menuDTO 객체에 데이터 설정
                menuDTO mdto = new menuDTO();
                mdto.setMenu_name(menu_name);
                mdto.setMenu_corner(menu_corner);
                mdto.setMenu_price(menu_price);
                mdto.setMenu_pack(menu_pack);
                mdto.setMenu_image(fileName);

                // 서비스를 사용하여 데이터베이스에 데이터 추가
                menuInsertService.MenuInsert(mdto);
                return ResponseEntity.ok("Data inserted successfully");
            } catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to insert data");
            }
        }

        // 이미지 저장
        private String saveImage(MultipartFile image) {
            if (image != null) {
                try {
                    String originalFileName = image.getOriginalFilename(); // 이미지 이름 출력
                    String filePath = imageUploadPath + File.separator + originalFileName;
                    File dest = new File(filePath);
                    image.transferTo(dest);
                    return originalFileName;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }