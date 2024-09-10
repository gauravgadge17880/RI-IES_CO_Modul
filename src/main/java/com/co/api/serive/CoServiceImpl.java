package com.co.api.serive;

import java.util.List;

import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import com.co.api.binding.CoInfo;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class CoServiceImpl implements CoService {

	@Override
	public List<CoInfo> getNotices(Integer caseNum, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean printNotice(Integer noticeId) {
		// TODO Auto-generated method stub
		return false;
	}

}
