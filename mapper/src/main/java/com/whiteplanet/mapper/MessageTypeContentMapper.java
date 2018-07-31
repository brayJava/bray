package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.MessageTypeContent;
import com.whiteplanet.mapper.model.MessageTypeContentExample;
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

public interface MessageTypeContentMapper {
    @SelectProvider(type=MessageTypeContentSqlProvider.class, method="countByExample")
    int countByExample(MessageTypeContentExample example);

    @DeleteProvider(type=MessageTypeContentSqlProvider.class, method="deleteByExample")
    int deleteByExample(MessageTypeContentExample example);

    @Delete({
        "delete from message_type_content",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into message_type_content (id, msg__word_type, ",
        "msg_word_content)",
        "values (#{id,jdbcType=INTEGER}, #{msgWordType,jdbcType=INTEGER}, ",
        "#{msgWordContent,jdbcType=VARCHAR})"
    })
    int insert(MessageTypeContent record);

    @InsertProvider(type=MessageTypeContentSqlProvider.class, method="insertSelective")
    int insertSelective(MessageTypeContent record);

    @SelectProvider(type=MessageTypeContentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="msg__word_type", property="msgWordType", jdbcType=JdbcType.INTEGER),
        @Result(column="msg_word_content", property="msgWordContent", jdbcType=JdbcType.VARCHAR)
    })
    List<MessageTypeContent> selectByExample(MessageTypeContentExample example);

    @Select({
        "select",
        "id, msg__word_type, msg_word_content",
        "from message_type_content",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="msg__word_type", property="msgWordType", jdbcType=JdbcType.INTEGER),
        @Result(column="msg_word_content", property="msgWordContent", jdbcType=JdbcType.VARCHAR)
    })
    MessageTypeContent selectByPrimaryKey(Integer id);
    /**
     * 获取所有常用话术
     * @return
     */
    @Select({
            "select",
            "id, msg__word_type, msg_word_content",
            "from message_type_content"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="msg__word_type", property="msgWordType", jdbcType=JdbcType.INTEGER),
            @Result(column="msg_word_content", property="msgWordContent", jdbcType=JdbcType.VARCHAR)
    })
    List<MessageTypeContent> selectAllMsgWordTypes();

    @UpdateProvider(type=MessageTypeContentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MessageTypeContent record, @Param("example") MessageTypeContentExample example);

    @UpdateProvider(type=MessageTypeContentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MessageTypeContent record, @Param("example") MessageTypeContentExample example);

    @UpdateProvider(type=MessageTypeContentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MessageTypeContent record);

    @Update({
        "update message_type_content",
        "set msg__word_type = #{msgWordType,jdbcType=INTEGER},",
          "msg_word_content = #{msgWordContent,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MessageTypeContent record);
}