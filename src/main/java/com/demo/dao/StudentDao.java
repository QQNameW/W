package com.demo.dao;

import com.demo.pojo.StudentBean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface StudentDao {
    List<StudentBean> QueryAll();

    StudentBean QueryByKey(String key);

    int AddStudent(StudentBean studentBean);

    int UpdataStudent(StudentBean studentBean);

    int DeleteStudent(String id);
}
