package ch.admin.bag.dp3t.inform;

import ch.admin.bag.dp3t.R;

public enum InformRequestError {
	BLACK_INVALID_AUTH_RESPONSE_FORM(R.string.unexpected_error_title, "ABIONDT"),
	BLACK_STATUS_ERROR(R.string.unexpected_error_title, "ABST"),
	BLACK_MISC_NETWORK_ERROR(R.string.network_error, "ABNETWE"),
	RED_STATUS_ERROR(R.string.unexpected_error_with_retry, "ARST"),
	RED_USER_CANCELLED_SHARE(R.string.user_cancelled_key_sharing_error, "ARUSCCD"),
	RED_EXPOSURE_API_ERROR(R.string.unexpected_error_title, "AREA"),
	RED_MISC_NETWORK_ERROR(R.string.network_error, "ARNETWE");


	private final int errorMessage;
	private final String errorCode;


	InformRequestError(int errorMessage, String errorCode) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public int getErrorMessage() {
		return errorMessage;
	}

	public String getErrorCode(String addCode) {
		if (errorCode == null) return null;
		return addCode == null ? errorCode : errorCode + addCode;
	}
}