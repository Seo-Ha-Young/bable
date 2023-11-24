package writing.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import writing.board.dto.ImageDTO;
import writing.board.entity.Image_Blob;
import writing.board.repository.ImageRepository;

import javax.transaction.Transactional;
import java.util.Map;

@Service
@Log4j2
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService{
    private final ImageRepository imageRepository;

    @Override
    @Transactional
    public Long register(ImageDTO imageDTO) {
        Map<String, Object> entityMap = dtoToEntity(imageDTO);
        Image_Blob image_blob = (Image_Blob) entityMap.get("image");
        imageRepository.save(image_blob);
        return image_blob.getNo();
    }


}
