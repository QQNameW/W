package com.demo.dao;

import com.demo.pojo.BookBean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface BookDao {
    /**
     * 查询全部书本信息
     *
     * @return List<BookBean>
     */
    List<BookBean> QueryAll();

    /**
     * 根据关键字查询
     *
     * @param key
     * @return BookBean
     */
    BookBean QueryBookByKey(String key);

    /**
     * 添加书本信息
     *
     * @param bookBean
     * @return int
     */
    int AddBook(BookBean bookBean);

    /**
     * 更新书本信息
     *
     * @param bookBean
     * @return BookBean
     */
    int UpdataBooks(BookBean bookBean);

    /**
     * 根据id删除书本信息
     *
     * @param id
     * @return
     */
    int DeleteBooks(String id);
}
