package writing.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import writing.board.dto.ImageDTO;
import writing.board.service.ImageService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Controller
@Log4j2
@RequestMapping("/upload")
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;
    @Value("${writing.board.upload.path}")
    private String uploadPath;

    @GetMapping("/image")
    public void image() { };

//    @PostMapping("/image")
//    public String addImage(ImageDTO imageDTO) {
//        log.info("ImageDTO : "+ imageDTO);
//    return null;
//    }

    @PostMapping("/image")
    @ResponseBody
    public String save(@RequestParam Map<String, Object> paramMap) throws Exception {

        Map<String,Object> map = new HashMap<String, Object>();

        String base64 = paramMap.get("base64").toString();

        byte[] bytes = base64.getBytes();

        map.put("bytes",bytes);

     //  ImageService(map);

        return "";
    }

}
