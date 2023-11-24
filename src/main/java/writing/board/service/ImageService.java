package writing.board.service;

import writing.board.dto.ImageDTO;
import writing.board.entity.Image_Blob;

import java.util.HashMap;
import java.util.Map;

public interface ImageService {


    Long register(ImageDTO imageDTO);

    default Map<String, Object> dtoToEntity(ImageDTO imageDTO) {
        Map<String, Object> entityMap = new HashMap<>();
        Image_Blob image_blob = Image_Blob.builder()
                .img_name(imageDTO.getImg_name())
                .img_blob(imageDTO.getImg_blob()).build();
        entityMap.put("image", image_blob);

        return entityMap;
    }
    default void saveImg(Map<String, Object> map) {

    }

}
