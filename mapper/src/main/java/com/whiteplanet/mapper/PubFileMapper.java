package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.PubFile;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PubFileMapper {
    @Delete({
        "delete from pub_file",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into pub_file (id, file_type, ",
        "file_path, create_time, ",
        "status)",
        "values (#{id,jdbcType=VARCHAR}, #{fileType,jdbcType=VARCHAR}, ",
        "#{filePath,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(PubFile record);

    @InsertProvider(type=PubFileSqlProvider.class, method="insertSelective")
    int insertSelective(PubFile record);

    @Select({
        "select",
        "id, file_type, file_path, create_time, status",
        "from pub_file",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="file_type", property="fileType", jdbcType= JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER)
    })
    PubFile selectByPrimaryKey(String id);

    @UpdateProvider(type=PubFileSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PubFile record);

    @Update({
        "update pub_file",
        "set file_type = #{fileType,jdbcType=VARCHAR},",
          "file_path = #{filePath,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PubFile record);
}