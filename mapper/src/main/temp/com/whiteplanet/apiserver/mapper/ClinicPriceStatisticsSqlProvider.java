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

import com.whiteplanet.mapper.model.ClinicPriceStatistics;
import com.whiteplanet.mapper.model.ClinicPriceStatisticsExample.Criteria;
import com.whiteplanet.mapper.model.ClinicPriceStatisticsExample.Criterion;
import com.whiteplanet.mapper.model.ClinicPriceStatisticsExample;
import java.util.List;
import java.util.Map;

public class ClinicPriceStatisticsSqlProvider {

    public String countByExample(ClinicPriceStatisticsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("clinic_price_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ClinicPriceStatisticsExample example) {
        BEGIN();
        DELETE_FROM("clinic_price_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(ClinicPriceStatistics record) {
        BEGIN();
        INSERT_INTO("clinic_price_statistics");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPriceRange() != null) {
            VALUES("price_range", "#{priceRange,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCount() != null) {
            VALUES("user_count", "#{userCount,jdbcType=INTEGER}");
        }
        
        if (record.getPercentage() != null) {
            VALUES("percentage", "#{percentage,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(ClinicPriceStatisticsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("time");
        SELECT("price_range");
        SELECT("user_count");
        SELECT("percentage");
        FROM("clinic_price_statistics");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ClinicPriceStatistics record = (ClinicPriceStatistics) parameter.get("record");
        ClinicPriceStatisticsExample example = (ClinicPriceStatisticsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("clinic_price_statistics");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{record.time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPriceRange() != null) {
            SET("price_range = #{record.priceRange,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCount() != null) {
            SET("user_count = #{record.userCount,jdbcType=INTEGER}");
        }
        
        if (record.getPercentage() != null) {
            SET("percentage = #{record.percentage,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("clinic_price_statistics");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("time = #{record.time,jdbcType=TIMESTAMP}");
        SET("price_range = #{record.priceRange,jdbcType=VARCHAR}");
        SET("user_count = #{record.userCount,jdbcType=INTEGER}");
        SET("percentage = #{record.percentage,jdbcType=VARCHAR}");
        
        ClinicPriceStatisticsExample example = (ClinicPriceStatisticsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(ClinicPriceStatistics record) {
        BEGIN();
        UPDATE("clinic_price_statistics");
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPriceRange() != null) {
            SET("price_range = #{priceRange,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCount() != null) {
            SET("user_count = #{userCount,jdbcType=INTEGER}");
        }
        
        if (record.getPercentage() != null) {
            SET("percentage = #{percentage,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(ClinicPriceStatisticsExample example, boolean includeExamplePhrase) {
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