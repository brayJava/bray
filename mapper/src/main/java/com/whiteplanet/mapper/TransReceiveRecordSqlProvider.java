package com.whiteplanet.mapper;



import com.whiteplanet.mapper.model.TransReceiveRecord;
import com.whiteplanet.mapper.model.TransReceiveRecordExample;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class TransReceiveRecordSqlProvider {

    public String countByExample(TransReceiveRecordExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("trans_receive_record");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(TransReceiveRecordExample example) {
        BEGIN();
        DELETE_FROM("trans_receive_record");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(TransReceiveRecord record) {
        BEGIN();
        INSERT_INTO("trans_receive_record");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDocId() != null) {
            VALUES("trans_doc_id", "#{transDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDocId() != null) {
            VALUES("receive_doc_id", "#{receiveDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getDescribeReason() != null) {
            VALUES("describe_reason", "#{describeReason,jdbcType=VARCHAR}");
        }
        
        if (record.getOprationDate() != null) {
            VALUES("opration_date", "#{oprationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsFree() != null) {
            VALUES("is_free", "#{isFree,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(TransReceiveRecordExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("trans_doc_id");
        SELECT("receive_doc_id");
        SELECT("order_id");
        SELECT("status");
        SELECT("describe_reason");
        SELECT("opration_date");
        SELECT("is_free");
        FROM("trans_receive_record");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TransReceiveRecord record = (TransReceiveRecord) parameter.get("record");
        TransReceiveRecordExample example = (TransReceiveRecordExample) parameter.get("example");
        
        BEGIN();
        UPDATE("trans_receive_record");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getTransDocId() != null) {
            SET("trans_doc_id = #{record.transDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDocId() != null) {
            SET("receive_doc_id = #{record.receiveDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getDescribeReason() != null) {
            SET("describe_reason = #{record.describeReason,jdbcType=VARCHAR}");
        }
        
        if (record.getOprationDate() != null) {
            SET("opration_date = #{record.oprationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsFree() != null) {
            SET("is_free = #{record.isFree,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("trans_receive_record");
        
        SET("id = #{record.id,jdbcType=VARCHAR}");
        SET("trans_doc_id = #{record.transDocId,jdbcType=VARCHAR}");
        SET("receive_doc_id = #{record.receiveDocId,jdbcType=VARCHAR}");
        SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("describe_reason = #{record.describeReason,jdbcType=VARCHAR}");
        SET("opration_date = #{record.oprationDate,jdbcType=TIMESTAMP}");
        SET("is_free = #{record.isFree,jdbcType=INTEGER}");
        
        TransReceiveRecordExample example = (TransReceiveRecordExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(TransReceiveRecord record) {
        BEGIN();
        UPDATE("trans_receive_record");
        
        if (record.getTransDocId() != null) {
            SET("trans_doc_id = #{transDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDocId() != null) {
            SET("receive_doc_id = #{receiveDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getDescribeReason() != null) {
            SET("describe_reason = #{describeReason,jdbcType=VARCHAR}");
        }
        
        if (record.getOprationDate() != null) {
            SET("opration_date = #{oprationDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsFree() != null) {
            SET("is_free = #{isFree,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(TransReceiveRecordExample example, boolean includeExamplePhrase) {
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
        List<TransReceiveRecordExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            TransReceiveRecordExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<TransReceiveRecordExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    TransReceiveRecordExample.Criterion criterion = criterions.get(j);
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