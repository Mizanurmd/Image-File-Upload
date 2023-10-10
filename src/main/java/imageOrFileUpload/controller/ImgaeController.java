package imageOrFileUpload.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import imageOrFileUpload.service.ImageService;

@RestController
@RequestMapping("/imageOrFile")
public class ImgaeController {
	@Autowired
	private ImageService imgSer;

	@PostMapping("/save")
	public String saveImgeorFile(
			@RequestParam("file")MultipartFile file,
			@RequestParam("name")String name,
			@RequestParam("description")String description) throws IOException {

		return imgSer.saveImage(file, name, description);

	}

}
