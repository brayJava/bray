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

import com.whiteplanet.mapper.model.ImSingleMessage;
import com.whiteplanet.mapper.model.ImSingleMessageExample.Criteria;
import com.whiteplanet.mapper.model.ImSingleMessageExample.Criterion;
import com.whiteplanet.mapper.model.ImSingleMessageExample;
import java.util.List;
import java.util.Map;

public class ImSingleMessageSqlProvider {

    public String countByExample(ImSingleMessageExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("im_single_message");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ImSingleMessageExample example) {
        BEGIN();
        DELETE_FROM("im_single_message");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(ImSingleMessage record) {
        BEGIN();
        INSERT_INTO("im_single_message");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getFromType() != null) {
            VALUES("from_type", "#{fromType,jdbcType=VARCHAR}");
        }
        
        if (record.getFromId() != null) {
            VALUES("from_id", "#{fromId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFromAppkey() != null) {
            VALUES("from_appkey", "#{fromAppkey,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetType() != null) {
            VALUES("target_type", "#{targetType,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgExtras() != null) {
            VALUES("msg_extras", "#{msgExtras,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgText() != null) {
            VALUES("msg_text", "#{msgText,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgType() != null) {
            VALUES("msg_type", "#{msgType,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgRichmediaPath() != null) {
            VALUES("msg_richmedia_path", "#{msgRichmediaPath,jdbcType=VARCHAR}");
        }
        
        if (record.getLocalRechmediaPath() != null) {
            VALUES("local_rechmedia_path", "#{localRechmediaPath,jdbcType=VARCHAR}");
        }
        
        if (record.getFromPlatform() != null) {
            VALUES("from_platform", "#{fromPlatform,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetId() != null) {
            VALUES("target_id", "#{targetId,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            VALUES("version", "#{version,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgid() != null) {
            VALUES("msgid", "#{msgid,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgCtime() != null) {
            VALUES("msg_ctime", "#{msgCtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgLevel() != null) {
            VALUES("msg_level", "#{msgLevel,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(ImSingleMessageExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("from_type");
        SELECT("from_id");
        SELECT("create_time");
        SELECT("from_appkey");
        SELECT("target_type");
        SELECT("msg_extras");
        SELECT("msg_text");
        SELECT("msg_type");
        SELECT("msg_richmedia_path");
        SELECT("local_rechmedia_path");
        SELECT("from_platform");
        SELECT("target_id");
        SELECT("version");
        SELECT("msgid");
        SELECT("msg_ctime");
        SELECT("msg_level");
        FROM("im_single_message");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ImSingleMessage record = (ImSingleMessage) parameter.get("record");
        ImSingleMessageExample example = (ImSingleMessageExample) parameter.get("example");
        
        BEGIN();
        UPDATE("im_single_message");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getFromType() != null) {
            SET("from_type = #{record.fromType,jdbcType=VARCHAR}");
        }
        
        if (record.getFromId() != null) {
            SET("from_id = #{record.fromId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFromAppkey() != null) {
            SET("from_appkey = #{record.fromAppkey,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetType() != null) {
            SET("target_type = #{record.targetType,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgExtras() != null) {
            SET("msg_extras = #{record.msgExtras,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgText() != null) {
            SET("msg_text = #{record.msgText,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgType() != null) {
            SET("msg_type = #{record.msgType,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgRichmediaPath() != null) {
            SET("msg_richmedia_path = #{record.msgRichmediaPath,jdbcType=VARCHAR}");
        }
        
        if (record.getLocalRechmediaPath() != null) {
            SET("local_rechmedia_path = #{record.localRechmediaPath,jdbcType=VARCHAR}");
        }
        
        if (record.getFromPlatform() != null) {
            SET("from_platform = #{record.fromPlatform,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetId() != null) {
            SET("target_id = #{record.targetId,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{record.version,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgid() != null) {
            SET("msgid = #{record.msgid,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgCtime() != null) {
            SET("msg_ctime = #{record.msgCtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgLevel() != null) {
            SET("msg_level = #{record.msgLevel,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("im_single_message");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("from_type = #{record.fromType,jdbcType=VARCHAR}");
        SET("from_id = #{record.fromId,jdbcType=VARCHAR}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("from_appkey = #{record.fromAppkey,jdbcType=VARCHAR}");
        SET("target_type = #{record.targetType,jdbcType=VARCHAR}");
        SET("msg_extras = #{record.msgExtras,jdbcType=VARCHAR}");
        SET("msg_text = #{record.msgText,jdbcType=VARCHAR}");
        SET("msg_type = #{record.msgType,jdbcType=VARCHAR}");
        SET("msg_richmedia_path = #{record.msgRichmediaPath,jdbcType=VARCHAR}");
        SET("local_rechmedia_path = #{record.localRechmediaPath,jdbcType=VARCHAR}");
        SET("from_platform = #{record.fromPlatform,jdbcType=VARCHAR}");
        SET("target_id = #{record.targetId,jdbcType=VARCHAR}");
        SET("version = #{record.version,jdbcType=VARCHAR}");
        SET("msgid = #{record.msgid,jdbcType=VARCHAR}");
        SET("msg_ctime = #{record.msgCtime,jdbcType=TIMESTAMP}");
        SET("msg_level = #{record.msgLevel,jdbcType=VARCHAR}");
        
        ImSingleMessageExample example = (ImSingleMessageExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(ImSingleMessage record) {
        BEGIN();
        UPDATE("im_single_message");
        
        if (record.getFromType() != null) {
            SET("from_type = #{fromType,jdbcType=VARCHAR}");
        }
        
        if (record.getFromId() != null) {
            SET("from_id = #{fromId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFromAppkey() != null) {
            SET("from_appkey = #{fromAppkey,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetType() != null) {
            SET("target_type = #{targetType,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgExtras() != null) {
            SET("msg_extras = #{msgExtras,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgText() != null) {
            SET("msg_text = #{msgText,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgType() != null) {
            SET("msg_type = #{msgType,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgRichmediaPath() != null) {
            SET("msg_richmedia_path = #{msgRichmediaPath,jdbcType=VARCHAR}");
        }
        
        if (record.getLocalRechmediaPath() != null) {
            SET("local_rechmedia_path = #{localRechmediaPath,jdbcType=VARCHAR}");
        }
        
        if (record.getFromPlatform() != null) {
            SET("from_platform = #{fromPlatform,jdbcType=VARCHAR}");
        }
        
        if (record.getTargetId() != null) {
            SET("target_id = #{targetId,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            SET("version = #{version,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgid() != null) {
            SET("msgid = #{msgid,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgCtime() != null) {
            SET("msg_ctime = #{msgCtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMsgLevel() != null) {
            SET("msg_level = #{msgLevel,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(ImSingleMessageExample example, boolean includeExamplePhrase) {
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