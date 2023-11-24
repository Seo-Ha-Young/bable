package writing.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import writing.board.entity.Image_Blob;

import java.util.List;
import java.util.Map;

public interface ImageRepository extends JpaRepository<Image_Blob, Long> {

    @Query("select no, regDate, img_name, img_blob from Image_Blob where no = :no")
    List<Object[]> getImageWithAll(Long no);

    @Query("select no, regDate, img_name, img_blob from Image_Blob")
    List<Object[]> getImageWithAll();

  //  @Query("insert into Image_Blob(img_name, img_blob) value(#{img_name}, #{bytes, jdbcType=BLOB, javaType[B]})")
   // Map<String,Object> saveImg(String img_name, Byte bytes);

}
