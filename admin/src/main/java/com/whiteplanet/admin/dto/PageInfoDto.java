package com.whiteplanet.admin.dto;

import com.whiteplanet.utils.WPStringUtil;

/**
 * @author:wuzhiyuan
 * @description: 页面信息数据对象
 * @date: Created in 10:00 2017/11/29
 * @modified By:
 */
public class PageInfoDto {
    /**
     * 获得当前页
     */
    public int pageNum;
    /**
     * 获得一页显示的条数
     */
    public int pageSize;
    /**
     * 是否是第一页
     */
    public boolean isFirstPage;
    /**
     * 获得总页数
     */
    public long pages;
    /**
     * 总的记录条数
     */
    public Long totals;
    /**
     * 是否是最后一页
     */
    public boolean isLastPage;
    /**
     *  中间页起始页
     */
    public int beginPage;
    /**
     * 中间页结束页
     */
    public int endPage;

    public Long getTotals() {
        return totals;
    }

    public void setTotals(Long totals) {
        this.totals = totals;
    }

    public int getBeginPage() {
        return beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public PageInfoDto() {
    }

    public PageInfoDto(int pageNum, int pageSize, boolean isFirstPage, long pages, boolean isLastPage,long totals) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.isFirstPage = isFirstPage;
        this.pages = pages;
        this.isLastPage = isLastPage;
        this.totals = totals;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isFirstPage() {
        return isFirstPage;
    }

    public void setFirstPage(boolean firstPage) {
        isFirstPage = firstPage;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }
    public static void main(String[] args) {
        String s = WPStringUtil.GETuuid();
        System.out.println(s);
    }
}
