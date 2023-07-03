package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Mendy
 * @create 2023-07-03 9:58
 */

@Mapper
public interface BookDao {

    @Select("select * from ssm_db.tbl_book where id = #{id}")
    public Book getById(Integer id);

}
