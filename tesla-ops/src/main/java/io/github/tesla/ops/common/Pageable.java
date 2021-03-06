package io.github.tesla.ops.common;

import java.io.Serializable;
import java.util.List;

/**
 */
public class Pageable implements Serializable {
    private static final long serialVersionUID = 1L;
    // 总记录数
    private int total;
    // 列表数据
    private List<?> rows;

    /**
     * 分页
     * 
     * @param list
     *            列表数据
     * @param totalCount
     *            总记录数
     * @param pageSize
     *            每页记录数
     * @param currPage
     *            当前页数
     */
    public Pageable(List<?> list, int total) {
        this.rows = list;
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public int getTotal() {
        return total;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
