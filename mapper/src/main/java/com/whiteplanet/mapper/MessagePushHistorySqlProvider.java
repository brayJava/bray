package com.whiteplanet.mapper;

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

import com.whiteplanet.mapper.model.MessagePushHistory;
import com.whiteplanet.mapper.model.MessagePushHistoryExample.Criteria;
import com.whiteplanet.mapper.model.MessagePushHistoryExample.Criterion;
import com.whiteplanet.mapper.model.MessagePushHistoryExample;
import java.util.List;
import java.util.Map;

public class MessagePushHistorySqlProvider {

    public String countByExample(MessagePushHistoryExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("message_push_history");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(MessagePushHistoryExample example) {
        BEGIN();
        DELETE_FROM("message_push_history");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(MessagePushHistory record) {
        BEGIN();
        INSERT_INTO("message_push_history");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorid() != null) {
            VALUES("doctorId", "#{doctorid,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            VALUES("orderId", "#{orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getTransid() != null) {
            VALUES("transId", "#{transid,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveid() != null) {
            VALUES("receiveId", "#{receiveid,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getAuditStatus() != null) {
            VALUES("audit_status", "#{auditStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getReason() != null) {
            VALUES("reason", "#{reason,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(MessagePushHistoryExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("doctorId");
        SELECT("type");
        SELECT("orderId");
        SELECT("transId");
        SELECT("receiveId");
        SELECT("content");
        SELECT("audit_status");
        SELECT("reason");
        SELECT("create_date");
        FROM("message_push_history");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MessagePushHistory record = (MessagePushHistory) parameter.get("record");
        MessagePushHistoryExample example = (MessagePushHistoryExample) parameter.get("example");
        
        BEGIN();
        UPDATE("message_push_history");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorid() != null) {
            SET("doctorId = #{record.doctorid,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{record.type,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            SET("orderId = #{record.orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getTransid() != null) {
            SET("transId = #{record.transid,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveid() != null) {
            SET("receiveId = #{record.receiveid,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            SET("content = #{record.content,jdbcType=VARCHAR}");
        }
        
        if (record.getAuditStatus() != null) {
            SET("audit_status = #{record.auditStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getReason() != null) {
            SET("reason = #{record.reason,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("message_push_history");
        
        SET("id = #{record.id,jdbcType=VARCHAR}");
        SET("doctorId = #{record.doctorid,jdbcType=VARCHAR}");
        SET("type = #{record.type,jdbcType=VARCHAR}");
        SET("orderId = #{record.orderid,jdbcType=VARCHAR}");
        SET("transId = #{record.transid,jdbcType=VARCHAR}");
        SET("receiveId = #{record.receiveid,jdbcType=VARCHAR}");
        SET("content = #{record.content,jdbcType=VARCHAR}");
        SET("audit_status = #{record.auditStatus,jdbcType=VARCHAR}");
        SET("reason = #{record.reason,jdbcType=VARCHAR}");
        SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        
        MessagePushHistoryExample example = (MessagePushHistoryExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(MessagePushHistory record) {
        BEGIN();
        UPDATE("message_push_history");
        
        if (record.getDoctorid() != null) {
            SET("doctorId = #{doctorid,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderid() != null) {
            SET("orderId = #{orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getTransid() != null) {
            SET("transId = #{transid,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveid() != null) {
            SET("receiveId = #{receiveid,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            SET("content = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getAuditStatus() != null) {
            SET("audit_status = #{auditStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getReason() != null) {
            SET("reason = #{reason,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(MessagePushHistoryExample example, boolean includeExamplePhrase) {
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