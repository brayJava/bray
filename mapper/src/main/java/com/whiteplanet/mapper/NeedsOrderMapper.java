package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.AppointmentBean;
import com.whiteplanet.mapper.model.NeedsOrder;
import com.whiteplanet.mapper.model.NeedsOrderInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.List;

public interface NeedsOrderMapper {
    @Delete({
            "delete from needs_order",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into needs_order (id, docker_id, ",
            "case_illness_id, status, ",
            "cancel, pay, ref, ",
            "cancel_date, create_time, ",
            "update_date, cancel_reason)",
            "values (#{id,jdbcType=VARCHAR}, #{dockerId,jdbcType=VARCHAR}, ",
            "#{caseIllnessId,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
            "#{cancel,jdbcType=INTEGER}, #{pay,jdbcType=BIT}, #{ref,jdbcType=BIT}, ",
            "#{cancelDate,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateDate,jdbcType=TIMESTAMP}, #{cancelReason,jdbcType=VARCHAR})"
    })
    int insert(NeedsOrder record);

    @InsertProvider(type=NeedsOrderSqlProvider.class, method="insertSelective")
    int insertSelective(NeedsOrder record);

    @Select({
            "select",
            "id, docker_id, case_illness_id, status, cancel, pay, ref, cancel_date, create_time, ",
            "update_date, cancel_reason",
            "from needs_order",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_reason", property="cancelReason", jdbcType= JdbcType.VARCHAR)
    })
    NeedsOrder selectByPrimaryKey(String id);

    @UpdateProvider(type=NeedsOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(NeedsOrder record);

    @Update({
            "update needs_order",
            "set docker_id = #{dockerId,jdbcType=VARCHAR},",
            "case_illness_id = #{caseIllnessId,jdbcType=VARCHAR},",
            "status = #{status,jdbcType=INTEGER},",
            "cancel = #{cancel,jdbcType=INTEGER},",
            "pay = #{pay,jdbcType=BIT},",
            "ref = #{ref,jdbcType=BIT},",
            "cancel_date = #{cancelDate,jdbcType=TIMESTAMP},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "cancel_reason = #{cancelReason,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(NeedsOrder record);

    /**
     * @param patientId 患者ID
     */
    @Select({

            "select no.id, d.real_name, ci.name as pname, ci.age, ci.sex, ci.phone, ci.illness, d.`department_name`",
            "from `needs_order` no, case_illness ci , doctor d",
            "where no.`case_illness_id` = ci.id",
            "and no.`docker_id` = d.id",
            "and ci.`patient_id` = #{patientId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id = true),
            @Result(column="real_name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="update_date", property="lastDateTime", jdbcType= JdbcType.TIMESTAMP)
    })
    List<AppointmentBean> selectByPatientID(String patientId);

    @Select({
            "select",
            "id, docker_id, case_illness_id, create_time, status, cancel, cancel_date, update_date, pay, ref, cancel_reason",
            "from needs_order",
            "where docker_id = #{doctorId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "pay", property = "pay", jdbcType = JdbcType.BIT),
            @Result(column = "ref", property = "ref", jdbcType = JdbcType.BIT),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    List<NeedsOrder> selectByDoctorId(String doctorId);

    @Select({
            "select",
            "id, docker_id, case_illness_id, create_time, status, cancel, cancel_date, update_date, pay, ref, cancel_reason",
            "from needs_order",
            "where docker_id = #{doctorId, jdbcType=VARCHAR}",
            "and status = 2"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "pay", property = "pay", jdbcType = JdbcType.BIT),
            @Result(column = "ref", property = "ref", jdbcType = JdbcType.BIT),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    List<NeedsOrder> selectByDoctorDiagnosised(String doctorId);

    @Select({
            "select",
            "id, docker_id, case_illness_id, create_time, status, cancel, cancel_date, update_date, pay, ref, cancel_reason",
            "from needs_order",
            "where docker_id = #{doctorId, jdbcType=VARCHAR}",
            "and status in(-1,3)",
            "order by create_time desc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "pay", property = "pay", jdbcType = JdbcType.BIT),
            @Result(column = "ref", property = "ref", jdbcType = JdbcType.BIT),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    List<NeedsOrder> selectByDoctorIdOver(String doctorId);

    @Select({
            "select",
            "id, docker_id, case_illness_id, create_time, status, cancel, cancel_date, update_date, pay, ref, cancel_reason",
            "from needs_order",
            "where docker_id = #{doctorId, jdbcType=VARCHAR}",
            "and status in(0,1,4)",
            "order by create_time desc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "pay", property = "pay", jdbcType = JdbcType.BIT),
            @Result(column = "ref", property = "ref", jdbcType = JdbcType.BIT),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    List<NeedsOrder> selectByDoctorIdUnknown(String doctorId);

    @Update({
            "update needs_order",
            "set status = #{status, jdbcType=INTEGER},",
            "ref = #{ref, jdbcType=INTEGER},",
            "update_date = #{updateDate, jdbcType=TIMESTAMP}",
            "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateStatusAndRefByNeedsOrderId(NeedsOrder needsOrder);

    @Update({
            "update needs_order",
            "set status = #{status, jdbcType=INTEGER},",
            "cancel = #{cancel, jdbcType=INTEGER},",
            "cancel_date = #{cancelDate, jdbcType=TIMESTAMP},",
            "update_date = #{updateDate, jdbcType=TIMESTAMP}",
            "where id = #{id, jdbcType=VARCHAR}"
    })
    int updateStatusAndCancelAndCancelDateByNeedsOrderId(NeedsOrder needsOrder);


    @Select({
            "select",
            "id, docker_id, case_illness_id, status, cancel, pay, ref, cancel_date, create_time, ",
            "update_date, cancel_reason",
            "from needs_order",
            "where case_illness_id = #{caseIllnessId, jdbcType=VARCHAR}",
            "and status != -2"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    NeedsOrder selectByCaseIllnessId(String caseIllnessId);

    @Select({
            "select",
            "   t.update_date",
            "from `needs_order` t",
            "where t.docker_id = #{doctorId, jdbcType=VARCHAR}",
            "and exists(select 1 from case_illness where patient_id = #{patientId, jdbcType=VARCHAR} and id = t.case_illness_id )",
            "order by t.update_date desc limit 1"
    })
    Date selectLastDateByDoctorId(@Param("doctorId") String doctorId, @Param("patientId") String patientId);

    @Update({
            "update needs_order",
            "set status = #{status, jdbcType=INTEGER},",
            "update_date = #{updateDate, jdbcType=TIMESTAMP}",
            "where id = #{id, jdbcType=TIMESTAMP}"
    })
    int updateStatusByNeedsOrderId(NeedsOrder needsOrder);

    @Select({
            "SELECT",
            "id, docker_id, case_illness_id, status, cancel, pay, ref, cancel_date, create_time, ",
            "update_date, cancel_reason",
            "FROM",
            "needs_order",
            "WHERE",
            "status = 0",
            "AND DATE_SUB(create_time,INTERVAL -2 DAY) < NOW()"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    List<NeedsOrder> selectNeedsOrder48HourCreateTimeTwoDay();

    @Select({
            "SELECT",
            "id, docker_id, case_illness_id, status, cancel, pay, ref, cancel_date, create_time, ",
            "update_date, cancel_reason",
            "FROM",
            "needs_order",
            "WHERE",
            "status = 0",
            "AND DATE_SUB(create_time,INTERVAL -1 DAY) < NOW()"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    List<NeedsOrder> selectNeedsOrderListCreateTimeOneDay();


    @Select({
            "SELECT",
            "ci.name AS case_illness_name, ci.illness AS case_illness_illness ,no.id, no.docker_id, no.case_illness_id, no.status, no.cancel, no.pay, no.ref, no.cancel_date, no.create_time, ",
            "no.update_date, no.cancel_reason",
            "FROM",
            "needs_order AS no,",
            "case_illness AS ci",
            "WHERE",
            "ci.patient_id = #{patientId, jdbcType=VARCHAR}",
            "AND ci.status = 1",  // 生成约诊单
            "AND no.case_illness_id = ci.id",
            "AND no.docker_id = #{doctorId, jdbcType=VARCHAR}",
            "AND no.status = 2"  // 0: 发送需求 1: 转诊 2: 接诊 3: 看诊完成
    })
    @Results({
            @Result(column="case_illness_name", property="caseIllnessName", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_illness", property="caseIllnessIllness", jdbcType= JdbcType.VARCHAR),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="docker_id", property="dockerId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="cancel", property="cancel", jdbcType= JdbcType.INTEGER),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "cancel_reason", property = "cancelReason", jdbcType = JdbcType.VARCHAR)
    })
    List<NeedsOrderInfo> selectNeedsOrderListByPatientIdAndDoctorId(@Param("patientId") String patientId, @Param("doctorId") String doctorId);
}
