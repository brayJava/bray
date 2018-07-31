package com.whiteplanet.apiserver.mapper;

import com.whiteplanet.mapper.model.Evaluate;
import com.whiteplanet.mapper.model.EvaluateExample;
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

public interface EvaluateMapper {
    @SelectProvider(type=EvaluateSqlProvider.class, method="countByExample")
    int countByExample(EvaluateExample example);

    @DeleteProvider(type=EvaluateSqlProvider.class, method="deleteByExample")
    int deleteByExample(EvaluateExample example);

    @Delete({
        "delete from evaluate",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into evaluate (id, doc_id, ",
        "eval_id, score, eval_type, ",
        "comment, is_visible, ",
        "create_time)",
        "values (#{id,jdbcType=BIGINT}, #{docId,jdbcType=VARCHAR}, ",
        "#{evalId,jdbcType=VARCHAR}, #{score,jdbcType=INTEGER}, #{evalType,jdbcType=INTEGER}, ",
        "#{comment,jdbcType=VARCHAR}, #{isVisible,jdbcType=TINYINT}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(Evaluate record);

    @InsertProvider(type=EvaluateSqlProvider.class, method="insertSelective")
    int insertSelective(Evaluate record);

    @SelectProvider(type=EvaluateSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="doc_id", property="docId", jdbcType=JdbcType.VARCHAR),
        @Result(column="eval_id", property="evalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="eval_type", property="evalType", jdbcType=JdbcType.INTEGER),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_visible", property="isVisible", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Evaluate> selectByExample(EvaluateExample example);

    @Select({
        "select",
        "id, doc_id, eval_id, score, eval_type, comment, is_visible, create_time",
        "from evaluate",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="doc_id", property="docId", jdbcType=JdbcType.VARCHAR),
        @Result(column="eval_id", property="evalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="eval_type", property="evalType", jdbcType=JdbcType.INTEGER),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_visible", property="isVisible", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Evaluate selectByPrimaryKey(Long id);

    @UpdateProvider(type=EvaluateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    @UpdateProvider(type=EvaluateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    @UpdateProvider(type=EvaluateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Evaluate record);

    @Update({
        "update evaluate",
        "set doc_id = #{docId,jdbcType=VARCHAR},",
          "eval_id = #{evalId,jdbcType=VARCHAR},",
          "score = #{score,jdbcType=INTEGER},",
          "eval_type = #{evalType,jdbcType=INTEGER},",
          "comment = #{comment,jdbcType=VARCHAR},",
          "is_visible = #{isVisible,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Evaluate record);
}