package com.example.restdemo.service.impl;

import com.example.restdemo.model.FileModel;
import com.example.restdemo.repository.FileRepository;
import com.example.restdemo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class FileServiceImpl implements FileService {
    @Autowired
    FileRepository fileRepository;
    public void saveFile(FileModel fileModel){
        fileRepository.save(fileModel);
    }
    public List<FileModel> getAllFiles(){
        return fileRepository.findAll();
    }
    public FileModel getFile(Long id){
        return fileRepository.findById(id).get();
    }
}
