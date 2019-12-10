package java_20191210;

import java.util.ArrayList;

import java_20191210.dao.SalDao;
import java_20191210.dto.DeptDto;
import java_20191210.dto.SalDto;

public class SalDemo {
	public static void main(String[] args) {
		SalDao s = SalDao.getInstance();
		//boolean isSuccess = s.insert(new SalDto(6, 4001, 10000));
		//System.out.println(isSuccess);
		
		//boolean isSuccess = s.update(new SalDto(6, 5001, 10000));
		//System.out.println(isSuccess);
		
		//boolean isSuccess = s.delete(6);
		//System.out.println(isSuccess);
		
		ArrayList<SalDto> list = s.select();
		
		for(SalDto dto : list){
			System.out.printf("%d , %s , %s %n", dto.getGrade(), dto.getLoSal(), dto.getHiSal());
		}
		
		SalDto dto = s.select(2);
		if(dto == null){
			System.out.println("데이터가 존재하지 않습니다.");
		} else {
			System.out.printf("%d , %s , %s %n", dto.getGrade(), dto.getLoSal(), dto.getHiSal());
		}
	}
}
