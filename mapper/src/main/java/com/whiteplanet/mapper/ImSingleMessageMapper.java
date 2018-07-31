package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.JMessageBean;
import com.whiteplanet.mapper.model.ImSingleMessage;
import com.whiteplanet.mapper.model.ImSingleMessageExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

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
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insert(ImSingleMessage record);

    @InsertProvider(type=ImSingleMessageSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int insertSelective(ImSingleMessage record);

     //批量插入
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    @InsertProvider(type=ImSingleMessageSqlProvider.class, method="insertBatch")
    int insertBatch(@Param("list") List<ImSingleMessage> list);

    @Select({
            "select MAX(msg_ctime) msgCtime from im_single_message"
    })
    //获取最新消息时间
    Date selectMaxMsgCtime();
    @Select({
            "select count(*) from im_single_message where from_id = #{patientId,jdbcType=VARCHAR} or target_id = #{patientId,jdbcType=VARCHAR}"
    })
    //获取患者用户聊天记录条数
    int selectCountById(@Param("patientId") String patientId);
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

    @Select({
            " SELECT " ,
            " im.from_id, " ,
            " max_time, " ,
            " msg_extras, " ,
            " msg_text, " ,
            " msg_type, " ,
            " target_id " ,
            " FROM " ,
            " ( " ,
            " SELECT " ,
            " from_id, " ,
            " max(msg_ctime) max_time " ,
            " FROM " ,
            " im_single_message " ,
            " WHERE " ,
            " target_id LIKE '%bsxqhz' " ,
            " AND msg_ctime >= #{startTime,jdbcType=VARCHAR} " ,
            " AND msg_ctime <= #{endTime,jdbcType=VARCHAR} " ,
            " GROUP BY " ,
            " from_id " ,
            " ) temp " ,
            " LEFT JOIN ( " ,
            "select",
                    "id, from_type, from_id, create_time, from_appkey, target_type, msg_extras, msg_text, ",
                    "msg_type, msg_richmedia_path, local_rechmedia_path, from_platform, target_id, ",
                    "version, msgid, msg_ctime, msg_level",
                    "from im_single_message",
            ") im ON ( " ,
            " temp.from_id = im.from_id " ,
            " AND temp.max_time = im.msg_ctime " ,
            " ) "
    })
    @Results({
            @Result(column="from_id", property="fromId", jdbcType=JdbcType.VARCHAR),
            @Result(column="max_time", property="maxTime", jdbcType=JdbcType.VARCHAR),
            @Result(column="msg_extras", property="msgExtras", jdbcType=JdbcType.VARCHAR),
            @Result(column="msg_text", property="msgText", jdbcType=JdbcType.VARCHAR),
            @Result(column="msg_type", property="msgType", jdbcType=JdbcType.VARCHAR),
            @Result(column="target_id", property="targetId", jdbcType=JdbcType.VARCHAR)
    })
    List<JMessageBean> selectJMessageByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);


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