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

import com.whiteplanet.mapper.model.AppOrder;
import com.whiteplanet.mapper.model.AppOrderExample.Criteria;
import com.whiteplanet.mapper.model.AppOrderExample.Criterion;
import com.whiteplanet.mapper.model.AppOrderExample;
import java.util.List;
import java.util.Map;

public class AppOrderSqlProvider {

    public String countByExample(AppOrderExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("app_order");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(AppOrderExample example) {
        BEGIN();
        DELETE_FROM("app_order");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(AppOrder record) {
        BEGIN();
        INSERT_INTO("app_order");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getmRecordId() != null) {
            VALUES("m_record_id", "#{mRecordId,jdbcType=VARCHAR}");
        }
        
        if (record.getVisitPersonId() != null) {
            VALUES("visit_person_id", "#{visitPersonId,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectStartDate() != null) {
            VALUES("inspect_start_date", "#{inspectStartDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInspectEndDate() != null) {
            VALUES("inspect_end_date", "#{inspectEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInspectCheckCity() != null) {
            VALUES("inspect_check_city", "#{inspectCheckCity,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectCheckCost() != null) {
            VALUES("inspect_check_cost", "#{inspectCheckCost,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getTransDocId() != null) {
            VALUES("trans_doc_id", "#{transDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDocName() != null) {
            VALUES("trans_doc_name", "#{transDocName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDate() != null) {
            VALUES("trans_date", "#{transDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReceiveDocId() != null) {
            VALUES("receive_doc_id", "#{receiveDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDocName() != null) {
            VALUES("receive_doc_name", "#{receiveDocName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDate() != null) {
            VALUES("receive_date", "#{receiveDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTreatmentMoney() != null) {
            VALUES("treatment_money", "#{treatmentMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getPayType() != null) {
            VALUES("pay_type", "#{payType,jdbcType=INTEGER}");
        }
        
        if (record.getNote() != null) {
            VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(AppOrderExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("order_no");
        SELECT("m_record_id");
        SELECT("visit_person_id");
        SELECT("inspect_start_date");
        SELECT("inspect_end_date");
        SELECT("inspect_check_city");
        SELECT("inspect_check_cost");
        SELECT("create_time");
        SELECT("update_time");
        SELECT("status");
        SELECT("trans_doc_id");
        SELECT("trans_doc_name");
        SELECT("trans_date");
        SELECT("receive_doc_id");
        SELECT("receive_doc_name");
        SELECT("receive_date");
        SELECT("treatment_money");
        SELECT("pay_type");
        SELECT("note");
        FROM("app_order");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AppOrder record = (AppOrder) parameter.get("record");
        AppOrderExample example = (AppOrderExample) parameter.get("example");
        
        BEGIN();
        UPDATE("app_order");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getmRecordId() != null) {
            SET("m_record_id = #{record.mRecordId,jdbcType=VARCHAR}");
        }
        
        if (record.getVisitPersonId() != null) {
            SET("visit_person_id = #{record.visitPersonId,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectStartDate() != null) {
            SET("inspect_start_date = #{record.inspectStartDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInspectEndDate() != null) {
            SET("inspect_end_date = #{record.inspectEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInspectCheckCity() != null) {
            SET("inspect_check_city = #{record.inspectCheckCity,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectCheckCost() != null) {
            SET("inspect_check_cost = #{record.inspectCheckCost,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getTransDocId() != null) {
            SET("trans_doc_id = #{record.transDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDocName() != null) {
            SET("trans_doc_name = #{record.transDocName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDate() != null) {
            SET("trans_date = #{record.transDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReceiveDocId() != null) {
            SET("receive_doc_id = #{record.receiveDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDocName() != null) {
            SET("receive_doc_name = #{record.receiveDocName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDate() != null) {
            SET("receive_date = #{record.receiveDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTreatmentMoney() != null) {
            SET("treatment_money = #{record.treatmentMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getPayType() != null) {
            SET("pay_type = #{record.payType,jdbcType=INTEGER}");
        }
        
        if (record.getNote() != null) {
            SET("note = #{record.note,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("app_order");
        
        SET("id = #{record.id,jdbcType=VARCHAR}");
        SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        SET("m_record_id = #{record.mRecordId,jdbcType=VARCHAR}");
        SET("visit_person_id = #{record.visitPersonId,jdbcType=VARCHAR}");
        SET("inspect_start_date = #{record.inspectStartDate,jdbcType=TIMESTAMP}");
        SET("inspect_end_date = #{record.inspectEndDate,jdbcType=TIMESTAMP}");
        SET("inspect_check_city = #{record.inspectCheckCity,jdbcType=VARCHAR}");
        SET("inspect_check_cost = #{record.inspectCheckCost,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("trans_doc_id = #{record.transDocId,jdbcType=VARCHAR}");
        SET("trans_doc_name = #{record.transDocName,jdbcType=VARCHAR}");
        SET("trans_date = #{record.transDate,jdbcType=TIMESTAMP}");
        SET("receive_doc_id = #{record.receiveDocId,jdbcType=VARCHAR}");
        SET("receive_doc_name = #{record.receiveDocName,jdbcType=VARCHAR}");
        SET("receive_date = #{record.receiveDate,jdbcType=TIMESTAMP}");
        SET("treatment_money = #{record.treatmentMoney,jdbcType=DECIMAL}");
        SET("pay_type = #{record.payType,jdbcType=INTEGER}");
        SET("note = #{record.note,jdbcType=VARCHAR}");
        
        AppOrderExample example = (AppOrderExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(AppOrder record) {
        BEGIN();
        UPDATE("app_order");
        
        if (record.getOrderNo() != null) {
            SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getmRecordId() != null) {
            SET("m_record_id = #{mRecordId,jdbcType=VARCHAR}");
        }
        
        if (record.getVisitPersonId() != null) {
            SET("visit_person_id = #{visitPersonId,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectStartDate() != null) {
            SET("inspect_start_date = #{inspectStartDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInspectEndDate() != null) {
            SET("inspect_end_date = #{inspectEndDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInspectCheckCity() != null) {
            SET("inspect_check_city = #{inspectCheckCity,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectCheckCost() != null) {
            SET("inspect_check_cost = #{inspectCheckCost,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getTransDocId() != null) {
            SET("trans_doc_id = #{transDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDocName() != null) {
            SET("trans_doc_name = #{transDocName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDate() != null) {
            SET("trans_date = #{transDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReceiveDocId() != null) {
            SET("receive_doc_id = #{receiveDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDocName() != null) {
            SET("receive_doc_name = #{receiveDocName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDate() != null) {
            SET("receive_date = #{receiveDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTreatmentMoney() != null) {
            SET("treatment_money = #{treatmentMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getPayType() != null) {
            SET("pay_type = #{payType,jdbcType=INTEGER}");
        }
        
        if (record.getNote() != null) {
            SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(AppOrderExample example, boolean includeExamplePhrase) {
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