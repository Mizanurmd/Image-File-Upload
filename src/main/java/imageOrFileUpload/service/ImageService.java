package imageOrFileUpload.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import imageOrFileUpload.entity.Image;
import imageOrFileUpload.repository.ImageRepository;

@Service
public class ImageService {
	
	@Autowired
	private ImageRepository imgRepo;
	
	public String saveImage(MultipartFile file, String name,String description) throws IOException {
		Image img = new Image();
		img.setName(name);
		img.setDescription(description);
		img.setImage(file.getBytes());
		imgRepo.save(img);
		return "Image save in DB";
		
		
	}
	
	

}
