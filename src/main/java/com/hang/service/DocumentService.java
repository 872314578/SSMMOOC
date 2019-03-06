package com.hang.service;

import com.hang.domain.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentService {

    public  List<Document> getAllDocuments() throws Exception;

    public  void removeDocumentsById(Integer id) throws Exception;

    public  List<Document> getDocumentsByName(String name) throws Exception;

}
