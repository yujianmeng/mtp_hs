package com.service;

import com.proto.CenterBank.Msg31001;

/**
 *  
 * ClassName: MakeMemberFeeFileService.java
 * date: 2016年12月16日下午5:34:07
 * @author yu.jian
 * @version
 */
public interface MakeMemberFeeFileService {
	public String doMakeMemberFeeFile(Msg31001 msg31001, long recId) throws Exception;
}
