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

import com.whiteplanet.mapper.model.VisitPerson;
import com.whiteplanet.mapper.model.VisitPersonExample.Criteria;
import com.whiteplanet.mapper.model.VisitPersonExample.Criterion;
import com.whiteplanet.mapper.model.VisitPersonExample;
import java.util.List;
import java.util.Map;

public class VisitPersonSqlProvider {

    public String countByExample(VisitPersonExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("visit_person");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(VisitPersonExample example) {
        BEGIN();
        DELETE_FROM("visit_person");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(VisitPerson record) {
        BEGIN();
        INSERT_INTO("visit_person");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            VALUES("sex", "#{sex,jdbcType=BIT}");
        }
        
        if (record.getRealName() != null) {
            VALUES("real_name", "#{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getIntroduce() != null) {
            VALUES("introduce", "#{introduce,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            VALUES("update_date", "#{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getPatientcol() != null) {
            VALUES("patientcol", "#{patientcol,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            VALUES("age", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getSource() != null) {
            VALUES("source", "#{source,jdbcType=VARCHAR}");
        }
        
        if (record.getMobileType() != null) {
            VALUES("mobile_type", "#{mobileType,jdbcType=VARCHAR}");
        }
        
        if (record.getScreenSize() != null) {
            VALUES("screen_size", "#{screenSize,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginIp() != null) {
            VALUES("last_login_ip", "#{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDate() != null) {
            VALUES("last_login_date", "#{lastLoginDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOpenId() != null) {
            VALUES("open_id", "#{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            VALUES("country", "#{country,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadimgurl() != null) {
            VALUES("headimgurl", "#{headimgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getFollow() != null) {
            VALUES("follow", "#{follow,jdbcType=BIT}");
        }
        
        return SQL();
    }

    public String selectByExample(VisitPersonExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("code");
        SELECT("phone");
        SELECT("password");
        SELECT("sex");
        SELECT("real_name");
        SELECT("introduce");
        SELECT("create_date");
        SELECT("update_date");
        SELECT("status");
        SELECT("patientcol");
        SELECT("age");
        SELECT("source");
        SELECT("mobile_type");
        SELECT("screen_size");
        SELECT("last_login_ip");
        SELECT("last_login_date");
        SELECT("open_id");
        SELECT("nickname");
        SELECT("province");
        SELECT("city");
        SELECT("country");
        SELECT("headimgurl");
        SELECT("follow");
        FROM("visit_person");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        VisitPerson record = (VisitPerson) parameter.get("record");
        VisitPersonExample example = (VisitPersonExample) parameter.get("example");
        
        BEGIN();
        UPDATE("visit_person");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            SET("code = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            SET("sex = #{record.sex,jdbcType=BIT}");
        }
        
        if (record.getRealName() != null) {
            SET("real_name = #{record.realName,jdbcType=VARCHAR}");
        }
        
        if (record.getIntroduce() != null) {
            SET("introduce = #{record.introduce,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            SET("update_date = #{record.updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getPatientcol() != null) {
            SET("patientcol = #{record.patientcol,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            SET("age = #{record.age,jdbcType=INTEGER}");
        }
        
        if (record.getSource() != null) {
            SET("source = #{record.source,jdbcType=VARCHAR}");
        }
        
        if (record.getMobileType() != null) {
            SET("mobile_type = #{record.mobileType,jdbcType=VARCHAR}");
        }
        
        if (record.getScreenSize() != null) {
            SET("screen_size = #{record.screenSize,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginIp() != null) {
            SET("last_login_ip = #{record.lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDate() != null) {
            SET("last_login_date = #{record.lastLoginDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOpenId() != null) {
            SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{record.province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{record.city,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            SET("country = #{record.country,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadimgurl() != null) {
            SET("headimgurl = #{record.headimgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getFollow() != null) {
            SET("follow = #{record.follow,jdbcType=BIT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("visit_person");
        
        SET("id = #{record.id,jdbcType=VARCHAR}");
        SET("code = #{record.code,jdbcType=VARCHAR}");
        SET("phone = #{record.phone,jdbcType=VARCHAR}");
        SET("password = #{record.password,jdbcType=VARCHAR}");
        SET("sex = #{record.sex,jdbcType=BIT}");
        SET("real_name = #{record.realName,jdbcType=VARCHAR}");
        SET("introduce = #{record.introduce,jdbcType=VARCHAR}");
        SET("create_date = #{record.createDate,jdbcType=TIMESTAMP}");
        SET("update_date = #{record.updateDate,jdbcType=TIMESTAMP}");
        SET("status = #{record.status,jdbcType=INTEGER}");
        SET("patientcol = #{record.patientcol,jdbcType=VARCHAR}");
        SET("age = #{record.age,jdbcType=INTEGER}");
        SET("source = #{record.source,jdbcType=VARCHAR}");
        SET("mobile_type = #{record.mobileType,jdbcType=VARCHAR}");
        SET("screen_size = #{record.screenSize,jdbcType=VARCHAR}");
        SET("last_login_ip = #{record.lastLoginIp,jdbcType=VARCHAR}");
        SET("last_login_date = #{record.lastLoginDate,jdbcType=TIMESTAMP}");
        SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        SET("province = #{record.province,jdbcType=VARCHAR}");
        SET("city = #{record.city,jdbcType=VARCHAR}");
        SET("country = #{record.country,jdbcType=VARCHAR}");
        SET("headimgurl = #{record.headimgurl,jdbcType=VARCHAR}");
        SET("follow = #{record.follow,jdbcType=BIT}");
        
        VisitPersonExample example = (VisitPersonExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(VisitPerson record) {
        BEGIN();
        UPDATE("visit_person");
        
        if (record.getCode() != null) {
            SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            SET("sex = #{sex,jdbcType=BIT}");
        }
        
        if (record.getRealName() != null) {
            SET("real_name = #{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getIntroduce() != null) {
            SET("introduce = #{introduce,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDate() != null) {
            SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateDate() != null) {
            SET("update_date = #{updateDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getPatientcol() != null) {
            SET("patientcol = #{patientcol,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            SET("age = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getSource() != null) {
            SET("source = #{source,jdbcType=VARCHAR}");
        }
        
        if (record.getMobileType() != null) {
            SET("mobile_type = #{mobileType,jdbcType=VARCHAR}");
        }
        
        if (record.getScreenSize() != null) {
            SET("screen_size = #{screenSize,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginIp() != null) {
            SET("last_login_ip = #{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginDate() != null) {
            SET("last_login_date = #{lastLoginDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOpenId() != null) {
            SET("open_id = #{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            SET("country = #{country,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadimgurl() != null) {
            SET("headimgurl = #{headimgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getFollow() != null) {
            SET("follow = #{follow,jdbcType=BIT}");
        }
        
        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(VisitPersonExample example, boolean includeExamplePhrase) {
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