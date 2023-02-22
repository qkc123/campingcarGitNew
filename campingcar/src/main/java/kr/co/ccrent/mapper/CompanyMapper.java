package kr.co.ccrent.mapper;

import java.util.List;

import kr.co.ccrent.dto.CompanyDTO;
import kr.co.ccrent.dto.Criteria;




public interface CompanyMapper {
	
//  ★★★★★★★★★★★★★★★★★★★★               유저 페이지              ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
//	승인 목록조회 + 페이징처리
	List<CompanyDTO> selectAll(Criteria cri)throws Exception;
	public int selectAll_Count(Criteria cri) throws Exception;
	
//	대여회사 신청서 작성	
	int register(CompanyDTO companyDTO);
	
	
//  ★★★★★★★★★★★★★★★★★★★★               어드민 페이지              ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
//	대기 목록 조회 + 페이징처리
	List<CompanyDTO> selectAll2(Criteria cri)throws Exception;
	public int selectAll2_Count(Criteria cri) throws Exception;
	
//	승인 목록 조회 + 페이징처리
	List<CompanyDTO> selectAll3(Criteria cri)throws Exception;
	public int selectAll3_Count(Criteria cri) throws Exception;
	
	List<CompanyDTO> getAll2();
	List<CompanyDTO> getAll3();
	
	CompanyDTO get(int comp_id);

//	신청상태 변경하기 comp_status +1 = 승인	
	int modify(CompanyDTO companyDTO);
	
//  신청 상태 거절하기 ( 삭제 )
	int remove(int comp_status);
	




	
}
