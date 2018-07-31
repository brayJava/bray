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

import com.whiteplanet.mapper.model.UserLossStatistics;
import com.whiteplanet.mapper.model.UserLossStatisticsExample.Criteria;
import com.whiteplanet.mapper.model.UserLossStatisticsExample.Criterion;
import com.whiteplanet.mapper.model.UserLossStatisticsExample;
import java.util.List;
import java.util.Map;

public class UserLossStatisticsSqlProvider {

    public String countByExample(UserLossStatisticsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("user_loss_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserLossStatisticsExample example) {
        BEGIN();
        DELETE_FROM("user_loss_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(UserLossStatistics record) {
        BEGIN();
        INSERT_INTO("user_loss_statistics");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMonthLossCount() != null) {
            VALUES("month_loss_count", "#{monthLossCount,jdbcType=INTEGER}");
        }
        
        if (record.getQuarterLossCount() != null) {
            VALUES("quarter_loss_count", "#{quarterLossCount,jdbcType=INTEGER}");
        }
        
        if (record.getHalfyearLossCount() != null) {
            VALUES("halfyear_loss_count", "#{halfyearLossCount,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(UserLossStatisticsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("time");
        SELECT("month_loss_count");
        SELECT("quarter_loss_count");
        SELECT("halfyear_loss_count");
        FROM("user_loss_statistics");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserLossStatistics record = (UserLossStatistics) parameter.get("record");
        UserLossStatisticsExample example = (UserLossStatisticsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("user_loss_statistics");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{record.time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMonthLossCount() != null) {
            SET("month_loss_count = #{record.monthLossCount,jdbcType=INTEGER}");
        }
        
        if (record.getQuarterLossCount() != null) {
            SET("quarter_loss_count = #{record.quarterLossCount,jdbcType=INTEGER}");
        }
        
        if (record.getHalfyearLossCount() != null) {
            SET("halfyear_loss_count = #{record.halfyearLossCount,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("user_loss_statistics");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("time = #{record.time,jdbcType=TIMESTAMP}");
        SET("month_loss_count = #{record.monthLossCount,jdbcType=INTEGER}");
        SET("quarter_loss_count = #{record.quarterLossCount,jdbcType=INTEGER}");
        SET("halfyear_loss_count = #{record.halfyearLossCount,jdbcType=INTEGER}");
        
        UserLossStatisticsExample example = (UserLossStatisticsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(UserLossStatistics record) {
        BEGIN();
        UPDATE("user_loss_statistics");
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMonthLossCount() != null) {
            SET("month_loss_count = #{monthLossCount,jdbcType=INTEGER}");
        }
        
        if (record.getQuarterLossCount() != null) {
            SET("quarter_loss_count = #{quarterLossCount,jdbcType=INTEGER}");
        }
        
        if (record.getHalfyearLossCount() != null) {
            SET("halfyear_loss_count = #{halfyearLossCount,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(UserLossStatisticsExample example, boolean includeExamplePhrase) {
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