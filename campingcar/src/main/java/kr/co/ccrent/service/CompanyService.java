package kr.co.ccrent.service;

import java.util.List;

import kr.co.ccrent.dto.CompanyDTO;
import kr.co.ccrent.dto.Criteria;



public interface CompanyService {
	
//  ★★★★★★★★★★★★★★★★★★★★               유저 페이지              ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
//	랜트카 대여 회사명 전체 조회
	public List<CompanyDTO> getAll(Criteria cri) throws Exception;
	public int getAll_Count(Criteria cri) throws Exception;
	
	
//	회사 정보 추가 하기
	public int register(CompanyDTO companyDTO);
	
	public List<CompanyDTO> getAll2();
	public List<CompanyDTO> getAll3();
	
//	★★★★★★★★★★★★★★★★★★★★               유저 페이지 끝              ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
	
	
//  ★★★★★★★★★★★★★★★★★★★★               어드민 페이지 시작              ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
// 승인 목록조회 + 페이징처리       ( 승 인 중 )  대여 회사 목록
	public List<CompanyDTO> getAll3(Criteria cri)throws Exception;
	public int getAll3_Count(Criteria cri) throws Exception;
	
//  대기 목록조회 + 페이징처리      ( 대 기 중 ) 대여 회사 현황
	public List<CompanyDTO> getAll2(Criteria cri)throws Exception;
	public int getAll2_Count(Criteria cri) throws Exception;
	
//	상세 조회
	public CompanyDTO get(int comp_id);

	
//	신청상태 변경하기 comp_status +1 = 승인 
	public  int modify(CompanyDTO companyDTO);
	
//  신청 상태 거절하기 ( 삭제 )
	public  int remove(int comp_status);

	

	
}
