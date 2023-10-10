package imageOrFileUpload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import imageOrFileUpload.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {

}
