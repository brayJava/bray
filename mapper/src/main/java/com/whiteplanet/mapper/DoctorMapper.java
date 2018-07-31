package com.whiteplanet.mapper;

import com.whiteplanet.mapper.data.*;
import com.whiteplanet.mapper.model.Doctor;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.HashMap;
import java.util.List;

public interface DoctorMapper {
    @Delete({
            "delete from doctor",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into doctor (id, department_id, ",
            "hospital_id, code, ",
            "department_function_id, phone, ",
            "password, real_name, ",
            "sex, kinde, introduce, ",
            "treatment, treatment_money, ",
            "create_date, update_date, ",
            "status, faceimg, ",
            "credits, age, source, ",
            "department_name, department_function_name, ",
            "hospital_name, thumbs_up, ",
            "cryptogram)",
            "values (#{id,jdbcType=VARCHAR}, #{departmentId,jdbcType=VARCHAR}, ",
            "#{hospitalId,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
            "#{departmentFunctionId,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
            "#{password,jdbcType=VARCHAR}, #{realName,jdbcType=VARCHAR}, ",
            "#{sex,jdbcType=BIT}, #{kinde,jdbcType=VARCHAR}, #{introduce,jdbcType=VARCHAR}, ",
            "#{treatment,jdbcType=BIT}, #{treatmentMoney,jdbcType=DECIMAL}, ",
            "#{createDate,jdbcType=TIMESTAMP}, #{updateDate,jdbcType=TIMESTAMP}, ",
            "#{status,jdbcType=INTEGER}, #{faceimg,jdbcType=VARCHAR}, ",
            "#{credits,jdbcType=DECIMAL}, #{age,jdbcType=INTEGER}, #{source,jdbcType=VARCHAR}, ",
            "#{departmentName,jdbcType=VARCHAR}, #{departmentFunctionName,jdbcType=VARCHAR}, ",
            "#{hospitalName,jdbcType=VARCHAR}, #{thumbsUp,jdbcType=INTEGER}, ",
            "#{cryptogram,jdbcType=VARCHAR})"
    })
    int insert(Doctor record);

    @InsertProvider(type=DoctorSqlProvider.class, method="insertSelective")
    int insertSelective(Doctor record);

    @Select({
            "select",
            "id, department_id, hospital_id, code, department_function_id, phone, password, ",
            "real_name, sex, kinde, introduce, treatment, treatment_money, create_date, update_date, ",
            "status, faceimg, credits, age, source, department_name, department_function_name, ",
            "hospital_name, thumbs_up, cryptogram, step,is_first_login,identify_status,identify_remarks ",
            "from doctor",
            "order by dc.create_date desc"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_id", property="departmentId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="kinde", property="kinde", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="treatment", property="treatment", jdbcType= JdbcType.BIT),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="credits", property="credits", jdbcType= JdbcType.DECIMAL),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="thumbs_up", property="thumbsUp", jdbcType= JdbcType.INTEGER),
            @Result(column="cryptogram", property="cryptogram", jdbcType= JdbcType.VARCHAR),
            @Result(column="step", property="step", jdbcType= JdbcType.INTEGER),
            @Result(column="is_first_login", property="firstLogin", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_status", property="identifyStatus", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_remarks", property="identifyRemarks", jdbcType=JdbcType.VARCHAR)
    })
    List<Doctor> selectAllDocdor();
    @Select({
            "select",
            "id, department_id, hospital_id, code, department_function_id, phone, password, ",
            "real_name, sex, kinde, introduce, treatment, treatment_money, create_date, update_date, ",
            "status, faceimg, credits, age, source, department_name, department_function_name, ",
            "hospital_name, thumbs_up, cryptogram, step,is_first_login,identify_status,identify_remarks ",
            "from doctor",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_id", property="departmentId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="kinde", property="kinde", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="treatment", property="treatment", jdbcType= JdbcType.BIT),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="bgimg", property="bgimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="credits", property="credits", jdbcType= JdbcType.DECIMAL),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="thumbs_up", property="thumbsUp", jdbcType= JdbcType.INTEGER),
            @Result(column="cryptogram", property="cryptogram", jdbcType= JdbcType.VARCHAR),
            @Result(column="step", property="step", jdbcType= JdbcType.INTEGER),
            @Result(column="is_first_login", property="firstLogin", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_status", property="identifyStatus", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_remarks", property="identifyRemarks", jdbcType=JdbcType.VARCHAR)
    })
    Doctor selectByPrimaryKey(String id);

    @UpdateProvider(type=DoctorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Doctor record);

    @Update({
            "update doctor",
            "set department_id = #{departmentId,jdbcType=VARCHAR},",
            "hospital_id = #{hospitalId,jdbcType=VARCHAR},",
            "code = #{code,jdbcType=VARCHAR},",
            "department_function_id = #{departmentFunctionId,jdbcType=VARCHAR},",
            "phone = #{phone,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "real_name = #{realName,jdbcType=VARCHAR},",
            "sex = #{sex,jdbcType=BIT},",
            "kinde = #{kinde,jdbcType=VARCHAR},",
            "introduce = #{introduce,jdbcType=VARCHAR},",
            "treatment = #{treatment,jdbcType=BIT},",
            "treatment_money = #{treatmentMoney,jdbcType=DECIMAL},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP},",
            "status = #{status,jdbcType=INTEGER},",
            "faceimg = #{faceimg,jdbcType=VARCHAR},",
            "credits = #{credits,jdbcType=DECIMAL},",
            "age = #{age,jdbcType=INTEGER},",
            "source = #{source,jdbcType=VARCHAR},",
            "department_name = #{departmentName,jdbcType=VARCHAR},",
            "department_function_name = #{departmentFunctionName,jdbcType=VARCHAR},",
            "hospital_name = #{hospitalName,jdbcType=VARCHAR},",
            "thumbs_up = #{thumbsUp,jdbcType=INTEGER},",
            "cryptogram = #{cryptogram,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Doctor record);

    @Select({
            "select",
            "code",
            "from doctor",
            "order by create_date desc limit 1"
    })
    String selectByLastCode();

    @Select({
            "select",
            "count(1)",
            "from doctor"
    })
    int selectCount();

    @Select({
            "select",
            "count(1)",
            "from doctor",
            "where phone = #{phone,jdbcType=VARCHAR}"
    })
    int selectExistByPhone(String phone);

    @Select({
            "select",
            "id, department_id, hospital_id, code, department_function_id, phone, password, ",
            "real_name, sex, kinde, introduce, treatment, treatment_money, create_date, update_date, ",
            "status, faceimg, credits, age, source, department_name, department_function_name, ",
            "hospital_name,is_first_login",
            "from doctor",
            "where phone = #{phone,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_id", property="departmentId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="kinde", property="kinde", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="treatment", property="treatment", jdbcType= JdbcType.BIT),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="credits", property="credits", jdbcType= JdbcType.DECIMAL),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="is_first_login", property="firstLogin", jdbcType=JdbcType.BOOLEAN)
    })
    Doctor selectByPhone(String phone);

    @SelectProvider(type=DoctorSqlProvider.class, method="selectByDepartments")
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_id", property="departmentId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="kinde", property="kinde", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="treatment", property="treatment", jdbcType= JdbcType.BIT),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="credits", property="credits", jdbcType= JdbcType.DECIMAL),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR)
    })
    List<Doctor> selectByDepartments(@Param("ids") List<String> ids, @Param("patientId") String patientId);


    @SelectProvider(type=DoctorSqlProvider.class, method="selectPartnerByDocAndDf")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="hospital", property="hospital", jdbcType=JdbcType.VARCHAR),
            @Result(column="department", property="department", jdbcType=JdbcType.VARCHAR),
            @Result(column="hide", property="hide", jdbcType=JdbcType.BIT),
            @Result(column="faceimage", property="faceimage", jdbcType=JdbcType.VARCHAR)
    })
    List<DoctorPartnerBean> selectPartnerByDocAndDf(@Param("doctorId") String doctorId,
                                                    @Param("departmentFunctionId") String departmentFunctionId,
                                                    @Param("count") Integer count);


    @Select({
            "select d.id, dc.show as hide,d.`real_name` as `name`," ,
            " d.`department_name` as `department`, d.`hospital_name` as `hospital`, dc.show as hide, " ,
            "d.`faceimg` as `faceimage` " ,
            "from clinic c,doctor_clinic dc,doctor d",
            "where c.id = dc.clinic_id and dc.doctor_id = d.id",
            "and c.doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and d.department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital", property="hospital", jdbcType= JdbcType.VARCHAR),
            @Result(column="department", property="department", jdbcType= JdbcType.VARCHAR),
            @Result(column="hide", property="hide", jdbcType= JdbcType.BIT),
            @Result(column="faceimage", property="faceimage", jdbcType= JdbcType.VARCHAR)
    })
    List<DoctorPartnerBean> selectPartner(@Param("doctorId") String doctorId, @Param("departmentFunctionId") String departmentFunctionId);

    @Select({
            "select d.* " ,
            "from clinic c,doctor_clinic dc,doctor d",
            "where c.id = dc.clinic_id and dc.doctor_id = d.id",
            "and c.doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "and d.department_function_id = #{departmentFunctionId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_id", property="departmentId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="kinde", property="kinde", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="treatment", property="treatment", jdbcType= JdbcType.BIT),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="credits", property="credits", jdbcType= JdbcType.DECIMAL),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR)
    })
    List<Doctor> selectPartnerCard(@Param("doctorId") String doctorId, @Param("departmentFunctionId") String departmentFunctionId);

    @Select({
            "select d.department_function_id, d.department_function_name, count(1) as department_function_count",
            " from clinic c,doctor_clinic dc,doctor d",
            "where c.id = dc.clinic_id and dc.doctor_id = d.id",
            "and c.doctor_id = #{doctorId,jdbcType=VARCHAR}",
            "group by d.department_function_id, d.department_function_name"
    })
    @Results({
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_count", property="departmentFunctionCount", jdbcType= JdbcType.VARCHAR)
    })
    List<DepartmentFunctionDoctorBean> selectPartnerDepartmentFunction(String doctorId);

    @Select({"select max(treatment_money) as max,min(treatment_money) as min from doctor"})
    @Results({
            @Result(column="max", property="max", jdbcType= JdbcType.DECIMAL),
            @Result(column="min", property="min", jdbcType= JdbcType.DECIMAL)
    })
    DoctorMaxMin selectMaxMinMoney();

    @Select({
            "select treatment_money as money, count(1) as count " ,
            "from doctor " ,
            "group by treatment_money order by treatment_money asc"})
    @Results({
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="count", property="count", jdbcType= JdbcType.INTEGER)
    })
    List<Entry> selectLineAll();

    @Select({
            "select treatment_money as money, count(1) as count " ,
            "from doctor " ,
            "where department_id = #{departmentId,jdbcType=VARCHAR}",
            "group by treatment_money order by treatment_money asc"})
    @Results({
            @Result(column="money", property="money", jdbcType= JdbcType.DECIMAL),
            @Result(column="count", property="count", jdbcType= JdbcType.INTEGER)
    })
    List<Entry> selectLineCurrent(String departmentId);

    @Select({
            "select",
            "id, department_id, hospital_id, code, department_function_id, phone, password, ",
            "real_name, sex, kinde, introduce, treatment, treatment_money, create_date, update_date, ",
            "status, faceimg, credits, age, source, department_name, department_function_name, ",
            "hospital_name",
            "from doctor",
            "where id = #{doctorId, jdbcType=VARCHAR}",
            "and real_name like '%${realName}%'"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "department_id", property = "departmentId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hospital_id", property = "hospitalId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "code", property = "code", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_function_id", property = "departmentFunctionId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "real_name", property = "realName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sex", property = "sex", jdbcType = JdbcType.BIT),
            @Result(column = "kinde", property = "kinde", jdbcType = JdbcType.VARCHAR),
            @Result(column = "introduce", property = "introduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "treatment", property = "treatment", jdbcType = JdbcType.BIT),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "faceimg", property = "faceimg", jdbcType = JdbcType.VARCHAR),
            @Result(column = "credits", property = "credits", jdbcType = JdbcType.DECIMAL),
            @Result(column = "age", property = "age", jdbcType = JdbcType.INTEGER),
            @Result(column = "source", property = "source", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_name", property = "departmentName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_function_name", property = "departmentFunctionName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hospital_name", property = "hospitalName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "thumbs_up", property = "thumbsUp", jdbcType = JdbcType.INTEGER),
            @Result(column = "cryptogram", property = "cryptogram", jdbcType = JdbcType.VARCHAR)
    })
    Doctor selectByDoctorIdAndRealNameLike(HashMap map);

    @Select({
            "select doctor.*,",
            "(select count(1) from doctor_clinic where doctor_id = #{doctorId, jdbcType=VARCHAR}) obj_partner,",
            "(select count(1) from doctor_clinic,clinic where doctor_clinic.clinic_id = clinic.id and clinic.doctor_id = #{doctorId, jdbcType=VARCHAR}) as partner",
            "from doctor_phone, doctor ",
            "where doctor_phone.owner_doctor_id = doctor.id ",
            "and doctor_phone.doctor_id = #{doctorId, jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR, id = true),
            @Result(column = "department_id", property = "departmentId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hospital_id", property = "hospitalId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "code", property = "code", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_function_id", property = "departmentFunctionId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "real_name", property = "realName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sex", property = "sex", jdbcType = JdbcType.BIT),
            @Result(column = "kinde", property = "kinde", jdbcType = JdbcType.VARCHAR),
            @Result(column = "introduce", property = "introduce", jdbcType = JdbcType.VARCHAR),
            @Result(column = "treatment", property = "treatment", jdbcType = JdbcType.BIT),
            @Result(column = "treatment_money", property = "treatmentMoney", jdbcType = JdbcType.DECIMAL),
            @Result(column = "create_date", property = "createDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_date", property = "updateDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER),
            @Result(column = "faceimg", property = "faceimg", jdbcType = JdbcType.VARCHAR),
            @Result(column = "credits", property = "credits", jdbcType = JdbcType.DECIMAL),
            @Result(column = "age", property = "age", jdbcType = JdbcType.INTEGER),
            @Result(column = "source", property = "source", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_name", property = "departmentName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "department_function_name", property = "departmentFunctionName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "hospital_name", property = "hospitalName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "thumbs_up", property = "thumbsUp", jdbcType = JdbcType.INTEGER),
            @Result(column = "cryptogram", property = "cryptogram", jdbcType = JdbcType.VARCHAR),
            @Result(column = "obj_partner", property = "objPartner", jdbcType = JdbcType.INTEGER),
            @Result(column = "partner", property = "partner", jdbcType = JdbcType.INTEGER)
    })
    List<DoctorPhoneData> selectByDoctorPhone(String doctorId);

    /**
     * 根据条件查询对应医生用户
     * @return
     */
    @SelectProvider(type = DoctorSqlProvider.class,method = "selectDoctorByCondition")
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="department_id", property="departmentId", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_id", property="hospitalId", jdbcType= JdbcType.VARCHAR),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_id", property="departmentFunctionId", jdbcType= JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType= JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType= JdbcType.VARCHAR),
            @Result(column="real_name", property="realName", jdbcType= JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType= JdbcType.BIT),
            @Result(column="kinde", property="kinde", jdbcType= JdbcType.VARCHAR),
            @Result(column="introduce", property="introduce", jdbcType= JdbcType.VARCHAR),
            @Result(column="treatment", property="treatment", jdbcType= JdbcType.BIT),
            @Result(column="treatment_money", property="treatmentMoney", jdbcType= JdbcType.DECIMAL),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="faceimg", property="faceimg", jdbcType= JdbcType.VARCHAR),
            @Result(column="credits", property="credits", jdbcType= JdbcType.DECIMAL),
            @Result(column="age", property="age", jdbcType= JdbcType.INTEGER),
            @Result(column="source", property="source", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_name", property="departmentName", jdbcType= JdbcType.VARCHAR),
            @Result(column="department_function_name", property="departmentFunctionName", jdbcType= JdbcType.VARCHAR),
            @Result(column="hospital_name", property="hospitalName", jdbcType= JdbcType.VARCHAR),
            @Result(column="thumbs_up", property="thumbsUp", jdbcType= JdbcType.INTEGER),
            @Result(column="cryptogram", property="cryptogram", jdbcType= JdbcType.VARCHAR),
            @Result(column="step", property="step", jdbcType= JdbcType.INTEGER),
            @Result(column="is_first_login", property="firstLogin", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_status", property="identifyStatus", jdbcType=JdbcType.INTEGER),
            @Result(column="identify_remarks", property="identifyRemarks", jdbcType=JdbcType.VARCHAR)
    })
    List<Doctor> selectDoctorByCondition(@Param("doctorId") String doctorId,
                                         @Param("phone") String phone,
                                         @Param("realName") String realName,
                                         @Param("hospitalName") String hospitalName,
                                         @Param("status") String status);
    @Select({
            "SELECT",
            "count(*) range_count",
            "FROM",
            "doctor",
            "WHERE",
            "treatment_money BETWEEN #{lowTreatmentMoney,jdbcType=DECIMAL} AND #{highTreatmentMoney,jdbcType=DECIMAL} ",
            "AND source like '%#{source, jdbcType=VARCHAR}%' ",
            "AND department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
            "AND department_function like '%#{departmentFunction, jdbcType=VARCHAR}%' ",
            "AND date_format(d.update_date, '%Y/%m/%d') > #{startTime, jdbcType=VARCHAR} ",
            "AND date_format(d.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} "
    })
    int selectClinicPriceRange(ClinicPriceRangeBean clinicPriceRangeBean);

    @Select({
            " SELECT" ,
            " count(*) range_count " ,
            " FROM " ,
            " doctor d" ,
            " WHERE ",
            " d.treatment_money = 0 " ,
            " AND source like '%#{source, jdbcType=VARCHAR}%' ",
            " AND department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
            " AND department_function like '%#{departmentFunction, jdbcType=VARCHAR}%' ",
            " AND date_format(d.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} ",
            " AND date_format(d.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} "
    })
    int selectClinicZeroPrice(ClinicPriceRangeBean clinicPriceRangeBean);

    @Select({
            " SELECT " ,
            " date_format(d.update_date, '%Y/%m/%d') time, ",
            " TRUNCATE(avg(d.treatment_money),0) avg_money, ",
            " max(d.treatment_money) max_money, ",
            " MIN(d.treatment_money) min_money, ",
            "( ",
            " SELECT ",
            " count(*)",
            " FROM ",
            " doctor f ",
            " WHERE " ,
            "treatment_money = 0",
            " and date_format(f.update_date, '%Y/%m/%d') = time ",
            ") zero_count ",
            " FROM ",
            " doctor d ",
            " AND source like '%#{source, jdbcType=VARCHAR}%' ",
            " AND department_name like '%#{departmentName, jdbcType=VARCHAR}%' ",
            " AND department_function like '%#{departmentFunction, jdbcType=VARCHAR}%' ",
            " AND date_format(d.update_date, '%Y/%m/%d') >= #{startTime, jdbcType=VARCHAR} ",
            " AND date_format(d.update_date, '%Y/%m/%d') <= #{endTime, jdbcType=VARCHAR} " ,
            " GROUP BY time DESC "
    })
    List<ClinicPriceRelateBean> selectClinicPriceRelate(ClinicPriceRangeBean clinicPriceRangeBean);
}