package com.ljl.mapper;

import com.ljl.pojo.medicine;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from medicine")
      List<medicine> list();
    @Delete("delete from medicine where id=#{id}")
    void deleteById(Integer id);

    @Insert("insert into medicine(id, Name, Manufacturer, Category, StockQuantity, ExpiryDate, PurchasePrice, SellingPrice) " +
            "values (#{id}, #{name}, #{manufacturer}, #{category}, #{stockQuantity}, " +
            "#{expiryDate}, #{purchasePrice}, #{sellingPrice})")
    void insert(medicine medicine);

}
