package ems.member.configration2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ems.member.DataBaseConnectionInfo;
import ems.member.dao.StudentDao;
import ems.member.service.EMSInformationService;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentDeleteService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

@Configuration
public class MemberConfig {
	
	/*
	 * <bean id="studentDao" class="ems.member.dao.StudentDao" ></bean>
	 */
	@Bean
	public StudentDao studentDao () {
		return new StudentDao();
	}
	
	/*
	 * <bean id="registerService" class="ems.member.service.StudentRegisterService">
		<constructor-arg ref="studentDao" ></constructor-arg>
	   </bean>
	 */
	@Bean
	public StudentRegisterService registerService() {
		return new StudentRegisterService(studentDao());
	}
	
	@Bean
	public StudentDeleteService deleterService() {
		return new StudentDeleteService(studentDao());
	}
	
	@Bean
	public StudentModifyService modifyService() {
		return new StudentModifyService(studentDao());
	}
	
	@Bean
	public StudentSelectService selectService() {
		return new StudentSelectService(studentDao());
	}
	
	@Bean
	public StudentAllSelectService allSelectService() {
		return new StudentAllSelectService(studentDao());
	}
	
	@Bean
	public DataBaseConnectionInfo dataBaseConnectionInfoDev() {
		DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo(); // 객체 생성하고
		
		infoDev.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		infoDev.setUserId("scott");
		infoDev.setUserPw("tiger");
		
		return infoDev; 
	}
	
	@Bean
	public DataBaseConnectionInfo dataBaseConnectionInfoReal() {
		DataBaseConnectionInfo infoReal = new DataBaseConnectionInfo(); // 객체 생성하고
		
		infoReal.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
		infoReal.setUserId("masterId");
		infoReal.setUserPw("masterPw");
		
		return infoReal; 
	}
	
	@Bean
	public EMSInformationService informationService() {
		EMSInformationService infoService = new EMSInformationService();
		
		infoService.setInfo("Education Management System program was developed in 2015.");
		infoService.setCopyRight("COPYRIGHT(C) 2015 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		infoService.setVer("The version is 1.0");
		infoService.setsYear(2015);
		infoService.setsMonth(1);
		infoService.setsDay(1);
		infoService.seteYear(2016);
		infoService.seteMonth(2);
		infoService.seteDay(29);
		
		ArrayList<String> developers = new ArrayList<>();
		developers.add("Cheney");
		developers.add("Eloy");
		developers.add("Jasper");
		developers.add("Dillon");
		developers.add("Kian");
		infoService.setDevelopers(developers);
		
		Map<String, String> administrator = new HashMap<>();
		administrator.put("Cheney", "cheney@springPjt.org");
		administrator.put("Jasper", "jasper@springPjt.org");
		infoService.setAdministrators(administrator);
		
		Map<String, DataBaseConnectionInfo> dbInfos = new HashMap<>();
		dbInfos.put("dev", dataBaseConnectionInfoDev());
		dbInfos.put("real", dataBaseConnectionInfoReal());
		infoService.setDbInfos(dbInfos);
		
		return infoService;
	}
}
