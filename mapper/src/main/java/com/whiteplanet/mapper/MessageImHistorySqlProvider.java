package com.whiteplanet.mapper;




import com.whiteplanet.mapper.model.MessageImHistory;
import com.whiteplanet.mapper.model.MessageImHistoryExample;
import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class MessageImHistorySqlProvider {

    public String countByExample(MessageImHistoryExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("message_im_history");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(MessageImHistoryExample example) {
        BEGIN();
        DELETE_FROM("message_im_history");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(MessageImHistory record) {
        BEGIN();
        INSERT_INTO("message_im_history");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getSendDate() != null) {
            VALUES("send_date", "#{sendDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            VALUES("del_flag", "#{delFlag,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(MessageImHistoryExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("type");
        SELECT("title");
        SELECT("content");
        SELECT("user_id");
        SELECT("order_id");
        SELECT("send_date");
        SELECT("del_flag");
        FROM("message_im_history");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MessageImHistory record = (MessageImHistory) parameter.get("record");
        MessageImHistoryExample example = (MessageImHistoryExample) parameter.get("example");
        
        BEGIN();
        UPDATE("message_im_history");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            SET("type = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            SET("content = #{record.content,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getSendDate() != null) {
            SET("send_date = #{record.sendDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            SET("del_flag = #{record.delFlag,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("message_im_history");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("type = #{record.type,jdbcType=INTEGER}");
        SET("title = #{record.title,jdbcType=VARCHAR}");
        SET("content = #{record.content,jdbcType=VARCHAR}");
        SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        SET("send_date = #{record.sendDate,jdbcType=TIMESTAMP}");
        SET("del_flag = #{record.delFlag,jdbcType=INTEGER}");
        
        MessageImHistoryExample example = (MessageImHistoryExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(MessageImHistory record) {
        BEGIN();
        UPDATE("message_im_history");
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            SET("content = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getSendDate() != null) {
            SET("send_date = #{sendDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDelFlag() != null) {
            SET("del_flag = #{delFlag,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(MessageImHistoryExample example, boolean includeExamplePhrase) {
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
        List<MessageImHistoryExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            MessageImHistoryExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<MessageImHistoryExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    MessageImHistoryExample.Criterion criterion = criterions.get(j);
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