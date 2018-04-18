package com.ujs.spmsys.service.impl;

import com.ujs.spmsys.StorageProperties;
import com.ujs.spmsys.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.Path;
import java.util.stream.Stream;

@Service
public class FileSystemStorageService implements StorageService {

//    private final Path rootLocation;
//
//    @Autowired
//    public FileSystemStorageService(StorageProperties storageProperties) {
//        this.rootLocation = Path.get
//    }
    @Override
    public void init() {

    }

    @Override
    public void store(MultipartFile file) {

    }

    @Override
    public Stream<Path> loadAll() {
        return null;
    }

    @Override
    public Path load(String filename) {
        return null;
    }

    @Override
    public Resource loadAsResource(String filename) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
