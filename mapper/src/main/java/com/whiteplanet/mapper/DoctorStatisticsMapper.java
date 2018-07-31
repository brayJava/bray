package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.WeekDoctorStatistics;
import com.whiteplanet.mapper.data.StatisticsWeekCount;
import com.whiteplanet.mapper.model.DoctorStatistics;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.HashMap;

public interface DoctorStatisticsMapper {
    @Delete({
            "delete from doctor_statistics",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
    @Insert({
            "insert into doctor_statistics (id, doctor_id, ",
            "time, partner_count, ",
            "partner_two, customer_count, ",
            "profit, profit_ref, ",
            "invitations_doctor, invitations_doctor_read, ",
            "invitations_doctor_register, apply_clinic, ",
            "apply_clinic_read, apply_clinic_ok, ",
            "send_customer, send_customer_read, ",
            "send_customer_follow, clinic_count)",
            "values (#{id,jdbcType=INTEGER}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{time,jdbcType=TIMESTAMP}, #{partnerCount,jdbcType=INTEGER}, ",
            "#{partnerTwo,jdbcType=INTEGER}, #{customerCount,jdbcType=INTEGER}, ",
            "#{profit,jdbcType=DECIMAL}, #{profitRef,jdbcType=DECIMAL}, ",
            "#{invitationsDoctor,jdbcType=INTEGER}, #{invitationsDoctorRead,jdbcType=INTEGER}, ",
            "#{invitationsDoctorRegister,jdbcType=INTEGER}, #{applyClinic,jdbcType=INTEGER}, ",
            "#{applyClinicRead,jdbcType=INTEGER}, #{applyClinicOk,jdbcType=INTEGER}, ",
            "#{sendCustomer,jdbcType=INTEGER}, #{sendCustomerRead,jdbcType=INTEGER}, ",
            "#{sendCustomerFollow,jdbcType=INTEGER}, #{clinicCount,jdbcType=INTEGER})"
    })
    int insert(DoctorStatistics record);

    @InsertProvider(type=DoctorStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(DoctorStatistics record);

    @Select({
            "select",
            "id, doctor_id, time, partner_count, partner_two, customer_count, profit, profit_ref, ",
            "invitations_doctor, invitations_doctor_read, invitations_doctor_register, apply_clinic, ",
            "apply_clinic_read, apply_clinic_ok, send_customer, send_customer_read, send_customer_follow, ",
            "clinic_count",
            "from doctor_statistics",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="partner_count", property="partnerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="partner_two", property="partnerTwo", jdbcType= JdbcType.INTEGER),
            @Result(column="customer_count", property="customerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="profit", property="profit", jdbcType= JdbcType.DECIMAL),
            @Result(column="profit_ref", property="profitRef", jdbcType= JdbcType.DECIMAL),
            @Result(column="invitations_doctor", property="invitationsDoctor", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_read", property="invitationsDoctorRead", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_register", property="invitationsDoctorRegister", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic", property="applyClinic", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_read", property="applyClinicRead", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_ok", property="applyClinicOk", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer", property="sendCustomer", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_read", property="sendCustomerRead", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_follow", property="sendCustomerFollow", jdbcType= JdbcType.INTEGER),
            @Result(column="clinic_count", property="clinicCount", jdbcType= JdbcType.INTEGER)
    })
    DoctorStatistics selectByPrimaryKey(Integer id);

    @UpdateProvider(type=DoctorStatisticsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DoctorStatistics record);

    @Update({
            "update doctor_statistics",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "time = #{time,jdbcType=TIMESTAMP},",
            "partner_count = #{partnerCount,jdbcType=INTEGER},",
            "partner_two = #{partnerTwo,jdbcType=INTEGER},",
            "customer_count = #{customerCount,jdbcType=INTEGER},",
            "profit = #{profit,jdbcType=DECIMAL},",
            "profit_ref = #{profitRef,jdbcType=DECIMAL},",
            "invitations_doctor = #{invitationsDoctor,jdbcType=INTEGER},",
            "invitations_doctor_read = #{invitationsDoctorRead,jdbcType=INTEGER},",
            "invitations_doctor_register = #{invitationsDoctorRegister,jdbcType=INTEGER},",
            "apply_clinic = #{applyClinic,jdbcType=INTEGER},",
            "apply_clinic_read = #{applyClinicRead,jdbcType=INTEGER},",
            "apply_clinic_ok = #{applyClinicOk,jdbcType=INTEGER},",
            "send_customer = #{sendCustomer,jdbcType=INTEGER},",
            "send_customer_read = #{sendCustomerRead,jdbcType=INTEGER},",
            "send_customer_follow = #{sendCustomerFollow,jdbcType=INTEGER},",
            "clinic_count = #{clinicCount,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DoctorStatistics record);

    @Select({
            "select * from (select",
            "   YEARWEEK(`time`) as `week`,",
            "        sum(partner_count) as `partner_count`",
            "        from doctor_statistics",
            "        where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "           and YEARWEEK(time) = YEARWEEK(now())",
            "                group by YEARWEEK(time)",
            ") t"
    })
    @Results({
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="partner_count", property="count", jdbcType= JdbcType.INTEGER),
    })
    StatisticsWeekCount selectWeekPartnerByDoctorId(String doctorId);

    @Select({
            "select * from (select",
            "   YEARWEEK(`time`) as `week`,",
            "        sum(clinic_count) as `clinic_count`",
            "        from doctor_statistics",
            "        where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "           and YEARWEEK(time) = YEARWEEK(now())",
            "                group by YEARWEEK(`time`)",
            ") t"
    })
    @Results({
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="clinic_count", property="count", jdbcType= JdbcType.INTEGER),
    })
    StatisticsWeekCount selectWeekClinicByDoctorId(String doctorId);

    @Select({
            "select * from (select",
            "   YEARWEEK(`time`) as `week`,",
            "sum(partner_count)as partner_count,",
            "sum(partner_two)as partner_two,",
            "sum(customer_count)as customer_count,",
            "sum(profit)as profit,",
            "sum(profit_ref)as profit_ref,",
            "sum(invitations_doctor)as invitations_doctor,",
            "sum(invitations_doctor_read)as invitations_doctor_read,",
            "sum(invitations_doctor_register) as invitations_doctor_register,",
            "sum(apply_clinic) as apply_clinic,",
            "sum(apply_clinic_read) as apply_clinic_read,",
            "sum(apply_clinic_ok) as apply_clinic_ok,",
            "sum(send_customer) as send_customer,",
            "sum(send_customer_read) as send_customer_read,",
            "sum(send_customer_follow) as send_customer_follow,",
            "sum(clinic_count) as clinic_count,",
            "sum(department_count) as department_count",
            "        from doctor_statistics",
            "        where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "           and YEARWEEK(time) = YEARWEEK(now())",
            "                group by YEARWEEK(time)",
            ") t"
    })
    @Results({
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="partner_count", property="partnerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="partner_two", property="partnerTwo", jdbcType= JdbcType.INTEGER),
            @Result(column="customer_count", property="customerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="profit", property="profit", jdbcType= JdbcType.DECIMAL),
            @Result(column="profit_ref", property="profitRef", jdbcType= JdbcType.DECIMAL),
            @Result(column="invitations_doctor", property="invitationsDoctor", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_read", property="invitationsDoctorRead", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_register", property="invitationsDoctorRegister", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic", property="applyClinic", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_read", property="applyClinicRead", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_ok", property="applyClinicOk", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer", property="sendCustomer", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_read", property="sendCustomerRead", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_follow", property="sendCustomerFollow", jdbcType= JdbcType.INTEGER),
            @Result(column="clinic_count", property="clinicCount", jdbcType= JdbcType.INTEGER),
            @Result(column="department_count", property="departmentCount", jdbcType= JdbcType.INTEGER)

    })
    WeekDoctorStatistics selectWeekAllClinicByDoctorId(String doctorId);


    @Select({
            "select * from (select",
            "   YEARWEEK(`time`) as `week`,",
            "sum(partner_count)as partner_count,",
            "sum(partner_two)as partner_two,",
            "sum(customer_count)as customer_count,",
            "sum(profit)as profit,",
            "sum(profit_ref)as profit_ref,",
            "sum(invitations_doctor)as invitations_doctor,",
            "sum(invitations_doctor_read)as invitations_doctor_read,",
            "sum(invitations_doctor_register) as invitations_doctor_register,",
            "sum(apply_clinic) as apply_clinic,",
            "sum(apply_clinic_read) as apply_clinic_read,",
            "sum(apply_clinic_ok) as apply_clinic_ok,",
            "sum(send_customer) as send_customer,",
            "sum(send_customer_read) as send_customer_read,",
            "sum(send_customer_follow) as send_customer_follow,",
            "sum(clinic_count) as clinic_count,",
            "sum(department_count) as department_count",
            "        from doctor_statistics",
            "        where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "           and YEARWEEK(time) = YEARWEEK(now()) - 1",
            "                group by YEARWEEK(time)",
            ") t"
    })
    @Results({
            @Result(column="week", property="week", jdbcType= JdbcType.INTEGER),
            @Result(column="partner_count", property="partnerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="partner_two", property="partnerTwo", jdbcType= JdbcType.INTEGER),
            @Result(column="customer_count", property="customerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="profit", property="profit", jdbcType= JdbcType.DECIMAL),
            @Result(column="profit_ref", property="profitRef", jdbcType= JdbcType.DECIMAL),
            @Result(column="invitations_doctor", property="invitationsDoctor", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_read", property="invitationsDoctorRead", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_register", property="invitationsDoctorRegister", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic", property="applyClinic", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_read", property="applyClinicRead", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_ok", property="applyClinicOk", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer", property="sendCustomer", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_read", property="sendCustomerRead", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_follow", property="sendCustomerFollow", jdbcType= JdbcType.INTEGER),
            @Result(column="clinic_count", property="clinicCount", jdbcType= JdbcType.INTEGER),
            @Result(column="department_count", property="departmentCount", jdbcType= JdbcType.INTEGER)

    })
    WeekDoctorStatistics selectWeekPrevClinicByDoctorId(String doctorId);

    @Select({
            "select * from (select",
            "sum(partner_count)as partner_count,",
            "sum(partner_two)as partner_two,",
            "sum(customer_count)as customer_count,",
            "sum(profit)as profit,",
            "sum(profit_ref)as profit_ref,",
            "sum(invitations_doctor)as invitations_doctor,",
            "sum(invitations_doctor_read)as invitations_doctor_read,",
            "sum(invitations_doctor_register) as invitations_doctor_register,",
            "sum(apply_clinic) as apply_clinic,",
            "sum(apply_clinic_read) as apply_clinic_read,",
            "sum(apply_clinic_ok) as apply_clinic_ok,",
            "sum(send_customer) as send_customer,",
            "sum(send_customer_read) as send_customer_read,",
            "sum(send_customer_follow) as send_customer_follow,",
            "sum(clinic_count) as clinic_count,",
            "sum(department_count) as department_count",
            "        from doctor_statistics",
            "        where doctor_id = #{doctorId,jdbcType=VARCHAR}",
            ") t"
    })
    @Results({
            @Result(column="partner_count", property="partnerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="partner_two", property="partnerTwo", jdbcType= JdbcType.INTEGER),
            @Result(column="customer_count", property="customerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="profit", property="profit", jdbcType= JdbcType.DECIMAL),
            @Result(column="profit_ref", property="profitRef", jdbcType= JdbcType.DECIMAL),
            @Result(column="invitations_doctor", property="invitationsDoctor", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_read", property="invitationsDoctorRead", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_register", property="invitationsDoctorRegister", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic", property="applyClinic", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_read", property="applyClinicRead", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_ok", property="applyClinicOk", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer", property="sendCustomer", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_read", property="sendCustomerRead", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_follow", property="sendCustomerFollow", jdbcType= JdbcType.INTEGER),
            @Result(column="clinic_count", property="clinicCount", jdbcType= JdbcType.INTEGER),
            @Result(column="department_count", property="departmentCount", jdbcType= JdbcType.INTEGER)
    })
    DoctorStatistics selectAllClinicByDoctorId(String doctorId);

    @SelectProvider(type=DoctorStatisticsSqlProvider.class, method="selectWinCountByDoctorStatistics")
    int selectWinCountByDoctorStatistics(DoctorStatistics doctorStatistics);


    @Select({
            "select",
            "id, doctor_id, time, partner_count, partner_two, customer_count, profit, profit_ref, ",
            "invitations_doctor, invitations_doctor_read, invitations_doctor_register, apply_clinic, ",
            "apply_clinic_read, apply_clinic_ok, send_customer, send_customer_read, send_customer_follow, ",
            "clinic_count",
            "from doctor_statistics",
            "where doctor_id = #{doctorId, jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="partner_count", property="partnerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="partner_two", property="partnerTwo", jdbcType= JdbcType.INTEGER),
            @Result(column="customer_count", property="customerCount", jdbcType= JdbcType.INTEGER),
            @Result(column="profit", property="profit", jdbcType= JdbcType.DECIMAL),
            @Result(column="profit_ref", property="profitRef", jdbcType= JdbcType.DECIMAL),
            @Result(column="invitations_doctor", property="invitationsDoctor", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_read", property="invitationsDoctorRead", jdbcType= JdbcType.INTEGER),
            @Result(column="invitations_doctor_register", property="invitationsDoctorRegister", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic", property="applyClinic", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_read", property="applyClinicRead", jdbcType= JdbcType.INTEGER),
            @Result(column="apply_clinic_ok", property="applyClinicOk", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer", property="sendCustomer", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_read", property="sendCustomerRead", jdbcType= JdbcType.INTEGER),
            @Result(column="send_customer_follow", property="sendCustomerFollow", jdbcType= JdbcType.INTEGER),
            @Result(column="clinic_count", property="clinicCount", jdbcType= JdbcType.INTEGER)
    })
    DoctorStatistics selectByDoctorId(String doctorId);

    @Select({
        "select",
        "id, doctor_id, time, partner_count, partner_two, customer_count, profit, profit_ref, ",
        "invitations_doctor, invitations_doctor_read, invitations_doctor_register, apply_clinic, ",
        "apply_clinic_read, apply_clinic_ok, send_customer, send_customer_read, send_customer_follow, ",
        "clinic_count",
        "from doctor_statistics",
        "where doctor_id = #{doctorId, jdbcType=INTEGER}",
        "and time = #{currentDay, jdbcType=TIMESTAMP}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
        @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="partner_count", property="partnerCount", jdbcType= JdbcType.INTEGER),
        @Result(column="partner_two", property="partnerTwo", jdbcType= JdbcType.INTEGER),
        @Result(column="customer_count", property="customerCount", jdbcType= JdbcType.INTEGER),
        @Result(column="profit", property="profit", jdbcType= JdbcType.DECIMAL),
        @Result(column="profit_ref", property="profitRef", jdbcType= JdbcType.DECIMAL),
        @Result(column="invitations_doctor", property="invitationsDoctor", jdbcType= JdbcType.INTEGER),
        @Result(column="invitations_doctor_read", property="invitationsDoctorRead", jdbcType= JdbcType.INTEGER),
        @Result(column="invitations_doctor_register", property="invitationsDoctorRegister", jdbcType= JdbcType.INTEGER),
        @Result(column="apply_clinic", property="applyClinic", jdbcType= JdbcType.INTEGER),
        @Result(column="apply_clinic_read", property="applyClinicRead", jdbcType= JdbcType.INTEGER),
        @Result(column="apply_clinic_ok", property="applyClinicOk", jdbcType= JdbcType.INTEGER),
        @Result(column="send_customer", property="sendCustomer", jdbcType= JdbcType.INTEGER),
        @Result(column="send_customer_read", property="sendCustomerRead", jdbcType= JdbcType.INTEGER),
        @Result(column="send_customer_follow", property="sendCustomerFollow", jdbcType= JdbcType.INTEGER),
        @Result(column="clinic_count", property="clinicCount", jdbcType= JdbcType.INTEGER)
    })
    DoctorStatistics selectByDoctorIdAndTime(HashMap map);

    @Update({
        "update doctor_statistics",
        "set partner_count = partner_count + 1",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "and time = #{currentDay, jdbcType=TIMESTAMP}"
    })
    int updatePartnerCountAddOneByTimeAndDoctorId(HashMap map);

    @Update({
        "update doctor_statistics",
        "set apply_clinic = apply_clinic + 1",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "and time = #{currentDay, jdbcType=TIMESTAMP}"
    })
    int updateApplyClinicAddOneByTimeAndDoctorId(HashMap map);

    @Update({
        "update doctor_statistics",
        "set clinic_count = clinic_count + 1",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "and time = #{currentDay, jdbcType=TIMESTAMP}"
    })
    int updateClinicCountAddOneByTimeAndDoctorId(HashMap map);

    @Update({
        "update doctor_statistics",
        "set department_count = department_count + 1",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "and time = #{currentDay, jdbcType=TIMESTAMP}"
    })
    int updateDepartmentCountAddOneByTimeAndDoctorId(HashMap map);

    @Update({
        "update doctor_statistics",
        "set invitations_doctor = invitations_doctor + 1",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "and time = #{currentDay, jdbcType=TIMESTAMP}"
    })
    int updateInvitationsDoctorAddOneByTimeAndDoctorId(HashMap map);

    @Update({
        "update doctor_statistics",
        "set partner_two = #{partnerTwo, jdbcType=INTEGER}",
        "where doctor_id = #{doctorId, jdbcType=VARCHAR}",
        "and time = #{currentDay, jdbcType=TIMESTAMP}"
    })
    int updatePartnerTwoByTimeAndDoctorIdAndPartnerTwo(HashMap map);
}