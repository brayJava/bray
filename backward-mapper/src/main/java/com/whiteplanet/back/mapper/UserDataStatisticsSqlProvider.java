package com.whiteplanet.back.mapper;
import com.whiteplanet.back.model.UserDataStatistics;
import com.whiteplanet.back.model.UserDataStatisticsExample;
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


import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class UserDataStatisticsSqlProvider {

    public String countByExample(UserDataStatisticsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("user_data_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserDataStatisticsExample example) {
        BEGIN();
        DELETE_FROM("user_data_statistics");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(UserDataStatistics record) {
        BEGIN();
        INSERT_INTO("user_data_statistics");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoadUserCount() != null) {
            VALUES("load_user_count", "#{loadUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterUserCount() != null) {
            VALUES("register_user_count", "#{registerUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getFillDataCount() != null) {
            VALUES("fill_data_count", "#{fillDataCount,jdbcType=INTEGER}");
        }
        
        if (record.getApplyRealnameCount() != null) {
            VALUES("apply_realname_count", "#{applyRealnameCount,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterLoadPer() != null) {
            VALUES("register_load_per", "#{registerLoadPer,jdbcType=VARCHAR}");
        }
        
        if (record.getFillDataUserPer() != null) {
            VALUES("fill_data_user_per", "#{fillDataUserPer,jdbcType=VARCHAR}");
        }
        
        if (record.getRealnameSubmitPer() != null) {
            VALUES("realname_submit_per", "#{realnameSubmitPer,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveDeviceNumber() != null) {
            VALUES("active_device_number", "#{activeDeviceNumber,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(UserDataStatisticsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("time");
        SELECT("load_user_count");
        SELECT("register_user_count");
        SELECT("fill_data_count");
        SELECT("apply_realname_count");
        SELECT("register_load_per");
        SELECT("fill_data_user_per");
        SELECT("realname_submit_per");
        SELECT("active_device_number");
        FROM("user_data_statistics");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }
    //批量插入
    public String insertBatch(Map<String, Object> map) {
        List<UserDataStatistics> list = (List<UserDataStatistics>)map.get("list");
        //构造SQL
        StringBuilder sb = new StringBuilder();
        StringBuilder mfsb = new StringBuilder();
        sb.append("INSERT INTO user_data_statistics");
        sb.append("(time, load_user_count, register_user_count, fill_data_count, apply_realname_count" +
                ", register_load_per, fill_data_user_per, realname_submit_per, active_device_number)");
        sb.append("VALUES ");
        mfsb.append("(");
        mfsb.append(" #'{'list[{0}].time,jdbcType=TIMESTAMP},");
        mfsb.append(" #'{'list[{0}].load_user_count,jdbcType=INTEGER}, #'{'list[{0}].register_user_count,jdbcType=INTEGER},");
        mfsb.append(" #'{'list[{0}].fill_data_count,jdbcType=INTEGER}, #'{'list[{0}].apply_realname_count,jdbcType=INTEGER},");
        mfsb.append(" #'{'list[{0}].register_load_per,jdbcType=VARCHAR},  #'{'list[{0}].fill_data_user_per,jdbcType=VARCHAR},");
        mfsb.append(" #'{'list[{0}].realname_submit_per,jdbcType=VARCHAR},  #'{'list[{0}].active_device_number,jdbcType=INTEGER}");
        mfsb.append(")");
        MessageFormat mf = new MessageFormat(mfsb.toString());
        for (int i = 0; i < list.size(); i ++) {
            sb.append(mf.format(mfsb.toString(),new Object[]{i}));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserDataStatistics record = (UserDataStatistics) parameter.get("record");
        UserDataStatisticsExample example = (UserDataStatisticsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("user_data_statistics");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getTime() != null) {
            SET("time = #{record.time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoadUserCount() != null) {
            SET("load_user_count = #{record.loadUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterUserCount() != null) {
            SET("register_user_count = #{record.registerUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getFillDataCount() != null) {
            SET("fill_data_count = #{record.fillDataCount,jdbcType=INTEGER}");
        }
        
        if (record.getApplyRealnameCount() != null) {
            SET("apply_realname_count = #{record.applyRealnameCount,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterLoadPer() != null) {
            SET("register_load_per = #{record.registerLoadPer,jdbcType=VARCHAR}");
        }
        
        if (record.getFillDataUserPer() != null) {
            SET("fill_data_user_per = #{record.fillDataUserPer,jdbcType=VARCHAR}");
        }
        
        if (record.getRealnameSubmitPer() != null) {
            SET("realname_submit_per = #{record.realnameSubmitPer,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveDeviceNumber() != null) {
            SET("active_device_number = #{record.activeDeviceNumber,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("user_data_statistics");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("time = #{record.time,jdbcType=TIMESTAMP}");
        SET("load_user_count = #{record.loadUserCount,jdbcType=INTEGER}");
        SET("register_user_count = #{record.registerUserCount,jdbcType=INTEGER}");
        SET("fill_data_count = #{record.fillDataCount,jdbcType=INTEGER}");
        SET("apply_realname_count = #{record.applyRealnameCount,jdbcType=INTEGER}");
        SET("register_load_per = #{record.registerLoadPer,jdbcType=VARCHAR}");
        SET("fill_data_user_per = #{record.fillDataUserPer,jdbcType=VARCHAR}");
        SET("realname_submit_per = #{record.realnameSubmitPer,jdbcType=VARCHAR}");
        SET("active_device_number = #{record.activeDeviceNumber,jdbcType=INTEGER}");
        
        UserDataStatisticsExample example = (UserDataStatisticsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(UserDataStatistics record) {
        BEGIN();
        UPDATE("user_data_statistics");
        
        if (record.getTime() != null) {
            SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoadUserCount() != null) {
            SET("load_user_count = #{loadUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterUserCount() != null) {
            SET("register_user_count = #{registerUserCount,jdbcType=INTEGER}");
        }
        
        if (record.getFillDataCount() != null) {
            SET("fill_data_count = #{fillDataCount,jdbcType=INTEGER}");
        }
        
        if (record.getApplyRealnameCount() != null) {
            SET("apply_realname_count = #{applyRealnameCount,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterLoadPer() != null) {
            SET("register_load_per = #{registerLoadPer,jdbcType=VARCHAR}");
        }
        
        if (record.getFillDataUserPer() != null) {
            SET("fill_data_user_per = #{fillDataUserPer,jdbcType=VARCHAR}");
        }
        
        if (record.getRealnameSubmitPer() != null) {
            SET("realname_submit_per = #{realnameSubmitPer,jdbcType=VARCHAR}");
        }
        
        if (record.getActiveDeviceNumber() != null) {
            SET("active_device_number = #{activeDeviceNumber,jdbcType=INTEGER}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(UserDataStatisticsExample example, boolean includeExamplePhrase) {
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
        List<UserDataStatisticsExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            UserDataStatisticsExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<UserDataStatisticsExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    UserDataStatisticsExample.Criterion criterion = criterions.get(j);
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