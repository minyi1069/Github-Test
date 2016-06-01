package com.choa.s4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.choa.util.DBConnector;

public class MemberDAO {
	
	public MemberDTO login(MemberDTO mdto){
		Connection con = DBConnector.getConnect();
		String sql="select * from member where id=? and pw=?";
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st=con.prepareStatement(sql);
			st.setString(1, mdto.getId());
			st.setString(2, mdto.getPw());
			rs=st.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			DBConnector.disConnect(rs, st, con);
		}
		
		return mdto;
	}

}
