package com.whiteplanet.admin.util;

import com.whiteplanet.admin.dto.DoctorDto;
import java.util.Comparator;
/**
 * @author:wuzhiyuan
 * @description: 证件时间比较器
 * @date: Created in 13:56 2017/12/1
 * @modified By:
 */
public class CertificatesComparator implements Comparator {
    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.<p>
     * In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.<p>
     * The implementor must ensure that <tt>sgn(compare(x, y)) ==
     * -sgn(compare(y, x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>compare(x, y)</tt> must throw an exception if and only
     * if <tt>compare(y, x)</tt> throws an exception.)<p>
     * The implementor must also ensure that the relation is transitive:
     * <tt>((compare(x, y)&gt;0) &amp;&amp; (compare(y, z)&gt;0))</tt> implies
     * <tt>compare(x, z)&gt;0</tt>.<p>
     * Finally, the implementor must ensure that <tt>compare(x, y)==0</tt>
     * implies that <tt>sgn(compare(x, z))==sgn(compare(y, z))</tt> for all
     * <tt>z</tt>.<p>
     * It is generally the case, but <i>not</i> strictly required that
     * <tt>(compare(x, y)==0) == (x.equals(y))</tt>.  Generally speaking,
     * any comparator that violates this condition should clearly indicate
     * this fact.  The recommended language is "Note: this comparator
     * imposes orderings that are inconsistent with equals."
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws ClassCastException if the arguments' types prevent them from
     * being compared by this comparator.
     */
    /**
     *  按照申请时间降序排，最新的放前面
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        DoctorDto d1 = (DoctorDto) o1;
        DoctorDto d2 = (DoctorDto) o2;
        if(d1.getCompareTime()==null&&d2.getCompareTime()!=null){
            return 1;
        }else if(d1.getCompareTime()!=null&&d2.getCompareTime()==null){
            return 0;
        }else if (d1.getCompareTime()!=null&&d2.getCompareTime()!=null){
            if(d1.getCompareTime().getTime()>d2.getCompareTime().getTime()){
                return -1;
            }else {
                return 1;
            }

        }else {
            return 1;
        }
    }
}
