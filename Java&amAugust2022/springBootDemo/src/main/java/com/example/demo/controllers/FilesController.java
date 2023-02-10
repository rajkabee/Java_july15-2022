package com.example.demo.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/files")
public class FilesController {
	@GetMapping("/upload")
	public String fileUploadForm() {
		return "fileUpload";
	}
	
	@PostMapping("/upload")
	public String fileUplaodForm(@RequestParam("image") MultipartFile file) {
		if(!file.isEmpty()) {
			
			try {
				String destination = new ClassPathResource("/static").getFile().getAbsolutePath();
				Files.copy(file.getInputStream(), Paths.get(destination+"/"+file.getOriginalFilename()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "fileUpload";
	}
}
