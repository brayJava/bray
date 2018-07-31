package com.whiteplanet.mapper;

import com.whiteplanet.mapper.model.ReceiveDetail;
import com.whiteplanet.mapper.model.ReceiveDetailExample;
import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class ReceiveDetailSqlProvider {

    public String countByExample(ReceiveDetailExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("receive_detail");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(ReceiveDetailExample example) {
        BEGIN();
        DELETE_FROM("receive_detail");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(ReceiveDetail record) {
        BEGIN();
        INSERT_INTO("receive_detail");
        
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
        
        if (record.getStartDate() != null) {
            VALUES("start_date", "#{startDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndDate() != null) {
            VALUES("end_date", "#{endDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateDate() != null) {
            VALUES("create_date", "#{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOutpatientType() != null) {
            VALUES("outpatient_type", "#{outpatientType,jdbcType=INTEGER}");
        }
        
        if (record.getOutpatientName() != null) {
            VALUES("outpatient_name", "#{outpatientName,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalName() != null) {
            VALUES("hospital_name", "#{hospitalName,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalAddr() != null) {
            VALUES("hospital_addr", "#{hospitalAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalAddrDetail() != null) {
            VALUES("hospital_addr_detail", "#{hospitalAddrDetail,jdbcType=VARCHAR}");
        }

        if(record.getDateType() !=null){
            VALUES("date_type", "#{dateType,jdbcType=INTEGER}");
        }
        
        if (record.getIsFree() != null) {
            VALUES("is_free", "#{isFree,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    public String selectByExample(ReceiveDetailExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("trans_doc_id");
        SELECT("receive_doc_id");
        SELECT("order_id");
        SELECT("start_date");
        SELECT("end_date");
        SELECT("outpatient_type");
        SELECT("outpatient_name");
        SELECT("hospital_name");
        SELECT("hospital_addr");
        SELECT("hospital_addr_detail");
        SELECT("is_free");
        FROM("receive_detail");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ReceiveDetail record = (ReceiveDetail) parameter.get("record");
        ReceiveDetailExample example = (ReceiveDetailExample) parameter.get("example");
        
        BEGIN();
        UPDATE("receive_detail");
        
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
        
        if (record.getStartDate() != null) {
            SET("start_date = #{record.startDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndDate() != null) {
            SET("end_date = #{record.endDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOutpatientType() != null) {
            SET("outpatient_type = #{record.outpatientType,jdbcType=INTEGER}");
        }
        
        if (record.getOutpatientName() != null) {
            SET("outpatient_name = #{record.outpatientName,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalName() != null) {
            SET("hospital_name = #{record.hospitalName,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalAddr() != null) {
            SET("hospital_addr = #{record.hospitalAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalAddrDetail() != null) {
            SET("hospital_addr_detail = #{record.hospitalAddrDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getIsFree() != null) {
            SET("is_free = #{record.isFree,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("receive_detail");
        
        SET("id = #{record.id,jdbcType=VARCHAR}");
        SET("trans_doc_id = #{record.transDocId,jdbcType=VARCHAR}");
        SET("receive_doc_id = #{record.receiveDocId,jdbcType=VARCHAR}");
        SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        SET("start_date = #{record.startDate,jdbcType=TIMESTAMP}");
        SET("end_date = #{record.endDate,jdbcType=TIMESTAMP}");
        SET("outpatient_type = #{record.outpatientType,jdbcType=INTEGER}");
        SET("outpatient_name = #{record.outpatientName,jdbcType=VARCHAR}");
        SET("hospital_name = #{record.hospitalName,jdbcType=VARCHAR}");
        SET("hospital_addr = #{record.hospitalAddr,jdbcType=VARCHAR}");
        SET("hospital_addr_detail = #{record.hospitalAddrDetail,jdbcType=VARCHAR}");
        SET("is_free = #{record.isFree,jdbcType=INTEGER}");
        
        ReceiveDetailExample example = (ReceiveDetailExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(ReceiveDetail record) {
        BEGIN();
        UPDATE("receive_detail");
        
        if (record.getTransDocId() != null) {
            SET("trans_doc_id = #{transDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveDocId() != null) {
            SET("receive_doc_id = #{receiveDocId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getStartDate() != null) {
            SET("start_date = #{startDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndDate() != null) {
            SET("end_date = #{endDate,jdbcType=TIMESTAMP}");
        }

        if (record.getCreateDate() != null) {
            SET("create_date = #{createDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOutpatientType() != null) {
            SET("outpatient_type = #{outpatientType,jdbcType=INTEGER}");
        }
        
        if (record.getOutpatientName() != null) {
            SET("outpatient_name = #{outpatientName,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalName() != null) {
            SET("hospital_name = #{hospitalName,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalAddr() != null) {
            SET("hospital_addr = #{hospitalAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getHospitalAddrDetail() != null) {
            SET("hospital_addr_detail = #{hospitalAddrDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getIsFree() != null) {
            SET("is_free = #{isFree,jdbcType=INTEGER}");
        }

        if (record.getDateType()!=null) {
            SET("date_type = #{dateType,jdbcType=INTEGER}");
        }

        WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(ReceiveDetailExample example, boolean includeExamplePhrase) {
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
        List<ReceiveDetailExample.Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            ReceiveDetailExample.Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<ReceiveDetailExample.Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    ReceiveDetailExample.Criterion criterion = criterions.get(j);
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