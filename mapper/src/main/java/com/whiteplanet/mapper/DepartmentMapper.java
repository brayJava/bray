package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.Department;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DepartmentMapper {
    @Delete({
            "delete from department",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
            "insert into department (id, code, ",
            "name, pid, min_money, ",
            "max_money, coustom, status, ",
            "use_count, create_date, ",
            "update_date)",
            "values (#{id,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
            "#{name,jdbcType=VARCHAR}, #{pid,jdbcType=VARCHAR}, #{minMoney,jdbcType=INTEGER}, ",
            "#{maxMoney,jdbcType=INTEGER}, #{coustom,jdbcType=BIT}, #{status,jdbcType=INTEGER}, ",
            "#{useCount,jdbcType=INTEGER}, #{createDate,jdbcType=TIMESTAMP}, ",
            "#{updateDate,jdbcType=TIMESTAMP})"
    })
    int insert(Department record);

    @InsertProvider(type=DepartmentSqlProvider.class, method="insertSelective")
    int insertSelective(Department record);

    @Select({
            "select",
            "id, code, name, pid, min_money, max_money, coustom, status, use_count, create_date, visiting,",
            "update_date",
            "from department",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="min_money", property="minMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="max_money", property="maxMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="coustom", property="coustom", jdbcType= JdbcType.BIT),
            @Result(column="visiting", property="visiting", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="use_count", property="useCount", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    Department selectByPrimaryKey(String id);

    @Select({
            "select code from department where id = (select pid from department where id = #{id,jdbcType=VARCHAR})"
    })
    String selectParentCodeByPrimaryKey(String id);

    @UpdateProvider(type=DepartmentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Department record);

    @Update({
            "update department",
            "set code = #{code,jdbcType=VARCHAR},",
            "name = #{name,jdbcType=VARCHAR},",
            "pid = #{pid,jdbcType=VARCHAR},",
            "min_money = #{minMoney,jdbcType=INTEGER},",
            "max_money = #{maxMoney,jdbcType=INTEGER},",
            "coustom = #{coustom,jdbcType=BIT},",
            "status = #{status,jdbcType=INTEGER},",
            "use_count = #{useCount,jdbcType=INTEGER},",
            "create_date = #{createDate,jdbcType=TIMESTAMP},",
            "update_date = #{updateDate,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Department record);

    @Select({
            "select",
            "id, code, name , min_money, max_money",
            "from department",
            "where (pid is null or pid = '')",
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="min_money", property="minMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="max_money", property="maxMoney", jdbcType= JdbcType.INTEGER),
    })
    List<Department> selectParent();

    @Select({
            "select",
            "id, code, name , min_money, max_money",
            "from department t1",
            "where",
            "exists(select 1 from department t2 where t1.pid = t2.id and code = #{code, jdbcType=VARCHAR} and status = 0)",
            "and coustom = 0" ,
            "and status = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="min_money", property="minMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="max_money", property="maxMoney", jdbcType= JdbcType.INTEGER),
    })
    List<Department> selectPositionByCode(@Param("code") String code);

    @Select({
            "select",
            "id, code, name, pid, min_money, max_money, coustom, status, use_count, create_date,visiting, ",
            "update_date",
            "from department",
            "where code = #{code,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="min_money", property="minMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="max_money", property="maxMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="coustom", property="coustom", jdbcType= JdbcType.BIT),
            @Result(column="visiting", property="visiting", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="use_count", property="useCount", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    Department selectByCode(String code);

    @Select({
            "select",
            "id, code, name, pid, min_money, max_money, coustom, status, use_count, create_date, ",
            "update_date",
            "from department",
            "where name = #{name,jdbcType=VARCHAR}",
            "and (pid is not null or pid != '')",
            "and coustom = true"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="min_money", property="minMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="max_money", property="maxMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="coustom", property="coustom", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="use_count", property="useCount", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    Department selectChildByName(String name);

    @Select({
            "select",
            "id, code, name, pid, min_money, max_money, coustom, status, use_count, create_date, ",
            "update_date",
            "from department",
            "where (pid is null or pid = '')",
            "and coustom = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="min_money", property="minMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="max_money", property="maxMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="coustom", property="coustom", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="use_count", property="useCount", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<Department> selectByPIDisNull();

    @Select({
            "select",
            "id, code, name, pid, min_money, max_money, coustom, status, use_count, create_date, ",
            "update_date",
            "from department",
            "where (pid is not null or pid != '')",
            "and coustom = 0"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="code", property="code", jdbcType= JdbcType.VARCHAR),
            @Result(column="name", property="name", jdbcType= JdbcType.VARCHAR),
            @Result(column="pid", property="pid", jdbcType= JdbcType.VARCHAR),
            @Result(column="min_money", property="minMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="max_money", property="maxMoney", jdbcType= JdbcType.INTEGER),
            @Result(column="coustom", property="coustom", jdbcType= JdbcType.BIT),
            @Result(column="status", property="status", jdbcType= JdbcType.INTEGER),
            @Result(column="use_count", property="useCount", jdbcType= JdbcType.INTEGER),
            @Result(column="create_date", property="createDate", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="update_date", property="updateDate", jdbcType= JdbcType.TIMESTAMP)
    })
    List<Department> selectByPIDisNotNull();
}