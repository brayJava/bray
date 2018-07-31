package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.PubFile;
import com.whiteplanet.mapper.model.PubFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PubFileMapper {
    @SelectProvider(type=PubFileSqlProvider.class, method="countByExample")
    int countByExample(PubFileExample example);

    @DeleteProvider(type=PubFileSqlProvider.class, method="deleteByExample")
    int deleteByExample(PubFileExample example);

    @Delete({
        "delete from pub_file",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into pub_file (id, file_type, ",
        "file_path, create_time, ",
        "status, img_type)",
        "values (#{id,jdbcType=VARCHAR}, #{fileType,jdbcType=VARCHAR}, ",
        "#{filePath,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{imgType,jdbcType=INTEGER})"
    })
    int insert(PubFile record);

    @InsertProvider(type=PubFileSqlProvider.class, method="insertSelective")
    int insertSelective(PubFile record);

    @SelectProvider(type=PubFileSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="img_type", property="imgType", jdbcType=JdbcType.INTEGER)
    })
    List<PubFile> selectByExample(PubFileExample example);

    @Select({
        "select",
        "id, file_type, file_path, create_time, status, img_type",
        "from pub_file",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="img_type", property="imgType", jdbcType=JdbcType.INTEGER)
    })
    PubFile selectByPrimaryKey(String id);

    @UpdateProvider(type=PubFileSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PubFile record, @Param("example") PubFileExample example);

    @UpdateProvider(type=PubFileSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PubFile record, @Param("example") PubFileExample example);

    @UpdateProvider(type=PubFileSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PubFile record);

    @Update({
        "update pub_file",
        "set file_type = #{fileType,jdbcType=VARCHAR},",
          "file_path = #{filePath,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "img_type = #{imgType,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PubFile record);
}