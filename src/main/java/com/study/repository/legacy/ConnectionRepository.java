package com.study.repository.legacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.study.domain.Board;

@Repository
public class ConnectionRepository {
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	private Connection conn = null;
	
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");                       // 데이터베이스와 연동하기 위해 DriverManager에 등록한다.
		conn = DriverManager.getConnection(url, username, password);   
	}

	public List<Board> selectBoardList() throws SQLException {
		String sql = "SELECT id, name, create_at FROM board";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		List<Board> boardList = new ArrayList<Board>();
		
		while(rs.next()) {
			Board board = new Board();
			board.setId(rs.getLong("id"));
			board.setName(rs.getString("name"));
			board.setCreateAt(rs.getDate("create_at"));
			
			boardList.add(board);
		}
		
		return boardList;
	}

	
	public List<Board> selectBoard(String boardName) throws SQLException {
		String sql = "SELECT id, name, create_at FROM board WHERE name = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, boardName);
		ResultSet rs = pstmt.executeQuery();

		List<Board> boardList = new ArrayList<>();
		
		while(rs.next()) {
			Board board = new Board();
			board.setId(rs.getLong("id"));
			board.setName(rs.getString("name"));
			board.setCreateAt(new Date(rs.getLong("create_at")));

			boardList.add(board);
		}
		
		return boardList;
	}
}
