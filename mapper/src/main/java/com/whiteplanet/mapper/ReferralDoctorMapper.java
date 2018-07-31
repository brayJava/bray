package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ReferralDoctor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.HashMap;
import java.util.List;

public interface ReferralDoctorMapper {
    @Delete({
        "delete from referral_doctor",
                "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into referral_doctor (id, doctor_id, ",
            "referral_id, status, ",
            "money, create_time, ",
            "update_date)",
            "values (#{id,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{referralId,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
            "#{money,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(ReferralDoctor record);

    @InsertProvider(type=ReferralDoctorSqlProvider.class, method="insertSelective")
    int insertSelective(ReferralDoctor record);

    @Select({
            "select",
            "id, doctor_id, referral_id, status, money, grounds, create_time, update_date",
            "from referral_doctor",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="money", property="money", jdbcType= JdbcType.BIT),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    ReferralDoctor selectByPrimaryKey(String id);

    @UpdateProvider(type=ReferralDoctorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ReferralDoctor record);

    @Select({
            "select",
            "count(1)",
            "from referral_doctor",
            "where referral_id = #{referralId,jdbcType=VARCHAR}",
            "and status = 0"
    })
    int selectCountByReferralId(String referralId);

    @Update({
            "update referral_doctor",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "referral_id = #{referralId,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "money = #{money,jdbcType=BIT},",
            "grounds = #{grounds, jdbcType=VARCHAR},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ReferralDoctor record);

    @Select({
            "select",
            "id, status, create_time, doctor_id, referral_id, grounds",
            "from referral_doctor",
            "where referral_id = #{referralId,jdbcType=VARCHAR}",
            "and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR)
    })
    ReferralDoctor selectByReferralId(@Param("referralId") String referralId, @Param("status") int status);

    @Select({
            "select",
            "id, status, create_time, doctor_id, referral_id, grounds",
            "from referral_doctor",
            "where referral_id = #{referralId,jdbcType=VARCHAR}",
            "and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR)
    })
    List<ReferralDoctor> selectByReferralIdAllStatus(@Param("referralId") String referralId, @Param("status") int status);

    @Select({
            "select",
            "id, status, create_time, doctor_id, referral_id, grounds",
            "from referral_doctor",
            "where referral_id = #{referralId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR)
    })
    List<ReferralDoctor> selectByReferralIdNoStatus(@Param("referralId") String referralId);

    @Select({
            "select",
            "id, status, create_time, doctor_id, referral_id, grounds",
            "from referral_doctor",
            "where referral_id = #{referralId,jdbcType=VARCHAR}",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR)
    })
    List<ReferralDoctor> selectByReferralIdEnableStatus(@Param("referralId") String referralId);

    @Select({
            "select",
            "id, status, create_time, doctor_id, referral_id, grounds",
            "from referral_doctor",
            "where referral_id = #{referralId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR)
    })
    List<ReferralDoctor> selectByReferralIdDisableStatus(@Param("referralId") String referralId);

    @Select({
        "select",
        "id, status, grounds, money, create_time, doctor_id, referral_id, update_date",
        "from referral_doctor",
        "where referral_id = #{referralId, jdbcType=VARCHAR}",
        "and doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR),
        @Result(column ="money", property="money", jdbcType= JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    ReferralDoctor selectByReferralIdAndDoctorId(HashMap map);

    @Select({
        "select",
        "id, status, grounds, money, create_time, doctor_id, referral_id, update_date",
        "from referral_doctor",
        "where referral_id = #{referralId, jdbcType=VARCHAR}",
        "and doctor_id != #{doctorId, jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
        @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
        @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR),
        @Result(column ="money", property="money", jdbcType= JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<ReferralDoctor> selectReferralDoctorListByReferralIdAndNotDoctorId(HashMap map);

    @Select({
            "select",
            "id, status, grounds, money, create_time, doctor_id, referral_id, update_date",
            "from referral_doctor",
            "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and status = #{status, jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR),
            @Result(column ="money", property="money", jdbcType= JdbcType.BIT),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<ReferralDoctor> selectReferralDoctorListByDoctorIdAndStatus(ReferralDoctor referralDoctor);

    @Select({
            "select",
            "id, status, grounds, money, create_time, doctor_id, referral_id, update_date",
            "from referral_doctor",
            "where referral_id = #{referralId, jdbcType=VARCHAR}",
            "and status = #{status, jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="grounds", property="grounds", jdbcType= JdbcType.VARCHAR),
            @Result(column ="money", property="money", jdbcType= JdbcType.BIT),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="referral_id", property="referralId", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<ReferralDoctor> selectReferralDoctorListByReferralIdAndStatus(ReferralDoctor referralDoctor);


    @Update({
        "update referral_doctor",
        "set status = #{status, jdbcType=VARCHAR},",
        "money = #{money, jdbcType=VARCHAR},",
        "update_date = #{updateDate, jdbcType=TIMESTAMP}",
        "where id = #{id, jdbcType=INTEGER}"
    })
    int updateStatusAndMoneyById(ReferralDoctor referralDoctor);

    @Update({
        "update referral_doctor",
        "set status = #{status, jdbcType=VARCHAR},",
        "update_date = #{updateDate, jdbcType=TIMESTAMP}",
        "where referral_id = #{referralId, jdbcType=VARCHAR}"
    })
    int updateStatusByReferralId(ReferralDoctor referralDoctor);

    @Update({
            "update referral_doctor",
            "set status = #{status, jdbcType=INTEGER},",
            "update_date = #{updateDate, jdbcType=TIMESTAMP}",
            "where referral_id = #{referralId, jdbcType=VARCHAR}",
            "and doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    int updateStatusByReferralIdAndDoctorId(ReferralDoctor referralDoctor);

    @Update({
        "update referral_doctor",
        "set status = #{status, jdbcType=INTEGER},",
        "grounds = #{grounds, jdbcType=VARCHAR},",
        "update_date = #{updateDate, jdbcType=TIMESTAMP}",
        "where referral_id = #{referralId, jdbcType=VARCHAR}",
        "and doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    int updateStatusAndGroundsByReferralIdAndDoctorId(ReferralDoctor referralDoctor);
}