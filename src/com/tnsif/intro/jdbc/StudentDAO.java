package com.tnsif.intro.jdbc;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

public class StudentDAO {
	 public void addStudent(String name, String email, String course) {
	        try {
	            Connection conn = StudentData.getConnection();

	            String sql = "INSERT INTO students(name, email, course) VALUES (?, ?, ?)";
	            PreparedStatement ps = conn.prepareStatement(sql);

	            ps.setString(1, name);
	            ps.setString(2, email);
	            ps.setString(3, course);

	            ps.executeUpdate();
	            System.out.println("Student added successfully!");

	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
      public void viewStudents() {
	        try {
	            Connection conn = StudentData.getConnection();

	            String sql = "SELECT * FROM students";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            System.out.println("\nID | Name | Email | Course");
	            System.out.println("---------------------------");

	            while (rs.next()) {
	                System.out.println(
	                    rs.getInt("id") + " | " +
	                    rs.getString("name") + " | " +
	                    rs.getString("email") + " | " +
	                    rs.getString("course")
	                );
	            }

	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

