package com.whiteplanet.apiserver.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.whiteplanet.mapper.model.Evaluate;
import com.whiteplanet.mapper.model.EvaluateExample.Criteria;
import com.whiteplanet.mapper.model.EvaluateExample.Criterion;
import com.whiteplanet.mapper.model.EvaluateExample;
import java.util.List;
import java.util.Map;

public class EvaluateSqlProvider {

    public String countByExample(EvaluateExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("evaluate");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(EvaluateExample example) {
        BEGIN();
        DELETE_FROM("evaluate");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Evaluate record) {
        BEGIN();
        INSERT_INTO("evaluate");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getDocId() != null) {
            VALUES("doc_id", "#{docId,jdbcType=VARCHAR}");
        }
        
        if (record.getEvalId() != null) {
            VALUES("eval_id", "#{evalId,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getEvalType() != null) {
            VALUES("eval_type", "#{evalType,jdbcType=INTEGER}");
        }
        
        if (record.getComment() != null) {
            VALUES("comment", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVisible() != null) {
            VALUES("is_visible", "#{isVisible,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(EvaluateExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("doc_id");
        SELECT("eval_id");
        SELECT("score");
        SELECT("eval_type");
        SELECT("comment");
        SELECT("is_visible");
        SELECT("create_time");
        FROM("evaluate");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Evaluate record = (Evaluate) parameter.get("record");
        EvaluateExample example = (EvaluateExample) parameter.get("example");
        
        BEGIN();
        UPDATE("evaluate");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getDocId() != null) {
            SET("doc_id = #{record.docId,jdbcType=VARCHAR}");
        }
        
        if (record.getEvalId() != null) {
            SET("eval_id = #{record.evalId,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{record.score,jdbcType=INTEGER}");
        }
        
        if (record.getEvalType() != null) {
            SET("eval_type = #{record.evalType,jdbcType=INTEGER}");
        }
        
        if (record.getComment() != null) {
            SET("comment = #{record.comment,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVisible() != null) {
            SET("is_visible = #{record.isVisible,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("evaluate");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("doc_id = #{record.docId,jdbcType=VARCHAR}");
        SET("eval_id = #{record.evalId,jdbcType=VARCHAR}");
        SET("score = #{record.score,jdbcType=INTEGER}");
        SET("eval_type = #{record.evalType,jdbcType=INTEGER}");
        SET("comment = #{record.comment,jdbcType=VARCHAR}");
        SET("is_visible = #{record.isVisible,jdbcType=TINYINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        EvaluateExample example = (EvaluateExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Evaluate record) {
        BEGIN();
        UPDATE("evaluate");
        
        if (record.getDocId() != null) {
            SET("doc_id = #{docId,jdbcType=VARCHAR}");
        }
        
        if (record.getEvalId() != null) {
            SET("eval_id = #{evalId,jdbcType=VARCHAR}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getEvalType() != null) {
            SET("eval_type = #{evalType,jdbcType=INTEGER}");
        }
        
        if (record.getComment() != null) {
            SET("comment = #{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVisible() != null) {
            SET("is_visible = #{isVisible,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(EvaluateExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}