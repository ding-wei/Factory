package com.dw.pattern.template.dao;

import com.dw.pattern.template.entity.JdbcTemplate;
import com.dw.pattern.template.entity.Member;
import com.dw.pattern.template.entity.RowMapper;


import java.sql.ResultSet;
import java.util.List;

public class MemberDao {
    //为什么不继承 ,主要是为了解耦
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);
    public List<?> query(){
        String sql = "select * from ...";
        return jdbcTemplate.excuteQuery(sql,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }
}
