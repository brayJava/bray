package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.OrderIllnessBean;
import com.whiteplanet.mapper.model.Order;
import com.whiteplanet.mapper.model.OrderPro;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface OrderMapper {
    @Delete({
            "delete from `order`",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into `order` (id, doctor_id, ",
            "pay, vis, appraise, ",
            "timeout, status, create_time, ",
            "update_time, needs_order_id, ",
            "case_illness_id, pay_date, ",
            "vis_date, timeout_date, ",
            "finsh_date, cancel_date, ",
            "appraise_date, money, treatment_money, fabulous)",
            "values (#{id,jdbcType=VARCHAR}, #{doctorId,jdbcType=VARCHAR}, ",
            "#{pay,jdbcType=BIT}, #{vis,jdbcType=BIT}, #{appraise,jdbcType=BIT}, ",
            "#{timeout,jdbcType=BIT}, #{status,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{updateTime,jdbcType=TIMESTAMP}, #{needsOrderId,jdbcType=VARCHAR}, ",
            "#{caseIllnessId,jdbcType=VARCHAR}, #{payDate,jdbcType=TIMESTAMP}, ",
            "#{visDate,jdbcType=TIMESTAMP}, #{timeoutDate,jdbcType=TIMESTAMP}, ",
            "#{finshDate,jdbcType=TIMESTAMP}, #{cancelDate,jdbcType=TIMESTAMP}, ",
            "#{appraiseDate,jdbcType=TIMESTAMP}, #{money,jdbcType=BOOLEAN}, #{treatmentMoney,jdbcType=DECIMAL},#{fabulous,jdbcType=BIT})"
    })
    int insert(Order record);

    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    int insertSelective(Order record);

    @Select({
            "select",
            "id, doctor_id, pay, vis, appraise, timeout, status, create_time, update_time, ",
            "needs_order_id, case_illness_id, pay_date, vis_date, timeout_date, finsh_date, ",
            "cancel_date, appraise_date, money, treatment_money, fabulous",
            "from `order`",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
    })
    Order selectByPrimaryKey(String id);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    @Update({
            "update `order`",
            "set doctor_id = #{doctorId,jdbcType=VARCHAR},",
            "pay = #{pay,jdbcType=BIT},",
            "vis = #{vis,jdbcType=BIT},",
            "appraise = #{appraise,jdbcType=BIT},",
            "timeout = #{timeout,jdbcType=BIT},",
            "status = #{status,jdbcType=INTEGER},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "update_time = #{updateTime,jdbcType=TIMESTAMP},",
            "needs_order_id = #{needsOrderId,jdbcType=VARCHAR},",
            "case_illness_id = #{caseIllnessId,jdbcType=VARCHAR},",
            "pay_date = #{payDate,jdbcType=TIMESTAMP},",
            "vis_date = #{visDate,jdbcType=TIMESTAMP},",
            "timeout_date = #{timeoutDate,jdbcType=TIMESTAMP},",
            "finsh_date = #{finshDate,jdbcType=TIMESTAMP},",
            "cancel_date = #{cancelDate,jdbcType=TIMESTAMP},",
            "appraise_date = #{appraiseDate,jdbcType=TIMESTAMP},",
            "money = #{money,jdbcType=BOOLEAN},",
            "treatment_money = #{treatmentMoney,jdbcType=DECIMAL},",
            "fabulous = #{fabulous,jdbcType=BIT}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Order record);

    @Select({
            "select",
            "id, doctor_id, pay, vis, appraise, timeout, status, create_time, update_time,",
            "needs_order_id, case_illness_id, pay_date, vis_date, timeout_date, finsh_date, cancel_date, appraise_date, money, treatment_money, fabulous",
            "from `order`",
            "where case_illness_id = #{caseIllnessId,jdbcType=VARCHAR}",
            "and status != -1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
    })
    Order selectByCaseIllnessId(String caseIllnessId);

    @Select({
            "select",
            "id, doctor_id, pay, vis, appraise, timeout, status, ",
            "create_time, update_time, needs_order_id, case_illness_id, pay_date, vis_date, timeout_date,",
            "finsh_date, cancel_date, appraise_date, money, treatment_money,fabulous",
            "from `order`",
            "where needs_order_id = #{needsOrderId, jdbcType=VARCHAR}",
            "and status != -1"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property = "timeout", jdbcType = JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column = "pay_date", property = "payDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "vis_date", property = "visDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "timeout_date", property = "timeoutDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
    })
    Order selectByNeedsOrder(String needsOrderId);

    @Select({
            "select",
            "id, doctor_id, pay, vis, appraise, timeout, status, ",
            "create_time, update_time, needs_order_id, case_illness_id, pay_date, vis_date, timeout_date,",
            "finsh_date, cancel_date, appraise_date, money, treatment_money,fabulous",
            "from `order`",
            "where needs_order_id = #{needsOrderId, jdbcType=VARCHAR}",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property = "timeout", jdbcType = JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column = "pay_date", property = "payDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "vis_date", property = "visDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "timeout_date", property = "timeoutDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
    })
    Order selectByNeedsOrderEnable(String needsOrderId);

    @Select({
            "select",
            "id, doctor_id, pay, vis, appraise, timeout, status, ",
            "create_time, update_time, needs_order_id, case_illness_id, pay_date, vis_date, timeout_date,",
            "finsh_date, cancel_date, appraise_date, money, treatment_money,fabulous",
            "from `order`",
            "where needs_order_id = #{needsOrderId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property = "timeout", jdbcType = JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column = "pay_date", property = "payDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "vis_date", property = "visDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "timeout_date", property = "timeoutDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
    })
    Order selectByNeedsOrderAll(String needsOrderId);

    @Select({
            "select",
            "id, doctor_id, pay, vis, appraise, timeout, status, ",
            "create_time, update_time, needs_order_id, case_illness_id, pay_date, vis_date, timeout_date,",
            "finsh_date, cancel_date, appraise_date, money, treatment_money, fabulous",
            "from `order`",
            "where needs_order_id = #{needsOrderId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property = "timeout", jdbcType = JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column = "pay_date", property = "payDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "vis_date", property = "visDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "timeout_date", property = "timeoutDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
    })
    Order selectByNeedsOrderNoStatus(String needsOrderId);

    @Select({
            "select `visiting`.`time` ",
            "from `order`,`visiting` ",
            "where `order`.`id` = `visiting`.order_id ",
            "and `order`.doctor_id = #{doctorId,jdbcType=VARCHAR} ",
            "and `visiting`.`time` >= now()",
            "and `visiting`.status = 0",
            "and YEAR(`visiting`.`time`) = #{year,jdbcType=VARCHAR} ",
            "and Month(`visiting`.`time`) = #{month,jdbcType=VARCHAR} ",
            "and `order`.status in(0,1)"
    })
    List<Date> selectByDoctorIdAndAfter(@Param("doctorId") String doctorId, @Param("year") String year, @Param("month") String month);

    @Select({
            "select",
            "   `visiting`.`time`,",
            "   `visiting`.`order_id`,",
            "   `order`.`needs_order_id`,",
            "   `needs_order`.`ref`,",
            "   `needs_order`.`docker_id` as ref_doctor_id,",
            "   `case_illness`.`name`,",
            "   `case_illness`.`age`,",
            "   `case_illness`.`sex`,",
            "   `case_illness`.`phone`,",
            "   `case_illness`.`id` as illness_id,",
            "   `case_illness`.`illness`",
            "from `order`,`visiting`,`needs_order`,`case_illness`",
            "where `order`.`id` = `visiting`.order_id",
            "   and not exsit()",
            "   and `order`.needs_order_id = needs_order.id",
            "   and needs_order.case_illness_id = `case_illness`.id",
            "   and not exists(select 1 from diagnosis_stop where order_id = `order`.id and `status` = 0)",
            "   and `order`.`doctor_id` = #{doctorId,jdbcType=VARCHAR} ",
            "   and date_format(`visiting`.`time`, '%Y-%m-%d') == #{date,jdbcType=VARCHAR}",
            "   and `order`.status in(0,1)",
            "   and `visiting`.status = 0",
            "order by `visiting`.`time` desc"
    })
    @Results({
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="illness_id", property="illnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR)
    })
    List<OrderIllnessBean> selectByDoctorIdAndDateFormatAfterNow(@Param("doctorId") String doctorId, @Param("date") String date);

    @Select({
            "select",
            "   `visiting`.`time`,",
            "   `visiting`.`order_id`,",
            "   `order`.`needs_order_id`,",
            "   `needs_order`.`ref`,",
            "   `needs_order`.`docker_id` as ref_doctor_id,",
            "   `case_illness`.`name`,",
            "   `case_illness`.`age`,",
            "   `case_illness`.`sex`,",
            "   `case_illness`.`phone`,",
            "   `case_illness`.`id` as illness_id,",
            "   `case_illness`.`illness`",
            "from `order`,`visiting`,`needs_order`,`case_illness`",
            "where `order`.`id` = `visiting`.order_id",
            "   and `order`.needs_order_id = needs_order.id",
            "   and needs_order.case_illness_id = `case_illness`.id",
            "   and not exists(select 1 from diagnosis_stop where order_id = `order`.id and `status` = 0)",
            "   and `order`.`doctor_id` = #{doctorId,jdbcType=VARCHAR} ",
            "   and `visiting`.`time` >= now()",
            "   and `order`.status in(0,1)",
            "   and `visiting`.status = 0",
            "order by `visiting`.`time` desc"
    })
    @Results({
            @Result(column="time", property="time", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="order_id", property="orderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="illness_id", property="illnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref", property="ref", jdbcType= JdbcType.BIT),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="illness", property="illness", jdbcType= JdbcType.VARCHAR),
            @Result(column="ref_doctor_id", property="refDoctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR)
    })
    List<OrderIllnessBean> selectByDoctorIdAndAfterNow(@Param("doctorId") String doctorId);

    @Select({
            "select",
            "   distinct date_format(`visiting`.`time`, '%Y-%m-%d')",
            "from `order`,`visiting`",
            "where `order`.`id` = `visiting`.order_id",
            "   and `order`.`doctor_id` = #{doctorId,jdbcType=VARCHAR}",
            "   and `visiting`.`time` >= now()",
            "   and `order`.status in(0,1)"
    })
    List<String> selectVisTimeByDoctorId(@Param("doctorId") String doctorId);

    @Select({
            "select",
            "v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time, o.needs_order_id, ",
            "o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, visiting as v",
            "where o.doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and date(v.time) between #{timeA, jdbcType=TIMESTAMP} and #{timeB, jdbcType=TIMESTAMP}",
            "and o.status = 0",
            "and o.id = v.order_id",
            "and v.status = 0",
            "order by visiting_time asc"
    })
    @Results({
            @Result(column="visiting_time", property="visitingTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    List<OrderPro> selectOrderProByDoctorIdAndVisitingTime(HashMap map);

    @Select({
            "select",
            "v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time, o.needs_order_id, ",
            "o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, visiting as v",
            "where o.doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and date(v.time) between #{timeA, jdbcType=TIMESTAMP} and #{timeB, jdbcType=TIMESTAMP}",
            "and o.status = #{status, jdbcType=INTEGER}",
            "and o.id = v.order_id",
            "and v.status = 0",
            "order by visiting_time asc"
    })
    @Results({
            @Result(column="visiting_time", property="visitingTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    List<OrderPro> selectOrderProByDoctorIdAndStatusAndVisitingTime(HashMap map);

    @Select({
            "select",
            "v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time, o.needs_order_id, ",
            "o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, visiting as v",
            "where o.needs_order_id = #{needsOrderId, jdbcType=VARCHAR}",
            "and o.id = v.order_id",
            "and v.status = 0",
            "order by visiting_time asc"
    })
    @Results({
            @Result(column="visiting_time", property="visitingTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    OrderPro selectOrderProByNeedsOrderId(String needsOrderId);

    @Select({
            "select",
            "v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time, o.needs_order_id, ",
            "o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, visiting as v",
            "where o.doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and o.status = #{status, jdbcType=INTEGER}",
            "and o.id = v.order_id",
            "order by visiting_time asc"
    })
    @Results({
            @Result(column="visiting_time", property="visitingTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    List<OrderPro> selectOrderProListByDoctorIdAndStatus(HashMap map);

    @Select({
            "select distinct v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, " ,
            "o.appraise, o.timeout, o.status, o.create_time, o.update_time, " ,
            "o.needs_order_id, o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, " ,
            "o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, visiting as v",
            "where",
            "doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and o.status = 0",
            "and o.id = v.order_id",
            "and v.status = 0",
            "order by visiting_time desc"
    })
    @Results({
            @Result(column="visiting_time", property="visitingTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    List<OrderPro> selectOrderProListByDoctorId(@Param("doctorId") String doctorId);

    @Select({
            "select",
            "v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time, o.needs_order_id, ",
            "o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, visiting as v",
            "where o.doctor_id = #{doctorId, jdbcType=VARCHAR}",
            "and o.status in(-1,1)",
            "and o.id = v.order_id",
            "order by visiting_time asc"
    })
    @Results({
            @Result(column="visiting_time", property="visitingTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    List<OrderPro> selectByDoctorIdAndOver(String doctorId);

    @Select({
            "select ord.id,ord.needs_order_id,ord.case_illness_id,ord.doctor_id from `order` ord, visiting vis",
            "where ord.id = vis.order_id",
            "and ord.pay = false or pay is null",
            "and DATE_SUB(vis.`time`,INTERVAL 1 HOUR) < now()",
            "and ord.status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
    })
    List<Order> selectOrderListByStatusAndPayTimeoutZeroAndNowGreatThanTimeoutDate();

    @Select({
            "select ord.id, ord.treatment_money, ord.money,ord.needs_order_id,ord.case_illness_id,ord.doctor_id from `order` ord, visiting vis",
            "where ord.id = vis.order_id",
            "and ord.`status` = 0",
            "and ord.`pay` = true",
            "and date_add(vis.`time`,INTERVAL 2 HOUR)< now()"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
    })
    List<Order> selectVisFinshing();

    @Select({
            "select",
            "o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time,",
            "o.needs_order_id, o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, `visiting` as v",
            "where o.status = 0",
            "and o.timeout = 0",
            "and (o.pay is NULL or o.pay = 0)",
            "and o.id = v.order_id",
            "and DATE_SUB(v.time,INTERVAL 1 DAY) < now()"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    List<Order> selectOrderListByStatusZeroAndPayTimeoutZero();

    @Select({
            "select",
            "o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time,",
            "o.needs_order_id, o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
            "from `order` as o, visiting as v",
            "where o.status = 0",
            "and o.pay = TRUE",
            "and o.vis = TRUE",
            "and v.order_id = o.id",
            "and #{time, jdbcType=TIMESTAMP} > v.time"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL)
    })
    List<Order>   selectOrderListByStatusOneAndTime(String time);

//    @Select({
//            "select",
//            "v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time, o.needs_order_id, ",
//            "o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
//            "from `order` as o, visiting as v",
//            "where o.doctor_id = #{doctorId, jdbcType=VARCHAR}",
//            "and o.id = v.order_id",
////            "and #{time, jdbcType=TIMESTAMP} >= o.pay_date",  // 改改改
//            "and #{time, jdbcType=TIMESTAMP} <= v.time "
//    })
//    @Results({
//            @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
//            @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="pay", property="pay", jdbcType=JdbcType.BIT),
//            @Result(column="vis", property="vis", jdbcType=JdbcType.BIT),
//            @Result(column="appraise", property="appraise", jdbcType=JdbcType.BIT),
//            @Result(column="timeout", property="timeout", jdbcType=JdbcType.BIT),
//            @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
//            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="needs_order_id", property="needsOrderId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="case_illness_id", property="caseIllnessId", jdbcType=JdbcType.VARCHAR),
//            @Result(column="pay_date", property="payDate", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="vis_date", property="visDate", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="timeout_date", property="timeoutDate", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="finsh_date", property="finshDate", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="cancel_date", property="cancelDate", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="appraise_date", property="appraiseDate", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
//            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
//            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
//    })
//    List<OrderPro> selectOrderProListByDoctorIdAndAfterTime(@Param("doctorId") String doctorId, @Param("time") String time);

    @Select({
        "select",
        "v.time as visiting_time, o.id, o.doctor_id, o.pay, o.vis, o.appraise, o.timeout, o.status, o.create_time, o.update_time, o.needs_order_id, ",
        "o.case_illness_id, o.pay_date, o.vis_date, o.timeout_date, o.finsh_date, o.cancel_date, o.appraise_date, o.money, o.treatment_money",
        "from `order` as o, visiting as v",
        "where o.status = 0",
        "and o.pay = TRUE",
        "and o.id = v.order_id",
        "and v.time > DATE_SUB(now(),INTERVAL 30 MINUTE)",
        "and v.time < DATE_SUB(now(),INTERVAL -30 MINUTE)"
    })
    @Results({
            @Result(column="visiting_time", property="visitingTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="doctor_id", property="doctorId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay", property="pay", jdbcType= JdbcType.BIT),
            @Result(column="vis", property="vis", jdbcType= JdbcType.BIT),
            @Result(column="appraise", property="appraise", jdbcType= JdbcType.BIT),
            @Result(column="timeout", property="timeout", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="needs_order_id", property="needsOrderId", jdbcType= JdbcType.VARCHAR),
            @Result(column="case_illness_id", property="caseIllnessId", jdbcType= JdbcType.VARCHAR),
            @Result(column="pay_date", property="payDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="vis_date", property="visDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="timeout_date", property="timeoutDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="finsh_date", property="finshDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="cancel_date", property="cancelDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="appraise_date", property="appraiseDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column = "money", property = "money", jdbcType = JdbcType.BOOLEAN),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "fabulous", property = "fabulous", jdbcType = JdbcType.BIT)
    })
    List<OrderPro> selectOrderProListByDoctorIdAndVisitingTimeBetweenOneHour();



}
