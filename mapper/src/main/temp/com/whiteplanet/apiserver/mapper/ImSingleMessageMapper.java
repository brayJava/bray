package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.ImSingleMessage;
import com.whiteplanet.mapper.model.ImSingleMessageExample;
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

public interface ImSingleMessageMapper {
    @SelectProvider(type=ImSingleMessageSqlProvider.class, method="countByExample")
    int countByExample(ImSingleMessageExample example);

    @DeleteProvider(type=ImSingleMessageSqlProvider.class, method="deleteByExample")
    int deleteByExample(ImSingleMessageExample example);

    @Delete({
        "delete from im_single_message",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into im_single_message (id, from_type, ",
        "from_id, create_time, ",
        "from_appkey, target_type, ",
        "msg_extras, msg_text, ",
        "msg_type, msg_richmedia_path, ",
        "local_rechmedia_path, from_platform, ",
        "target_id, version, ",
        "msgid, msg_ctime, ",
        "msg_level)",
        "values (#{id,jdbcType=BIGINT}, #{fromType,jdbcType=VARCHAR}, ",
        "#{fromId,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{fromAppkey,jdbcType=VARCHAR}, #{targetType,jdbcType=VARCHAR}, ",
        "#{msgExtras,jdbcType=VARCHAR}, #{msgText,jdbcType=VARCHAR}, ",
        "#{msgType,jdbcType=VARCHAR}, #{msgRichmediaPath,jdbcType=VARCHAR}, ",
        "#{localRechmediaPath,jdbcType=VARCHAR}, #{fromPlatform,jdbcType=VARCHAR}, ",
        "#{targetId,jdbcType=VARCHAR}, #{version,jdbcType=VARCHAR}, ",
        "#{msgid,jdbcType=VARCHAR}, #{msgCtime,jdbcType=TIMESTAMP}, ",
        "#{msgLevel,jdbcType=VARCHAR})"
    })
    int insert(ImSingleMessage record);

    @InsertProvider(type=ImSingleMessageSqlProvider.class, method="insertSelective")
    int insertSelective(ImSingleMessage record);

    @SelectProvider(type=ImSingleMessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="from_type", property="fromType", jdbcType=JdbcType.VARCHAR),
        @Result(column="from_id", property="fromId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="from_appkey", property="fromAppkey", jdbcType=JdbcType.VARCHAR),
        @Result(column="target_type", property="targetType", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_extras", property="msgExtras", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_text", property="msgText", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_type", property="msgType", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_richmedia_path", property="msgRichmediaPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="local_rechmedia_path", property="localRechmediaPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="from_platform", property="fromPlatform", jdbcType=JdbcType.VARCHAR),
        @Result(column="target_id", property="targetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="msgid", property="msgid", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_ctime", property="msgCtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="msg_level", property="msgLevel", jdbcType=JdbcType.VARCHAR)
    })
    List<ImSingleMessage> selectByExample(ImSingleMessageExample example);

    @Select({
        "select",
        "id, from_type, from_id, create_time, from_appkey, target_type, msg_extras, msg_text, ",
        "msg_type, msg_richmedia_path, local_rechmedia_path, from_platform, target_id, ",
        "version, msgid, msg_ctime, msg_level",
        "from im_single_message",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="from_type", property="fromType", jdbcType=JdbcType.VARCHAR),
        @Result(column="from_id", property="fromId", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="from_appkey", property="fromAppkey", jdbcType=JdbcType.VARCHAR),
        @Result(column="target_type", property="targetType", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_extras", property="msgExtras", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_text", property="msgText", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_type", property="msgType", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_richmedia_path", property="msgRichmediaPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="local_rechmedia_path", property="localRechmediaPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="from_platform", property="fromPlatform", jdbcType=JdbcType.VARCHAR),
        @Result(column="target_id", property="targetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="msgid", property="msgid", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_ctime", property="msgCtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="msg_level", property="msgLevel", jdbcType=JdbcType.VARCHAR)
    })
    ImSingleMessage selectByPrimaryKey(Long id);

    @UpdateProvider(type=ImSingleMessageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ImSingleMessage record, @Param("example") ImSingleMessageExample example);

    @UpdateProvider(type=ImSingleMessageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ImSingleMessage record, @Param("example") ImSingleMessageExample example);

    @UpdateProvider(type=ImSingleMessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ImSingleMessage record);

    @Update({
        "update im_single_message",
        "set from_type = #{fromType,jdbcType=VARCHAR},",
          "from_id = #{fromId,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "from_appkey = #{fromAppkey,jdbcType=VARCHAR},",
          "target_type = #{targetType,jdbcType=VARCHAR},",
          "msg_extras = #{msgExtras,jdbcType=VARCHAR},",
          "msg_text = #{msgText,jdbcType=VARCHAR},",
          "msg_type = #{msgType,jdbcType=VARCHAR},",
          "msg_richmedia_path = #{msgRichmediaPath,jdbcType=VARCHAR},",
          "local_rechmedia_path = #{localRechmediaPath,jdbcType=VARCHAR},",
          "from_platform = #{fromPlatform,jdbcType=VARCHAR},",
          "target_id = #{targetId,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=VARCHAR},",
          "msgid = #{msgid,jdbcType=VARCHAR},",
          "msg_ctime = #{msgCtime,jdbcType=TIMESTAMP},",
          "msg_level = #{msgLevel,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ImSingleMessage record);
}