package com.whiteplanet.admin.util;
import com.github.pagehelper.PageInfo;
import com.whiteplanet.admin.dto.PageInfoDto;

import java.util.Date;
import java.util.Objects;
/**
 * @author:wuzhiyuan
 * @description: 分页相关逻辑处理util工具类
 * @date: Created in 16:22 2017/12/6
 * @modified By:
 */
public class PageUtil {
    /**
     * 中间件页数显示大小
     * @param pageInfoDto
     */
    public static void setBeginAndEndPage(PageInfoDto pageInfoDto) {
        long pages = pageInfoDto.getPages();
        int pageNum = pageInfoDto.getPageNum();
        long beginPage = 1;
        long endPage = 6;
        if(pages <= 6) {
            beginPage = 1;
            endPage = pages;
        }
        if(pages > 6 ) {
            beginPage = pageNum -1;
            endPage = pageNum + 3;
            if(beginPage - 1 <= 0) {
                beginPage = 1;
                endPage = 6;
            } else if (endPage > pages) {
                beginPage = pages -5;
                endPage = pages;
            }
        }
        pageInfoDto.setBeginPage(new Long(beginPage).intValue());
        pageInfoDto.setEndPage(new Long(endPage).intValue());
    }
    /**
     * 分页逻辑处理
     * @param pageInfo
     */
    public static PageInfoDto pageInfoHandle(PageInfo pageInfo) {
        PageInfoDto pageInfoDto = null;
        if(!Objects.isNull(pageInfo)) {
            pageInfoDto = new PageInfoDto(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.isIsFirstPage(),
                    pageInfo.getPages(), pageInfo.isIsLastPage(),pageInfo.getTotal());
            //设置分页终始值
            PageUtil.setBeginAndEndPage(pageInfoDto);
        }
        return pageInfoDto;
    }

    public static void main(String[] args) {
        int i = (int) ((Math.random() * 9 + 1) * 1000);
        String s = DateUtil.formatDate(new Date(), DateUtil.PATTERN_yyyyMMdd);
//        long millis = Clock.systemDefaultZone().millis();
        System.out.println(s+i);
    }
}
