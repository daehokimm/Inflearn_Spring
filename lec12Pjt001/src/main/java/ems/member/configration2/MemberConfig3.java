package ems.member.configration2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ems.member.DataBaseConnectionInfo;
import ems.member.service.EMSInformationService;

/*
 * 유틸 기능
 */
@Configuration
public class MemberConfig3 {
	
	@Autowired
	DataBaseConnectionInfo dataBaseConnectionInfoDev;
	
	@Autowired
	DataBaseConnectionInfo dataBaseConnectionInfoReal;
	
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
		dbInfos.put("dev", dataBaseConnectionInfoDev);
		dbInfos.put("real", dataBaseConnectionInfoReal);
		infoService.setDbInfos(dbInfos);
		
		return infoService;
	}
}
