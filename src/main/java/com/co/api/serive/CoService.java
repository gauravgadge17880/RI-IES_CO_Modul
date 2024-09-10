package com.co.api.serive;

import java.util.List;

import com.co.api.binding.CoInfo;

public interface CoService {

	public  List<CoInfo> getNotices (Integer caseNum, String status );
	public boolean printNotice(Integer noticeId);
}
