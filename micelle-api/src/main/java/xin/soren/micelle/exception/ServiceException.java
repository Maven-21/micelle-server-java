package xin.soren.micelle.exception;

import java.text.MessageFormat;

/**
 * 
 * @Description: 应用内部异常类
 * @author soren
 * @date 2017年9月13日 下午8:49:42
 *
 */
public class ServiceException extends ExceptionBase {
	/**
	 * @Fields serialVersionUID : version
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(long code, String msg) {
		super(code, msg, Const.StatusCode.OK);
	}

	public ServiceException(long code, String msg, int statusCode) {
		super(code, msg, statusCode);
	}

	@Override
	public String toString() {
		return MessageFormat.format("[应用错误] {0}", super.toString());
	}
}
