package com.whiteplanet.mapper;

import org.apache.ibatis.annotations.Delete;

import java.util.Date;

public interface DateDefaultMapper {

    @Delete({"select now()"})
    Date getDate();
}
