package com.shen.mapper;

import com.shen.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {
    @Select("select * from tb_brand;")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    @Select("select * from tb_brand where id=#{id};")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status});")
    void add(Brand brand);

    void deleteByIds(@Param("ids") int[] ids);

    @Delete("delete from tb_brand where id=#{id};")
    void deleteById(int id);

    @Update("update tb_brand set brand_name = #{brandName},company_name = #{companyName},ordered = #{ordered},description = #{description},status = #{status} where id = #{id}")
    void update(Brand brand);

    List<Brand> selectByPageAndCondition(@Param("begin") int begin, @Param("size") int size, @Param("brand") Brand brand);

    int selectTotalCountByCondition(Brand brand);

}
