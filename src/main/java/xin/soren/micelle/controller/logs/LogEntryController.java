package xin.soren.micelle.controller.logs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import xin.soren.micelle.common.api.Api;

/**
 * 
 * @Description: 书签日志接口
 * @author soren
 * @date 2017年12月16日 下午5:19:59
 */
@RestController
@RequestMapping("/api/logs")
@Slf4j
public class LogEntryController {
	/**
	 * 
	 * @Description: 获取日志接口
	 * @param lastLogsId
	 * @return
	 * @Throws
	 * @date 2017年12月16日 下午5:25:02
	 */
	@RequestMapping(method = RequestMethod.GET)
	@Api
	public Object getLogsEntry(@RequestParam(value = "lastid", required = false, defaultValue = "0") Long lastLogsId) {
		log.info("");
		return null;
	}

	/**
	 * 
	 * @Description: 推送日志接口
	 * @return
	 * @Throws
	 * @date 2017年12月16日 下午5:31:27
	 */
	@RequestMapping(method = RequestMethod.POST)
	@Api
	public Object postLogsEntry() {
		return null;
	}
}
