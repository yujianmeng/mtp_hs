package com.service;

import com.proto.CenterBank.Msg31001;

/**
 *  行情文件
 * ClassName: MakeQuotationFileService.java
 * date: 2016年12月16日下午8:49:01
 * @author yu.jian
 * @version
 */
public interface MakeQuotationFileService {
	public String doMakeQuotationFile(Msg31001 msg31001, long recId) throws Exception;
}
