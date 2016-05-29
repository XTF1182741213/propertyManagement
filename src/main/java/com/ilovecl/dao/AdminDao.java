package com.ilovecl.dao;

import com.ilovecl.entity.Admin;

/**
 * @author qiuyongchen
 *         email:qiuych3@mail2.sysu.edu.cn
 * @since 2016-05-29 15:06
 */
public interface AdminDao {
    Admin queryById(int id);
}
