package com.dw.pattern.template.entity;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
    private DataSource dataSource;
    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public List<?> excuteQuery(String sql, RowMapper<?> rowMapper,Object [] values){
        List<?> result = null;
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement pstmt = this.createPreparedStatement(conn,sql);
            //3.执行语句集
            ResultSet rs = this.excuteQuery(pstmt,values);
            //4.解析语句集
            result = this.parseResultSet(rs,rowMapper);
            //5.关闭结果集
            this.closeResultSet(rs);
            //6.关闭语句集
            this.closeStatement(pstmt);
            //7.关闭连接
            this.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  result ;
    }
    private void closeConnection(Connection conn)  throws  Exception{
        conn.close();
    }
    private void closeStatement(PreparedStatement pstmt) throws  Exception {
        pstmt.close();
    }

    private void closeResultSet(ResultSet rs)  throws  Exception{
        rs.close();
    }

    private List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws  Exception{
        List<Object> result = new ArrayList<Object>();
        int rownum =1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rownum++));
        }
        return result;
    }

    public ResultSet excuteQuery(PreparedStatement pstmt, Object[] values) throws Exception{
        for (int i = 0 ; i <values.length ; i++){
            pstmt.setObject(i,values[i]);
        }
        return pstmt.executeQuery();
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
