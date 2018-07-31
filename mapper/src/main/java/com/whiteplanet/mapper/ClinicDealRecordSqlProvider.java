package com.whiteplanet.mapper;




import com.whiteplanet.mapper.model.ClinicDealRecord;
import com.whiteplanet.mapper.model.ClinicDealRecordExample;
import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class ClinicDealRecordSqlProvider {

    public String countByExample(ClinicDealRecordExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("clinic_deal_record");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ClinicDealRecordExample example) {
        BEGIN();
        DELETE_FROM("clinic_deal_record");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(ClinicDealRecord record) {
        BEGIN();
        INSERT_INTO("clinic_deal_record");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getClinicId() != null) {
            VALUES("clinic_id", "#{clinicId,jdbcType=VARCHAR}");
        }

        if (record.getWithDrawId() != null) {
            VALUES("withdraw_id", "#{withDrawId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            VALUES("money", "#{money,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderId() != null) {
            VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getDealType() != null) {
            VALUES("deal_type", "#{dealType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(ClinicDealRecordExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("clinic_id");
        SELECT("money");
        SELECT("order_id");
        SELECT("deal_type");
        SELECT("create_date");
        FROM("clinic_deal_record");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ClinicDealRecord record = (ClinicDealRecord) parameter.get("record");
        ClinicDealRecordExample example = (ClinicDealRecordExample) parameter.get("example");
        
        BEGIN();
        UPDATE("clinic_deal_record");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getClinicId() != null) {
            SET("clinic_id = #{record.clinicId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            SET("money = #{record.money,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderId() != null) {
            SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getDealType() != null) {
            SET("deal_type = #{record.dealType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("clinic_deal_record");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("clinic_id = #{record.clinicId,jdbcType=VARCHAR}");
        SET("money = #{record.money,jdbcType=DECIMAL}");
        SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        SET("deal_type = #{record.dealType,jdbcType=INTEGER}");
        SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        
        ClinicDealRecordExample example = (ClinicDealRecordExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(ClinicDealRecord record) {
        BEGIN();
        UPDATE("clinic_deal_record");
        
        if (record.getClinicId() != null) {
            SET("clinic_id = #{clinicId,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            SET("money = #{money,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderId() != null) {
            SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getDealType() != null) {
            SET("deal_type = #{dealType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDate() != null) {
            SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(ClinicDealRecordExample example, boolean includeExamplePhrase) {
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
        List<ClinicDealRecordExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            ClinicDealRecordExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<ClinicDealRecordExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    ClinicDealRecordExample.Criterion criterion = criterions.get(j);
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