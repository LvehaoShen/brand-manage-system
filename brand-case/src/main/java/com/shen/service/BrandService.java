package com.shen.service;

import com.shen.pojo.Brand;
import com.shen.pojo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandService {
    List<Brand> selectAll();

    void add(Brand brand);

    void deleteByIds(int[] ids);

    void deleteById(int id);

    Brand selectById(int id);

    void update(Brand brand);

    PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand);
}
