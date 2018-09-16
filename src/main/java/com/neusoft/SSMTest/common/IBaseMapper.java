package com.neusoft.SSMTest.common;


import java.util.List;

/**
 * Created by xhbg on 2018/9/12.
 */
public interface IBaseMapper<T> {

    T selectOne(T t);

    List<T> selectAll(T t);

    Integer insert(T t);

    Integer update(T t);

    Integer deleteByPK(T t);
}
