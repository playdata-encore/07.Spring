package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.qlrm.mapper.JpaResultMapper;

import model.domain.Employees;
import model.util.PublicCommon;

public class Service {
	public static void main(String[] args) {
		System.out.println(getEmployees());
	}
	
	public static ArrayList<Employees> getEmployees() {
		List<Employees> list = null;
		EntityManager em = PublicCommon.getEntityManager();
        try {
        	list = new JpaResultMapper().list(em.createNativeQuery("SELECT * FROM employees"), Employees.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return (ArrayList<Employees>) list;
	}
}
