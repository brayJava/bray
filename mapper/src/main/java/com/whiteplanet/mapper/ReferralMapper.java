package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Referral;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface ReferralMapper {
    @Delete({
            "delete from referral",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into referral (id, source, ",
            "status, money, needs_order_id, ",
            "create_time, update_time, ",
            "timeout, timeout_time, ",
            "notes)",
            "values (#{id,jdbcType=VARCHAR}, #{source,jdbcType=INTEGER}, ",
            "#{status,jdbcType=INTEGER}, #{money,jdbcType=BIT}, #{needsOrderId,jdbcType=VARCHAR}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
            "#{timeout,jdbcType=BIT}, #{timeoutTime,jdbcType=TIMESTAMP}, ",
            "#{notes,jdbcType=LONGVARCHAR})"
    })
    int insert(Referral record);

    @InsertProvider(type=ReferralSqlProvider.class, method="insertSelective")
    int insertSelective(Referral record);

    @Select({
            "select",
            "id, source, status, money, needs_order_id, create_time, update_time, timeout, ",
            "timeout_time, notes",
            "from referral",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="money", property="money", jdbcType= JdbcType.BIT),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="timeout_time", property="timeoutTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    Referral selectByPrimaryKey(String id);

    @UpdateProvider(type=ReferralSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Referral record);

    @Update({
            "update referral",
            "set source = #{source,jdbcType=INTEGER},",
            "status = #{status,jdbcType=INTEGER},",
            "money = #{money,jdbcType=BIT},",
            "needs_order_id = #{needsOrderId,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "timeout = #{timeout,jdbcType=BIT},",
            "timeout_time = #{timeoutTime,jdbcType=TIMESTAMP},",
            "notes = #{notes,jdbcType=LONGVARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(Referral record);

    @Update({
            "update referral",
            "set notes = #{notes, jdbcType=LONGVARCHAR},",
            "source = #{source,jdbcType=INTEGER},",
            "status = #{status,jdbcType=INTEGER},",
            "money = #{money,jdbcType=BIT},",
            "needs_order_id = #{needsOrderId,jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "timeout = #{timeout,jdbcType=BIT},",
            "timeout_time = #{timeoutTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Referral record);

    @Select({
            "select",
            "id, status, create_time, source, needs_order_id, notes",
            "from referral",
            "where needs_order_id = #{needsOrderId,jdbcType=VARCHAR}",
            "and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    Referral selectByNeedOrder(@Param("needsOrderId") String needsOrderId, @Param("status") int status);

    @Select({
            "select",
            "r.id, r.status, r.create_time, r.source, r.needs_order_id, r.notes",
            "from referral as r, referral_doctor as rd",
            "where rd.doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and r.id = rd.referral_id"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<Referral> selectByDoctorId(String doctorId);

    @Select({
            "select",
            "r.id, r.money, r.status, r.create_time, r.source, r.needs_order_id, r.notes",
            "from referral as r",
            "where r.needs_order_id = #{needsOrderId}",
            "and r.`status` in(1, 0)"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="money", property="money", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    Referral selectByNeedsOrderId(String needsOrderId);

    @Select({
            "select",
            "r.id, r.status, r.create_time, r.source, r.needs_order_id, r.notes",
            "from referral as r",
            "where r.needs_order_id = #{needsOrderId}",
            "and r.status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    Referral selectByNeedsOrderIdNoStatus(String needsOrderId);

    @Select({
            "select",
            "r.id, r.status, r.create_time, r.source, r.needs_order_id, r.notes",
            "from referral as r",
            "where r.needs_order_id = #{needsOrderId}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    Referral selectByNeedsOrderIdNoStatusTrue(String needsOrderId);

    @Select({
            "select",
            "r.id, r.status, r.create_time, r.source, r.needs_order_id, r.notes",
            "from referral as r",
            "where r.needs_order_id = #{needsOrderId}",
            "and r.`status` = 1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    Referral selectByNeedsOrderIdRevice(String needsOrderId);

    /**
     * 转诊个数
     * @param needsOrderId
     * @return
     */
    @Select({
            "select count(1) from referral_doctor,referral",
            "where referral.id = referral_doctor.referral_id",
            "and referral.needs_order_id = #{needsOrderId,jdbcType=VARCHAR}"
    })
    int selectCountByNeedsOrderId(String needsOrderId);

    @Update({
            "update referral",
            "set source = #{source,jdbcType=INTEGER},",
            "status = #{status,jdbcType=INTEGER},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP}",
            "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateSourceAndStatusById(Referral referral);

    @Update({
            "update referral",
            "set status = #{status, jdbcType=INTEGER},",
            "update_time = #{updateTime, jdbcType=TIMESTAMP}",
            "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateStatusById(Referral referral);

    @Select({
            "select ref.* from needs_order nord,referral ref",
            "where nord.ref = true",
            "and nord.id = ref.needs_order_id",
            "and ref.status = 0",
            "and date_add(ref.create_time , interval 2 day) < now() ",
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="money", property="money", jdbcType= JdbcType.BIT),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="timeout_time", property="timeoutTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<Referral> selectReferralListByTimeoutZeroAndStatusZeroAndNowGreatThanTimeoutTime();

    @Select({
        "SELECT",
            "id, source, status, money, needs_order_id, create_time, update_time, timeout, timeout_time, notes",
        "FROM",
            "referral",
        "WHERE",
            "status = 0",
            "AND DATE_SUB(create_time,INTERVAL -2 DAY) < NOW()"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="money", property="money", jdbcType= JdbcType.BIT),
        @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
        @Result(column="timeout_time", property="timeoutTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<Referral> selectReferralListByStatusZeroAndCreateTimeTwoDay();

    @Select({
            "SELECT",
            "id, source, status, money, needs_order_id, create_time, update_time, timeout, timeout_time, notes",
            "FROM",
            "referral",
            "WHERE",
            "status = 0",
            "AND DATE_SUB(create_time,INTERVAL -1 DAY) < NOW()"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="source", property="source", jdbcType= JdbcType.INTEGER),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="money", property="money", jdbcType= JdbcType.BIT),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="timeout_time", property="timeoutTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="notes", property="notes", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<Referral> selectReferralListByStatusZeroAndCreateTimeOneDay();

}