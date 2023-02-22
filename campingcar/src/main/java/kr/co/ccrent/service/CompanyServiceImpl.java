package kr.co.ccrent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ccrent.dto.CompanyDTO;
import kr.co.ccrent.dto.Criteria;
import kr.co.ccrent.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyMapper companyMapper;

	@Override
	public CompanyDTO get(int comp_id) {
		return companyMapper.get(comp_id);
	}

	@Override
	public int register(CompanyDTO companyDTO) {
		return companyMapper.register(companyDTO);
	}

	@Override
	public int modify(CompanyDTO companyDTO) {
		return companyMapper.modify(companyDTO);
	}

	@Override
	public int remove(int comp_status) {
		return companyMapper.remove(comp_status);
	}

	@Override
	public List<CompanyDTO> getAll(Criteria cri) throws Exception {
		return companyMapper.selectAll(cri);
	}

	@Override
	public int getAll_Count(Criteria cri) throws Exception {
		return companyMapper.selectAll_Count(cri);
	}

	@Override
	public List<CompanyDTO> getAll2(Criteria cri) throws Exception {
		return companyMapper.selectAll2(cri);
	}

	@Override
	public int getAll2_Count(Criteria cri) throws Exception {
		return companyMapper.selectAll2_Count(cri);
	}

	@Override
	public List<CompanyDTO> getAll3(Criteria cri) throws Exception {
		return companyMapper.selectAll3(cri);
	}

	@Override
	public int getAll3_Count(Criteria cri) throws Exception {
		return companyMapper.selectAll3_Count(cri);
	}

	@Override
	public List<CompanyDTO> getAll2() {
		return (List<CompanyDTO>) companyMapper.getAll2();
	}

	@Override
	public List<CompanyDTO> getAll3() {
		return (List<CompanyDTO>) companyMapper.getAll3();
	}

	
}
