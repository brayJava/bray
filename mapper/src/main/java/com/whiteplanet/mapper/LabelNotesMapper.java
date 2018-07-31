package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.LabelNotes;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LabelNotesMapper {
    @Delete({
            "delete from label_notes",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into label_notes (id, name, ",
            "type, status, create_time, ",
            "update_time)",
            "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
            "#{type,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(LabelNotes record);

    @InsertProvider(type=LabelNotesSqlProvider.class, method="insertSelective")
    int insertSelective(LabelNotes record);

    @Select({
            "select",
            "id, name, type, status, create_time, update_time",
            "from label_notes",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP)
    })
    LabelNotes selectByPrimaryKey(String id);

    @UpdateProvider(type=LabelNotesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LabelNotes record);

    @Update({
            "update label_notes",
            "set name = #{name,jdbcType=VARCHAR},",
            "type = #{type,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(LabelNotes record);

    @Select({
            "select " ,
            "distinct id, name " ,
            "from `label_notes` l,`department_function_patient` d " ,
            "where l.`id` = d.`label_notes_id` " ,
            "and d.status = 0",
            "and l.type ='patient'",
            "and l.status =0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR)
    })
    List<LabelNotes> selectPatientLabelNotes();
}