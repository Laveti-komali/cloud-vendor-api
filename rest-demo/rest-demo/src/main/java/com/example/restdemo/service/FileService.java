package com.example.restdemo.service;

import com.example.restdemo.model.FileModel;
import java.util.List;
public interface FileService {
    public void saveFile(FileModel fileModel);
    public List<FileModel> getAllFiles();
    public FileModel getFile(Long id);
}
