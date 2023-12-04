package com.example.ysu.controller;

import com.example.ysu.model.dto.menuDTO;
import com.example.ysu.service.MenuUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/adminmenu")
public class MenuUpdateController {
    @Autowired
    private MenuUpdateService menuUpdateService;

    private final String imageUploadPath = "C:/ysu-1/src/img"; // 이미지 저장 경로 지정

    @PostMapping("/menudetail/{menu_id}")
    public ResponseEntity<String> updateData(
            @PathVariable int menu_id,
            @RequestParam("menu_name") String menu_name,
            @RequestParam("menu_corner") String menu_corner,
            @RequestParam("menu_price") int menu_price,
            @RequestParam("menu_pack") int menu_pack,
            @RequestPart(value = "menu_image", required = false) MultipartFile menu_image,
            @RequestParam("menu_sales") int menu_sales,
            @RequestParam("menu_regist") int menu_regist
    ) {
        try {
            String fileName = null;

            // 클라이언트에서 전달한 menu_image 값이 빈 문자열이 아닌 경우에만 이미지를 처리
            if (menu_image != null && !menu_image.isEmpty()) {
                // 이미지 파일을 저장하고 파일 이름을 얻어옴
                fileName = saveImage(menu_image);
            }

            // menuDTO 객체에 데이터 설정
            menuDTO mdto = new menuDTO();
            mdto.setMenu_id(menu_id);
            mdto.setMenu_name(menu_name);
            mdto.setMenu_corner(menu_corner);
            mdto.setMenu_price(menu_price);
            mdto.setMenu_pack(menu_pack);

            // 이미지를 바꾼 경우에만 새로운 이미지 파일명을 저장
            if (fileName != null && !fileName.isEmpty()) {
                mdto.setMenu_image(fileName);
            } else {
                // 이미지를 바꾸지 않았을 때는 기존 이미지 파일명을 유지
                menuDTO MenuImageData = menuUpdateService.getMenuById(menu_id); // 서비스 메서드 호출을 통해 기존 데이터를 가져옴
                mdto.setMenu_image(MenuImageData.getMenu_image());
            }

            mdto.setMenu_sales(menu_sales);
            mdto.setMenu_regist(menu_regist);

            // 서비스를 사용하여 데이터베이스에 데이터 추가 또는 수정
            menuUpdateService.MenuUpdate(mdto);

            return ResponseEntity.ok("Data updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update data");
        }
    }

    // 이미지 저장
    private String saveImage(MultipartFile image) {
        if (image != null && !image.isEmpty()) {
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