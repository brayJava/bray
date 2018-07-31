package com.whiteplanet.back.mapper;


import com.whiteplanet.back.model.UserActivityStatistics;
import com.whiteplanet.back.model.UserActivityStatisticsExample;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class UserActivityStatisticsSqlProvider {

    public String countByExample(UserActivityStatisticsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("user_activity_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserActivityStatisticsExample example) {
        BEGIN();
        DELETE_FROM("user_activity_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(UserActivityStatistics record) {
        BEGIN();
        INSERT_INTO("user_activity_statistics");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDailyActivity() != null) {
            VALUES("daily_activity", "#{dailyActivity,jdbcType=INTEGER}");
        }
        
        if (record.getWeekActivity() != null) {
            VALUES("week_activity", "#{weekActivity,jdbcType=INTEGER}");
        }
        
        if (record.getMonthActivity() != null) {
            VALUES("month_activity", "#{monthActivity,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(UserActivityStatisticsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("time");
        SELECT("daily_activity");
        SELECT("week_activity");
        SELECT("month_activity");
        FROM("user_activity_statistics");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserActivityStatistics record = (UserActivityStatistics) parameter.get("record");
        UserActivityStatisticsExample example = (UserActivityStatisticsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("user_activity_statistics");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{record.time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDailyActivity() != null) {
            SET("daily_activity = #{record.dailyActivity,jdbcType=INTEGER}");
        }
        
        if (record.getWeekActivity() != null) {
            SET("week_activity = #{record.weekActivity,jdbcType=INTEGER}");
        }
        
        if (record.getMonthActivity() != null) {
            SET("month_activity = #{record.monthActivity,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("user_activity_statistics");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("time = #{record.time,jdbcType=TIMESTAMP}");
        SET("daily_activity = #{record.dailyActivity,jdbcType=INTEGER}");
        SET("week_activity = #{record.weekActivity,jdbcType=INTEGER}");
        SET("month_activity = #{record.monthActivity,jdbcType=INTEGER}");
        
        UserActivityStatisticsExample example = (UserActivityStatisticsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(UserActivityStatistics record) {
        BEGIN();
        UPDATE("user_activity_statistics");
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDailyActivity() != null) {
            SET("daily_activity = #{dailyActivity,jdbcType=INTEGER}");
        }
        
        if (record.getWeekActivity() != null) {
            SET("week_activity = #{weekActivity,jdbcType=INTEGER}");
        }
        
        if (record.getMonthActivity() != null) {
            SET("month_activity = #{monthActivity,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(UserActivityStatisticsExample example, boolean includeExamplePhrase) {
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
        List<UserActivityStatisticsExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            UserActivityStatisticsExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<UserActivityStatisticsExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    UserActivityStatisticsExample.Criterion criterion = criterions.get(j);
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