package com.hang.mapper;

import com.hang.domain.Document;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentDao {

    public List<Document> selectAllDocument() throws Exception;

    @Delete("delete from document where id = #{id}")
    public void deleteDocumentById(Integer id) throws Exception;
}
