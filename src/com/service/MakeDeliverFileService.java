package com.service;

import com.proto.CenterBank.Msg31001;

/**
 *  交割单文件
 * ClassName: MakeDeliverFileService.java
 * date: 2016年12月16日下午9:18:58
 * @author yu.jian
 * @version
 */
public interface MakeDeliverFileService {
	public String doMakeDeliverFile(Msg31001 msg31001, long recId) throws Exception;
}
